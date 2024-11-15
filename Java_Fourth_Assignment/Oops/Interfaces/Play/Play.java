package Oops.Interfaces.Play;

import java.util.Scanner;

interface Playable {
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable {
    
    public void play() {
        System.out.println("Playing MP3 music...");
    }

    public void pause() {
        System.out.println("Pausing MP3 music...");
    }

    public void stop() {
        System.out.println("Stopping MP3 music...");
    }
}

class CDPlayer implements Playable {

    public void play() {
        System.out.println("Playing CD music...");
    }

    public void pause() {
        System.out.println("Pausing CD music...");
    }

    public void stop() {
        System.out.println("Stopping CD music...");
    }
}

class StreamingPlayer implements Playable {

    public void play() {
        System.out.println("Streaming music...");
    }

    public void pause() {
        System.out.println("Pausing streaming music...");
    }

    public void stop() {
        System.out.println("Stopping streaming music...");
    }
}

public class Play {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a music player: 1. MP3 Player  2. CD Player  3. Streaming Player");
        int choice = scanner.nextInt();

        Playable player;
        switch (choice) {
            case 1:
                player = new MP3Player();
                break;
            case 2:
                player = new CDPlayer();
                break;
            case 3:
                player = new StreamingPlayer();
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("Choose action: 1. Play  2. Pause  3. Stop  4. Exit");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    player.play();
                    break;
                case 2:
                    player.pause();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid action.");
            }
        }

        scanner.close();
    }
}
