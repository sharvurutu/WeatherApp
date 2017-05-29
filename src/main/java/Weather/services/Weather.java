package Weather.services;
import java.io.IOException;

import javax.persistence.Table;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Weather {
    
    public String retrieve(String city) throws IOException {
	
	String uri = "http://api.openweathermap.org/data/2.5/weather?id=" + city;
	
	RestTemplate restTemplate = new RestTemplate();
	String result = restTemplate.getForObject(uri, String.class);
	return result;
    }

}