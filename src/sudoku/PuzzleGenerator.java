/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Carlo
 */
public class PuzzleGenerator {
    
    public PuzzleGenerator() {
        
    }
    
    public static int[][] generate() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("puzzles.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> puzzles = new ArrayList<String>();
        String puzzle;
        Random rand = new Random();
        int p_index = rand.nextInt(6) + 1; // integer from 1 to 6 (number of puzzles ready)
        int[][] output = new int[9][9];
        int i, j;
        char c;
        int x;
        
        // Make arraylist of all puzzles
        while ((puzzle = br.readLine()) != null) {
            puzzles.add(puzzle);
        }
        
        // Get random puzzle from list and generate puzzle array
        puzzle = puzzles.get(p_index);
        for (i = 0; i < puzzle.length(); i++) {
            for (j = 0; j < 9; j ++) {
                c = puzzle.charAt((i*9)+j);
                x = Character.getNumericValue(c);
                output[i][j] = x;
            }
        }
        
        return output;
        
    }
    
}
