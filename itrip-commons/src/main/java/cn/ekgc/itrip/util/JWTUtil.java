package cn.ekgc.itrip.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>用于生成和解析Token工具类</b>
 * @author Arthur
 * @version 3.0.0 2019-12-16
 * @since 3.0.0
 */
public class JWTUtil {
	/**
	 * <b>根据用户信息，生成相应的Token JSON</b>
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public static String createToken(Long userId) throws Exception {
		// 获得对于Token进行加密的算法对象
		Algorithm algorithm = Algorithm.HMAC256(ConstantUtil.AUTH_SECRET);
		// 创建JWT创建者JWTCreator.Builder
		JWTCreator.Builder builder = JWT.create();

		// 创建头部签名的Map集合
		Map<String, Object> headerMap = new HashMap<String, Object>();
		headerMap.put("alg", "hmac256");
		headerMap.put("type", "jwt");
		// 设定签名头部信息
		builder.withHeader(headerMap);
		builder.withClaim("id", userId);
		// 进行加密，获得最终的JSON
		String jwtJSON = builder.sign(algorithm);
		return jwtJSON;
	}

	/**
	 * <b>对于给定的Token进行校验和解密，获得用户id</b>
	 * @param token
	 * @return
	 */
	public static Long decryptToken(String token) throws Exception {
		// 设定加密时所有的算法构成
		Algorithm algorithm = Algorithm.HMAC256(ConstantUtil.AUTH_SECRET);
		// 校验所给定的token是否正确
		try{
			// 如果能够进行成功的解密，那么说明此时所提供的Token的JSON是真实有效的
			DecodedJWT decodedJWT = JWT.decode(token);
			// 通过解密后的JWT对象获得相应的载荷数据
			Long id = decodedJWT.getClaim("id").asLong();
			if(id != null){
				return id;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1L;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(decryptToken("eyJ0eXBlIjoiand0IiwiYWxnIjoiSFMyNTYiLCJ0eXAiOiJKV1QifQ.eyJpZCI6MX0.0qvW4Ipe6_sL6mcQgk4WPjmnli0MFD5FrGQoH10mrGM"));
	}
}
