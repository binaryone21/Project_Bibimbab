package kr.co.bibimbab.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bibimbab.vo.StoreVO;

@Service
public class StoreService {

	@Autowired
	private StoreDao stDao;
	
	/* 해당하는 조건의 Store List 조회 */
	public List<StoreVO> listVOStore(String BRAND) {
		return stDao.listVOStore(BRAND);
	}
}
