package cn.ekgc.itrip.controller;

import cn.ekgc.itrip.pojo.entity.User;
import cn.ekgc.itrip.pojo.vo.Dto;
import cn.ekgc.itrip.transport.UserTransport;
import cn.ekgc.itrip.util.UserUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("itripAuthController")
@RequestMapping("/auth")
public class ItripAuthController {
	@Resource
	private UserTransport userTransport;

	@RequestMapping(value = "/api/ckusr", method = RequestMethod.GET)
	public Dto<User> checkUser(String name) throws Exception{
		Dto<User> dto = new Dto<User>();
		if(name != null && !"".equals(name)) {
			if(UserUtil.checkUserCodePattern(name)) {
				if(userTransport.checkUser(name)) {
					dto.setMsg("123");
					dto.setSuccess("true");
					return dto;
				}
			}
		}
		dto.setMsg("123");
		dto.setSuccess("false");
		return dto;
	}

	@RequestMapping(value = "/api/doregister", method = RequestMethod.POST)
	public Dto<User> checkUserCellphone(@RequestBody User user) throws  Exception {
		Dto<User> dto = new Dto<User>();
		if(userTransport.checkUserCellphone(user)){
			dto.setSuccess("true");
			return dto;
		}
		dto.setSuccess("false");
		dto.setMsg("111");
		return dto;
	}

}
