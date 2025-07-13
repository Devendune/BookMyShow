package BookMyShowPckg;

import java.awt.print.Book;

public class BookMyShow
{
    MovieController movieController;
    TheatreController theatreController;

    public BookMyShow()
    {
        movieController=new MovieController();
        theatreController=new TheatreController();
    }
    public static void main(String[] args)
    {
        BookMyShow bookMyShow=new BookMyShow();
        bookMyShow.initialise();
    }

    public void initialise()
    {
        createMovies();
    }
    public void createMovies()
    {
        Movie movie=new Movie();

        movie.setId(1);
        movie.setName("Avengers");
        movie.setDuration(130);



    }
}
