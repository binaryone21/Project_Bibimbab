package kr.co.bibimbab.main;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	@Resource(name="MainService")
	private MainService mainService;
	
	@RequestMapping("/Main.do") // 여기가 메인 페이지입니다.
	public String main() {
		return "main/main.tiles";
	}
}
