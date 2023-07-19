package swen221.tetris.moves;

import swen221.tetris.logic.Rectangle;

import swen221.tetris.logic.Board;

/**
 * Move the active tetromino one square to the left.
 *
 * @author David J. Pearce
 *
 */
public class MoveLeft extends AbstractTranslation {
	/**
	 * Construct a new move left translation.
	 */
	public MoveLeft() {
		super(-1,0);
	}
	
	@Override
	public boolean isValid(Board board) {
		board = new Board(board);
		if(board.getActiveTetromino() == null) { return false; }
		Rectangle rect = board.getActiveTetromino().getBoundingBox();
		if(rect != null) {
			if(rect.getMinX() <= 0) {
				return false;
			}
			return true;
		}
		return false;
	}
}
