package BookMyShowPckg;

import java.util.ArrayList;
import java.util.List;

public class Show
{
    int id;
    Movie movie;
    Screen screen;
    Seat seat;
    int startTime;
    List<Integer>bookedId=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public List<Integer> getBookedId() {
        return bookedId;
    }

    public void setBookedId(List<Integer> bookedId) {
        this.bookedId = bookedId;
    }
}
