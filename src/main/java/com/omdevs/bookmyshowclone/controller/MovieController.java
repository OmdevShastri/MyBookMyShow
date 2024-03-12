package com.omdevs.bookmyshowclone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.omdevs.bookmyshowclone.entity.Show;
import com.omdevs.bookmyshowclone.service.MovieService;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/search")
    public ResponseEntity<List<Show>> searchMovie(
            @RequestParam("movieName") String movieName,
            @RequestParam("city") String city,
            @RequestParam("date") String date) {
        List<Show> shows = movieService.searchMovie(movieName, city, date);
        return ResponseEntity.ok().body(shows);
    }

    // Other endpoints related to movie functionalities can be defined here

}
