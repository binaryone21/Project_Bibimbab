package seunghee.toy.bibimbab.company;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("CompanyDao")
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	SqlSession sqlSession;

}
