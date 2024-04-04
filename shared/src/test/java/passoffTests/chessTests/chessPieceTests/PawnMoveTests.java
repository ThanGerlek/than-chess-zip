package passoffTests.chessTests.chessPieceTests;

import chess.*;
import org.junit.jupiter.api.Test;
import passoffTests.TestFactory;

import java.util.HashSet;

import static passoffTests.TestFactory.*;

public class PawnMoveTests {

    @Test
    public void pawnMiddleOfBoardWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | |P| | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(4, 4),
                endPositions(new int[][]{{5, 4}})
        );
    }

    @Test
    public void pawnMiddleOfBoardBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | |p| | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(4, 4),
                endPositions(new int[][]{{3, 4}})
        );
    }


    @Test
    public void pawnInitialMoveWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | |P| | | |
                        | | | | | | | | |
                        """,
                startPosition(2, 5),
                endPositions(new int[][]{{3, 5}, {4, 5}})
        );
    }

    @Test
    public void pawnInitialMoveBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | |p| | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(7, 3),
                endPositions(new int[][]{{6, 3}, {5, 3}})
        );
    }


    @Test
    public void pawnPromotionWhite() {
        validatePromotion("""
                        | | | | | | | | |
                        | | |P| | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(7, 3),
                endPositions(new int[][]{{8, 3}})
        );
    }


    @Test
    public void edgePromotionBlack() {
        validatePromotion("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | |p| | | | | |
                        | | | | | | | | |
                        """,
                startPosition(2, 3),
                endPositions(new int[][]{{1, 3}})
        );
    }


    @Test
    public void pawnPromotionCapture() {
        validatePromotion("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | |p| | | | | | |
                        |N| | | | | | | |
                        """,
                startPosition(2, 2),
                endPositions(new int[][]{{1, 1}, {1, 2}})
        );
    }


    @Test
    public void pawnAdvanceBlockedWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | |n| | | | |
                        | | | |P| | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(4, 4),
                endPositions(new int[][]{})
        );
    }

    @Test
    public void pawnAdvanceBlockedBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | |p| | | | |
                        | | | |r| | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(5, 4),
                endPositions(new int[][]{})
        );
    }


    @Test
    public void pawnAdvanceBlockedDoubleMoveWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | |p| |
                        | | | | | | | | |
                        | | | | | | |P| |
                        | | | | | | | | |
                        """,
                startPosition(2, 7),
                endPositions(new int[][]{{3, 7}})
        );
    }

    @Test
    public void pawnAdvanceBlockedDoubleMoveBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | |p| | | | | |
                        | | |p| | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(7, 3),
                endPositions(new int[][]{})
        );
    }


    @Test
    public void pawnCaptureWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | |r| |N| | | |
                        | | | |P| | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(4, 4),
                endPositions(new int[][]{{5, 3}, {5, 4}})
        );
    }

    @Test
    public void pawnCaptureBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | |p| | | | |
                        | | | |n|R| | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(4, 4),
                endPositions(new int[][]{{3, 5}})
        );
    }

    @Test
    public void pawnMoveFromEdgeWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | |P|
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(4, 8),
                endPositions(new int[][]{{5, 8}})
        );
    }

    @Test
    public void pawnMoveFromEdgeBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | |p|
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(5, 8),
                endPositions(new int[][]{{4, 8}})
        );
    }

    @Test
    public void pawnCaptureFromEdgeWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | |r| |
                        | | | | | | | |P|
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(4, 8),
                endPositions(new int[][]{{5, 8}, {5, 7}})
        );
    }

    @Test
    public void pawnCaptureFromEdgeBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | |p|
                        | | | | | | |R| |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(5, 8),
                endPositions(new int[][]{{4, 8}, {4, 7}})
        );
    }

    @Test
    public void pawnCaptureFromStartWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | |r| | | | | |
                        | | |r| | | | | |
                        | | | |P| | | | |
                        | | | | | | | | |
                        """,
                startPosition(2, 4),
                endPositions(new int[][]{{3, 3}, {3, 4}, {4, 4}})
        );
    }

    @Test
    public void pawnCaptureFromStartBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | | |p| | | | |
                        | | |R| | | | | |
                        | | |R| | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(7, 4),
                endPositions(new int[][]{{6, 4}, {5, 4}, {6, 3}})
        );
    }

    @Test
    public void captureAndPromoteWhite() {
        validatePromotion("""
                        | | |r| | | | | |
                        | | | |P| | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(7, 4),
                endPositions(new int[][]{{8, 3}, {8, 4}})
        );
    }

    @Test
    public void captureAndPromoteBlack() {
        validatePromotion("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | |p| | | | |
                        | | |R| | | | | |
                        """,
                startPosition(2, 4),
                endPositions(new int[][]{{1, 3}, {1, 4}})
        );
    }

    @Test
    public void pawnCannotCaptureBackwardWhite() {
        validateMoves("""
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | |P| | | | | |
                        | | |r|r| | | | |
                        | | | | | | | | |
                        """,
                startPosition(3, 3),
                endPositions(new int[][]{{4, 3}})
        );
    }

    @Test
    public void pawnCannotCaptureBackwardBlack() {
        validateMoves("""
                        | | | | | | | | |
                        | | |R|R| | | | |
                        | | |p| | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        | | | | | | | | |
                        """,
                startPosition(6, 3),
                endPositions(new int[][]{{5, 3}})
        );
    }

    private void validatePromotion(String boardText, ChessPosition startPosition, int[][] endPositions) {
        var board = TestFactory.loadBoard(boardText);
        var testPiece = board.getPiece(startPosition);
        var validMoves = new HashSet<ChessMove>();
        for (var endPosition : endPositions) {
            var end = startPosition(endPosition[0], endPosition[1]);
            validMoves.add(TestFactory.getNewMove(startPosition, end, ChessPiece.PieceType.QUEEN));
            validMoves.add(TestFactory.getNewMove(startPosition, end, ChessPiece.PieceType.BISHOP));
            validMoves.add(TestFactory.getNewMove(startPosition, end, ChessPiece.PieceType.ROOK));
            validMoves.add(TestFactory.getNewMove(startPosition, end, ChessPiece.PieceType.KNIGHT));
        }

        validateMoves(board, testPiece, startPosition, validMoves);
    }

}
