package practice_19_20;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[2048];
        ArrayList<InetAddress> addresses = new ArrayList<>();
        ArrayList<Integer> ports = new ArrayList<>();
        DatagramSocket socket = new DatagramSocket(777);
        DatagramPacket packet = new DatagramPacket(
                buffer,
                0,
                buffer.length);
        PrintWriter writer = new PrintWriter("C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_19_20/history.txt");
        System.out.println("chat 777" + "\n");

        Thread server = new Thread(() -> {
            while (true) {
                DatagramPacket packetToChat = null;
                try {
                    socket.receive(packet);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Address: " + packet.getAddress());
                System.out.println("Port: " + packet.getPort());
                int flag = 0;
                for (int i = 0; i < ports.size(); i++) {
                    if (ports.get(i) == packet.getPort() && addresses.get(i) == packet.getAddress()) {
                        flag++;
                    }
                }
                if (flag == 0) {
                    addresses.add(packet.getAddress());
                    ports.add(packet.getPort());
                    String greeting = "Server: new user - " + (new String(buffer, 0, packet.getLength()));
                    String date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date());
                    String data = date + " | " + greeting;
                    System.out.println(data + "\n");
                    for (int i = 0; i < ports.size(); i++) {
                        try {
                            packetToChat = new DatagramPacket(
                                    data.getBytes(),
                                    0, data.getBytes().length,
                                    InetAddress.getByName("255.255.255.255"), ports.get(i)
                                    );
                        } catch (UnknownHostException e) {
                            e.printStackTrace();
                        }
                        try {
                            socket.send(packetToChat);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    writer.write(data + "\n");
                }
                else {
                    String message = new String(buffer, 0, packet.getLength());
                    String date = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date());
                    String data = date + " | " + message;
                    System.out.println(data + "\n");
                    for (int i = 0; i < ports.size(); i++) {
                        if (!(packet.getAddress() == addresses.get(i) && packet.getPort() == ports.get(i))) {
                            try {
                                packetToChat = new DatagramPacket(
                                        data.getBytes(),
                                        0, data.getBytes().length,
                                        InetAddress.getByName("255.255.255.255"), ports.get(i)
                                );
                            } catch (UnknownHostException e) {
                                e.printStackTrace();
                            }
                            try {
                                socket.send(packetToChat);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    writer.write(data + "\n");
                }
                writer.flush();
            }
        });
        server.start();
    }
}