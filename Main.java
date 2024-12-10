public class Main {
    public static void main(String[] args) {
        
        Genre rock = new Genre("Rock");
        Genre pop = new Genre("Pop");


        Author author1 = new Author("John Lennon");
        Author author2 = new Author("Taylor Swift");

        
        Song song1 = new Song("Imagine", rock, author1, 1.99);
        Song song2 = new Song("Love Story", pop, author2, 2.49);

        
        MusicStore store = new MusicStore();
        store.addSong(song1);
        store.addSong(song2);

       
        User user = new User("Alice", 5.00);

        
        System.out.println("Welcome to the Music Store!");
        store.showAvailableSongs();

       
        System.out.println("\nAttempting to purchase 'Imagine'...");
        Song songToBuy = store.findSongByTitle("Imagine");
        if (songToBuy != null) {
            user.purchaseSong(songToBuy);
        }

       
        System.out.println("\nPurchased songs:");
        user.showPurchasedSongs();

       
        System.out.println("\nRemaining balance: $" + user.getBalance());
    }
}
