package cn.ekgc.itrip.dao;

import cn.ekgc.itrip.pojo.entity.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
	List<User> checkUser(Map<String, Object> map) throws Exception;

	void checkUserCellphone(User user) throws Exception;
}
