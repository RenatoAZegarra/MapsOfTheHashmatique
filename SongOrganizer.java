import java.util.HashMap;

public class SongOrganizer {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        
        // Add songs to the trackList
        trackList.put("All Of The Lights", "Restraining order, can't see my daughter Her mother, brother, grandmother hate me in that order Public visitation, we met at Borders");
        trackList.put("Heartless", "You run and tell your friends that you're leaving me (hey) They say that they don't see what you see in me (hey) You wait a couple months then you gon' see (hey) You'll never find nobody better than me");
        trackList.put("Otra Noche In Miami", "Diez en punto de la noche y salgo como de costumbre Prenas en diamantes que ceguen cuando me alumbre Me diferencio de la muchedumbre A mi estilo puede que no te acostumbre");
        trackList.put("No me Conoce", "Se puso bonita porque sabe que hoy se bebe A portarse mal pa' sentirse bien No queria fumar pero le dio al pen Una Barbie pero no busca un Ken Siempre le llego cuando dice, ven");
        
        // Retrieve a song by its title
        String songTitle = "Heartless";
        String lyrics = trackList.get(songTitle);
        System.out.println("Track: " + songTitle);
        System.out.println("Lyrics: " + lyrics);
        
        // Print all track names and lyrics
        System.out.println("\nAll tracks:");
        for (String track : trackList.keySet()) {
            String trackLyrics = trackList.get(track);
            System.out.println("Track: " + track);
            System.out.println("Lyrics: " + trackLyrics);
        }
    }
}
