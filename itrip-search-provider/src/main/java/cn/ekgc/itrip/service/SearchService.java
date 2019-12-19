package cn.ekgc.itrip.service;

import cn.ekgc.itrip.pojo.vo.ItripHotelVO;
import cn.ekgc.itrip.pojo.vo.SearchHotCityVO;

import java.util.List;

public interface SearchService {
	List<ItripHotelVO> searchItripHotelListByHotCity(SearchHotCityVO searchHotCityVO) throws Exception;
}
