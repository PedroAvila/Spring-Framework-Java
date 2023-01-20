import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.ISpeakerService;

public class Application {
	
	public static void main(String args[]) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//ISpeakerService service = new SpeakerServiceImpl();
		
		ISpeakerService service = appContext.getBean("speakerService", ISpeakerService.class);
		
		System.out.println(service);
		
		System.out.println(service.findAll().get(0).getFirstName());
		
		ISpeakerService service2 = appContext.getBean("speakerService", ISpeakerService.class);
		System.out.println(service2);
	}
	
}
