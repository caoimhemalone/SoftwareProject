#!/bin/sh

#  SoftPro.py
#  SoftwareProject
#
#  Created by Caoimhe Malone on 03/12/2017.
#  Copyright © 2017 Caoimhe Malone. All rights reserved.

import time
import grovepi

pir_sensor = 8
motion=0
led = 2
grovepi.pinMode(pir_sensor,"INPUT")
grovepi.pinMode(led, "OUTPUT")

while True:
    try:
        motion=grovepi.digitalRead(pir_sensor)
        if motion==0 or motion==1:
            if motion==1:
                print ('Motion Detected')
                digitalWrite (LED, HIGH);
            else:
                print ('-')
                digitalWrite (LED, LOW);


    time.sleep(.2)

except IOError:
    print ("Error")
