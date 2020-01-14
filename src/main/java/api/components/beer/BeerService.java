package api.components.beer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.*;

public class BeerService{
    private ArrayList<Beer> beerList = new ArrayList<Beer>();
    private final AtomicLong beerID = new AtomicLong();
    private final AtomicLong recipeID = new AtomicLong();

    //Create
    public boolean createBeer(Beer beer){
        beer.setBeerID(beerID.incrementAndGet());
        beer.setRecipeID(recipeID.incrementAndGet());

        beerList.add(beer);
        return true;
    }

    //Retrieve
    public Beer retrieveBeer(long id){
      return beerList.get((int) id);
    }

    //Update
    public boolean updateBeer(Beer beer){
        return true;
    }

    //Delete
    public boolean deleteBeer(long id){
        return true;
    }

}