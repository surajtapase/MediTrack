# MediTrack – Setup Instructions

## Prerequisites
- JDK 17 (Microsoft OpenJDK)
- IntelliJ IDEA
- Windows / macOS / Linux
- Git (optional)

## Project Setup
1. Clone or download the project.
2. Open IntelliJ IDEA.
3. Click **Open** → select the `MediTrack` folder.
4. Ensure Project SDK is set to **Java 17**.
5. Mark `src/main/java` as **Sources Root** if required.

## Run the Application
1. Navigate to:
   src/main/java/com/airtribe/meditrack/Main.java
2. Right-click → **Run Main**
3. Use the console menu to interact with the system.

## Folder Structure
- `entity` → Domain models
- `service` → Business logic
- `exception` → Custom exceptions
- `constants` → Global constants
- `util` → In-memory datastore
- `test` → Manual test runners
- `docs` → Documentation
