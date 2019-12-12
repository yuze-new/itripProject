package cn.ekgc.itrip.service.impl;

import cn.ekgc.itrip.dao.UserDao;
import cn.ekgc.itrip.pojo.entity.User;
import cn.ekgc.itrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public boolean checkUser(String userCode) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userCode", userCode);

		List<User> list = userDao.checkUser(map);
		if(list != null && list.size()>0) {
			return false;
		}
		return true;
	}

	public boolean checkUserCellphone(User user) throws Exception {
		try {
			userDao.checkUserCellphone(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
