#!/bin/sh

#  SoftPro.py
#  SoftwareProject
#
#  Created by Caoimhe Malone on 03/12/2017.
#  Copyright © 2017 Caoimhe Malone. All rights reserved.

import grovepi
from grovepi import *
import math

ultrasonic_ranger = 4
buzzer = 6
switch = 3
led_status = 5

while True:
    try:
        grovepi.pinMode(switch, "INPUT")
        while True:
            if grovepi.digitalRead(switch) == 1: #if the system is on
                if grovepi.ultrasonicRead(ultrasonic_ranger) < 100: #if motion is detected
                    print("Disturbance")
                        grovepi.analogWrite(buzzer, 100) #buzzer makes noise
                        time.sleep(.5)
                            grovepi.analogWrite(buzzer, 0) #turn buzzer off
                            grovepi.digitalWrite(led_status, 1) #turn on led to indicate movement
                    
                        else : #if the system is off
                            grovepi.digitalWrite(led_status, 0) # turn led off


    except IOError:
        print ("Error")



