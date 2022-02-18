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
		ModelAndView mv = new ModelAndView();
		mv.addObject("mnListBBB", 	mnSer.voListMenu("1"));	// 비빔밥 메뉴 정보
		mv.addObject("mnListJS", 	mnSer.voListMenu("2"));	// 정식 메뉴 정보
		mv.addObject("mnListDB", 	mnSer.voListMenu("3"));	// 덮밥 메뉴 정보
		mv.addObject("mnListDGS", 	mnSer.voListMenu("4"));	// 돈까스 메뉴 정도
		mv.setViewName("menu/menu.tiles");
		return mv;
	}
}
