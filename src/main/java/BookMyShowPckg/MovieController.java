package BookMyShowPckg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController
{
    Map<City,List<Movie>> mapping;
    List<Movie>allMovies;

    public MovieController()
    {
        mapping=new HashMap<>();
        allMovies=new ArrayList<>();
    }
}
