# ✈️ Airlines Booking Automation

This repository contains an automated testing framework for an **Airlines Booking Web Application**, developed using **Selenium**, **TestNG**, and **Java**.  
The goal of this project is to automate core booking functionalities — from searching for flights to confirming bookings — ensuring reliability and consistency in UI testing.

---

## 🚀 Project Overview

This project automates different scenarios of an airline booking system.  
It is designed following the **Page Object Model (POM)** structure to maintain scalability, readability, and reusability.

### ✅ Key Features
- Automated UI testing using **Selenium WebDriver**
- Built with **Java** and **TestNG**
- **Page Object Model (POM)** for clean code organization
- Test execution via **Maven** and **TestNG**
- Easily maintainable and extendable test structure

---

## 🧰 Tools & Technologies

| Category | Tools / Frameworks |
|-----------|--------------------|
| Language | Java |
| Build Tool | Maven |
| Test Framework | TestNG |
| Automation Tool | Selenium WebDriver |
| Design Pattern | Page Object Model (POM) |
| IDE | IntelliJ IDEA |

---

## 🗂️ Project Structure
```
src/
 ├── main/
 │    └── java/
 │         └── com.wsd.automation/
 │             └── base/
 │             └── pages/
 └── test/
      └── java/
      │    └── tests/
      │         └── utils/
      └── resources/
```

## Features Automated

### 1. User Authentication
- Launch the airline booking application
- Select the Flying From 
- Select the Flying to
- Select a specific date

---
## How to Run the Tests

1. **Clone the repository**
```bash
git clone https://github.com/rahmannazneen/airlines-booking-automation.git
```

2. **Install dependencies**:
```bash
mvn clean install
```

3. **Execute tests** (using TestNG):
```bash
mvn test
```

> Ensure you have the latest browser drivers (ChromeDriver) in your system path.

---

## Author

**Nazneen Rahman** – SQA Automation Engineer