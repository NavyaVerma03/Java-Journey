// Create two interfaces Camera and MusicPlayer and implement both interfaces in a Smartphone class.
package ClassObject.Interface;

public class MultipleInterface {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        sp.takePhoto();
        sp.playMusic();
    }

}
interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

class Smartphone implements Camera,MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }
}
