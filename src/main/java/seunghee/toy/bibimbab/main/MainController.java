package seunghee.toy.bibimbab.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	@Autowired
	private MainService miSer;
	
	@RequestMapping("/") // 여기가 메인 페이지입니다.
	public String main() {
		return "main/main.tiles";
	}
}
