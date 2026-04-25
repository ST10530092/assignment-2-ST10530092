# Life Hack App!
- **Developer**: Kgopotso Thupi
- **Student Number**: ST10530092
- **Group**: N/A
- **Course**: Introduction to Mobile Application Development
- **Subject**: Introduction to Mobile Application Development

---

## Project Overview

The **Life Hack or Urban Myth?** app is a mobile application developed as part of an assignment in the Introduction to Mobile Application Development subject. This application was created using **Kotlin** and **Android Studio**. The app's primary purpose is to help users test their common sense by presenting popular life hack statements and challenging them to decide whether each one is a genuine productivity tip or just an urban myth. The app loops through 7 flashcard-style questions, gives instant feedback on each answer, tracks the user's score, and displays personalised feedback at the end. A review feature also allows users to revisit all the questions and their correct answers.

The app was developed to meet the requirements of the assignment, which includes creating a functional mobile app and utilizing GitHub for version control and CI/CD automation using GitHub Actions.

---

## Purpose and Features

### Purpose:
The main goal of this app is to present users with 7 life hack statements and allow them to decide whether each statement is a real "Hack" (True) or a "Myth" (False). The app uses a loop to cycle through all the questions, tracks the user's score, and provides personalised feedback based on how well they performed. This helps users learn real-world shortcuts while debunking common myths in a fun and interactive way.

### Key Features:
- Feature 1: A Welcome Screen displays a brief description of the app and a Start button to begin the quiz.
- Feature 2: A Flashcard Question Screen loops through 7 life hack statements, each with a "Hack" and "Myth" button, instant feedback after each answer, and a Next button to proceed.
- Feature 3: A Score Screen displays the user's total score, personalised feedback and a Review button that shows all questions with their correct answers

These features aim to provide an easy-to-use and fun way for users to maintain social connections by offering quick social interaction suggestions based on the time of day. The app helps users stay socially active even during busy schedules by simplifying decision-making and encouraging small, meaningful interactions

---

## Design Considerations

The design of the **Life Hack or Urban Myth?** app was based on the following key considerations:

1. **User Experience (UX)**: The app was designed with the goal of providing an intuitive and easy-to-navigate user interface, ensuring a seamless quiz experience across all three screens.

2. **Responsiveness**: The app was built to ensure it performs well on different screen sizes, with ConstraintLayout used throughout to adapt to different device dimensions.

3. **Simplicity**: The design is minimalistic and focused, using clear button labels and colour-coded feedback (green for correct, red for incorrect) so users always know what is happening.

4. **Performance**: Code was kept clean and efficient, using separate private functions for logic such as loadQuestion() and checkAnswer() to keep the code organised and easy to follow.
---

## GitHub and GitHub Actions

This project was managed using **GitHub** for version control, where all code changes were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to keep track of changes and maintain project integrity.

### GitHub Actions:
I utilized **GitHub Actions** to automate the build and deployment process. This includes:

- Running automated **tests** to ensure the appâ€™s functionality.
- Compiling the app into **APK** and **AAB** files, which are the formats required for distribution.
- Uploading these build artifacts to GitHub for easy access.

The workflow ensures that my project is automatically built and tested every time I push changes, and it simplifies the process of delivering the final APK/AAB files for submission.

---

## Screenshots

### App Screenshots:
<img width="1268" height="404" alt="Prompt to ChatGPT" src="https://github.com/user-attachments/assets/f3884a5c-c50e-49db-b00a-a4a270310fa1" />

*Caption for screenshot 1: attached are 3 screenshots of how my current app interface looks like, please generate a modern light blue-themed UI of this for reference, them I'll write the xml version of the idea *




<img width="1161" height="666" alt="Result after prompt to ChatGPT" src="https://github.com/user-attachments/assets/53a13916-5b96-4234-a70e-38569f23e592" />


*Caption for screenshot 2: This is the result after prompted with "attached are 3 screenshots of how my current app interface looks like, please generate a modern light blue-themed UI of this for reference, them I'll write the xml version of the idea"*
)
### Video Demo:
A video showcasing the app's functionality can be viewed here: [[YouTube Video Link]](https://youtu.be/wJ2KqhNyRww?si=4hZolyv-e-R-h811).

---

## Challenges and Learnings

During the development of this project, I encountered several challenges, including:

1. **Challenge 1**: Navigating between the three screens and correctly passing the score value using Intent extras was initially tricky.
   - **Solution**: I used intent.putExtra("score", score) in the Quiz screen and intent.getIntExtra("score", 0) in the Score screen, following the same pattern used in the previous flashcard assignment.

2. **Challenge 2**: Preventing users from answering the same question more than once after selecting Hack or Myth.
   - **Solution**: I disabled both answer buttons immediately after a selection using hackBtn?.isEnabled = false and mythBtn?.isEnabled = false, and only re-enabled them when the next question loaded.

From these challenges, I learned important lessons in multi-screen navigation, passing data between activities, and writing clean, user-friendly logic in Kotlin.

---

## Future Enhancements

While the current version of the app provides the core functionality, there are several features that could be added in the future, including:

1. **Feature 1**: Adding more life hack questions and randomising the order each time the quiz is played to keep it fresh.
2. **Feature 2**: Adding a difficulty setting where users can choose between categories such as Health, Tech, or Everyday Hacks.
3. **Feature 3**: Implementing a leaderboard or high score tracker so users can try to beat their previous scores.
---

## References

1. Android Developers. (n.d.). Android Developer Documentation. Available at: https://developer.android.com/
Used for understanding Android layout components, Intent navigation, and activity lifecycle.

2. OpenAI. (2026). ChatGPT (Large language model). Available at: https://chat.openai.com/
Used for assistance with debugging and understanding Kotlin concepts.

---

## List of Figures

- **Figure 1**: Screenshot of the Welcome Screen showing the app title, description, and Start button.
  <img width="799" height="717" alt="Screen 1" src="https://github.com/user-attachments/assets/28a3ee4a-f486-4b95-9de5-52560ff237a8" />

- **Figure 2**: Screenshot of the Quiz Screen showing a life hack statement with Hack and Myth answer buttons.
  <img width="787" height="698" alt="Screen 2" src="https://github.com/user-attachments/assets/ddc24414-746b-4a71-9dae-53a45dc4668c" />

- **Figure 3**: Screenshot of the Score Screen showing the user's total score and personalised feedback.
<img width="727" height="670" alt="Screen 3" src="https://github.com/user-attachments/assets/55b6bbcf-7c17-4601-8761-f3c7cde67364" />


---

## Disclosure of AI Usage in My Assessment

In the development of this project, I have used generative AI tools to assist in various parts of the assignment. Below is a detailed disclosure of where and how these tools were used:

### 1. Section(s) in which Generative AI was used:
- **Kotlin Code**: AI was used to assist with understanding how to pass data between activities using Intent extras and how to disable buttons after user interaction to prevent duplicate answers.

### 2. Name of AI Tool(s) Used:
- **ChatGPT** (OpenAI)

### 3. Purpose/Intention Behind Use:
- **Code Assistance**: Used to help understand Kotlin concepts, debug logic errors, and get guidance on Android Studio project structure.

### 4. Date(s) in Which Generative AI Was Used:
- AI assistance was used during development to help resolve specific coding questions related to Intent navigation and UI state management.

  
