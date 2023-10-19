package projeto.demo.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.gson.Gson;

@Configuration
public class BeansFactory {
	@Bean
    Gson gson() {
    	return new Gson();
    }
}
