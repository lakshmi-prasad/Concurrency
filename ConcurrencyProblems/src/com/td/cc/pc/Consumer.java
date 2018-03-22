package com.td.cc.pc;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<String> bq;

	public Consumer(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		String item;
		for(int i=0; i < 5; i++) {
		try {
			item = bq.take();
			System.out.println("Consumer" + item);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
