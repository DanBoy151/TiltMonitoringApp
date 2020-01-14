package api.components.beer;

import java.util.Date;

public class Beer {

    private long beerID;
    private final String name;
    private long recipeID;
    private final Date startDate;
    private final double oG;
    private final double fG;

    public Beer(long beerID, String name, long recipeID,
                Date startDate, double d, double e){
        this.beerID = beerID;
        this.name = name;
        this.recipeID = recipeID;
        this.startDate = startDate;
        this.oG = d;
        this.fG = e;
    }

    public long getBeerID(){
        return beerID;
    }

    public void setBeerID(long newBeerID){
        beerID = newBeerID;
    }

    public String getName(){
        return name;
    }

    public Long getRecipeID(){
        return recipeID;
    }

    public void setRecipeID(long newRecipeID){
        recipeID = newRecipeID;
    }

    public Date getStartDate(){
        return startDate;
    }

    public double getOG(){
        return oG;
    }

    public double getFG(){
        return fG;
    }

}

