1) A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.
//This was implemented by creating a class called reminderList. It has the following methods which allow the user to add, delete, and edit reminders from a list. selectCheckOff(), clearCheckOff(), addNew(), edit(), delete(), select().

2) The application must contain a database (DB) of reminders and corresponding data.
//Implemented as a blank box in this UML design. This DB connects to the list class and reminderList class through searc() and inheritance. 

3)Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).
//User can invoke the addNew method which adds a new reminder. When this happens, the class called type (for reminder type) has a list of types that the user can select. Then there is a class called reminder which creates the reminders as objects. 

4)Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.
//Implemented a basic visual of what this would look like. The list class has a nameOfReminder method. This allows the user to look up a reminder directly across lists in the DB.

5)The reminders must be saved automatically and immediately after they are modified.
//When the user creates a new reminder, the reminderList class will update automatically and will immediately have those changes reflected in the DB.

6)Users must be able to check off reminders in the list (without deleting them).
//Each object of a Reminder class has an attribute of type boolean that will identify whether its crossed off or not as per the isCheckedOff attribute.

7)Users must also be able to clear all the check-off marks in the reminder list at once.
//the list class has a method called clearCheckOff(). Any item with the check attribute in the reminder class will have the checked boolean attribute set to false. 

8)Check-off marks for the reminder list are persistent and must also be saved immediately.
//the checked boolean attribute in the remainder class will be saved immediately because once the object is finished updating the edits from the remainderList class to the database, the checked attribute will be carried out with it and saved automatically. 


9)The application must present the reminders grouped by type.
//We have the listType class which contains the type attribute. This type attribute is saved as a string in the remaining class which allows each reminder to be grouped by their corresponding type.

10)The application must support multiple reminder lists at a time (e.g., "Weekly", "Monthly",
"Kid's Reminders"). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.
//The class reminderList is a child of parent class list. Class reminderList has access to all the methods of the list class. 

11)The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior.
//The allDay boolean attribute determined what happens with date and time alerts. If the users reminder is for an allday event then it dateAndTime will be null. If it is not an all day event, then dateAndTime will invoke the repeats attribute which will start the repeat class. The user can determine when to have the reminder repeat or the user can end it. 

12)Extra Credit: Option to set up reminder based on location.
//Added a location attribute which extends from the reminder class. It will be triggered when the current location matches the setLocation determined in the reminder class.

13)The User Interface (UI) must be intuitive and responsive.
//Can't show this in the UML design but UI is very important in general. Having an easy to use, simple, and neat design is key to keeping users interested in your product. They do not want to use anything that is complicated for malfunctioning. I also added a user class which can be used for the user to log into their account which has all of their reminders saved. This is not required but it can be a nice feature. 
