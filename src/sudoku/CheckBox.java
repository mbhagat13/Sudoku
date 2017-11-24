/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Meher
 */
//Overview
//Class implements the Algorithim to check if each box in the board is filled
//correctly
//Immutable 

//Abstraction Function
//only instance variable is inhertited from the superclass Check
//Represents if box is valid or not by a boolean variable

//Rep Invariant:
//valid must be either true or false;

public class CheckBox extends Check {
        private boolean valid= false;
      
        //REQUIRES:: a 2D integer array with completely filled out with integer
        // values between 1 and 9 
        //MODIFIES: valid (boolean)
        //EFFECTS: changes valid to true or false based on the values that were
        //entered in the board
	@Override
	public boolean checkMoves(int[][] uservalues) {
		int[] validity;

		for (int v = 0; v < 9; v += 3) { //cycle through columns
			for (int h = 0; h < 9; h += 3) { //cycle through rows
				validity = new int[9];
				for (int x = h; x < h+3; x++) { //cycle through row of box
					for (int y = v; y < v+3; y++) { //cycle through column of box
						if(uservalues[y][x] >= 1 && uservalues[y][x] <= 9)
						{
							validity[uservalues[y][x]-1]++;
						}
					}

				}
				for (int k = 0; k < 9; k++) { //check if validity is incorrect
					if (validity[k] != 1) {
                                            valid = false;
                                            return valid;//if so return false
                                        }
				}
			}
		}
                valid = true; // return true
                return valid;

	}
        //EFFECTS: returns the state of valid which is whether not the board was
        // filled correctly for the given algorithim
       public String toString(){
           return (valid + "");
       }
       //EFFECTS: Returns true or false if the rep is held or not
       public boolean repOk(){
           if(valid || valid ==false){
           return true;
           }else
           return false;
       }
}