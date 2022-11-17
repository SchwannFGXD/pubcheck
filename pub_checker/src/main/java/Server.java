import java.util.ArrayList;

public class Server {

    private ArrayList<Drinks> drinksList;

    public Server(){
        this.drinksList=new ArrayList<>();
        drinksList.add(Drinks.ULTRA_VIOLET);
        drinksList.add(Drinks.MOJITO);
        drinksList.add(Drinks.VODKA);
    }

    public ArrayList<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(ArrayList<Drinks> drinksList) {
        this.drinksList = drinksList;
    }

    public boolean canServeGuest(Guest guest){
        if (guest.getAge()>18 && guest.getMoney()>=5 && guest.getSobriety()>=50 && guest.getAccess()==Access.UNBANNED && guest.getCurrency() =='£') {
            for (Drinks drink:drinksList) {
                if (drink== guest.getFavouriteDrink()){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

}
