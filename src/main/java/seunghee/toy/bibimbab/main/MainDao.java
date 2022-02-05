package seunghee.toy.bibimbab.main;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("MainDao")
public class MainDao {

	@Autowired
	SqlSession sqlSession;
}
