package com.ust.weather_forecast.service;

import com.ust.weather_forecast.pojos.Weather;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
@Slf4j
public class WeatherService {

    private  final RestClient restClient;

    @Value("${weather.api.apikey}")
    private String API_KEY;

    String apiMethod = 	"/current.json";

//    https://api.weatherapi.com/v1/current.json?key=2cca150c01194d0a85972213240309&q=bengaluru

    public Weather fetchAllWeatherDetailsByCity(String city){
        String finalApi = apiMethod+"?key="+API_KEY+"&q="+city;
        log.info(finalApi);
        return restClient.get()
                .uri(finalApi)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .body(Weather.class);
    }
}
