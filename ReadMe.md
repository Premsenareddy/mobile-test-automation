⭐ Mobile Test Automation Framework
Enterprise-grade Mobile Automation (Android/iOS) using Java, Appium, TestNG, Maven & BDD
















A modular, scalable Mobile Test Automation Framework designed for modern enterprise apps. Supports Android & iOS, built with Appium, Java 17, Maven, TestNG, Cucumber BDD, Extent reporting, and parallel execution.

This repository demonstrates:

Clean automation architecture (POM + Driver Factory)

BDD + TestNG hybrid automation

Multi-environment test execution

API utility for backend validations

Cloud execution (PCloudy-ready)

Highly reusable screen objects

CI/CD-friendly structure

📁 Project Structure
mobile-test-automation
│
├── pom.xml                          # Maven project config
├── testng.xml                       # TestNG execution suite
├── .gitignore
│
├── src
│   ├── main
│   │   ├── java/com/appium
│   │   │   ├── base/               # BaseClass, AppiumServer handling
│   │   │   ├── driver/             # DriverManager, Factory, PCloudy support
│   │   │   ├── screens/            # Page Objects (Android/iOS)
│   │   │   ├── utils/              # CommonUtils, WaitUtil, Json, PropertyUtil
│   │   │   └── exception/          # Custom exceptions
│   │   └── resources               # Log4j, configs
│   │
│   └── test
│       ├── java/com/appium
│       │   ├── features/           # Cucumber Feature Files (BDD Scenarios)
│       │   ├── stepDefinitions/    # Step definitions
│       │   ├── runner/             # TestRunner (Cucumber + TestNG)
│       │   └── hooks/              # Test hooks
│       │
│       └── resources
│           ├── testData/           # JSON test data
│           ├── properties/         # dev/sit configs
│           └── extent.properties   # Reporting config
│
├── scripts/maven-test.sh           # CLI execution helper
├── .buildkite/pipeline.yaml        # CI pipeline (optional)
└── ReadMe.md

🏗 High-Level Architecture
                +-------------------------------------+
                |             Test Runner              |
                |     (TestNG + Cucumber BDD)          |
                +-----------------+--------------------+
                                  |
                +-----------------+--------------------+
                |           Step Definitions           |
                | (BDD layer mapping feature → logic)  |
                +-----------------+--------------------+
                                  |
                +-----------------+--------------------+
                |     Page Object Model (Screens)      |
                |   (UI interactions, gestures, waits) |
                +-----------------+--------------------+
                                  |
                +-----------------+--------------------+
                |     Driver Factory / Appium Setup    |
                |  Local / Cloud / PCloudy Execution   |
                +-----------------+--------------------+
                                  |
                +-----------------+--------------------+
                |  Application Under Test (Android/iOS) |
                +---------------------------------------+

🚀 Running Tests
1️⃣ Install dependencies
mvn clean install -DskipTests

2️⃣ Execute full test suite
mvn test

3️⃣ Run specific TestNG suite
mvn test -DsuiteXmlFile=testng.xml

4️⃣ Run Cucumber feature
mvn test -Dcucumber.filter.tags="@smoke"

5️⃣ Parallel execution

Enabled via TestNG XML + thread configs:

mvn test -Dthread.count=5

📱 Mobile Execution (Appium)

Ensure Appium server is running:

appium


Update device capabilities in:

src/test/resources/properties/config_dev.properties
src/test/resources/properties/config_sit.properties

🌐 API Testing Support

A built-in API utility (RestUtil) supports:

GET/POST/PUT/PATCH requests

JSON payload builders

Header management

Backend validation during end-to-end flows

Useful for hybrid UI + API test journeys.

📊 Reporting
✔ Extent Reports

Auto-generated HTML reports in:

/Report/

✔ Screenshots on failure

Captured automatically in:

/log/ or /screenshots/

🤖 CI/CD Integration
Buildkite pipeline ready

.buildkite/pipeline.yaml

Add this step:

steps:
  - label: "Run Mobile Regression"
    command: mvn test
    agents:
      queue: default


Also compatible with:

GitHub Actions

Jenkins

Azure DevOps

GitLab CI

🛠 Tech Stack Summary
Category	Tools
Language	Java 17
Test Runner	TestNG
BDD	Cucumber
Mobile Automation	Appium
API Testing	RestUtil
Build Tool	Maven
Reporting	ExtentReports
Cloud Execution	PCloudy
Architecture	POM + Driver Factory
CI/CD	Buildkite / GitHub Actions ready
🎯 Purpose of This Framework

This repository demonstrates:

Senior-level mobile automation engineering

End-to-end feature coverage of real banking flows

BDD + POM patterns for maintainable automation

Cloud-device execution readiness

Integration of UI + API validations

Industry-standard architecture for enterprise QA teams

Ideal for interviews, portfolio demonstration, and real-world mobile automation.

📬 Contact

Premsena Reddy Anumandla
Senior QA Automation Engineer

📌 GitHub: @Premsenareddy
📌 LinkedIn: https://www.linkedin.com/in/premsena-anumandla-a802b4179/
