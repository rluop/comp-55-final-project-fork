// NEW FEATURE: CHANGE DIFFICULTY

The feature that I will implement in this iteration of the COMP 55 project is a difficulty system. Players will have the option to click a fourth button in the main menu that will lead them to another screen with four more buttons, "Normal", "Fast", and "Faster", which will allow them to change the starting difficulty of the game, and a "Back" button which will take them back to the main menu. After a difficulty button is clicked, a file will store an input based on the difficulty chosen. They will go then back to the main menu to start the game, where the game will load a new game, taking the value from the file as input to determine how fast the blocks fall.

// PSUEDOCODE

    if change difficulty button is clicked
        switch to difficulty screen
        if difficulty 1 button is clicked
            change file's contents to contain difficulty 1 value
        if difficulty 2 button is clicked
            change file's contents to contain difficulty 2 value
        if difficulty 3 button is clicked
            change file's contents to contain difficulty 3 value

    if back button is clicked
        switch to main menu screen

// PROOF OF IMPLEMENTATION

There is a timer at the top left of the game that indicates how long the game has been running, which will be used to show the feature has been implemented.

For the "Normal" difficulty, it takes the block 19 seconds to reach the top.
![image](https://github.com/rluop/comp-55-final-project-fork/assets/114570853/7d96633c-5a09-49e2-b5d9-a6d63216294a)\

For the "Fast" difficulty, it takes the block 9 seconds to reach the top.
![image](https://github.com/rluop/comp-55-final-project-fork/assets/114570853/71d11fe3-c4a5-4084-8efd-72c6a7753246)

For the "Faster" difficulty, it takes the block 6 seconds to reach the top.
![image](https://github.com/rluop/comp-55-final-project-fork/assets/114570853/92c4bbd7-95b0-4810-b3cc-7515a9bd77e3)
