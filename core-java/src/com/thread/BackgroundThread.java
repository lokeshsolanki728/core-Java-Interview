
package com.thread;

public class BackgroundThread extends Thread {

	String name ;

	public BackgroundThread(String name) {
		this.name = name;
	}  

	@Override
	public void run() {

		while (true) {

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println(name);
		}
	}
}
