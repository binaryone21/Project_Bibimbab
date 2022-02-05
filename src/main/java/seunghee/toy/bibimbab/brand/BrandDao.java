package seunghee.toy.bibimbab.brand;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("BrandDao")
public class BrandDao {

	@Autowired
	private SqlSession sqlSession;
}
