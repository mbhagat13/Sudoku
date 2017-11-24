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
public class CheckBox extends Check {
      
	@Override
	public boolean checkMoves(int[][] uservalues) {
		int[] validity;

		for (int v = 0; v < 9; v += 3) {
			for (int h = 0; h < 9; h += 3) {
				validity = new int[9];
				for (int x = h; x < h+3; x++) {
					for (int y = v; y < v+3; y++) {
						if(uservalues[y][x] >= 1 && uservalues[y][x] <= 9)
						{
							validity[uservalues[y][x]-1]++;
						}
					}

				}
				for (int k = 0; k < 9; k++) {
					if (validity[k] != 1) {
						return false;
					}
				}
			}
		}

		return true;

	}
}