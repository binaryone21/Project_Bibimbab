package kr.co.bibimbab.company;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CompanyController {
	
	@Resource(name="CompanyService")
	private CompanyService companyService;
	
	@RequestMapping("/Company.do")
	public String company() {
		return "company/company.tiles";
	}
}
