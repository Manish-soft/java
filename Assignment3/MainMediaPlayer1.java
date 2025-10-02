// Interface for audio player
interface AudioPlayer {
    void playAudio(String song); // Must be public when implemented
}


interface VideoPlayer {
    void playVideo(String movie); // Must be public when implemented
}


class MediaPlayer implements AudioPlayer, VideoPlayer {
    @Override
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }

    @Override
    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}

 class MainMediaPlayer1 {
    public static void main(String[] args) {
        MediaPlayer m1 = new MediaPlayer();


        String song = "Shape of You";
        String movie = "Inception";

     
        m1.playAudio(song);
        m1.playVideo(movie);
    }
}
