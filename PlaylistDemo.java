/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 *
 * Name:        İpek Çelikkıran
 * Student ID:  250444020
 * Date:        05.10.2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // TODO: Create one Track object using EACH of the four constructors.
        //       Print each track's toString() result.
        //       Also test getDurationFormatted() and individual getters.
        //       Test the invalid-duration case (negative value).

        // --- Default constructor ---
        Track defaultTrack = new Track();
        System.out.println("Default Track:");
        System.out.println(defaultTrack);
        System.out.println();


        // --- Title-only constructor ---
        Track titleOnlyTrack = new Track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(titleOnlyTrack);
        System.out.println();


        // --- Title + artist constructor ---
        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack);
        System.out.println();


        // --- Full constructor ---
        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack);
        System.out.println();

        // --- Getter test ---
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);

        // --- Invalid duration test ---
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -50, false);
        System.out.println("Invalid Duration Test:");
        System.out.println(invalidTrack);
        System.out.println();

        System.out.println("Getter Test:");
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());



    }
}
