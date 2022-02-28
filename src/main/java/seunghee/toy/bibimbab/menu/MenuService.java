package seunghee.toy.bibimbab.menu;

import seunghee.toy.bibimbab.vo.StoreVO;

import java.util.List;

public interface MenuService {
    /* 해당하는 조건의 Menu List 조회 */
    List<StoreVO> voListMenu(String TMI_KIND);
}
