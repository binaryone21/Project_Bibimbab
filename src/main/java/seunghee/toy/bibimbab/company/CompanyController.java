package seunghee.toy.bibimbab.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService cpSer;
	
	@RequestMapping("/company")
	public String company() {
		return "company/company.tiles";
	}
}
