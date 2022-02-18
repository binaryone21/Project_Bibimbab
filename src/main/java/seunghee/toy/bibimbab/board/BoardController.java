package seunghee.toy.bibimbab.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import seunghee.toy.bibimbab.vo.BoardVO;

@RequestMapping(value="/board")
@Controller
public class BoardController {

	@Autowired
	private BoardService bdSer;
	
	/* 기타상담 목록조회	*/
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView boardList(String searchType, String searchText, String pageNO) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdList",  bdSer.voListBoard(searchType, searchText, pageNO));		// 해당하는 조건의 Board List 조회
		mv.addObject("bdCount", bdSer.selectBoard_PK_Count(searchType, searchText));	// 해당하는 조건의 Board List 개수
		mv.setViewName("board/boardList.tiles");
		return mv;
	}
	
	/* 기타상담 상세보기 */
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView boardView(String TB_PK) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdOne", bdSer.selectBoard(TB_PK));	// 선택한 Board 정보를 조회
		mv.setViewName("board/boardView.tiles");
		return mv;
	}
	
	/* 기타상담 추가하기 */
	@RequestMapping("/write")
	public String boardWrite() {
		return "board/boardWrite.tiles";
	}
	
	/* 기타상담 추가완료 */
	@RequestMapping("/writeOK")
	public String boardWriteOK(BoardVO boardVO) {
		if(bdSer.insertBoard(boardVO)) {								// 입력한 Board 정보를 추가
			return "redirect:/board/list?pageNO=1";
		} else {
			return "redirect:/board/write?state=errorWrite";
		}
	}
	
	/* 기타상담 수정하기 */
	@RequestMapping("/update")
	public ModelAndView boardUpdate(String TB_PK) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdOne", bdSer.selectBoard(TB_PK));	// 선택한 Board 정보를 조회
		mv.setViewName("board/boardUpdate.tiles");
		return mv;
	}
	
	/* 기타상담 수정완료 */
	@RequestMapping("/updateOK")
	public String boardUpdateOK(BoardVO boardVO) {
		if(bdSer.updateBoard(boardVO)) {								// 입력한 Board 정보를 수정
			return "redirect:/board/view?TB_PK=" + boardVO.getTB_PK();
		} else {
			return "redirect:/board/update?TB_PK=" + boardVO.getTB_PK() + "&state=errorUpdate";
		}
	}
	
	/* 기타상담 삭제하기 */
	@RequestMapping("/delete")
	public String boardDelete(String TB_PK) {
		if(bdSer.deleteBoard(TB_PK)) {									// 선택한 Board 정보를 삭제
			return "redirect:/board/list?pageNO=1";
		} else {
			return "redirect:/board/view?TB_PK=" + TB_PK + "&state=errorDelete";
		}
	}
}
