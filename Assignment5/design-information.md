# Assignment 5 - Software Design
### 1) A list consisting of reminders the users want to be aware of. The application must allow users to add reminders to a list, delete reminders from a list, and edit the reminders in the list.
##### For this requirement, I added a ReminderList class which consists of reminderOverviews. Overviews holds reminders categories where users can pick what reminder they want to add relating to that category. Users are able to edit, delete, and add reminders.

### 2) The application must contain a database (DB) of reminders and corresponding data.
##### I added a database that connects to all the classes where user's can modify the data: ReminderList - where a user can create/modify new lists, RemindersOverview - where a user can create/modify and see categories for the list they're in,  Reminder Categories - where a user can create/modify the current category they're in such as checking off reminders, and ReminderDetails, where a user can get more information about a specific reminder and modify alerts for it. Every action the user can take here is connected to the database to update the data (check reminder) or pull data from the database to make a decision (reminder alert). 

### 3) Users must be able to add reminders to a list by picking them from a hierarchical list, where the first level is the reminder type (e.g., Appointment), and the second level is the name of the actual reminder (e.g., Dentist Appointment).
##### I implemented this requirement in my design by adding the reminderCategories and reminderDetails class. The reminderCategories class shows all the categories in the list (e.g: Appointment) and the reminderDetails contains the reminder in more details (e.g Doctor's Apppointment and details such as time, alerts, and location). 

### 4) Users must also be able to specify a reminder by typing its name. In this case, the application must look in its DB for reminders with similar names and ask the user whether that is the item they intended to add. If a match (or nearby match) cannot be found, the application must ask the user to select a reminder type for the reminder, or add a new one, and then save the new reminder, together with its type, in the DB. 
##### For this requirement, all classes have a function that will check if what the user is typing is currently in the database. If it matches something in the database, they will get an alert on the screen telling them what the database will suggest.  

### 5) The reminders must be saved automatically and immediately after they are modified.
##### I connected all classes to the database, whenever the user does an action it will check to see if its in the database and it will also save any modifications or creations to the database.

### 6) Users must be able to check off reminders in the list (without deleting them).
##### I implemented this requirement by giving the reminderDetails class the ability to check off each separate reminder. 


### 7) Users must also be able to clear all the check-off marks in the reminder list at once.
##### For this requirement, the user is able to check off all the reminders in the reminderCategory class if they want to check off the reminders in each category, or they can also check off the reminder in each respective reminderOverview. 

### 8) Check-off marks for the reminder list are persistent and must also be saved immediately.
##### For this requirement, I made it so the database connects to every class. Anytime the user makes a change(e.g a check) it will be sent to the database and saved. 

### 9) The application must present the reminders grouped by type.
##### I implemented this requirement by making the reminderCategory class. Users can put similar reminders in the same category. Example) In the appointments category users can make different appointment reminders, such as dentist appointment or counseling appointment.  

### 10) The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”, “Kid’s Reminders”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete reminder lists.
##### To realize this requirement, I made it so each reminderList class can make multiple reminderLists. The user is able to edit them, select them, and delete them.

### 11) The application should have the option to set up reminders with day and time alert. If this option is selected allow option to repeat the behavior.
##### For this requirement, I made it so the user can make a dedicated list where all the reminders in that list will be recurring, or the user is able to make a specific reminder in a specific category to be recurring. 

### 12) Extra Credit: Option to set up reminder based on location.
##### I connected the reminderDetails class with a location api. The user is able to choose a location they want to be reminded at and it will send that location to the database. 

### 13) The User Interface (UI) must be intuitive and responsive.
#####  I did not consider this because it does not affect the design directly. 