package com.ust.weather_forecast;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
@Slf4j
public class WeatherForecastApplication {

	@Value("${weather.api.baseurl}")
	private String BASE_URL;

	public static void main(String[] args) {
		SpringApplication.run(WeatherForecastApplication.class, args);
	}

//	https://api.weatherapi.com/v1/current.json?key=2cca150c01194d0a85972213240309&q=chennai

	@Bean
	public RestClient restClient() {
		log.info("BASE_URL: {}", BASE_URL);
		return RestClient.create(BASE_URL);
	}

}
