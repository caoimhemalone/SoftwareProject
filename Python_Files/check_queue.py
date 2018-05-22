import boto3
import os
import time
import sys
from grovepi import *

from gpiozero import MotionSensor

pir= MotionSensor(4)
buzzer = 2



pinMode(buzzer, "OUTPUT")

access_key = "AKIAIUHYRDMGFNBY2JPQ"
access_secret = "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"
region ="us-east-1"
queue_url = "	https://sqs.us-east-1.amazonaws.com/688000642875/AlexaScriptPi"

def pop_message(client, url):
    response = client.receive_message(QueueUrl = url, MaxNumberOfMessages = 10)

    #last message posted becomes messages
    message = response['Messages'][0]['Body']
    receipt = response['Messages'][0]['ReceiptHandle']
    client.delete_message(QueueUrl = url, ReceiptHandle = receipt)
    return message
    
client = boto3.client('sqs', aws_access_key_id = access_key, aws_secret_access_key = access_secret, region_name = region)

waittime = 20
client.set_queue_attributes(QueueUrl = queue_url, Attributes = {'ReceiveMessageWaitTimeSeconds': str(waittime)})

time_start = time.time()
while (time.time() - time_start < 60):
    #print("Checking...")
    
    try:
        message = pop_message(client, queue_url)
        print(message)
        if message == "on":
            #try:
                while True:
                    if pir.motion_detected:
                        digitalWrite(buzzer, 1)
                        print("Motion Detected")
                                
                        break
                    else:
                        digitalWrite(buzzer, 0)
                        print("No Motion Detected")
                        
                                    
                        break
              
                                    
        elif message == "off":
            #try:
                while True:
                    digitalWrite(buzzer,0)
                
    
                
    except:
        pass
