package seunghee.toy.bibimbab.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CompanyService")
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao cpDao;
}
