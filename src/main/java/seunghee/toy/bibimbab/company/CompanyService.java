package kr.co.bibimbab.company;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("CompanyService")
public class CompanyService {

	@Resource(name="CompanyDao")
	private CompanyDao companyDao;
}
