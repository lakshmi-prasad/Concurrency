package com.td.cc.pc;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<String> bq;

	public Producer(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println("PRODUCER");
			try {
				bq.put(""+i);
			} catch (InterruptedException e1) {
			
				e1.printStackTrace();
			}
			
		}
	}
}
