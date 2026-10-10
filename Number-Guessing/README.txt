# Number Guessing Game

A simple console-based Java game in which the player tries to guess a randomly generated number between 1 and 100.

## Features

- Generates a random number between 1 and 100.
- Accepts guesses from the user.
- Displays hints when the guess is too high or too low.
- Counts the number of attempts.
- Displays a congratulatory message when the correct number is guessed.

## Technologies Used

- Java
- Java Scanner
- Java Math

## Concepts Practiced

- Loops (`while`)
- Conditional statements (`if-else`)
- User input using `Scanner`
- Random number generation using `Math.random()`
- Attempt counting
- Basic problem-solving

## How to Run

1. Make sure Java is installed.
2. Open a terminal in the project folder.
3. Compile the program:

   `javac NumberGuessing.java`

4. Run the program:

   `java NumberGuessing`

## Sample Output

```text
======Welcome to the Number Guessing Game======
Enter your guess (1-100): 40
Too low! Try again.
Enter your guess (1-100): 75
Too high! Try again.
Enter your guess (1-100): 60
Congratulations! You've guessed the number in 3 attempts.
```

## Purpose

This project was created to practice Java fundamentals, conditional statements, loops, user input, and random number generation.