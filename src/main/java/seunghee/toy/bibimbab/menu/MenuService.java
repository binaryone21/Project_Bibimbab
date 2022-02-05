package kr.co.bibimbab.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bibimbab.vo.StoreVO;

@Service
public class MenuService {

	@Autowired
	private MenuDao menuDao;
	
	/* 해당하는 조건의 Menu List 조회 */
	public List<StoreVO> listVOMenu(String KIND) {
		return menuDao.listVOMenu(KIND); 
	}
}
