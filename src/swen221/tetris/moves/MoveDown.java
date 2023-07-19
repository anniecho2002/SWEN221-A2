package swen221.tetris.moves;

import swen221.tetris.logic.Rectangle;

import swen221.tetris.logic.Board;

/**
 * Move the active tetromino one square downwards.
 *
 * @author David J. Pearce
 *
 */

public class MoveDown extends AbstractTranslation {
	/**
	 * Construct a new move down translation.
	 */
	public MoveDown() {
		super(0,-1);
	}
	
	@Override
	public boolean isValid(Board board) {
		board = new Board(board);
		if(board.getActiveTetromino() == null){ return false; }
		Rectangle rect = board.getActiveTetromino().getBoundingBox();
		if(rect != null && rect.getMinY() > 0) {
			return true;
		}
		else { return false; }
	}
}
