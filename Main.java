public class Main {
    public static void main(String[] args) {
        // Создаем жанры
        Genre rock = new Genre("Rock");
        Genre pop = new Genre("Pop");

        // Создаем авторов
        Author author1 = new Author("John Lennon");
        Author author2 = new Author("Taylor Swift");

        // Создаем песни
        Song song1 = new Song("Imagine", rock, author1, 1.99);
        Song song2 = new Song("Love Story", pop, author2, 2.49);

        // Создаем музыкальный магазин
        MusicStore store = new MusicStore();
        store.addSong(song1);
        store.addSong(song2);

        // Создаем пользователя
        User user = new User("Alice", 5.00);

        // Показываем доступные песни
        System.out.println("Welcome to the Music Store!");
        store.showAvailableSongs();

        // Пользователь покупает песню
        System.out.println("\nAttempting to purchase 'Imagine'...");
        Song songToBuy = store.findSongByTitle("Imagine");
        if (songToBuy != null) {
            user.purchaseSong(songToBuy);
        }

        // Показываем купленные песни
        System.out.println("\nPurchased songs:");
        user.showPurchasedSongs();

        // Остаток баланса пользователя
        System.out.println("\nRemaining balance: $" + user.getBalance());
    }
}
