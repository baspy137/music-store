import java.util.ArrayList;

public class MusicStore {
    private ArrayList<Song> songs;

    public MusicStore() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void showAvailableSongs() {
        System.out.println("Available songs:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }

    public Song findSongByTitle(String title) {
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                return song;
            }
        }
        System.out.println("Song not found: " + title);
        return null;
    }
}
