package seunghee.toy.bibimbab.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CompanyService")
public class CompanyService {

	@Autowired
	private CompanyDao companyDao;
}
