package cn.ekgc.itrip.transport;

import cn.ekgc.itrip.pojo.entity.Area;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "itrip-biz-provider")
@RequestMapping("/area")
public interface  AreaTransport {

	@RequestMapping(value = "/query", method = RequestMethod.POST)
	public List<Area> query(@RequestParam Integer id) throws Exception;
}
