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

	// voList, select, update, delete, insert

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
	public ModelAndView boardView(String TOC_PK) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdOne", bdSer.selectBoard(TOC_PK));
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
		if(bdSer.insertBoard(boardVO)) {
			return "redirect:/board/list?pageNO=1";
		} else {
			return "redirect:/board/write?state=errorWrite";
		}
	}
	
	/* 기타상담 수정하기 */
	@RequestMapping("/update")
	public ModelAndView boardUpdate(String TOC_PK) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("bdOne", bdSer.selectBoard(TOC_PK));
		mv.setViewName("board/boardUpdate.tiles");
		return mv;
	}
	
	/* 기타상담 수정완료 */
	@RequestMapping("/updateOK")
	public String boardUpdateOK(BoardVO boardVO) {
		if(bdSer.updateBoard(boardVO)) {
			return "redirect:/board/view?TOC_PK=" + boardVO.getTOC_PK();
		} else {
			return "redirect:/board/update?TOC_PK=" + boardVO.getTOC_PK() + "&state=errorUpdate";
		}
	}
	
	/* 기타상담 삭제하기 */
	@RequestMapping("/delete")
	public String boardDelete(String TOC_PK) {
		if(bdSer.deleteBoard(TOC_PK)) {
			return "redirect:/board/list?pageNO=1";
		} else {
			return "redirect:/board/view?TOC_PK=" + TOC_PK + "&state=errorDelete";
		}
	}
	
	// 컨트롤러에서 파라미터 받으려면 ?? 되나??
	@ResponseBody
	@RequestMapping("/sampleSample")
	public String sample(HttpServletRequest request, HttpServletResponse response) {
		String param = ServletRequestUtils.getStringParameter(request, "pageNO", "");
		return param;
	}
}
