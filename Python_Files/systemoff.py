import time
from grovepi import *

from gpiozero import MotionSensor

pir= MotionSensor(4)
buzzer = 8
led = 4
button = 5


pinMode(buzzer, "OUTPUT")

try:
    

    while True:
            digitalWrite(buzzer, 0)
            digitalWrite(led, 0)
            print ("No Motion Detected")
            time.sleep(2)
       

except KeyboardInterrupt:
    digitalWrite(buzzer, 0)
    digitalWrite(led, 0)
    

except (IOError, TypeError) as e:
    print ("Error"), e






