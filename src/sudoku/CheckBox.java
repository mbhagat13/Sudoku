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
public class CheckBox implements Check {
      
	public boolean checkMoves(int[][] uservalues) {
		int[] validity = new int[9];
		int startIndexX = 0;
		int startIndexY = 0;

		for (int i = 0; i <= 9; i++) {

			for (int v = 0; v < 9; v = v + 3) {
				startIndexY = v;

				for (int h = 0; h < 9; h = h + 3) {
					startIndexX = h;

					for (int x = startIndexX; x < 3; x++) {
						validity = new int[9];

						for (int y = startIndexY; y < 3; y++) {
							if (uservalues[x][y] == 1) {
								validity[0] = validity[0] + 1;
							}
							if (uservalues[x][y] == 2) {
								validity[1] = validity[1] + 2;
							}
							if (uservalues[x][y] == 3) {
								validity[2] = validity[2] + 3;
							}
							if (uservalues[x][y] == 4) {
								validity[3] = validity[3] + 4;
							}
							if (uservalues[x][y] == 5) {
								validity[4] = validity[4] + 5;
							}
							if (uservalues[x][y] == 6) {
								validity[5] = validity[5] + 6;
							}
							if (uservalues[x][y] == 7) {
								validity[6] = validity[6] + 7;
							}
							if (uservalues[x][y] == 8) {
								validity[7] = validity[7] + 8;
							}
							if (uservalues[x][y] == 9) {
								validity[8] = validity[8] + 9;
							}

						}

					}
					for (int k = 0; k < 9; k++) {
						if (validity[k] != k + 1) {
							return false;
						}
					}

				}
			}
		}

		return true;

	}
}