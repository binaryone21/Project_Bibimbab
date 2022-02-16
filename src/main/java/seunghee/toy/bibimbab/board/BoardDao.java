package seunghee.toy.bibimbab.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import seunghee.toy.bibimbab.vo.BoardVO;

@Repository
public class BoardDao {

	@Autowired
	private SqlSession sqlSession;

	/* 해당하는 조건의 Board List 조회 */
	public List<BoardVO> listVOBoard(Map<String, String> param) {
		return sqlSession.selectList("bdMap.listVOBoard", param);
	} 
	
	/* 선택한 Board 정보를 조회 */
	public BoardVO selectBoard(String SEQNO) {
		return sqlSession.selectOne("bdMap.selectBoard", SEQNO);
	}

	/* 입력한 Board 정보를 추가 */
	public int insertBoard(BoardVO boardVO) {
		return sqlSession.insert("bdMap.insertBoard", boardVO);
	}
	
	/* 선택한 Board 정보를 수정 */
	public int updateBoard(BoardVO boardVO) {
		return sqlSession.update("bdMap.updateBoard", boardVO);
	}
	
	/* 선택한 Board 정보를 삭제 */
	public int deleteBoard(String SEQNO) {
		return sqlSession.update("bdMap.deleteBoard", SEQNO);
	}

	/* List - 해당하는 조건의 Board 갯수를 Count */
	public String selectBoardSeqnoCount(Map<String, String> param) {
		return sqlSession.selectOne("bdMap.selectBoardSeqnoCount", param);
	}
	
	/* View - 선택한 Board 정보에 조회수 증가 */
	public int updateBoardVisitPlus(String SEQNO) {
		return sqlSession.update("bdMap.updateBoardVisitPlus", SEQNO);
	}
	
}
