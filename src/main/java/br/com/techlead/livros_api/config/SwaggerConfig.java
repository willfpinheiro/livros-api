package br.com.techlead.livros_api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Projeto livros-api")
                        .description("Documentação da API do livros-api")
                        .version("1.0.0"))
                .servers(List.of(
                        new Server().url("https://livros-api-production.up.railway.app").description("Servidor Railway")
                ));
    }
}
