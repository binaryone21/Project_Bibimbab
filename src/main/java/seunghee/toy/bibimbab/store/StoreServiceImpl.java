package seunghee.toy.bibimbab.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import seunghee.toy.bibimbab.vo.StoreVO;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	private StoreDao stDao;

	/* 해당하는 조건의 Store List 조회 */
	@Override
	public List<StoreVO> voListStore(String TS_BRAND) {
		return stDao.voListStore(TS_BRAND);
	}
}
