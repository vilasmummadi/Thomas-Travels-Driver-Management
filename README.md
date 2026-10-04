# Thomas Travels Driver Management

A beginner Java console project that stores driver details in an array and performs basic searches and summaries. This was built as a first project to practice object-oriented programming and working with arrays.

## Project overview

Each `Driver` has an ID, category, name, and total distance travelled. The `Travel` class provides operations on a `Driver` array, and `TestDriver` creates sample drivers and demonstrates all five operations.

## Features

- Check whether a driver belongs to the `Car` category.
- Find a driver by ID.
- Count drivers in a category.
- Return all drivers in a category.
- Find the driver with the greatest distance travelled.

## Example data and output

The demo creates these drivers:

| ID | Category | Name | Distance |
|---:|---|---|---:|
| 101 | Car | Vilas | 1000.0 |
| 102 | Car | Rahul | 2500.0 |
| 103 | Auto | Ravi | 1500.0 |

Running the program prints:

```text
true
Driver [driverId=102, category=Car, driverName=Rahul, totaldistance=2500.0]
2
Driver [driverId=101, category=Car, driverName=Vilas, totaldistance=1000.0]
Driver [driverId=102, category=Car, driverName=Rahul, totaldistance=2500.0]
Driver [driverId=102, category=Car, driverName=Rahul, totaldistance=2500.0]
```

The lines show, in order: the category check, the driver found by ID, the number of Car drivers, both Car drivers, and the driver with the maximum distance.

## Technologies

- Java
- Java standard library

## Concepts practiced

- Classes and objects
- Constructors
- Encapsulation with private fields, getters, and setters
- Methods, parameters, and return values
- Arrays and `for` loops
- Conditional statements
- Returning objects and arrays
- Overriding `toString()`

## Project structure

```text
Thomas-Travels-Driver-Management/
├── README.md
├── Driver.java
├── TestDriver.java
└── Travel.java
```

## How to run

You need a JDK installed. From the project folder, compile the Java files and run the test/demo class:

```bash
javac -d out *.java
java -cp out com.TestDriver
```

In an IDE such as Eclipse, create a Java project, place these files in the `com` package, then run `TestDriver.java` as a Java application.

## Future improvements

- Handle an empty driver array and a search for an ID that does not exist with clearer results.
- Compare category names without case sensitivity and validate input values.
- Replace the fixed-size array with an `ArrayList` as a next step in learning collections.
- Add automated unit tests and separate test code from the application code.

## Author

Vilas Mummadi — [GitHub profile](https://github.com/vilasmummadi)
