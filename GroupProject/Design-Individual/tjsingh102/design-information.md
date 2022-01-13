1. 1. Created a class called all_lists which allows user to create, remove and edit reminders from a list
2. Allowed connection to database of reminders as instructed 
3. As user creates a reminder he will invoke type_of_reminder which contains defined reminder types which can be chosen by preference 
4. Locate_reminder can be called in the class all_lists to find the requested reminder 
5. As a reminder is generated it will be transferred to the reminders database through all_lists 
6. clearCheckOffs function is available to use in reminder_lists
7. Boolean “isCheckedOff” function is available in reminder creation subclass 
8. Reminder class is a subclass of all_lists and will therefore be transported to the database immediately 
9. Subclass reminder_type is used for grouping different types of reminders 
10.  all_lists contains all methods needed to generate, rename, select and delete reminder lists 
11. is_Allday boolean check is available for use in reminder sub class and will set reminder to all day notification in which case it will ask for date and time if it is set to false
12. UML design allows for user input and simple design