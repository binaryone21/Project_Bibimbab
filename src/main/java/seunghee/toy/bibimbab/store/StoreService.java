package seunghee.toy.bibimbab.store;

import seunghee.toy.bibimbab.vo.StoreVO;

import java.util.List;

public interface StoreService {
    /* 해당하는 조건의 Store List 조회 */
    List<StoreVO> voListStore(String TS_BRAND);
}
