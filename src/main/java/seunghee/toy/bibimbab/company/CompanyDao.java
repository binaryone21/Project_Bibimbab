package seunghee.toy.bibimbab.company;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("CompanyDao")
public class CompanyDao {

	@Autowired
	SqlSession sqlSession;

}
