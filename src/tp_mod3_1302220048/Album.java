package tp_mod3_1302220048;

public class Album {
      private String title;
    private int year;
    private Song[] songs = {};
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setSongs(Song[] songs) {
        this.songs = songs;
    }
    
    public String getTitle() {
        return title;
    }
 
    public int getYear() {
        return year;
    }
 
    public Song[] getSongs() {
        return songs;
    }
 
    public void addSong(Song song) {
        Song[] newSongs = new Song[songs.length + 1];
        for (int i = 0; i < songs.length; i++) {
            newSongs[i] = songs[i];
        }
        newSongs[songs.length] = song;
        songs = newSongs;
    }
 
    public void displayInfo() {
        System.out.println("Album Info");
        System.out.println("Title : " + title);
        System.out.println("Year : " + year);
        System.out.println("Song List");
        
        for (int i = 0; i < songs.length; i++) {
            System.out.print((i + 1) + ". "+ "Title : " + songs[i].getTitle() + "\n" + "Artist : " );
                for (int j = 0; j < songs[i].getArtist().length; j++) {
                    System.out.print(songs[i].getArtist()[j] + " (" + (j+1) + ")" + ", ");
                }

            System.out.println( "\nDuration : " + songs[i].getDuration() + "\n");
        }
    }
}
