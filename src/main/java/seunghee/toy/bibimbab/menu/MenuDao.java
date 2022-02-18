package seunghee.toy.bibimbab.menu;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seunghee.toy.bibimbab.vo.StoreVO;

@Repository
public class MenuDao {

	@Autowired
	SqlSession sqlSession;

	/* 해당하는 조건의 Menu List 조회 */
	public List<StoreVO> voListMenu(String TMI_KIND) {
		return sqlSession.selectList("mnMap.voListMenu", TMI_KIND);
	}
}
