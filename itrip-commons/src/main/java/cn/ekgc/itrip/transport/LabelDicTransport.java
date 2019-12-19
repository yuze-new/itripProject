package cn.ekgc.itrip.transport;

import cn.ekgc.itrip.pojo.entity.LabelDic;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "itrip-biz-provider")
@RequestMapping("/label")
public interface LabelDicTransport {
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	List<LabelDic> getHotelFeatureList() throws Exception ;
}
