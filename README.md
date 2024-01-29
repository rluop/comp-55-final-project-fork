// NEW FEATURE: CHANGE DIFFICULTY

The feature that I will implement in this iteration of the COMP 55 project is a difficulty system. Players will have the option to click a fourth button in the main menu that will lead them to another screen with three more buttons, "Normal", "Fast", and "Faster", which will allow them to change the starting difficulty of the game. After a difficulty button is clicked, a file will store an input based on the difficulty chosen. They will go then back to the main menu to start the game, where the game will load a new game, taking the value from the file as input to determine how fast the blocks fall.

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
