package kr.co.bibimbab.main;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("MainService")
public class MainService {

	@Resource(name="MainDao")
	private MainDao mainDao;
}
