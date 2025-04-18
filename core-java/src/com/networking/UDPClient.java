
package com.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket();

		byte[] bt = "Hello from UDP Client!".getBytes();

		InetAddress address = InetAddress.getByName("127.0.0.1");

		DatagramPacket packet = new DatagramPacket(bt, bt.length, address, 4445);

		socket.send(packet); 

		bt = new byte[256];
		packet = new DatagramPacket(bt, bt.length);

		socket.receive(packet);
		String message = new String(packet.getData()).trim();
		System.out.println("Quote of the Moment: " + message);

		socket.close();
		System.out.println("Client closed.");
	}
}
