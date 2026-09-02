🎲 Dice Roller - Java

A simple Java console-based Dice Roller that allows the user to choose how many times the dice should be rolled. The program generates a random value between 1 and 6, displays the corresponding ASCII-art dice, and calculates the total sum of all rolls.

✨ Features
🎲 Roll a six-sided dice multiple times
🔢 User chooses the number of rolls
🎯 Generates random values from 1 to 6
🖼️ Displays each dice roll using ASCII art
➕ Calculates and displays the total sum
⚠️ Handles invalid input when the number of rolls is 0 or negative
🛠️ Technologies Used
Java
Scanner — for user input
Random — for generating dice values
for loop — for repeating dice rolls
switch expression — for displaying dice faces
Java Text Blocks — for formatting dice graphics
📋 How It Works
The program asks the user how many times they want to roll the dice.
The entered number is checked to make sure it is greater than 0.
For every roll:
A random number between 1 and 6 is generated.
The corresponding dice face is displayed.
The roll is added to the total.
After all rolls, the program displays the total sum.