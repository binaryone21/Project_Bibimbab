package kr.co.bibimbab.board;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import kr.co.bibimbab.vo.BoardVO;

@Repository
public class BoardDao extends EgovAbstractMapper {

	/* 해당하는 조건의 Board List 조회 */
	public List<BoardVO> listVOBoard(Map<String, String> param) {
		return selectList("bdMap.listVOBoard", param);
	} 
	
	/* 선택한 Board 정보를 조회 */
	public BoardVO selectBoard(String SEQNO) {
		return selectOne("bdMap.selectBoard", SEQNO);
	}

	public int insertBoard(BoardVO boardVO) {
		return insert("bdMap.insertBoard", boardVO);
	}
	
	public int updateBoard() {
		return update("bdMap.updateBoard");
	}
	
	public int deleteBoard() {
		return update("bdMap.deleteBoard");
	}

	/* List - 해당하는 조건의 Board 갯수를 Count */
	public String selectBoardSeqnoCount(Map<String, String> param) {
		return selectOne("bdMap.selectBoardSeqnoCount", param);
	}
	
	/* View - 선택한 Board 정보에 조회수 증가 */
	public int updateBoardVisitPlus(String SEQNO) {
		return update("bdMap.updateBoardVisitPlus", SEQNO);
	}
	
}
