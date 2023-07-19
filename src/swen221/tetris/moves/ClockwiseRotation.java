// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.tetris.moves;

import swen221.tetris.logic.Rectangle;

import swen221.tetris.logic.Board;
import swen221.tetris.tetromino.ActiveTetromino;
import swen221.tetris.tetromino.Tetromino;

/**
 * Implements a rotation move which is either clockwise or anti-clockwise.
 *
 * @author David J. Pearce
 * @author Marco Servetto
 *
 */
public class ClockwiseRotation extends AbstractMove implements Move {

	@Override
	public Board apply(Board board) {
		// Create copy of the board to prevent modifying its previous state.
		board = new Board(board);
		// Create a copy of this board which will be updated.
		ActiveTetromino tetromino = board.getActiveTetromino().rotate(1);
		// Apply the move to the new board, rather than to this board.
		board.setActiveTetromino(tetromino);
		// Return updated version of this board.
		return board;
	}
	
	@Override
	public boolean isValid(Board board) {
		board = new Board(board);
		if(board.getActiveTetromino() == null) { return false; }
		ActiveTetromino activeTet = board.getActiveTetromino().rotate(1);
		Rectangle rect = activeTet.getBoundingBox();
		if(rect.getMinX() < 0 || rect.getMaxX() >= board.getWidth() || rect.getMinY() < 0) {
			return false;
		}
		else{ return true; }
	}
}
