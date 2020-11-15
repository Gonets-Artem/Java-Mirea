package practice_19_20;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.print("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        DatagramSocket socket = new DatagramSocket();
        byte[] username = name.getBytes();
        socket.send(new DatagramPacket(username, 0, username.length, InetAddress.getByName("127.0.0.1"), 777));

        Thread input = new Thread(() -> {
            while (true) {
                byte[] data = new byte[2048];
                DatagramPacket packetToReceive = new DatagramPacket(
                        data,
                        0, data.length
                );
                try {
                    socket.receive(packetToReceive);
                    System.out.println(new String(packetToReceive.getData(), 0, packetToReceive.getLength()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        input.start();

        Thread output = new Thread(() -> {
            while (true) {
                String text = sc.nextLine();
                String message = name + ": " + text;
                byte[] data = message.getBytes();
                try {
                    DatagramPacket packetToSend = new DatagramPacket(
                            data,
                            0, data.length,
                            InetAddress.getByName("127.0.0.1"), 777
                    );
                    socket.send(packetToSend);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        output.start();
    }
}
