package kr.co.bibimbab.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoreController {

	@Autowired
	private StoreService stSer;
	
	@RequestMapping("/Store.do")
	public ModelAndView store() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("stListBM", stSer.listVOStore("1"));
		mav.addObject("stListYGY", stSer.listVOStore("2"));
		mav.setViewName("store/store.tiles");
		return mav;
	}
}
