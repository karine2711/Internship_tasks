package java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("webapp")
public class BooksStoreConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
     //   resolver.setPrefix();
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
