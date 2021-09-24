/*
                HYBRID Concept

                    MAIN
            _________||_________
           |                    |
        DERIVED_1           DERIVED_2
           |____________________|
                     ||
                ANOTHER CLASS
    WITH PARENT AS DERIVED_1 AND DERIVED_2

* Unable to implement with class so used interface
*/
interface MediaPlayer{ // MAIN
    void play();
    void pause();
    void stop();
}
interface AudioPlayer extends MediaPlayer{ // DERIVED CLASS_1
    void encodeAudio();
    void decodeAudio();
}
interface VideoPlayer extends MediaPlayer{ // DERIVED CLASS_2
    void encodeVideo();
    void decodeVideo();
}
public class Hybrid implements AudioPlayer, VideoPlayer{ // CLASS WITH PARENT AS DERIVED CLASS_1 AND DERIVED CLASS_2
    
    static String path = "content://some/url/media.mp4";
    static MediaType type;
    public static void main(String[] args) {
        Hybrid player = new Hybrid();
        
        if(path.contains(".mp4")){
            type = MediaType.VIDEO;
            player.play();
        }
        else if(path.contains(".mp3")){
            type = MediaType.AUDIO;
            player.play();
        }
        else{
            type = MediaType.UNKNOWN;
            System.err.println("Sorry Media is of UNKNOWN Format!");
        }
    }

    @Override
    public void play() {
        if(type == MediaType.AUDIO){
            decodeAudio();
        }
        else if(type == MediaType.VIDEO){
            decodeVideo();
        }
        System.out.println("Playing media");        
    }

    @Override
    public void pause() {
        System.out.println("Pausing media");        
    }

    @Override
    public void stop() {
        System.out.println("Stopping media");        
    }

    @Override
    public void encodeVideo() {
        System.out.println("Encoding Video");
    }

    @Override
    public void decodeVideo() {
        System.out.println("Decoding Video");
    }

    @Override
    public void encodeAudio() {
        System.out.println("Encoding Audio");
    }

    @Override
    public void decodeAudio() {
        System.out.println("Decoding Audio");
    }
}

enum MediaType{AUDIO, VIDEO, UNKNOWN};