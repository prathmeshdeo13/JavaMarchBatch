package multithreading.threadTask;
// performing multiple threads on multiple task...


class MyVideo extends Thread{
    public void run(){
        System.out.println("video is playing");
    }
}

class MyAudio extends Thread{
    public void run(){
        System.out.println("audio is playing");
    }
}

class ProgressBar extends Thread{
    public void run(){
        System.out.println("progressBar is running");
    }
}

class MyVolume extends Thread{
    public void run(){
        System.out.println("volume");
    }
}
public class Vlc {
    public static void main(String[] args) {
        MyVideo video = new MyVideo();
        video.start();

        MyAudio audio = new MyAudio();
        audio.start();

        ProgressBar progressBar = new ProgressBar();
        progressBar.start();

        MyVolume volume =  new MyVolume();
        volume.start();
    }

}
