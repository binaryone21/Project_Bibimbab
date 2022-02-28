package seunghee.toy.bibimbab.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MainService")
public class MainServiceImpl implements MainService {

	@Autowired
	private MainDaoImpl miDao;
}
