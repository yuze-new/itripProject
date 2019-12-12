package cn.ekgc.itrip.transport.impl;

import cn.ekgc.itrip.pojo.entity.User;
import cn.ekgc.itrip.service.UserService;
import cn.ekgc.itrip.transport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

@RestController("userTransport")
@RequestMapping("/user")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public boolean checkUser(@RequestParam String userCode) throws Exception {
		return userService.checkUser(userCode);
	}

	@RequestMapping(value = "/cellphone", method = RequestMethod.POST)
	public boolean checkUserCellphone(@RequestBody User user) throws Exception {
		return userService.checkUserCellphone(user);
	}
}
