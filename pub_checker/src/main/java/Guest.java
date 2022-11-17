public class Guest {

    private String name;
    private int age;
    private int money;
    private int sobriety;
    private Access access;
    private char currency;
    private Drinks favouriteDrink;





    public Guest(String name, int age, int money, int sobriety, Access access, char currency, Drinks favouriteDrink){
        this.name = name;
        this.age =age;
        this.money = money;
        this.sobriety=sobriety;
        this.access=access;
        this.currency=currency;
        this.favouriteDrink=favouriteDrink;
    }

    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getSobriety() {
        return sobriety;
    }

    public void setSobriety(int sobriety) {
        this.sobriety = sobriety;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }

    public Drinks getFavouriteDrink() {
        return favouriteDrink;
    }

    public void setFavouriteDrink(Drinks favouriteDrink) {
        this.favouriteDrink = favouriteDrink;
    }
}
