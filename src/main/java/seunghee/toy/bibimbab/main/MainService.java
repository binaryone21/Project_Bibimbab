package seunghee.toy.bibimbab.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MainService")
public class MainService {

	@Autowired
	private MainDao mainDao;
}
