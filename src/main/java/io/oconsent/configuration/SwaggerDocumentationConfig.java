package io.oconsent.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("OConsent API Documentation (pre alpha)")
            .description("Following are the available API contract for the OConsent Protocol. These APIs are still in development and will break. Blockchain interaction APIs are still under development. Please drop an email to dev@oconsent.io or contact@subhadipmitra.com if you would like to be part of the early access or would like to contribute. Follow OConsent on Github at https://github.com/OConsent")
            .license("CC BY-SA 4.0")
            .licenseUrl("https://creativecommons.org/licenses/by-sa/4.0/")
            .termsOfServiceUrl("https://oconsent.io")
            .version("1.0.0")
            .contact(new Contact("","", "dev@oconsent.io"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("OConsent API Documentation (pre alpha)")
                .description("Following are the available API contract for the OConsent Protocol. These APIs are still in development and will break. Blockchain interaction APIs are still under development. Please drop an email to dev@oconsent.io or contact@subhadipmitra.com if you would like to be part of the early access or would like to contribute. Follow OConsent on Github at https://github.com/OConsent")
                .termsOfService("https://oconsent.io")
                .version("1.0.0")
                .license(new License()
                    .name("CC BY-SA 4.0")
                    .url("https://creativecommons.org/licenses/by-sa/4.0/"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("dev@oconsent.io")));
    }

}
