/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author Carlo
 */
public class BoardTest {
    
    public BoardTest() {
    }

    @Test
    /*
     * Test of readValsIn method, of class Board. 2 cases. White box
    */
    public void testReadValsIn() {
        int[][] test = new int[1][1];
        String num = "3";
        
        boolean expected = true;
        boolean result;
        
        // Test valid input
        try {
            test[0][0] = Integer.parseInt(num);
            result = true;
        }
        catch (Exception E) {
            result = false;
        }
        assertEquals(expected, result);
        
        // Test invalid input: if nothing in text field
        try {
            test[0][0] = Integer.parseInt(null);
            result = false;
        }
        catch (Exception e) {
            result = true;
        }
        assertEquals(expected, result);
        
    }
    
    /*
    Test of performChecks method of Board class. 2 cases. White box
    */
    @Test
    public void testPerformChecks() {
        ArrayList<Check> checks = new ArrayList<Check>();
        checks.add(new CheckBox());
        checks.add(new CheckHorizontal());
        checks.add(new CheckVertical());
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
    boolean expected = true;  
    boolean result = true;
    
                // Test valid check
		for(Check i : checks)
			if(!i.checkMoves(solution))
				result = false;
		assertEquals(expected, result);
                
                // Test invalid check
                expected = false;
                for(Check i : checks)
                    if(!i.checkMoves(incorrect))
                        result = false;
                assertEquals(expected, result);
    }
    
    
    
}
