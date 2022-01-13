## Individual Designs

**Design 1**: Steven Necola.

- Pros :

  - Hierarchy System.

- Cons :

  - Missing ListType attribute for ReminderList

![](https://lh6.googleusercontent.com/uItGOYCXPnvtWejh2fWTE19H0gLkh5hVheTzvrg5F11NxxxuYflYgTWA9nlZTq0CTyW2IjJxOXGdfuYoHtHd5d8EoJCq872HoywB8_anhfPCFo6PSWq48FGHRIDl8CE_jR10aaqb=s1600)

**Design 2:** Harjit Liyal

- Pros:

  - The design is easy to read and there is a clear relationship hierarchy.
  - The User is able to perform all project requirements.
  - There is a database that successfully saves all user’s actions & there is a location API that lets the user

- Cons:

  - The database connects to every class, which might be difficult to implement.
  - There is not much detail on the relationship between the reminderDetails class and location API.
  - There isn’t much clarification on reminder lists types or how reminders will be displayed for the user.

![](https://lh4.googleusercontent.com/cSPzbIeYQHDnQPAB4dfZn6xbNRwR2OnehXmik_t-WuwPeH_8ySpMsVY9C3XW5Mq6eDKfz3PRjFhWPpMIHYnXCpmE4Igb2lWMFzuR3c5iZjHDgWVqPItzzB-CjkB0OGHYCWPvtxYN=s1600)

**Design 3:** Tejinderpal Singh

- Pros:

  - Connects to database of reminders
  - Implements reminder lists and all lists efficiently
  - The chart is clear and easy to follow

- Cons:

  - Did not include hierarchy system
  - Requires an implementation of immediately saving modified data

![](https://lh4.googleusercontent.com/VWygGohgmC68RsFy67J3pVNUbwVGoO3IPaNqOI7UuAdjvLQs0fyvmJ4ui03L-ftG-whG56GLiAE3y0k3hCjWzAK1H6VRAjPntAJpAqryvoyk-H9TpnSK-ABtKfIaHqzQ-DuzGMEH=s1600)

**Design 4:** Ashley Simons

- Pros:

  - Databases saves all of the users actions
  - Has a GPS as part of the reminder class so the user can get unique reminders based on their current location.
  - Has a user class. The user can create an account so reminders can be added/removed/given on their mobile device and computer.

- Cons:

  - Needs an updated hierarchy system.
  - Needs to figure out how the reminders will actually be executed

![](https://lh5.googleusercontent.com/K6n3gvFmvq6SZ-8cftnbyQHRLNqmYV0piqBEjNDs-GvAXlm_EfA01kJM2ROMzPlw4llKxDvbAHDo2wPWCvUoRdRleGD9jsWLWNqJLnQCx4qSn4hjLZQ--PdIMNNQqUTg9KZxqAL_=s1600)

**Design 5:** Fariha Khan

- Pros:

  - The design has default Reminder types which users can choose from. Otherwise they can add their own type to the list.
  - Automatically saves the changes in list to the DB with CRUD.
  - Users can set up reminders based on their location with the help of Google Map Location API.

- Cons:

  - For android app, user is already given. So, implementing it again would over complicate it.
  - We can add the method to create a new reminder type list inside the Reminder class.

![](https://lh5.googleusercontent.com/QiCCWKnHiWjC4gYGA7ljIqhPH1Jl599eJUb6vT0Ljb9aoAzPUJCeGTusAFZpwYpcFDJCodJcGlXY88J337lpFgJD86YqqfYX1lafXSmD20tX7tLkZTYRHdGio7u9TW_XYWSIQotM=s1600)

**Design 6:** Shohum Boker

- Pros:

  - Minimal, meets all bare minimum requirements.
  - Easy to follow

- Cons:

  - Does not consider DB or UI in the design
  - Does not consider the optional requirements
  - It is too simple.

![](https://lh6.googleusercontent.com/-XbLbh6AQjhO5afsx3fj-9946DRnkEJGXm5llBEG6ANzvrqwrRd9nsHZOGEreAIsTfa1N_TF819PFU-G24JHwHHwaIt-BZcyNgmXKHcNr7GBWP_nc-f1PZmgsCVWPq5Iyawf-2IX=s1600)

## Team Design

![](https://lh6.googleusercontent.com/NB6CuP_JAWw0Pme6HCCcyo9Cna7kioSVc3qqzRnHn82-YPGhf17MMrE-HeLiZgDwwxLESsQ2_HdGaMyR-NWoJcjJq6blwR34jTV29-WYlabFhmD09UCVo-kf-yX3NF49lIhySj_U=s1600)

Commonalities:

- Design has a clear Hierarchy
- Implements all requirements
- Has reminder class that lets user set a time & location

Differences:

- Utilizes an alert function that alerts the user
- Uses a location API that lets the user be reminded at a location
- Reminder is able to be toggled
- Reminders are categorized based on their hierarchical value

## Summary

This project taught us how to explain our thought process behind our UMLs and also helped us understand how others approached the same task in a different way. This also helped each team member see things they could have improved on and things that they did better in their personal design. We also learned how to come to compromises if we had two different ways to achieve the same thing. We combined pieces of our old ideas and created a final UML diagram.
