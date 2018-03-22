package com.td.cc.pc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
		
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		
		Thread producerThread = new Thread(new Producer(bq));
		Thread conumerThread = new Thread(new Consumer(bq));
		
		producerThread.start();
		conumerThread.start();
		
	}
}
	