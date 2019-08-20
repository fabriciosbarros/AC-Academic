Academic Project - Algorithms and Constructs.

This is a Group Assignment.

Project Title: AcmeAndroid

REQUIREMENTS:

********************************************************
Module Learning Outcome: 
4. develop and implement custom algorithms and constructs for a wide variety of application-specific tasks, taking performance and system resources into consideration 
5. employ a variety of different constructs and to implement and categorise different searching and traversal algorithms over said constructs
********************************************************

The Project

Group: max 4 people

create algorithms to:

Make an Android stand, walk and sit down with human-like movement.

Acme Robotics have developed an Android, in collaboration with their partners AndroidsRus, they have sourced the motors to be used to articulate the android, along with a cheap power plant.
You have been tasked with designing and testing the algorithms to be used in the project.

Android articulations :

Ankle : 30 deg.   Voltage required : 3 volts
Knee  : 90 deg.  Voltage required : 3 volts
Hip     : 90 deg.    Voltage required : 4 volts
Waist : 30 deg. rotation / 90 deg. flexion.  Voltage required : 4 volts
Wrist : 180 deg. Voltage required : 2 volts
Elbow : 140 deg. Voltage required : 3 volts
Shoulder : 360 rotation / 180 flexion. Voltage required : 2 volts
Neck  : 30 deg rotation. Voltage required : 3 volts 
Head  : 180 deg rotation / 180 deg. flexion. Voltage required : 3 volts

each articulation is controlled by a single motor
each motor uses a max of 4 volts per second to operate and can move 15 degrees per second -
 if movement is more than 60% of available motion for a motor an additional 3 volts are required.

once a motor is moved the Android requires 1 volt to hold all motors in place(must always be 1 volt in battery).

the power plant is a cheap model of lithium battery from AndroidsRus and can only produce 8 volts, its recovery time after discharging is 3 seconds.(2.6 volts per second)




Starting point:
The Android is placed on a chair: 
Make it stand
Make it walk
Make it sit down

If the android is without power it will fall over and break and cost millions of euro to replace.
you will need to create initial motor positions for poses.


       Hints : (put program thread to sleep to simulate real time:  Thread.sleep(miliseconds);  )
Your algorithm design goal is to produce the most efficient algorithms for each pose transition. Research human movement and gait analysis as a means of interpreting the movement of your motors. Ensure that the development process is well documented (show all drawings / calculations / research articles ect..). Spend sufficient time on the development of the format of the program output to allow a user to view the progress of pose transitions (e.g. have stage progress / broken down groups of movements)
