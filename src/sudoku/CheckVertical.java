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

public class CheckVertical extends Check {
        private boolean valid = false;
        //REQUIRES:: a 2D integer array with completely filled out with integer
        // values between 1 and 9 
        //MODIFIES: valid (boolean)
        //EFFECTS: changes valid to true or false based on the values that were
        //entered in the board	
        public boolean checkMoves(int[][] uservalues) {
	int[] validity;
		for (int x = 0; x < 9; x++) {
			validity = new int[9];
			for (int y = 0; y < 9; y++) {
				if (uservalues[y][x] == 1) { //traverses all columns and sets false if flagged
					validity[0] = validity[0] + 1;
				}
				if (uservalues[y][x] == 2) {
					validity[1] = validity[1] + 2;
				}
				if (uservalues[y][x] == 3) {
					validity[2] = validity[2] + 3;
				}
				if (uservalues[y][x] == 4) {
					validity[3] = validity[3] + 4;
				}
				if (uservalues[y][x] == 5) {
					validity[4] = validity[4] + 5;
				}
				if (uservalues[y][x] == 6) {
					validity[5] = validity[5] + 6;
				}
				if (uservalues[y][x] == 7) {
					validity[6] = validity[6] + 7;
				}
				if (uservalues[y][x] == 8) {
					validity[7] = validity[7] + 8;
				}
				if (uservalues[y][x] == 9) {
					validity[8] = validity[8] + 9;
				}
			}
			for (int i = 0; i < 9; i++) {
				if (validity[i] != i + 1) {
                                    valid = false;
                                    return valid;

				}
			}

		}
          valid = true;
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
