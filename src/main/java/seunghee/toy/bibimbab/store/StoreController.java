package seunghee.toy.bibimbab.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoreController {

	@Autowired
	private StoreService stSer;
	
	@RequestMapping("/store")
	public ModelAndView store() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("stListBM", stSer.voListStore("1"));	// 배달의 민족 매장정보
		mv.addObject("stListYGY", stSer.voListStore("2"));	// 요기요 매장정보
		mv.setViewName("store/store.tiles");
		return mv;
	}
}
