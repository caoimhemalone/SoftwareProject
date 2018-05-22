import boto3

access_key = "AKIAIUHYRDMGFNBY2JPQ"
access_secret = "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"
region ="us-east-1"
queue_url = "	https://sqs.us-east-1.amazonaws.com/688000642875/AlexaScriptPi"

def post_message(client, message_body, url):
    response = client.send_message(QueueUrl = url, MessageBody= message_body)

def pop_message(client, url):
    response = client.receive_message(QueueUrl = url, MaxNumberOfMessages = 10)

    #last message posted becomes messages
    message = response['Messages'][0]['Body']
    receipt = response['Messages'][0]['ReceiptHandle']
    client.delete_message(QueueUrl = url, ReceiptHandle = receipt)
    return message
    
client = boto3.client('sqs', aws_access_key_id = access_key, aws_secret_access_key = access_secret, region_name = region)
post_message(client, "test", queue_url)
message = pop_message(client, queue_url)
print(message)