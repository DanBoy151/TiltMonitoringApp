package beer;

import java.math.BigDecimal;
import java.util.Date;

public class Beer {

    private final long beerID;
    private final String name;
    private final long recipeID;
    private final Date startDate;
    private final BigDecimal oG;
    private final BigDecimal fG;

    public Beer(long beerID, String name, long recipeID,
                Date startDate, BigDecimal oG, BigDecimal fG){
        this.beerID = beerID;
        this.name = name;
        this.recipeID = recipeID;
        this.startDate = startDate;
        this.oG = oG;
        this.fG = fG;
    }

    public long getBeerID(){
        return beerID;
    }

    public String getName(){
        return name;
    }

    public Long getRecipeID(){
        return recipeID;
    }

    public Date getStartDate(){
        return startDate;
    }

    public BigDecimal getOG(){
        return oG;
    }

    public BigDecimal getFG(){
        return fG;
    }

}

