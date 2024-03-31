package tp_mod3_1302220048;

public class Tp_mod3_1302220048 {

    
    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setTitle("Hello World");
        song1.setArtist(new String[]{"Alan Walker", "Torine"});
        song1.setDuration(171);
 
        Song song2 = new Song();
        song2.setTitle("Film Favorit");
        song2.setArtist(new String[]{"Sheila On 7"});
        song2.setDuration(226);
 
        Album album = new Album();
        album.setTitle("Kayaknya Hits");
        album.setYear(2023);
        
        album.addSong(song1);
        album.addSong(song2);
        
        album.displayInfo();  
    }
    
}
