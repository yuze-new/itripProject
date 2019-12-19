package cn.ekgc.itrip.controller.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <b>Swagger框架配置类</b>
 * @version 3.1.1
 * @since 3.1.1
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	@Bean
	public Docket createRestApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
			// 设置文档基本信息。
			.apiInfo(apiInfo())
			// 设定Swagger在扫描其注解时候的位置
			.select()
			// 扫描所有的Swagger注解
			.apis(RequestHandlerSelectors.basePackage("cn.ekgc.itrip"))
			.paths(PathSelectors.any())
			.build();
		return docket;
	}

	public ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder()
			// 设置生成的文档标题
			.title("来呀快活呀")
			// 设定联系人
			.contact(new Contact("呵呵", "www.baidu.com", "453194033@qq.com"))
			.description("Spring Boot | 接口")
			// 设定软件版本
				.version("3.1.1")
				.build();
		return apiInfo;
	}
}
