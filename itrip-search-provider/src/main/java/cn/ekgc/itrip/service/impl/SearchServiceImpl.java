package cn.ekgc.itrip.service.impl;

import cn.ekgc.itrip.pojo.vo.ItripHotelVO;
import cn.ekgc.itrip.pojo.vo.SearchHotCityVO;
import cn.ekgc.itrip.service.SearchService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.request.QueryRequest;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("searchService")
@Transactional
public class SearchServiceImpl implements SearchService {
	@Autowired
	private SolrClient solrClient;

	public List<ItripHotelVO> searchItripHotelListByHotCity(SearchHotCityVO searchHotCityVO) throws Exception {
		// 构建Solr数据查询对象
		SolrQuery solrQuery = new SolrQuery("*:*");
		// 对于Solr来说查询可以按照分页的情况进行查询，因此，在该需求下，默认查询的开始也为0，连续查询的条数就是需要展示的条数
		// 设定开始的页码，展示第一页
		solrQuery.setStart(0);
		solrQuery.setRows(searchHotCityVO.getCount());
		// 进行查询，获得结果
		QueryResponse queryRequest = solrClient.query(solrQuery);
		// 通过QueryResponse获得结果
		List<ItripHotelVO> list = queryRequest.getBeans(ItripHotelVO.class);
		return list;
	}
}
