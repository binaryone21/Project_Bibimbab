package seunghee.toy.bibimbab.menu;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seunghee.toy.bibimbab.vo.StoreVO;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;
	
	/* 해당하는 조건의 Menu List 조회 */
	@Override
	public List<StoreVO> voListMenu(String TMI_KIND) {
		return menuDao.voListMenu(TMI_KIND);
	}
}
