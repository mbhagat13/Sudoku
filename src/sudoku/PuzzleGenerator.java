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
 * 
 */
public class PuzzleGenerator {
    /** OVERVIEW: Immutable class that has a static method generate() that returns a 2D integer array
     * which holds the initial state of a sudoku puzzle for the user to solve; puzzles
     * are read in from a text file and chosen at random on board generation.
     *  
     * Abstraction function:
     * AF(r) = an incomplete Sudoku puzzle returned by r.generate()
     * 
     * Rep invariant:
     * RI(r) = text file 'puzzles.txt' must exist for r.generate() and each
     * puzzle from BufferedReader r.br has its own line in the text file. 
     * Each puzzle is formatted to have one row, from left column to right column,
     * in sequence for all 9x9=81 boxes. Each puzzle must be of size 9x9.
     * 
     * 
     * @return
     * @throws FileNotFoundException
     * @throws IOException 
     */
    
    public static int[][] generate() throws FileNotFoundException, IOException {
        /** REQUIRES: Text file in project's parent directory named 'puzzles.txt' 
         *  with sudoku puzzles formatted as one string per line per puzzle, where
         *  the first 9 numbers correspond to the numbers in the first row of the 
         *  sudoku puzzle in order from left to right, successive groups of 9 
         *  numbers are for successive rows.
         **/
        
        /**
         *  MODIFIES: None.
         **/
        
        /**
         *  EFFECTS: Returns a 2D int array.
         * 
         **/
        FileReader fr = new FileReader("puzzles.txt");
        BufferedReader br = new BufferedReader(fr);
        ArrayList<String> puzzles = new ArrayList<String>();
        String puzzle;
        Random rand = new Random();


        int p_index = rand.nextInt(5); // integer from 0 to 5 (number of puzzles ready)

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
    
    public boolean repOK() throws Exception {
        /** EFFECTS: Returns true if rep invariant holds; Otherwise, returns false.
         * 
         */
        try {
            FileReader fr = new FileReader("puzzles.txt");
            BufferedReader br = new BufferedReader(fr);
            String in = br.readLine();
            if (in.length() == 9) return true;
            else return false;
        }
        catch (Exception e) {
            return false;
        }
    }
    
    @Override
    public String toString() {
        /** EFFECTS: Returns the randomly selected Sudoku puzzle as a string formatted in 9x9 box format
         * 
         */
        int[][] puzzle = new int[9][9];
        try {
        puzzle = PuzzleGenerator.generate();
        }
        catch (Exception e) {

        }
        String s = "";
        int i, j;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                s += puzzle[i][j];
            }
            s += "\n";
        }
        return s;
    }
    
}
