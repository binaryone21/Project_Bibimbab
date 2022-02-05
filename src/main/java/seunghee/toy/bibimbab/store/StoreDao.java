package kr.co.bibimbab.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import kr.co.bibimbab.vo.StoreVO;

@Repository
public class StoreDao extends EgovAbstractMapper{

	/* 해당하는 조건의 Store List 조회 */
	public List<StoreVO> listVOStore(String BRAND) {
		return selectList("stMap.listVOStore", BRAND);
	}
}
