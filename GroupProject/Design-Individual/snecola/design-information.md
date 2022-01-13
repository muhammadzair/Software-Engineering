# Reminder App Design

1. A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list.
* The ReminderList class allows users to add reminders to a list, delete them from a list, and edit them.
2. The application must contain a database (DB) of reminders and corresponding data.
* The application design contains a database that will aggregate ReminderTypes, Reminders, and ReminderLists per user and use them to construct the UI.
3. Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).
* The ReminderType class along with its hierarchical value will allow for different types of reminders to be prioritized by type.
4. Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.
* The ReminderUI has a search function/
5. The reminders must be saved automatically and immediately after they are modified.
* At the end of update methods for reminders and reminder lists, the updateReminderInDB() function is called.
6. Users must be able to check off reminders in the list (without deleting them).
* The Reminder class has a boolean value of for check off and a method to update its status.
7. Users must also be able to clear all the check-off marks in the reminder list at once.
* There is a function to clear all checkoffs for reminders in the ReminderList class, and there will be a button for it in the UI.
8. Check-off marks for the reminder list are persistent and must also be saved immediately.
* At the end of the check-off function for a reminder, a call to update the reminder status in the database will be made.
9. The application must present the reminders grouped by type.
* Reminders contain a ReminderType which allows them to be aggregated and presented by type.
10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”, “Kid’s Reminders”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists.
* The ReminderUI has a list of ReminderLists that it can present. It also has the methods to create, rename, and delete reminder lists.
11. The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior.
* The application allows you to set Alert times for a Reminder and check off whether it is a repeating alert or not.
12. Extra Credit: Option to set up reminder based on location.
* Reminders will keep track of location if a location is set.
13. The User Interface (UI) must be intuitive and responsive.
* Ok.
