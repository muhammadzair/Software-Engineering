How each requirement is met

1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.

I created a ReminderList class, which is composed of Reminders, that will allow the user to add, edit, 
and delete reminders through the addReminder(Reminder r), editReminder(String name, Reminder modfied), 
deleteReminder(String name), respectively.


2. The application must contain a database (DB) of reminders and corresponding data.

This not a OOP design problem, this a backend problem, however, we can insert the reminder into the DB 
when a reminder is created via methods described in this document.

3. Users must be able to add reminders to a list by picking them from a hierarchical list, where the 
first level is the reminder type (e.g., Appointment), and the second level is the name of the actual 
reminder (e.g., Dentist Appointment).

This done by make a Reminder class a sub class to the Type class. 


4. Users must also be able to specify a reminder by typing its name. In this case, the application must look 
in its DB for reminders with similar names and ask the user whether that is the item they intended to add. 
If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type 
for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB.

ReminderFile class can add a reminder from the DB by using querey(String name) method and choose a reminder 
from the list from the querey. If the querey return nulls the addReminder(Reminder r) should be invoked from 
a reminder list instead.

5.The reminders must be saved automatically and immediately after they are modified.

This a problem to be sloved in code, not design

6. Users must be able to check off reminders in the list (without deleting them).

The ReminderList is able to change the isChecked instance varable from Reminder through the Checkoff(Reminder r)

7. Users must also be able to clear all the check-off marks in the reminder list at once.

The ReminderFile has the ablitly to clear all check-off marks of a list through the clearAllChecks(String name)

8. Check-off marks for the reminder list are persistent and must also be saved immediately.

This a problem to be sloved in code, not design

9. The application must present the reminders grouped by type.

This a task for UI, not software design

10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.

This done all through the ReminderFile class, that has methods that have the ability to create, (re)name, 
select, and delete the reminder lists through  the methods createList(String name), 
renameList(String oldName, String newName), getList(String name), deleteList(String name)

11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.

The reminder class does this by having a Day_time varible to store the day and time, and repeat bool if the
behavior should be repeated, the behaivor is then excuted by the Excutebehaivor() (note the method should return void)

12. Option to set up reminder based on location.
Ec skip

13. The User Interface (UI) must be intuitive and responsive.
Not considered because it does not affect the design directly




 
   