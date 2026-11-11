# Modern App UI — Jetpack Compose

A multi-screen Android UI project built with Kotlin and Jetpack Compose. The repository includes screenshots of the landing, main, and profile pages, and uses Compose Navigation to host the app’s UI.

## Screenshots

| Landing page | Main page | Profile page |
|---|---|---|
| ![Landing page](screenshots/landing%20page.jpg) | ![Main page](screenshots/main%20page.jpg) | ![Profile page](screenshots/profile%20page.jpg) |

## Architecture

The app uses a lightweight, UI-focused structure. Android launches `MainActivity`, which enables edge-to-edge display and sets the Compose content to `AppNavigation()`. The `ui` package separates navigation, screens, reusable components, and theme files; `model` contains the `Trend` model.

```text
app/src/main/
├── AndroidManifest.xml
└── java/com/mustafa/project1/
    ├── MainActivity.kt          Android entry point; launches AppNavigation
    ├── model/
    │   └── Trend.kt             Trend data model
    └── ui/
        ├── components/          Reusable Compose UI components
        ├── navigation/          App navigation
        ├── screens/             Screen composables
        └── theme/               Compose theme
```

### UI flow

```text
Android launcher
      │
      ▼
MainActivity
      │ setContent { AppNavigation() }
      ▼
ui/navigation
      │
      ├── ui/screens
      ├── ui/components
      └── ui/theme

model/Trend.kt ── UI data model
```

The project is an Android app with a single `:app` Gradle module. The app module enables Compose and includes Material 3 and Navigation Compose dependencies.

## Tech stack

- Kotlin 2.0.21
- Jetpack Compose
- Material 3
- Navigation Compose
- Android Gradle Plugin 8.9.3
- Gradle 8.11.1

## Requirements

- Android Studio with Android SDK 36
- JDK 11
- Android device or emulator (minimum SDK 24)

## Build and run

Open the project in Android Studio and run the `app` configuration, or use the Gradle wrapper:

```bash
./gradlew assembleDebug
```

Run unit tests:

```bash
./gradlew test
```

Run Android instrumentation tests on a connected device or emulator:

```bash
./gradlew connectedAndroidTest
```

## Project configuration

The app’s Gradle configuration sets `minSdk` to 24 and `targetSdk` to 35. The application ID is `com.mustafa.project1`.
