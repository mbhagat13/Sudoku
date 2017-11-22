/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Carlo
 */
public class PuzzleGeneratorTest {
    
    public PuzzleGeneratorTest() {
    }

    /**
     * Test of generate method, of class PuzzleGenerator. 5 cases. White box testing.
     */
    @Test
    public void testGenerate() throws Exception {
        boolean expected = true;
        boolean result;
        
        // Test invalid file I/O exception handling
        try {
            FileReader fr_fail = new FileReader("this_file_does_not_exist.txt");
            result = false;
        }
        catch (Exception E) {
            result = true;
        }
        assertEquals(expected, result);
        
        BufferedReader br = null;
        
        // Try valid file I/O
        try {
            FileReader fr = new FileReader("puzzles.txt");
            br = new BufferedReader(fr);
            result = true;
        }
        catch (Exception E) {
            result = false;
        }
        assertEquals(expected, result);
            
        ArrayList<String> puzzles = new ArrayList<String>();
        String puzzle;
        
        // Test random number generation 
        expected = true;
        Random rand = new Random();
        int p_index = rand.nextInt(30);
        if (p_index >= 0 && p_index <= 30) {
            result = true;
        }
        else {
            result = false;
        }
        assertEquals(expected, result);
        
        int[][] output = new int[9][9];
        int i;
        char c;
        int x;
        
        // Make arraylist of all puzzles
        while ((puzzle = br.readLine()) != null) {
            puzzles.add(puzzle);
        }
        
              
        // Test get random puzzle from list and generate puzzle array, testing for out of bounds index
        expected = true;
        puzzle = puzzles.get(p_index);
        try {
            for (i = 0; i < puzzle.length(); i++) {
                    c = puzzle.charAt(i);
                    x = Character.getNumericValue(c);
                    output[i/9][i%9] = x;
            }
            result = true;
        }
        catch (Exception E) {
            result = false;
        }
        assertEquals(expected, result);
        
        // Test puzzle array generation but out of bounds index exception thrown
        try {
            for (i = 0; i < puzzle.length() + 1; i++) {
                    c = puzzle.charAt(i);
                    x = Character.getNumericValue(c);
                    output[i/9][i%9] = x;
            }
            result = false;
        }
        catch (Exception E) {
            result = true;
        }
        assertEquals(expected, result);
       
        
        
        
    }
    
}
