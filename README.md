
# SnapSkills - Bite-Sized Coding Education Platform

A brief description of what this project does and who it's for

SnapSkills is a versatile education platform designed to make learning engaging and effective through interactive 1-minute lessons, scroll-up interactions, and gamified challenges. Inspired by platforms like Brilliant.org, TikTok, and Udemy, SnapSkills offers a fun and accessible way for individuals to acquire knowledge and skills across a broad range of topics, including **Coding,Mathematics, Physics**, and more.

This project encompasses the backend API, the frontend web application, and the mobile application.



## Key Features (MVP - July-Oct 2025)

* **Interactive Micro-Lessons:** Learn concepts across various subjects through concise, engaging lessons.
* **Scroll-Based Learning:** Progress through lessons and quizzes with a TikTok-like vertical scroll.
* **Gamified Challenges:** Earn XP points and unlock achievements to motivate learning in diverse subjects.
* **Course Catalog:** Browse available courses in **Coding, Physics, Mathematics**, and other disciplines.
* **User Progress Tracking:** Monitor your progress and XP within each course.
* **Instructor Course Builder (Web-Based):**
    * Create and manage new courses across various subjects.
    * Add lessons with video, text explanations, and quizzes.
    * Organize lessons within modules.
    * Intuitive drag-and-drop interface for course structure.
    * Live preview for web and app views.
* **Offline Access (Mobile App):** Download course resources (excluding videos) for learning without an internet connection.

## Tech Stack

### Frontend (User App)

* **Web:** Next.js, TailwindCSS
* **Mobile App (Android):** Native Android (Kotlin/Java)
* **Mobile App (iOS):** Native iOS (Swift/Objective-C)

### Backend

* **Language:** Java
* **Framework:** Spring Boot
* **Database:** PostgreSQL
* **In-Memory Data Store:** Redis
* **Authentication:** JWT
* **Storage (Videos/Images):** AWS S3
* **Analytics:** To be Decided
* **Deployment:**
    * **Web:** To be Decided
    * **Mobile App (Android):** Google Play Store
    * **Mobile App (iOS):** Apple App Store
    * **Backend:** To be Decided

## Getting Started

### Prerequisites

* **Backend:**
    * Java Development Kit (JDK) 17 or higher
    * Maven
    * PostgreSQL installed and running
    * Redis installed and running
    * Firebase project setup with credentials
* **Frontend (Web):**
    * Node.js (version 18 or higher recommended)
    * npm or yarn
* **Frontend (Mobile App - Android):**
    * Android Studio and Android SDK set up (refer to the official Android developer documentation)
    * Kotlin or Java knowledge
* **Frontend (Mobile App - iOS):**
    * Xcode and iOS SDK set up (refer to the official Apple developer documentation)
    * Swift or Objective-C knowledge

### Installation

Refer to the Setup folder

### Instructor Course Builder (Web)

The Course Builder interface is accessible through the web frontend at a specific route (e.g., `/admin/dashboard`). Ensure the backend API is running for the Course Builder to function correctly.

## Future Enhancements

* Advanced gamification features (leaderboards, badges).
* More diverse question types in the Quiz Builder.
* Instructor analytics dashboard with detailed user engagement metrics.
* AI-powered quiz generation and content suggestions across various subjects.
* Support for more topics.
* User feedback and commenting system.
* Integration with other learning platforms.
* Monetization features for instructors.

## Repositories

* **Backend API:** `/snapskills-backend`
* **Web Frontend:** `/snapskills/web`
* **Android App:** `/snapskills/android`
* **iOS App:** `/snapskills/ios`
* **Documentation:** `/snapskills-docs`

##  Contributing

We're building a passionate team of educators and developers. If you're interested in contributing , reach out at prateekgulati333@gmail.com or open an issue.



## License

[SnapSkills](https://github.com/prateekgulatidev/snapskills) © 2025 by [Prateek Gulati](https://github.com/prateekgulatidev) is licensed under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/)
