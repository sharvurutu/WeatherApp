package Weather.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Weather.services.Weather;


@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    Weather weather;

    public WeatherController(Weather ws)
    {
        this.weather = ws;
    }
    
    @RequestMapping(value = "/{city}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> getWeather(@PathVariable String city) throws IOException
    {

        String getWeather = weather.retrieve(city);

        return ResponseEntity.ok(getWeather);
    }

    
}