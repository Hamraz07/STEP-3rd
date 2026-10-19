
import java.util.Arrays;

public class Q2 {
    static class Playlist {
        private final String[] songs;private int count;
        Playlist(int capacity){songs=new String[capacity];}
        void addSong(String song){if(count<songs.length)songs[count++]=song;else System.out.println("Playlist is full");}
        String[] getSongs(){return Arrays.copyOf(songs,count);}
        int getSongCount(){return count;}
    }
    public static void main(String[] args) {
        Playlist playlist=new Playlist(10);playlist.addSong("Song A");playlist.addSong("Song B");
        String[] copy=playlist.getSongs();copy[0]="Changed";
        System.out.println(Arrays.toString(playlist.getSongs()));System.out.println("Song count: "+playlist.getSongCount());
    }
}
