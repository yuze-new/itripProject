package cn.ekgc.itrip.service;

import cn.ekgc.itrip.pojo.entity.User;

public interface UserService {
	boolean checkUser(String userCode) throws Exception;

	boolean checkUserCellphone(User user) throws Exception;
}
