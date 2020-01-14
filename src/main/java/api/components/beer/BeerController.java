package api.components.beer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/beer")
    public @ResponseBody Beer getBeer(@PathVariable long id){
        return beerService.retrieveBeer(id);
    }

    //Create New Beer
    @PostMapping("/beer")
    public boolean newBeer(@RequestBody Beer newBeer){
        return beerService.createBeer(newBeer);
    }

    //Update a Specific Beer
   @PutMapping("/beer")
    public boolean putBeer(@RequestParam(value = "id") long id){
        return true;
    }

    @DeleteMapping("/beer")
    public void deleteBeer(@RequestParam(value = "id") long id){

    }

}