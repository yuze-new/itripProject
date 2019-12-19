package cn.ekgc.itrip.util;

import java.util.Random;

/**
 * <b>系统使用各种代码生成工具类</b>
 * <p>例如使用的验证码，订单编号等</p>
 * @author Arthur
 * @version 3.0.0 2019-12-13
 * @since 3.0.0
 */
public class CodeUtil {
	/**
	 * <b>随机生成四位账户激活码</b>
	 * @return
	 * @throws Exception
	 */
	public static String createCode() throws Exception {
		Random random = new Random();
		StringBuffer stringBuffer = new StringBuffer();
		for(int i = 0; i < 4; i++){
			int code = random.nextInt(10);
			stringBuffer.append(code);
		}
		return stringBuffer.toString();
	}
}
