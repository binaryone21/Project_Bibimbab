package seunghee.toy.bibimbab.board;

import seunghee.toy.bibimbab.vo.BoardVO;

import java.util.List;
import java.util.Map;

public interface BoardDao {
    /* 해당하는 조건의 Board List 조회 */
    List<BoardVO> voListBoard(Map<String, String> param);

    /* 해당하는 조건의 Board List 개수 */
    String selectBoard_PK_Count(Map<String, String> param);

    /* 선택한 Board 정보를 조회 */
    BoardVO selectBoard(String TOC_PK);

    /* 선택한 Board 정보에 조회수 증가 */
    int updateBoard_Visit_Plus(String TOC_PK);

    /* 입력한 Board 정보를 추가 */
    int insertBoard(BoardVO boardVO);

    /* 선택한 Board 정보를 수정 */
    int updateBoard(BoardVO boardVO);

    /* 선택한 Board 정보를 삭제 */
    int deleteBoard(String TOC_PK);
}
