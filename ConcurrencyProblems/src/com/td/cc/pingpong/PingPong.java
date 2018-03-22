package com.td.cc.pingpong;

import java.util.concurrent.Semaphore;

public class PingPong {

	public static void main(String[] args) {
		
		Semaphore s = new Semaphore(1);
		
		Thread pingThread = new Thread(new Ping(s));
		Thread pongThread = new Thread(new Pong(s));
		
		pingThread.start();
		pongThread.start();
	}
}
