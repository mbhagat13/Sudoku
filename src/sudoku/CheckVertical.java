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
public class CheckVertical extends Check {

	public boolean checkMoves(int[][] uservalues) {
	int[] validity;
		for (int x = 0; x < 9; x++) {
			validity = new int[9];
			for (int y = 0; y < 9; y++) {
				if (uservalues[y][x] == 1) {
					validity[0] = validity[0] + 1;
				}
				if (uservalues[y][x] == 2) {
					validity[1] = validity[1] + 2;
				}
				if (uservalues[y][x] == 3) {
					validity[2] = validity[2] + 3;
				}
				if (uservalues[y][x] == 4) {
					validity[3] = validity[3] + 4;
				}
				if (uservalues[y][x] == 5) {
					validity[4] = validity[4] + 5;
				}
				if (uservalues[y][x] == 6) {
					validity[5] = validity[5] + 6;
				}
				if (uservalues[y][x] == 7) {
					validity[6] = validity[6] + 7;
				}
				if (uservalues[y][x] == 8) {
					validity[7] = validity[7] + 8;
				}
				if (uservalues[y][x] == 9) {
					validity[8] = validity[8] + 9;
				}
			}
			for (int i = 0; i < 9; i++) {
				if (validity[i] != i + 1) {
					return false;
				}
			}

		}

		return true;
	}

}
