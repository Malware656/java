// Multiple Derived class with Same Base class
class MediaPLayer { // Base class
    public void play() {
        System.out.println("Media PLaying");
    }

    public void pause() {
        System.out.println("Media Paused");
    }

    public void stop() {
        System.out.println("Media Stopped");
    }
}

class AudioPLayer extends MediaPLayer { // Derived class with Base class as Parent
    public void audioEncoder() {
        System.out.println("Audio Encoder");
    }

    public void audioDecoder() {
        System.out.println("Audio Decoder");
    }
}

class VideoPLayer extends MediaPLayer { // Another Derived class with Base class as Parent
    public void videoEncoder() {
        System.out.println("Video Encoder");

    }

    public void videoDecoder() {
        System.out.println("Video Decoder");

    }
}

public class Hierarchial {
    public static void main(String[] args) {
        MediaPLayer audioPLayer = new AudioPLayer();
        ((AudioPLayer) audioPLayer).audioDecoder();
        ((AudioPLayer) audioPLayer).play();

        MediaPLayer videoPLayer = new VideoPLayer();
        ((VideoPLayer) videoPLayer).videoEncoder();
        videoPLayer.stop();
    }
}
