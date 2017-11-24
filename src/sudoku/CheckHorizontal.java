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
public class CheckHorizontal extends Check{
      public boolean checkMoves(int [][] uservalues){
            int [] validity; 

            for (int x =0;x<9 ;x++){
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
			return false;
                } 
		}

            }
            
            
            
            
          
          return true;
      }

    
}
