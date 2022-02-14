package seunghee.toy.bibimbab.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	@Autowired
	private MenuService mnSer;
	
	@RequestMapping("/menu")
	public ModelAndView menu() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("mnListBBB", 	mnSer.listVOMenu("1"));
		mav.addObject("mnListJS", 	mnSer.listVOMenu("2"));
		mav.addObject("mnListDB", 	mnSer.listVOMenu("3"));
		mav.addObject("mnListDGS", 	mnSer.listVOMenu("4"));
		mav.setViewName("menu/menu.tiles");
		return mav;
	}
}
