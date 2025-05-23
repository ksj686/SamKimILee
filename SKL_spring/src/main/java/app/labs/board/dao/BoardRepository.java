package app.labs.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import app.labs.board.model.Board;

@Mapper
public interface BoardRepository {
	List<Board> getBoardList(@Param("boardCategory") String boardCategory);
	int getBoardCount();
	Board getBoardInfo(int boardId);
	int createBoardId();
	void createBoard(Board board);
	void reportBoard(int boardId);
	int getBoardReport(int boardId);
	void offensiveBoard(int boardId);
	// 삭제 기능은 없음
}
