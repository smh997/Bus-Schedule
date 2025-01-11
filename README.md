Bus Schedule
==================================

The Bus Schedule app displays a list of bus stops and arrival times. Tapping a bus stop on the first
screen will display a list of all arrival times for that particular stop.

The bus stops are stored in a Room database. Schedule items are represented by the `Schedule` class 
and queries on the data table are made by the `ScheduleDao` class. The app includes a view model to
access the `ScheduleDao` and format data to be display in a list.

It's [one of the Jetpack Compose training projects](https://github.com/google-developer-training/basic-android-kotlin-compose-training-bus-schedule-app/tree/starter)