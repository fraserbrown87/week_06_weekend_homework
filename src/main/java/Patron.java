public class Patron {

    private String name;
    private int wallet;

    public Patron(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }
}
