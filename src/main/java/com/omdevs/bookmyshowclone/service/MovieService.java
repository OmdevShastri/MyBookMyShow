package com.omdevs.bookmyshowclone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.omdevs.bookmyshowclone.entity.Show;
import com.omdevs.bookmyshowclone.dao.MovieRepository;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Show> searchMovie(String movieName, String city, String date) {
        // Implement logic to search for movies based on provided parameters
        // You can call methods from MovieRepository to fetch data from the database
        List<Show> shows = movieRepository.findShowsByMovieNameAndCityAndDate(movieName, city, date);
        return shows;
    }

}
