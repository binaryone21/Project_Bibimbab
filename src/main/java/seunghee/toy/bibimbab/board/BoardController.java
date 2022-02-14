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
	
	/* 기타상담 목록	*/
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView boardList(String searchType, String searchText, String pageNO) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdList",  bdSer.listVOBoard(searchType, searchText, pageNO));
		mv.addObject("bdCount", bdSer.selectBoardSeqnoCount(searchType, searchText));
		mv.setViewName("board/boardList.tiles");
		return mv;
	}
	
	/* 기타상담 상세보기 */
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public ModelAndView boardView(String SEQNO) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdOne", bdSer.selectBoard(SEQNO));
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
	public ModelAndView boardWriteOK(ModelAndView mv, BoardVO boardVO) {
		mv.setViewName("board/boardList.tiles");
		mv.addObject("bdOne", bdSer.insertBoard(boardVO));
		return mv;
	}
	
	/* 기타상담 수정하기 */
	@RequestMapping("/update")
	public ModelAndView boardUpdate(String CP, String SEQNO) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdOne", bdSer.selectBoard(SEQNO));
		mv.setViewName("board/boardUpdate.tiles");
		return mv;
	}
	
	/* 기타상담 수정완료 */
	@RequestMapping("/updateOK")
	public String boardUpdateOK(BoardVO boardVO) {
		if(bdSer.updateBoard(boardVO)) {
			return "redirect:/board/view?SEQNO=" + boardVO.getSEQNO();
		} else {
			return "redirect:/board/update?SEQNO=" + boardVO.getSEQNO() + "&state=error";
		}
	}
	
	/* 기타상담 삭제하기 */
	@RequestMapping("/delete")
	public String boardDelete(String CP, String SEQNO) {
		bdSer.deleteBoard();
		return "board/boardDelete.tiles";
	}
	
	// 컨트롤러에서 파라미터 받으려면 ?? 되나??
	@ResponseBody
	@RequestMapping("/sampleSample")
	public String sample(HttpServletRequest request, HttpServletResponse response) {
		String param = ServletRequestUtils.getStringParameter(request, "pageNO", "");
		return param;
	}
}
