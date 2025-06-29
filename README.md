# 6392654-Ritika-Kumari-Digital-Nurture-4.0-JavaFSE
This repository contains solutions to all assignments from the Cognizant Digital Nurture 4.0 Full Stack Engineer (Java) training program. Each solution is organized by module and includes well-documented code, following best practices in Java programming.

## Week-1_Algorithms_Data Structures
#### Ex-2_E-Commerce Platform Search Input(Solution folder)
      -Code
          -E-CommercePlatformSearchInput.java
      -Output
          -E-CommercePlatformSearchInput_OUTPUT(Image)
####  Ex-7_Financial Forecasting(Solution folder)
      -Code
          -FinancialForecasting.java
      -Output
          -FinancialForecasting_OUTPUT(Image)
### Algorithms_Data Structures.pdf

          
## Week-1_Design Pattern and Principles
#### Ex-1_Implementing the Singleton Pattern(Solution folder)
      -Code
          -Logger.java
          -Main.java
      -Output
          -SingletonPatternExample_OUTPUT(Image)
####  Ex-2_Implementing the Factory Method Pattern(Solution folder)
      -Code
          -Document.java
          -DocumentFactory.java
          -ExcelDocument.java
          -ExcelDocumentFactory.java
          -Main.java
          -PdfDocument.java
          -PdfDocumentFactory.java
          -WordDocument.java
          -WordDocumentFactory.java
      -Output
          -FactoryMethodPatternExample_OUTPUT(Image)
###  Design Pattern and Principles.pdf



## Week-2_PL-SQL Programming

### Exercise-1_Control Structures
#### Overview:
This assignment focuses on implementing PL/SQL control structures to solve three banking scenarios:
1. Applying a 1% discount to loan interest rates for customers above 60 years old.
2. Promoting customers to VIP status based on a balance exceeding $10,000.
3. Sending reminders for loans due within the next 30 days.

#### Code:
The `code` folder includes the following SQL files:
- **createTable.sql**: Creates the `Customers` and `Loans` tables with appropriate columns and constraints.
- **insertData.sql**: Inserts sample data into the `Customers` and `Loans` tables for testing.
- **scenario01.sql**: PL/SQL block to apply a 1% interest rate discount for customers over 60.
- **scenario02.sql**: PL/SQL block to set `IsVIP` to `TRUE` for customers with balances over $10,000.
- **scenario03.sql**: PL/SQL block to print reminders for loans due within 30 days.

The `output` folder contains screenshots of the outputs

**OUTPUT :**
- Customers_table_OUTPUT
- Loans_table_OUTPUT
- Scenario 1_OUTPUT
- Scenario 2_OUTPUT
- Scenario 3_OUTPUT


### Exercise-3_Stored Procedures
#### Overview:
This assignment focuses on implementing PL/SQL stored procedures to manage banking operations for accounts and employees. The scenarios include:
1. Processing monthly interest for savings accounts.
2. Updating employee salaries with a bonus based on department performance.
3. Transferring funds between customer accounts with balance validation.

#### Code:
The `code` folder includes the following SQL files:
- **createTable.sql**: Creates the `Accounts` and `Employees` tables with appropriate columns and constraints.
- **insertData.sql**: Inserts sample data into the `Accounts` and `Employees` tables for testing.
- **scenario01.sql**: Stored procedure `ProcessMonthlyInterest` to apply a 1% interest rate to savings accounts.
- **scenario02.sql**: Stored procedure `UpdateEmployeeBonus` to apply a bonus percentage to employee salaries in a specified department.
- **scenario03.sql**: Stored procedure `TransferFunds` to transfer funds between accounts with balance validation.

The `output` folder contains screenshots of the outputs.

**OUTPUT :**
- Accounts_table_OUTPUT
- Employees_table_OUTPUT
- Scenario 1_OUTPUT
- Scenario 2_OUTPUT
- Scenario 3_OUTPUT


## Week-2_SLF4J logging framework

### Overview
This project is an exercise to demonstrate logging error messages and warning levels using **SLF4J** with **Logback** as the logging implementation. The goal is to create a simple Java application that logs an error message and a warning message to the console. I implemented this using the SLF4J and Logback, as part of my learning journey in Java logging.

This project is built with Eclipse IDE for JAVA Developer.

### Prerequisites
- **Java**: JDK 21.
- **IDE**: Eclipse IDE for JAVA Developer.
- **Build Tool**: Maven.
- **Logging Framework**: SLF4J with Logback.

### Code:
TestErrorMessages.java :
The `TestErrorMessages` class demonstrates logging error and warning messages using SLF4J with Logback:
- **Setup**: Uses `LoggerFactory.getLogger(TestErrorMessages.class)` to create a logger instance for the `TestErrorMessages` class.
- **Main Method**:
  - Logs an error message: `"This is an error message"` using `logger.error`.
  - Logs a warning message: `"This is a warning message"` using `logger.warn`.
- **SLF4J Features**:
  - Uses SLF4J as the logging facade, with Logback as the backend to output logs to the console.
  - Demonstrates two logging levels: `ERROR` and `WARN`.

pom.xml :
Includes SLF4J and Logback dependencies:

**OUTPUT :**
- Maven_Test_for_TestErrorMessages_OUTPUT
- pom.xml_OUTPUT

### SLF4J Logging exercises.pdf



## Week-2_TDD using JUnit5 and Mockito

### JUnit_Basic Testing Exercises:

### Exercise-1_Setting Up Junit
## 📌 Objective
Set up a Java project using Maven and configure JUnit5 for writing and running unit tests in Eclipse IDE for JAVA Developer.

Code:
- Test3.java
- pom.xml

The `output` folder contains screenshots of the outputs.

**OUTPUT :**
- JUnit_Test_for_Test3_OUTPUT
- Maven_Test_for_Test3_OUTPUT
- pom.xml_OUTPUT

### Exercise-3_Assertions in JUnit
## Overview

This project demonstrates the use of various JUnit 5 assertions to validate test results in a Java application. The `AssertionsTest` class contains individual test methods, each showcasing a different JUnit assertion (`assertEquals`, `assertTrue`, `assertFalse`, `assertNull`, `assertNotNull`, `assertSame`, `assertNotSame`, `assertArrayEquals`, and `assertThrows`). The project is configured to run in Eclipse IDE for JAVA Developer with Maven .

### Added the Test Class

1. In `src/test/java`, create a package (e.g., `com.AssertionInJUnit`).
2. Created a new Java class named `Assertion`.

Code:
- Assertion.java
- pom.xml

## Test Descriptions

The `AssertionInJUnit` class includes the following test methods:

- `testAssertEquals`: Verifies that `2 + 3` equals `5`.
- `testAssertTrue`: Checks that `5 > 3` is true.
- `testAssertFalse`: Ensures `5 < 3` is false.
- `testAssertNull`: Confirms that `null` is null.
- `testAssertNotNull`: Verifies that a new `Object` is not null.

The `output` folder contains screenshots of the outputs.

**OUTPUT :**
- JUnit test_OUTPUT
- Maven test_OUTPUT
- pom.xml_OUTPUT

### Exercise-4_Arrange-Act-Assert(AAA) Pattern, Text Fixtures ,Setup and Teardown methods in JUnit
## Overview
This Assignment contains exercises demonstrating JUnit 5 testing concepts in a Java application. It includes: Organizing tests with the `Arrange-Act-Assert (AAA) pattern` and using setup/teardown methods with `@BeforeEach` and `@AfterEach`.

The Assignment is configured to run in Eclipse IDE for JAVA Developer with Maven.

## AAA Pattern
  - **Arrange**: Sets up inputs and expected results.
  - **Act**: Calls the method under test.
  - **Assert**: Verifies the result with assertions.

Code:
- Calculator.java
- CalculatorTest.java
- pom.xml

### Exercise : AAA Pattern and Setup/Teardown

#### Calculator.java
1. In `src/main/java/com.example`, created a Java class named `Calculator`.
2. In `src/test/java/com.example`, create a Java class named `CalculatorTest`.

## Exercise Descriptions

The `CalculatorTest` class tests a `Calculator` class using the Arrange-Act-Assert (AAA) pattern and setup/teardown methods:
- **Setup (`@BeforeEach`)**: Initializes a `Calculator` instance before each test.
- **Teardown (`@AfterEach`)**: Sets the `Calculator` to `null` after each test.
- **Tests**:
  - `testAdd`: Verifies `5 + 3 = 8`.
  - `testSubtract`: Verifies `5 - 3 = 2`.
- **AAA Pattern**:
  - **Arrange**: Sets up inputs and expected results.
  - **Act**: Calls the method under test.
  - **Assert**: Verifies the result with assertions.

The `output` folder contains screenshots of the outputs.

**OUTPUT :**
- JUnit_Test_for_CalculatorTest_OUTPUT
- Maven_Test_for_CalculatorTest_OUTPUT
- Maven_Test_for_Calculator_OUTPUT
- pom.xml_OUTPUT

### JUnit Basic Testing Exercises.pdf

### Mockito exercises

### Exercise-1_Mocking and Stubbing
## Overview
This project contains exercises demonstrating Mocking and stubbing an external API using Mockito.

The project is built with Eclipse IDE for JAVA Developer .

## Prerequisites
- **Java**: JDK 21.
- **IDE**: Eclipse IDE for JAVA Developer.
- **Build Tool**: Maven.
- **Testing Framework**: JUnit 5 (Jupiter).
- **Mocking Library**: Mockito.

### Code:
- ExternalApi.java
- MyService.java
- TestCase.java
- pom.xml

### Process:
1. In `src/main/java/com.mockito.stubbing`, created an interface named `ExternalApi`
2. In `src/main/java/com.mockito.stubbing`, created a class named `MyService`
3. In `src/test/java/com.mocking.stubbing`, created a class named `TestCase`

## Exercise Descriptions : Mocking and Stubbing
The `MyServiceTest` class demonstrates mocking and stubbing an `ExternalApi` using Mockito:
- **Setup**: Uses `@ExtendWith(MockitoExtension.class)` and `@Mock` to create a mock of `ExternalApi`.
- **Tests**:
    - `TestExternalApi`: Stubs `getData` to return "Mock Data" and verifies the service returns it.
- **Mockito Features**:
    - Stubbing with `when(...).thenReturn(...)`.

The `output` folder contains screenshots of the outputs.

**OUTPUT :**
- JUnit_Test_for_TestCase_OUTPUT
- Maven_Test_for_ExternalApi_OUTPUT
- Maven_Test_for_MyService_OUTPUT
- Maven_Test_for_TestCase_OUTPUT
- pom.xml_OUTPUT


## Exercise-2_Verifying Interactions

## Overview
This project is an exercise to demonstrate verifying method interactions using **Mockito** and **JUnit 5**. The goal is to ensure that the `performUpload` method in the `DataUploader` class calls the `upload` method of the `NetworkClient` interface with specific arguments . I used the Mockito JUnit 5 Extension to simplify the test setup.

This project is built with Eclipse IDE for JAVA Developer as part of my learning journey in Java unit testing.

## Prerequisites
- **Java**: JDK 21.
- **IDE**: Eclipse IDE for JAVA Developer.
- **Build Tool**: Maven.
- **Testing Framework**: JUnit 5 (Jupiter).
- **Mocking Library**: Mockito.

### Code:
- DataUploader.java
- NetworkClient.java
- TestDataUploader.java
- pom.xml

### Process:
1. In `src/main/java/com/mockito`, created an interface named `NetworkClient`
2. In `src/main/java/com/mockito`, created a class named `DataUploader`
3. In `src/test/java/com/mockito`, created a class named `TestDataUploader`

## Exercise Descriptions: Interaction Verification
The `MyServiceTest` class demonstrates verifying method interactions using Mockito and the JUnit 5 Extension:
- **Setup**: Uses `@ExtendWith(NetworkClient.class)` to enable Mockito integration and `@Mock` to create a mock of `NetworkClient`. The `performUpload` method initializes `DataUploader` with the mock.
- **Test**:
  - `testUploadCalledWithCorrectArgument`: Creates mock `Mockito.mock(NetworkClient.class)` and Call method with specific argument is called using `verify(mockClient).upload("TestPayload")`.
- **Mockito Features**:
  - Uses `verify` to check method interactions with specific arguments.
  - Leverages the Mockito JUnit 5 Extension for simplified mock management.

The `output` folder contains screenshots of the outputs.

**OUTPUT :**
- JUnit_Test_for_TestDataUploader_OUTPUT
- Maven_Test_for_DataUploader_OUTPUT
- Maven_Test_for_NetworkClient_OUTPUT
- Maven_Test_for_TestDataUploader_OUTPUT
- pom.xml_OUTPUT

### Mockito Exercises.pdf
