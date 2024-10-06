package com.ust.fetchdatafromapi.controller;

import com.ust.fetchdatafromapi.response.SearchByMeal;
import com.ust.fetchdatafromapi.service.ApiCallerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/meals")
@RequiredArgsConstructor
public class MealController {
    private final ApiCallerService apiCallerService;

    @GetMapping("/active")
    public String work(){
        return "I Am Working";
    }

    // GET /api/v1/meals/search?name=chicken
    @GetMapping("/search")
    public ResponseEntity<SearchByMeal> searchMealByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(apiCallerService.searchMealByName(name));
    }

    @GetMapping("/searchId")
    public ResponseEntity<SearchByMeal> searchMealByMid(@RequestParam("mid") Integer id){
        return ResponseEntity.ok(apiCallerService.searchMealById(id));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
