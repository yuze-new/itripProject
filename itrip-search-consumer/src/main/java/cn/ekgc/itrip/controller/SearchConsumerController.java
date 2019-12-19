package cn.ekgc.itrip.controller;

import cn.ekgc.itrip.controller.base.BaseController;
import cn.ekgc.itrip.pojo.vo.Dto;
import cn.ekgc.itrip.pojo.vo.ItripHotelVO;
import cn.ekgc.itrip.pojo.vo.SearchHotCityVO;
import cn.ekgc.itrip.transport.SearchTransport;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;

@RestController("searchConsumerController")
@RequestMapping("/search")
public class SearchConsumerController extends BaseController {
	@Autowired
	private SearchTransport searchTransport;

	@ApiOperation(value = "热门城市搜索酒店列表")
	@ApiImplicitParam(name = "SearchHotCityVO", value = "热门城市搜索视图")
	@RequestMapping(value = "/api/hotellist/searchItripHotelListByHotCity", method = RequestMethod.POST)
	public Dto<Object> searchItripHotelListByHotCity(@RequestBody SearchHotCityVO searchHotCityVO ) throws Exception {
		Dto<Object> dto = new Dto<Object>();
		List<ItripHotelVO> list = searchTransport.searchItripHotelListByHotCity(searchHotCityVO);
		dto.setSuccess("true");
		dto.setData(list);
		return dto;
	}
}
