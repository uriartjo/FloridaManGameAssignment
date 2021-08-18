package com.company;

public class Headline {

}

/*
Headline Class
This class is responsible for holding the Florida Man story headlines.

Required Class Attributes
A string that will hold the headline's...well, story.
A string, or keyword, that will be word being removed from the headline that the player to guess
An ArrayList holding the string previously mentioned keyword alongside 3 more strings. These will be the "options" presented to the player to choose from

Required Class Methods
A constructor that takes in:
The story
The keyword
The three additional choices
Appropriate getters and setters
A method that returns a String of the object's headline but with the keyword replaced by ______

Other Requirements
Upon being constructed, the headline object should automatically find itself placed into the app's ArrayList of existing Headlines. This ArrayList resides in the HeadlineBank class (see below for more).
Upon being constructed, the Headline object should shuffle the elements in the ArrayList. This ensures the option order is always randomized.
 */
