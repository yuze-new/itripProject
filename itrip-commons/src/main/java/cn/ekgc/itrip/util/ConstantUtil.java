package cn.ekgc.itrip.util;

import java.util.Properties;

public class ConstantUtil {
	private static final Properties props = new Properties();
	static {
		try {
			props.load(ConstantUtil.class.getClassLoader().getResourceAsStream("itrip.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static final Long ACTIVE_CODE_TIMEOUT = Long.parseLong("30");
	public static final String MAIL_FROM = props.getProperty("mail.from");
	public static final String AUTH_SECRET = props.getProperty("auth.secret");
}
