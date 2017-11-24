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
/*Overview
*This class provides the method names for the implementation of different
*algorithims to see if the board is filled out correctly
//Immutable

*Abstraction Function:
*This class has no instance variables as its purpose is to provide the common
*methods for the various algorithims
*
*Rep Invariant:
*No conditions as no instant variables exist
*/

public abstract class Check {
 
  public abstract boolean checkMoves(int [][] uservalues);
  
 
    
   public String toString(){
        return ("");// nothing returned as no instant variables exist
       }
    public boolean repOk(){
        return true;//true is always returned as rep is always held
    }
  
  
  
}
