
# Group 2 – Maven Regression Testing Using Azure Pipeline

## Experiments 5, 6, 7 and 8

This project contains four Java applications combined into
one Maven project, with JUnit 4 regression test cases
and an Azure DevOps CI pipeline.

## Software Requirements

- Java JDK 17
- IntelliJ IDEA
- Apache Maven
- Git
- GitHub
- Azure DevOps

## Project Structure

```text
Group-2-Maven-JUnit/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── Main.java
│   │
│   └── test/
│       └── java/
│           └── MainTest.java
│
├── pom.xml
├── azure-pipelines.yml
├── README.md
└── .gitignore
```

## Experiment 5 – Calculator Application

Perform the following operations:

- Addition
- Subtraction
- Multiplication
- Division
- Division-by-zero handling

JUnit tests verify all arithmetic operations
and division-by-zero handling.

Number of test cases: 5

## Experiment 6 – Student Pass or Fail

Determine whether a student has passed or failed.

- Marks >= 50: PASS
- Marks < 50: FAIL

JUnit test inputs:

- 35
- 50
- 75
- 100

Number of test cases: 4

## Experiment 7 – Leap Year Detection

Determine whether a given year is a leap year.

Rules:

- Divisible by 400: Leap year
- Divisible by 100: Not a leap year
- Divisible by 4: Leap year
- Otherwise: Not a leap year

JUnit test inputs:

- 2024
- 2023
- 1900
- 2000

Number of test cases: 4

## Experiment 8 – Purchase Discount Calculator

Apply a 10% discount when the purchase amount
is Rs. 1000 or more.

Otherwise, no discount is applied.

JUnit test inputs:

- Rs. 900
- Rs. 1000
- Rs. 1500

Number of test cases: 3

## Maven Configuration

The pom.xml file contains:

- Java 17 compiler configuration
- JUnit 4.13.2 dependency
- Maven Compiler Plugin
- Maven Surefire Plugin
- Maven JAR Plugin

## Execution Procedure

### Step 1: Compile the project

```bash
mvn clean compile
```

### Step 2: Run JUnit regression tests

```bash
mvn clean test
```

### Step 3: Package the application

```bash
mvn package
```

### Step 4: Execute the application

```bash
java -jar target/group2-1.0-SNAPSHOT.jar
```

Select the required experiment from the menu.

## JUnit Test Execution

The project contains 16 JUnit test cases.

| Experiment | Test Cases |
|---|---:|
| Calculator | 5 |
| Pass or Fail | 4 |
| Leap Year | 4 |
| Discount | 3 |
| Total | 16 |

Test reports are generated inside:

```text
target/surefire-reports/
```

## GitHub Commands

```bash
git init
git add .
git commit -m "Maven JUnit Regression Testing"
git branch -M main
git remote add origin YOUR_GITHUB_REPOSITORY_URL
git push -u origin main
```

For subsequent updates:

```bash
git add .
git commit -m "Update Group 2"
git push
```

## Azure DevOps Pipeline

The azure-pipelines.yml file configures:

1. GitHub source integration.
2. Ubuntu build environment.
3. JDK 17 configuration.
4. Maven clean and verify.
5. JUnit regression test execution.
6. JUnit test-result publishing.

## Verification

After executing the pipeline:

- Check the Maven build status.
- Verify all 16 tests have passed.
- Open the Tests tab in Azure DevOps.
- Verify the published JUnit test results.
- Confirm that the pipeline status is Succeeded.

## Result

Thus, four Java applications were developed using Maven,
JUnit regression tests were executed successfully,
and an Azure Pipeline was configured to automate
the build and test process.
