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

public class CheckHorizontal extends Check{
    private boolean valid = false;
        
    //REQUIRES:: a 2D integer array with completely filled out with integer
    // values between 1 and 9 
    //MODIFIES: valid (boolean)
    //EFFECTS: changes valid to true or false based on the values that were
    //entered in the board
      public boolean checkMoves(int [][] uservalues){
            int [] validity; 

            for (int x =0;x<9 ;x++){//traverses all rows and sets false if flagged
              validity = new int[9];
                for (int y =0;y<9 ;y++){
                if(uservalues[x][y]== 1){
                 validity[0]++; 
                 }  
                if(uservalues[x][y]== 2){
                 validity[1]++; 
                 }  
                if(uservalues[x][y]== 3){
                 validity[2]++; 
                 }  
                if(uservalues[x][y]== 4){
                 validity[3]++; 
                 }  
                if(uservalues[x][y]== 5){
                 validity[4]++; 
                 }  
                if(uservalues[x][y]== 6){
                 validity[5]++; 
                 }  
                if(uservalues[x][y]== 7){
                 validity[6]++; 
                 }  
                if(uservalues[x][y]== 8){
                 validity[7]++; 
                 }  
                if(uservalues[x][y]== 9){
                validity[8]++; 
                 } 
                }         
            for(int i = 0; i<9;i++){
               if(validity[i] != 1){
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
