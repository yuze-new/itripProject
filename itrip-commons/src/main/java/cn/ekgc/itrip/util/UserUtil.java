package cn.ekgc.itrip.util;

/**
 * <b>用户工具类，用于校验等等</b>
 * @author Arthur
 * @version 3.0.0 2019-12-12
 * @since 3.0.0
 */
public class UserUtil {
	private static final String emailRegEx = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
	private static final String Cellphone = "^1[0-9]{10}$";

	public static String checkUserCodePattern(String userCode) {
		if(userCode != null && !"".equals(userCode)) {
			if(userCode.matches(emailRegEx)) {
				return "1";
			} else if(userCode.matches(Cellphone)) {
				return "2";
			}
		}
		return "0";
	}
}
