package com.practice.amazon.challenge;

public class RunningCounter {
	public static void main(String[] args) {
		Runner runner = new Runner(1);
		Thread even = new Thread(new PrintEven(runner));
		Thread odd = new Thread(new PrintOdd(runner));

		even.start();
		odd.start();
	}
}

class PrintEven implements Runnable{

	private Runner runner;

	public PrintEven(Runner runner) {
		this.runner = runner;
	}

	@Override
	public void run() {

		runner.printEven();
	}

}
class PrintOdd implements Runnable{

	Runner runner;

	public PrintOdd(Runner runner) {
		this.runner = runner;
	}

	@Override
	public void run() {

		runner.printOdd();
	}

}
class Runner {
	 int counter;
	public Runner(int counter){
		this.counter = counter;
	}

	public  void printEven(){
		synchronized(this){
			while(counter<50){
				if(counter %2 !=0){
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				show(Thread.currentThread().getName()+" : ");
				notify();
			}
		}
	}
	public  void printOdd(){
		synchronized(this){
			while(counter<50){
				if(counter %2 ==0){
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				show(Thread.currentThread().getName()+" : ");
				notify();
			}
		}
	}
	public void show(String thread){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread+counter);
		counter ++;
	}

}