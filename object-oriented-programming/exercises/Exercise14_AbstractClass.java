/**
 * Exercise 14: Abstract Classes - Media Player System
 * PT821 - Object-Oriented Programming
 * State University of Zanzibar (SUZA)
 *
 * INSTRUCTIONS:
 * Complete the following exercise to practice abstract class concepts.
 * Follow the TODO comments and implement the required functionality.
 */

// ============================================
// EXERCISE: Create a Media Player System
// ============================================

/*
 * TODO 1: Create an abstract class called "MediaItem" with:
 * - Protected attributes: title (String), duration (int in seconds), artist (String)
 * - Constructor that initializes all attributes
 * - Abstract method: play() - each media type plays differently
 * - Abstract method: getMediaType() - returns type as String
 * - Concrete method: getDurationFormatted() - returns "MM:SS" format
 * - Concrete method: displayInfo() - shows title, artist, duration
 */

// Write your MediaItem abstract class here:


/*
 * TODO 2: Create a class "Song" that extends MediaItem with:
 * - Private attributes: album (String), genre (String), lyrics (String)
 * - Constructor that calls super() and initializes its attributes
 * - Implement play() to print "Playing song: [title] by [artist]"
 * - Implement getMediaType() to return "Audio"
 * - Method: showLyrics() - prints the lyrics
 * - Override displayInfo() to include album and genre
 */

// Write your Song class here:


/*
 * TODO 3: Create a class "Video" that extends MediaItem with:
 * - Private attributes: resolution (String, e.g., "1080p"), director (String)
 * - Constructor that calls super() and initializes its attributes
 * - Implement play() to print "Playing video: [title] in [resolution]"
 * - Implement getMediaType() to return "Video"
 * - Method: setResolution(String res) - changes playback resolution
 * - Method: showCredits() - prints director and artist info
 */

// Write your Video class here:


/*
 * TODO 4: Create a class "Podcast" that extends MediaItem with:
 * - Private attributes: host (String), episodeNumber (int), topic (String)
 * - Constructor that calls super() and initializes its attributes
 * - Implement play() to print "Playing podcast: [title] - Episode [number]"
 * - Implement getMediaType() to return "Podcast"
 * - Method: showEpisodeInfo() - prints topic and host
 * - Override displayInfo() to include episode info
 */

// Write your Podcast class here:


/*
 * TODO 5: Create an abstract class "Playlist" with:
 * - Protected attributes: name (String), mediaItems (MediaItem[]), itemCount (int)
 * - Constructor that initializes name and creates array
 * - Concrete method: addItem(MediaItem item) - adds to playlist
 * - Concrete method: removeItem(int index) - removes from playlist
 * - Abstract method: shuffle() - each playlist shuffles differently
 * - Concrete method: playAll() - plays all items in order
 * - Concrete method: getTotalDuration() - returns sum of all durations
 */

// Write your Playlist abstract class here:


/*
 * TODO 6: Create a class "MusicPlaylist" that extends Playlist with:
 * - Implement shuffle() to randomize song order
 * - Method: sortByArtist() - sorts songs alphabetically by artist
 * - Method: filterByGenre(String genre) - returns array of songs matching genre
 */

// Write your MusicPlaylist class here:


/*
 * TODO 7: Create a class "VideoPlaylist" that extends Playlist with:
 * - Private attribute: autoplayNext (boolean)
 * - Implement shuffle() (can be same as music or different)
 * - Method: setAutoplay(boolean value) - enables/disables autoplay
 * - Override playAll() to include autoplay behavior
 */

// Write your VideoPlaylist class here:


public class Exercise14_AbstractClass {
    public static void main(String[] args) {
        System.out.println("=== MEDIA PLAYER SYSTEM TEST ===\n");

        // TODO: Create Song objects
        // Song song1 = new Song("Nchi ya Mababu", 245, "Diamond Platnumz",
        //                       "A Boy from Tandale", "Bongo Flava", "Lyrics here...");
        // Song song2 = new Song("Jeje", 312, "Harmonize",
        //                       "Afro East", "Bongo Flava", "Lyrics here...");

        // TODO: Create Video objects
        // Video video1 = new Video("Tanzania Travel Guide", 1800, "Travel Channel",
        //                          "4K", "John Smith");
        // Video video2 = new Video("Learn Java", 3600, "Code Academy",
        //                          "1080p", "Jane Doe");

        // TODO: Create Podcast objects
        // Podcast podcast1 = new Podcast("Tech Talk", 2700, "Tech Weekly",
        //                                "James Brown", 42, "AI in Africa");

        // TODO: Test individual media items
        // System.out.println("--- Testing Individual Media Items ---\n");
        // song1.play();
        // song1.displayInfo();
        // System.out.println();
        //
        // video1.play();
        // video1.displayInfo();
        // video1.showCredits();
        // System.out.println();
        //
        // podcast1.play();
        // podcast1.displayInfo();
        // podcast1.showEpisodeInfo();

        // TODO: Test polymorphism with array of media items
        // System.out.println("\n--- Testing Polymorphism ---");
        // MediaItem[] mediaItems = {song1, video1, podcast1, song2, video2};
        // for (MediaItem item : mediaItems) {
        //     System.out.println(item.getMediaType() + ": " + item.getDurationFormatted());
        //     item.play();
        //     System.out.println();
        // }

        // TODO: Test playlists
        // System.out.println("\n--- Testing Playlists ---");
        // MusicPlaylist myMusic = new MusicPlaylist("My Favorites", 10);
        // myMusic.addItem(song1);
        // myMusic.addItem(song2);
        // System.out.println("Total duration: " + myMusic.getTotalDuration() + " seconds");
        // myMusic.playAll();
        // myMusic.shuffle();
        // System.out.println("After shuffle:");
        // myMusic.playAll();

        // VideoPlaylist myVideos = new VideoPlaylist("Learning", 10, true);
        // myVideos.addItem(video1);
        // myVideos.addItem(video2);
        // myVideos.playAll();

        System.out.println("\n=== END OF TEST ===");
    }
}

/*
 * BONUS CHALLENGE:
 *
 * 1. Add a "Audiobook" class extending MediaItem with:
 *    - Chapter support (current chapter, total chapters)
 *    - Method to skip to specific chapter
 *    - Method to get remaining time
 *
 * 2. Add a "SmartPlaylist" class that:
 *    - Automatically suggests similar items
 *    - Tracks play count for each item
 *    - Can sort by most played
 *
 * 3. Implement a "MediaLibrary" class with:
 *    - Methods to search by title, artist, or type
 *    - Statistics (total items, total duration, by type)
 *
 * EXPECTED OUTPUT (partial):
 *
 * === MEDIA PLAYER SYSTEM TEST ===
 *
 * --- Testing Individual Media Items ---
 *
 * Playing song: Nchi ya Mababu by Diamond Platnumz
 * === Media Information ===
 * Title: Nchi ya Mababu
 * Artist: Diamond Platnumz
 * Duration: 04:05
 * Type: Audio
 * Album: A Boy from Tandale
 * Genre: Bongo Flava
 *
 * Playing video: Tanzania Travel Guide in 4K
 * === Media Information ===
 * Title: Tanzania Travel Guide
 * Artist: Travel Channel
 * Duration: 30:00
 * Type: Video
 * Resolution: 4K
 * Director: John Smith
 *
 * ... (more output)
 *
 * SUBMISSION:
 * - Complete all TODO sections
 * - Test your code thoroughly
 * - Submit the completed .java file
 */
