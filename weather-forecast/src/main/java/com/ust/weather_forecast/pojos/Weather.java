package com.ust.weather_forecast.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public record Weather (
        Location location,
        Current current
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record Location(
        String name,
        String region,
        String country,
        double lat,
        double lon,
        @JsonProperty("tz_id") String tzId,
        @JsonProperty("localtime_epoch") int localtimeEpoch,
        String localtime
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record Current(
        String last_updated,
        @JsonProperty("temp_c") double tempc,
        @JsonProperty("temp_f") double tempf,
        @JsonProperty("is_day") int isday,
        Condition condition,
        @JsonProperty("wind_kph") double windkph,
        double wind_mph,
        int wind_degree,
        String wind_dir,
        int pressure_mb,
        double pressure_in,
        double precip_mm,
        int precip_in,
        int humidity,
         int cloud,
         double feelslike_c,
         double feelslike_f,
         double windchill_c,
         double windchill_f,
         double heatindex_c,
         double heatindex_f,
         double dewpoint_c,
         double dewpoint_f,
         int vis_km,
         int vis_miles,
         int uv,
         int gust_mph,
         int gust_kph
) {}

record Condition (
        String text,
        String icon,
        int code
) {}


//---------------------------------------------------------------------------------------------

/*

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
    private Location location;
    private Current current;

    class Location{
        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        @JsonProperty("tz_id") private String tzId;
        @JsonProperty("localtime_epoch") private int localtimeEpoch;
        private String localtime;
    }

    public class Condition{
        private String text;
        private String icon;
        private int code;
    }

    public class Current{
        private int last_updated_epoch;
        private String last_updated;
        private double temp_c;
        private double temp_f;
        private int is_day;
        private Condition condition;
        private double wind_mph;
        private double wind_kph;
        private int wind_degree;
        private String wind_dir;
        private int pressure_mb;
        private double pressure_in;
        private double precip_mm;
        private int precip_in;
        private int humidity;
        private int cloud;
        private double feelslike_c;
        private double feelslike_f;
        private double windchill_c;
        private double windchill_f;
        private double heatindex_c;
        private double heatindex_f;
        private double dewpoint_c;
        private double dewpoint_f;
        private int vis_km;
        private int vis_miles;
        private int uv;
        private int gust_mph;
        private int gust_kph;
    }

}


 */