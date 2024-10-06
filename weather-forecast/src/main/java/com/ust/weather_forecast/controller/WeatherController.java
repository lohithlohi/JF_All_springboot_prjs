package com.ust.weather_forecast.controller;


import com.ust.weather_forecast.WeatherForecastApplication;
import com.ust.weather_forecast.pojos.Weather;
import com.ust.weather_forecast.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;


    @GetMapping("/active")
    public String work(){
        return "I Am Working";
    }

    // GET /api/v1/weather/city?name=bengaluru
    @GetMapping("/city")
    public ResponseEntity<Weather> getAllDetailsByCity(@RequestParam("name") String city){
        return new ResponseEntity<>(weatherService.fetchAllWeatherDetailsByCity(city), HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
