package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.logic.Rectangle;

/**
 * Move the active tetromino one square to the right.
 *
 * @author David J. Pearce
 *
 */

public class MoveRight extends AbstractTranslation {
	/**
	 * Construct a new move right translation.
	 */
	public MoveRight() {
		super(1,0);
	}
	
	@Override
	public boolean isValid(Board board) {
		board = new Board(board);
		if(board.getActiveTetromino() == null) { return false; }
		Rectangle rect = board.getActiveTetromino().getBoundingBox();
		if(rect != null) {
			if(rect.getMaxX() >= board.getWidth() - 1) {
				return false;
			}
			return true;
		}
		return false;
	}
}
