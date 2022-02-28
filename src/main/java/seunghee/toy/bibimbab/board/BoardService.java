package seunghee.toy.bibimbab.board;

import seunghee.toy.bibimbab.vo.BoardVO;

import java.util.List;

public interface BoardService {
    /* 해당하는 조건의 Board List 조회 */
    List<BoardVO> voListBoard(String searchType, String searchText, String pageNO);

    /* 해당하는 조건의 Board List 개수 */
    String selectBoard_PK_Count(String searchType, String searchText);

    /* 선택한 Board 정보를 조회 */
    BoardVO selectBoard(String TOC_PK);

    /* 선택한 Board 정보에 조회수 증가 */
    int updateBoard_Visit_Plus(String TOC_PK);

    /* 입력한 Board 정보를 추가 */
    boolean insertBoard(BoardVO boardVO);

    /* 입력한 Board 정보를 수정 */
    boolean updateBoard(BoardVO boardVO);

    /* 선택한 Board 정보를 삭제 */
    boolean deleteBoard(String TOC_PK);
}
