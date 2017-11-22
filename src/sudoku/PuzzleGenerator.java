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
    
    public static int[][] generate() throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("puzzles.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> puzzles = new ArrayList<String>();
        String puzzle;
        Random rand = new Random();
        int p_index = rand.nextInt(30); // integer from 0 to 30 (number of puzzles ready)
        int[][] output = new int[9][9];
        int i;
        char c;
        int x;
        
        // Make arraylist of all puzzles
        while ((puzzle = br.readLine()) != null) {
            puzzles.add(puzzle);
        }
        
        // Get random puzzle from list and generate puzzle array
        puzzle = puzzles.get(p_index);
        for (i = 0; i < puzzle.length(); i++) {
                c = puzzle.charAt(i);
                x = Character.getNumericValue(c);
                output[i/9][i%9] = x;
        }
        return output;
        
    }
    
}
