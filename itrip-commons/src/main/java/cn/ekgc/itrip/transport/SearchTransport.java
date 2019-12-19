package cn.ekgc.itrip.transport;

import cn.ekgc.itrip.pojo.vo.ItripHotelVO;
import cn.ekgc.itrip.pojo.vo.SearchHotCityVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("itrip-search-provider")
@RequestMapping("/search")
public interface SearchTransport {

	@RequestMapping(value = "/searchItripHotelListByHotCity", method = RequestMethod.POST)
	List<ItripHotelVO> searchItripHotelListByHotCity(@RequestBody SearchHotCityVO searchHotCityVO) throws Exception;
}
