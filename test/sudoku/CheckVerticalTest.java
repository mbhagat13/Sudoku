/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlo
 */
public class CheckVerticalTest {
   
    int[][] solution = {    {8,9,3, 7,4,5, 2,1,6},
                    {1,4,5, 8,6,2, 3,9,7},
                    {6,7,2, 3,1,9, 5,8,4},

                    {7,6,9, 2,5,4, 1,3,8},
                    {4,2,8, 9,3,1, 7,6,5},
                    {5,3,1, 6,7,8, 4,2,9},

                    {2,1,4, 5,9,6, 8,7,3},
                    {9,8,7, 4,2,3, 6,5,1},
                    {3,5,6, 1,8,7, 9,4,2}};
    
    int[][] incorrect = {    {8,9,3, 7,4,5, 2,1,6},
                    {1,4,5, 8,6,2, 3,9,7},
                    {6,7,2, 3,1,9, 5,8,4},

                    {7,6,9, 2,5,4, 1,3,8},
                    {4,2,8, 9,9,1, 7,6,5},
                    {5,3,1, 6,7,8, 4,2,9},

                    {2,1,4, 5,9,6, 8,7,3},
                    {9,8,7, 4,2,3, 6,5,1},
                    {3,5,6, 1,8,7, 9,4,2}};    
    

    /**
     * Test of checkMoves method, of class CheckVertical. 2 cases. Black box testing
     */
    @Test
    public void testCheckMoves() {
        System.out.println("checkMoves (vert)");
        CheckVertical instance = new CheckVertical();
        boolean expResult = true;
        boolean result = instance.checkMoves(solution);
        assertEquals(expResult, result);
        expResult = false;
        result = instance.checkMoves(incorrect);
        assertEquals(expResult, result);      
    } 
    
}
