package cn.ekgc.itrip.transport;

import cn.ekgc.itrip.pojo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "itrip-biz-provider")
@RequestMapping("/user")
public interface UserTransport {

	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public boolean checkUser(@RequestParam String userCode) throws Exception ;

	@RequestMapping(value = "/cellphone", method = RequestMethod.POST)
	boolean checkUserCellphone(@RequestBody User user) throws Exception;
}
