package cn.ekgc.itrip.transport;

import cn.ekgc.itrip.pojo.entity.Area;
import cn.ekgc.itrip.pojo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "itrip-biz-provider")
@RequestMapping("/user")
public interface UserTransport {

	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public boolean checkUser(@RequestParam String userCode) throws Exception ;

	@RequestMapping(value = "/cellphone", method = RequestMethod.POST)
	boolean checkUserCellphone(@RequestBody User user) throws Exception;

	@RequestMapping(value = "/userCode", method = RequestMethod.POST)
	boolean Code(@RequestParam String user, @RequestParam String code) throws Exception;

	@RequestMapping(value = "/dologin", method = RequestMethod.POST)
	User doLogin(@RequestParam String name, @RequestParam String password) throws Exception ;

}
