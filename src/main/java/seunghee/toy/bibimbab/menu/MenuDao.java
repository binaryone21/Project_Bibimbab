package kr.co.bibimbab.menu;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import kr.co.bibimbab.vo.StoreVO;

@Repository
public class MenuDao  extends EgovAbstractMapper {

	/* 해당하는 조건의 Menu List 조회 */
	public List<StoreVO> listVOMenu(String KIND) {
		return selectList("mnMap.listVOMenu", KIND);
	}
}
