[README.md](https://github.com/user-attachments/files/27088695/README.md)
# Myth or Fact – Quiz App

## Purpose of the Application

This application was developed for the IMAD Assignment 2, which required students to build a small Android quiz game using Kotlin in Android Studio.

The purpose of the app is to test a user's general knowledge by presenting them with a series of statements and asking them to decide whether each one is a **fact (true)** or a **myth (false)**. The app is designed to be simple, interactive, and beginner-friendly, both from a user experience and from a development point of view.

The app consists of three screens:
- A **Welcome Screen** that greets the user and explains the game
- A **Quiz Screen** where the user answers 10 true/false questions and receives instant feedback
- A **Results Screen** that displays the user's final score and allows them to review the correct answers via a memo

The goal was to create an entertaining and educational experience that encourages users to think about common facts and myths.

## Design Considerations

### Layout & Structure
The app follows a clean, minimal layout using `ConstraintLayout` on all three screens. This layout was chosen because it allows control over the positioning of user interface elements on different screen sizes. This is important for ensuring the app looks good on a different Android devices.

Each screen was designed with a clear visual hierarchy:
- A **heading** at the top to orient the user
- **Content** (questions, scores, messages) in the middle
- **Action buttons** at the bottom so they are easy to reach with a thumb

### Consistency & Theme
A consistent theme was applied across the three screens to give the app a flowing feel. This includes using the same, easy to read, font for headings. The same button sizing and style and consistent spacing between elements. This ensures the user does not feel like they are navigating between unrelated screens.

### Font Sizes
Larger font sizes (`24sp` and above) were used deliberately to improve readability, especially for users on smaller screens or those with visual impairments. The question text and score text were also given generous sizing to ensure comfort during gameplay.

### Button Design
Two answer buttons (TRUE and FALSE) were placed side by side to make the choice visually obvious and quick to tap. The START and RESULTS buttons were centred and given a fixed width to make them stand out as primary action buttons. The MEMO and CLOSE buttons on the Results screen were placed side by side at the bottom for easy access after reviewing the score.

### User Feedback
A dedicated 'TextView' on the Quiz screen provides immediate feedback after each answer (✅ Correct! or ❌ Wrong!). This was a design decision to keep the user engaged and informed without navigating away from the quiz screen.

## Utilisation of GitHub

GitHub was used throughout this project as a **version control system** to track changes, manage the codebase, and submit the final project.

### How GitHub Was Used
- A repository was generated via the school-provided link on Arc and accepted via the emailed invite
- **GitHub Desktop** was used to commit and push code changes to the remote repository
- Commits would have been made **incrementally** as new features were completed, rather than in one large commit at the end. (Unfortunately I had to do only large commit as my laptop was in for repairs. 
-  For example:
  - Initial project setup and layout files added
  - Welcome screen layout and navigation logic added
  - Quiz screen layout completed
  - Quiz logic implemented (questions, answers, scoring)
  - Results screen layout and logic completed
  - README added and final review

### Why GitHub Is Important for Developers
GitHub is an industry-standard tool used by developers around the world. It is important for several reasons:

- **Version Control** — It allows developers to track every change made to a project, making it easy to go back to a previous version if something breaks
- **Collaboration** — Teams can work on the same codebase simultaneously without overwriting each other's work, using branches and pull requests
- **Backup** — Code stored on GitHub is safely backed up in the cloud, protecting against local data loss
- **Accountability** — Commit histories provide a clear record of who changed what and when, which is valuable in both academic and professional settings
- **Portfolio** — A GitHub profile showcases a developer's work and growth over time to potential employers

## Utilisation of GitHub Actions

GitHub Actions is a **Continuous Integration / Continuous Delivery** tool built directly into GitHub. It allows developers to automate workflows that run automatically when certain events happen in a repository, such as pushing new code or opening a pull request.

### What GitHub Actions Can Do for an Android Project
For an Android application like this one, GitHub Actions can be configured to automatically:

- **Build the app** every time new code is pushed, ensuring the project compiles correctly and no breaking changes have been introduced
- **Run unit tests** to verify that the app's logic behaves as expected after every change
- **Generate an APK** automatically so the latest version of the app is always available for download and testing
- **Enforce code quality** by running linting tools that flag bad practices or formatting issues

### Why This Matters
Without GitHub Actions, a developer would need to manually build and test their app every time a change is made. This is time-consuming and prone to human error. By automating these steps, GitHub Actions ensures that the codebase remains stable and that issues are caught early, before they make it into the final product.

### Links

- **Youtube Video** https://youtu.be/iNHsOKAOTyk
- **GIT Repository** https://github.com/ST10520118/Hack-or-Myth-app
