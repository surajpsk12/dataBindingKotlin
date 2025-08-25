# 🔗 DataBindingApp - Android Data Binding Demo (Kotlin)

> **An Android application showcasing the use of the Data Binding Library in Kotlin to bind UI components
> in layouts to data sources in your app code directly, reducing boilerplate code.**

---

## 🚀 Features

-   **Data Binding Implementation:** Demonstrates setting up and using Data Binding in an Android project.
-   **Binding Data to Views:** Shows how to bind a data object (`Vehicle.kt`) to UI elements in `activity_main.xml`.
    -   Displays properties of the `Vehicle` object (e.g., name, model year) directly in the layout.
-   **Binding Click Handlers:** Implements click event handling using data binding with a custom `VehicleClickListner.kt`.
-   **Reduced Boilerplate:** Illustrates how Data Binding can minimize `findViewById` calls and simplify UI updates.
-   **Gradle Setup:** Includes the necessary `build.gradle.kts` configuration to enable data binding.

---

## 🛠️ Tech Stack

-   **Language:** Kotlin
-   **UI:** XML with Data Binding expressions
-   **Core Components:** Android SDK, Android Data Binding Library
-   **Jetpack Libraries:**
    -   `androidx.databinding:databinding-runtime` (and related data binding artifacts)
-   **UI Elements:** Likely `TextViews`, `Buttons` etc., within `activity_main.xml` bound to data.

---

## 📁 Project Structure (Simplified)

```
com.surajvanshsv.databindingapp/ 
├── MainActivity.kt             # Main activity setting up data binding
├── Vehicle.kt                  # Data class (e.g., for a vehicle)
├── VehicleClickListner.kt      # Class to handle click events via data binding
├── res/
│   ├── layout/
│   │   └── activity_main.xml   # Layout file utilizing data binding expressions
│   └── values/                 # colors.xml, strings.xml, styles.xml
├── build.gradle.kts (Module :app) # Gradle build file with dataBinding enabled
└── AndroidManifest.xml
```


---

## ⚙️ Installation & Run

1.  **Clone this repo:**
    ```
    git clone https://github.com/surajpsk12/dataBindingKotlin.git
    cd dataBindingKotlin
    ```

2.  **Open in Android Studio.**

3.  **Ensure Data Binding is enabled in your `app/build.gradle.kts` file:**
    ```kotlin
    android {
        // ...
        buildFeatures {
            dataBinding = true
        }
    }
    ```

4.  **Run the app on an emulator or physical device.**

---

## ✨ Key Concepts Demonstrated

-   **Enabling Data Binding:** How to set `dataBinding = true` in `build.gradle.kts`.
-   **Layout Variables:** Using the `<data>` tag in XML to declare variables (e.g., `<variable name="myVehicle" type="com.surajvanshsv.databindingapp.Vehicle"/>`).
-   **Binding Expressions:** Using `@{}` syntax to set view attributes (e.g., `android:text="@{myVehicle.name}"`).
-   **Event Handling:** Binding methods to events (e.g., `android:onClick="@{() -> clickHandler.onVehicleClicked(myVehicle)}"`, though your `VehicleClickListner` might be set up differently, directly passing the listener instance).
-   **`DataBindingUtil`:** Using `DataBindingUtil.setContentView()` to inflate layouts and obtain the binding class instance.

---

## ✨ Future Enhancements

-   ✅ Demonstrate Two-Way Data Binding with `EditTexts`.
-   ✅ Show usage of `@BindingAdapter` for custom view properties.
-   ✅ Implement `ObservableFields` or `ObservableObjects` for automatic UI updates when data changes.
-   ✅ Use Data Binding with `RecyclerView` adapters.
-   ✅ Include examples of binding converters.

---

## 🤝 Contribution

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change or improve.

---

## 📜 License

MIT © 2024 [Suraj Kumar](https://github.com/surajpsk12)

---

## 🌐 Connect With Me

*   🔗 [LinkedIn - Suraj Kumar](https://www.linkedin.com/in/surajvansh12/)
*   💻 [GitHub - surajpsk12](https://github.com/surajpsk12)
