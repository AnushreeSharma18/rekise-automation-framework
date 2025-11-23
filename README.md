RekiSe Marine – UI Automation Framework
Selenium + TestNG | Page Object Model | Mock UI Testing

This project is created as part of the RekiSe Marine – UI Test Engineer Assessment.
It includes a complete automation framework built using Selenium WebDriver, TestNG, and Page Object Model (POM).
A mock HTML dashboard simulates three vessels, their status, mission details, and a Return-to-Base API trigger.

 Project Structure
rekise-ui-automation/
│
├── README.md
├── test_plan.md
├── testng.xml
│
├── src
│   └── test
│       └── java
│           └── com.reksise
│               ├── base
│               │   └── BaseTest.java
│               ├── pages
│               │   ├── DashboardPage.java
│               │   └── ModalPage.java
│               └── tests
│                   ├── VesselDisplayTest.java
│                   ├── VesselDetailsTest.java
│                   └── ReturnToBaseTest.java
│
└── resources
    └── dashboard.html



Automated Test Cases 


Test 1 – Verify All Vessels Appear

3 vessel cards are displayed

1 vessel is offline

UI shows correct vessel names and status



Test 2 – Verify Details Modal

Clicking “Details” opens a modal

Mission name matches the vessel

Sub-systems (Propulsion & Battery) display expected values



Test 3 – Verify Return-to-Base API Trigger

Clicking the “Return to Base” button logs
"API Simulation: /return-to-base"

Uses browser console log capture via Selenium



Setup Instructions

1. Install Requirements

Java 17 or later

Maven

Chrome browser

ChromeDriver (auto-managed via WebDriverManager)


2. Clone the Repository

git clone https://github.com/<your-username>/rekise-ui-automation.git
cd rekise-ui-automation

3. Place the Dashboard HTML File

Save the provided dashboard.html in:

/resources/dashboard.html


4. Install Dependencies
mvn clean install


5. Run Tests

Use TestNG XML:

mvn test -DsuiteXmlFile=testng.xml


Or run individual tests from your IDE.



Framework Design

-Page Object Model

DashboardPage → vessel cards, details button

ModalPage → modal interactions, subsystem information

-Base Test Class

Handles:

Chrome setup

Implicit waits

Browser teardown

-TestNG

Used for:

Assertions

Test execution

Reporting
