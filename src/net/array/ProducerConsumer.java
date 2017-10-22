package net.array;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

	public final static Integer size = 5;
	public static Queue<Integer> q = new LinkedList<>();
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Producer(q, size));
		Thread t2 = new Thread(new Consumer(q, size));
		t1.setName("Producer");
		t1.start();
		t2.setName("Consumer");
		t2.start();
		//java.util.concurrent.atomic.AtomicInteger
	}

	
}

class Producer implements Runnable{

	private Queue<Integer> q = new LinkedList<>();
	private int size = 0; 
	private static int i = 0;
	public Producer(Queue<Integer> q, int size){
		this.q = q;
		this.size = size;
	}
	
	@Override
	public void run() {
		try{
			synchronized(q){
				while(true){
					if(q.size() == size){
						//System.out.println(Thread.currentThread().getName() + " entered into the wait state");
						q.wait(); //release the q
						System.out.println(Thread.currentThread().getName() + " resume");
					}else{
						q.notify();
					}
					q.add(i++);
				}
			}
		}catch(InterruptedException ex){
			System.out.println(Thread.currentThread().getName() + " producer interrupted");
		}
	}
}

class Consumer implements Runnable{

	private Queue<Integer> q = new LinkedList<>();
	private int size=0;
	
	public Consumer(Queue<Integer> q, int size){
		this.q = q;
		this.size = size;
	}
	
	@Override
	public void run() {
		synchronized(q){
			while(true){
				try{
					Thread.sleep(1000);
					if(q.size() > 0){
						q.notify();
						System.out.println(Thread.currentThread().getName() + " consumed " + q.poll());

						/*if(q.size() == size){
							System.out.println(Thread.currentThread().getName() + " consumed " + q.poll());
							q.notify();
							//System.out.println(Thread.currentThread().getName() + " notified producer");
						}else{
							System.out.println(Thread.currentThread().getName() + " consumed " + q.poll());
							//System.out.println(Thread.currentThread().getName() + " queue still has space no need to notify ");
						}*/
					}else{
						//System.out.println(Thread.currentThread().getName() + " consumer empty queue ");
						q.wait();
					}
				}catch(Exception ex){
					ex.printStackTrace();
					System.out.println(Thread.currentThread().getName() + " conumer interruped");
				}
			}
		}
	}
	
}