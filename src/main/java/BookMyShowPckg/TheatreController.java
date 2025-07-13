package BookMyShowPckg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController
{
    Map<City,List<Theatre>>cityVsTheatre;
    List<Theatre> allThreatres;

    public TheatreController()
    {
        cityVsTheatre=new HashMap<>();
        allThreatres=new ArrayList<>();
    }

    public void addTheatre(Theatre theatre,City city)
    {
        allThreatres.add(theatre);

        List<Theatre> listTheatres=cityVsTheatre.getOrDefault(city,new ArrayList<>());
        listTheatres.add(theatre);
        cityVsTheatre.put(city,listTheatres);
    }

}
