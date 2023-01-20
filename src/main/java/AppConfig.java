import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.ISpeakerRepository;
import com.pluralsight.service.ISpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

@Configuration
@ComponentScan( {"com.pluralsight"} )
public class AppConfig {
	
	/*
	@Bean( name = "speakerService" )
	@Scope( value = BeanDefinition.SCOPE_SINGLETON )
	public ISpeakerService getSpeakearService() {
		//SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
		SpeakerServiceImpl service = new SpeakerServiceImpl();
		//service.setRepository(getSpeakerRepository());
		return service;
	}
	
	
	@Bean( name = "speakerRepository" )
	public ISpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	*/
}
 