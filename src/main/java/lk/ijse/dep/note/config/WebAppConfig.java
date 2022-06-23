package lk.ijse.dep.note.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lk.ijse.dep.note.WebAppInitializer;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Properties;

@Component
@EnableWebMvc
@ComponentScan(basePackageClasses = WebAppInitializer.class)
public class WebAppConfig {



    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
    return  new PropertySourcesPlaceholderConfigurer();

    }
    @Bean
    public ObjectMapper objectMapper(){
        return  new ObjectMapper();
    }
}