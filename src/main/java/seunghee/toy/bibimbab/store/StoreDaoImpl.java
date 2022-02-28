package seunghee.toy.bibimbab.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seunghee.toy.bibimbab.vo.StoreVO;

@Repository
public class StoreDaoImpl implements StoreDao {

	@Autowired
	SqlSession sqlSession;

	/* 해당하는 조건의 Store List 조회 */
	@Override
	public List<StoreVO> voListStore(String TSI_BRAND) {
		return sqlSession.selectList("stMap.voListStore", TSI_BRAND);
	}
}
