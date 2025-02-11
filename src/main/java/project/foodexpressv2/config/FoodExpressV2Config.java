package project.foodexpressv2.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodExpressV2Config {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
