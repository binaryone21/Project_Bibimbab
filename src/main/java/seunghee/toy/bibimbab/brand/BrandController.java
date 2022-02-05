package kr.co.bibimbab.brand;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrandController {

	@Resource(name="BrandService")
	private BrandService brandService;
	
	@RequestMapping("/Brand.do")
	public String brand() {
		return "brand/brand.tiles";
	}
}
