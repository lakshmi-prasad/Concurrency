package com.td.cc.pingpong;

import java.util.concurrent.Semaphore;

public class Ping implements Runnable {

	Semaphore s;

	Ping(Semaphore s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {

			s.acquire();
			System.out.println("PING");
			s.release();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
