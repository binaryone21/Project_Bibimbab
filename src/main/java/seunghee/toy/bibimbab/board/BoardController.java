package kr.co.bibimbab.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.bibimbab.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService bdSer;
	
	/* 기타상담 목록	*/
	@RequestMapping(value="/BoardList.do", method=RequestMethod.GET)
	public ModelAndView boardList(String searchType, String searchText, String pageNO) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bdList",  bdSer.listVOBoard(searchType, searchText, pageNO));
		mav.addObject("bdCount", bdSer.selectBoardSeqnoCount(searchType, searchText));
		mav.setViewName("board/boardList.tiles");
		return mav;
	}
	
	/* 기타상담 상세보기 */
	@RequestMapping(value="/BoardView.do", method=RequestMethod.GET)
	public ModelAndView boardView(String SEQNO) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bdOne", bdSer.selectBoard(SEQNO));
		mav.setViewName("board/boardView.tiles");
		return mav;
	}
	
	/* 기타상담 추가하기 */
	@RequestMapping("/BoardWrite.do")
	public String boardWrite() {
		return "board/boardWrite.tiles";
	}
	
	/* 기타상담 추가완료 */
	@RequestMapping("/BoardWriteOK.do")
	public ModelAndView boardWriteOK(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardList.tiles");
		mv.addObject("bdOne", bdSer.insertBoard(boardVO));
		return mv;
	}
	
	/* 기타상담 수정하기 */
	@RequestMapping("/BoardUpdate.do")
	public String boardUpdate(String CP, String SEQNO) {
		return "board/boardUpdate.tiles";
	}
	
	/* 기타상담 수정등록 */
	@RequestMapping("/BoardUpdateOK.do")
	public ModelAndView boardUpdateOK(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardList.tiles");
		mv.addObject("bdVO", bdSer.updateBoard());
		return mv;
	}
	
	/* 기타상담 삭제하기 */
	@RequestMapping("/BoardDelete.do")
	public String boardDelete(String CP, String SEQNO) {
		bdSer.deleteBoard();
		return "board/boardDelete.tiles";
	}
	
	// 컨트롤러에서 파라미터 받으려면 ?? 되나??
	@ResponseBody
	@RequestMapping("/sampleSample.do")
	public String sample(HttpServletRequest request, HttpServletResponse response) {
		String param = ServletRequestUtils.getStringParameter(request, "pageNO", "");
		return param;
	}
}
