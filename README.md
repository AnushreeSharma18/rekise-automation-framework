# RekiSe Marine -- UI Automation Framework

### Selenium + TestNG \| Page Object Model \| Mock UI Testing

This project is created as part of the **RekiSe Marine -- UI Test
Engineer Assessment**.\
It includes a complete automation framework built using **Selenium
WebDriver**, **TestNG**, and the **Page Object Model (POM)**.\
A mock HTML dashboard simulates three vessels, their status, mission
details, and a Return-to-Base API trigger.

------------------------------------------------------------------------

## 📁 Project Structure

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

------------------------------------------------------------------------

## 🧪 Automated Test Cases

### ✔ Test 1 -- Verify All Vessels Appear

-   3 vessel cards are displayed\
-   1 vessel is offline\
-   UI shows correct vessel names and status

### ✔ Test 2 -- Verify Details Modal

-   Clicking **"Details"** opens a modal\
-   Mission name matches the vessel\
-   Sub-systems (**Propulsion & Battery**) show expected values

### ✔ Test 3 -- Verify Return-to-Base API Trigger

-   Clicking **"Return to Base"** logs:\
    `"API Simulation: /return-to-base"`\
-   Uses **browser console log capture** via Selenium

------------------------------------------------------------------------

## ⚙️ Setup Instructions

### 1. Install Requirements

-   Java **17 or later**\
-   Maven\
-   Chrome browser\
-   ChromeDriver (**auto-managed via WebDriverManager**)

------------------------------------------------------------------------

### 2. Clone the Repository

``` bash
git clone https://github.com/<user>/rekise-ui-automation.git
cd rekise-ui-automation
```

------------------------------------------------------------------------

### 3. Place the Dashboard HTML File

Save the provided `dashboard.html` in:

    /resources/dashboard.html

------------------------------------------------------------------------

### 4. Install Dependencies

``` bash
mvn clean install
```

------------------------------------------------------------------------

### 5. Run Tests

#### Using TestNG XML

``` bash
mvn test -DsuiteXmlFile=testng.xml
```

#### Or run individual tests

from your IDE (IntelliJ / Eclipse).

------------------------------------------------------------------------

## 🏗 Framework Design

### 🧱 Page Object Model (POM)

  Page              Description
  ----------------- --------------------------------------------
  `DashboardPage`   Handles vessel cards, details button
  `ModalPage`       Handles modal interactions, subsystem data

------------------------------------------------------------------------

### 🛠 Base Test Class

Handles: - ChromeDriver setup\
- Implicit waits\
- Browser teardown

------------------------------------------------------------------------

### 🧪 TestNG Integration

Used for: - Assertions\
- Test execution flow\
- Reporting
