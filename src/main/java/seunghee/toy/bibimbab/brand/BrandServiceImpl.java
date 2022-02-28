package seunghee.toy.bibimbab.brand;

import org.springframework.stereotype.Service;

@Service("BrandService")
public class BrandServiceImpl implements BrandService {

	private BrandDaoImpl brDao;
}
