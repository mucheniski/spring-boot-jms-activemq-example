package com.example.springbootjmsactivemqexample.documentation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig implements WebMvcConfigurer {

    /*
     * Docket é uma classe do Spring que representa a configuração da API para gerar a especificação OPEN API
     * seria o sumário da documentação
     * */
    @Bean
    public Docket apiDocket() {

        var tagMessage = new Tag("Messages", "Send messages to Queue or Topic");

        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(customApiInfo())
                .tags(tagMessage);
    }

    public ApiInfo customApiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot JMS ActiveMQ Example")
                .description("Example of implementation")
                .version("1")
                .contact(new Contact("Developer", "github.com", "developer@example.com"))
                .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

    }

}
