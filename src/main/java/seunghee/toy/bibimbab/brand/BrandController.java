package seunghee.toy.bibimbab.brand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrandController {

	@Autowired
	private BrandService brSer;
	
	@RequestMapping("/brand")
	public String brand() {
		return "brand/brand.tiles";
	}
}
