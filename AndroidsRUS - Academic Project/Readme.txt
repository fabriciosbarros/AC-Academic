First Academic Project in Algorithms and Constructs.

Project Title: AndroidsRus

REQUIREMENTS:

********************************************************
Module Learning Outcome: 
1. identify and select appropriate algorithms and constructs for a given real-world
problem by differentiating between the complexity, scalability and efficiency of
different candidate solutions.
2. deconstruct a given construct and/or algorithm by analysing and criticising its space
and time complexity in terms of lower and upper theoretical bounds.
3. select and integrate multiple algorithms and constructs to solve a larger problem in
a real-world context while identifying and appraising the trade-offs of different
candidate approaches in terms of space and time complexity.

********************************************************

The Project

write a programme to create robots

AndroidsRus is a company that produces robots. They currently produce:
Android mk1 / Android mk2  / Android mk3  / Android mk4  / Android mk5

They are putting into production a new line of Androids:

Andy the Android
Betty the Busibot
Bobi the racedroid
Fred the Friendlybot 

you have been tasked to scavenge parts for this new line of Androids from the existing inventory list of the company.

All Androids have the following parts:

brain : 2.5GHZ / 3.5GHZ / 4.5GHZ
mobility : caterpillar tracks  / wheels / legs
vision : heat vision / full colour / night vision
arms : claws / grippers / articulated fingers
media center : sony / jvc / meridian
Power Plant : lithium / hydrogen / plasma (40 watt range)

you must generate a data set of the existing line of Androids of at least 600 units.




example output of existing Android:

model : MK3
serial number : 1098904 (randomly generated and unique)
brain : 3.5GHZ
mobility : Legs
vision : Full Colour
arms : articulated fingers
media center : meridian
Power Plant : Hydrogen

randomly create a mix of existing inventory
use these products to gather parts for the new range
you must state which existing Android donated each part, no more than 2 parts from the same Android.

example output of new product

Model : Fred the Friendlybot
SerialNum: 1234567 (randomly generated and unique)
Brain: 2.5GHZ (MK1 : serialNum : 2345354)
Mobility: Caterpillar Track (MK3 : serialNum :5687935)
Vision : Night Vision (MK5 : serialNum : 0980794)
Arms: grippers (MK1 : serialNum : 2345354)
Media Center : Meridian (MK2 : serialNum : 1239055)
Power Plant : Plasma (MK5 : serialNum : 3542277)

create 400 of the new line of Androids (random mix of models)



You must provide a way for a user to search the new and donor inventory:
A user can search for and view:
MODEL IS THE SERIAL NUMBER
TYPE IS THE NAME
o	All available models of a particular type. (eg. View all Betty the Busibot models)
o	One model of a particular type (eg. Single Andy the Android)
o	Total counts of available types (eg how many Andy, how many Betty…etc.)
o	A model that donated a particular part (ie. output of donor model and part donated and receiving model)
o	Go through the new guys to do the searching

You must design algorithms to generate the test data.
You must design algorithms to search the test data.
You must design algorithms to display the test data.
