public class HalfGallonJar {

    int pennyBalance;


    public HalfGallonJar(){
        int pennyBalance=0;
    }

    /**
     *
     * @param pennyAdd how many pennies to add to the jar
     * @return Returns String. If the jar is full, the user is notified. If the pennies are added successfully the user is notified of the current balance.
     */
    public String addPenny(int pennyAdd){
        if (pennyBalance+pennyAdd>3500){
            return("Jar is full!");

        }
        else{
            pennyBalance=pennyBalance+pennyAdd;
            return("Pennies added. Penny balance is now: "+ pennyBalance);
        }

    }

    /**
     *
     * @param pennyRemove how many pennies will be removed
     * @return Returns a String. If the user tries to remove too much, the program returns a message notifying the user they can't have a negative balance.  If the pennies are removed successfully, the user is notified.
     */

    public String removePenny(int pennyRemove){
        if (pennyBalance-pennyRemove<0){
            return("Balance can't be negative!");
        }

        else{
            pennyBalance=pennyBalance-pennyRemove;
            return("Pennies removed. Balance is now: "+ pennyBalance);
        }
    }

    /**
     *
     * @return The amount of pennies in dollars
     */

    public double pennyDollars(){
        double thePennyDollars=pennyBalance/100.0;
        return thePennyDollars;
    }

    /**
     *
     * @return the balance of pennies
     */

    public int getPennyBalance(){
        return(this.pennyBalance);


    }

}

