package api.components.beer;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BeerController {

    private ArrayList<Beer> beerList = new ArrayList<Beer>();
    private final AtomicLong beerID = new AtomicLong();
    private final AtomicLong recipeID = new AtomicLong();

    @GetMapping("/beer")
    public @ResponseBody Beer getBeer(@PathVariable long id){
        return beerList.get((int) id);
    }

    @GetMapping("/beer")
    public Beer getBeers(){
        return null;
    }

    //Create New Beer
    @PostMapping("/beer")
    public Beer newBeer(@RequestBody Beer newBeer){
        newBeer.setBeerID(beerID.incrementAndGet());
        newBeer.setRecipeID(recipeID.incrementAndGet());

        beerList.add(newBeer);

        return newBeer;
    }

    //Update a Specific Beer
   @PutMapping("/beer")
    public Beer putBeer(@RequestParam(value = "id") long id){
        return null;
    }

    @DeleteMapping("/beer")
    public void deleteBeer(@RequestParam(value = "id") long id){

    }

}