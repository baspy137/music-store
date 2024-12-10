import java.util.ArrayList;

public class User {
    private String username;
    private double balance;
    private ArrayList<Song> purchasedSongs;

    public User(String username, double balance) {
        this.username = username;
        this.balance = balance;
        this.purchasedSongs = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public boolean purchaseSong(Song song) {
        if (balance >= song.getPrice()) {
            balance -= song.getPrice();
            purchasedSongs.add(song);
            System.out.println("Purchased: " + song.getTitle());
            return true;
        } else {
            System.out.println("Not enough balance to purchase " + song.getTitle());
            return false;
        }
    }

    public void showPurchasedSongs() {
        System.out.println("Purchased songs:");
        for (Song song : purchasedSongs) {
            System.out.println(song);
        }
    }
}
