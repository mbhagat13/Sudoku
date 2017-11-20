/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author raymondbaker
 */
public class Sudoku {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Board frame = new Board();
		frame.setVisible(true);
	}
}
