## People Database-web

This is a CRUD web application built with Java, Spring (Boot, MVC, Data), HTML, CSS (Bootstrap), H2 and Gradle as the build tool.

## Features

* Create, Read, Update and Delete (CRUD) operations.
* Database access using H2

## Requirements

* Java 8
* Gradle 4.10 or higher

## Installation

1. Clone the repository

```
git clone https://github.com/username/crud-web-application.git
```

2. Build the project

```
gradle build
```

3. Start the application

```
gradle bootRun
```

4. The application will start running at http://localhost:8080. You can use a web browser to access the application.

## Database 

This application uses an in-memory H2 database to store the tasks. The database is initialized with some sample data when the application starts. You can access the H2 console at http://localhost:8080/h2-console (use "sa" as the username and leave the password blank).

## Preview

![peopledb](https://user-images.githubusercontent.com/96597273/209165141-298613ce-9da9-4407-a138-4aac07f5c71a.jpg)

### Tasks to do

- [x] Add ability to edit.
- [ ] Add ability to delete multiple records.
- [ ] Add ability to upload photo.
- [ ] Improve UI.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
