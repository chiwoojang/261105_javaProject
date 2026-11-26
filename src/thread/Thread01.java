package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Thread01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadSample ts = new ThreadSample();
		
//		System.out.println("== 기본 스레드 연습 ==");
//		ts.basicThreadExample();
		
//		System.out.println("[main] 스레드 종료");
		
//		System.out.println("== 동시성 이슈와 동기화 ==");
//		ts.syncronizationExample();
		
		System.out.println("== 스레드풀 사용 ==");
		ts.threadPoolExample();
				
		

	}

}

class ThreadSample{

	public void basicThreadExample() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread01 = new MyThread(); 
		Thread thread02 = new Thread(new MyRunnable());
		Thread thread03 = new Thread(
				() -> {
					for(int i=0;i<=3;i++) {
						System.out.println("[람다 스레드 작업 중] "+i);
						try {
							Thread.sleep(300);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				);
		
		thread01.start();
		thread02.start();
		thread03.start();
		
		thread01.join();
		thread02.join();
		thread03.join();
		
	}
	
	public void threadPoolExample() throws InterruptedException {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		// 5개의 작업을 2개의 thread로 나누어서 처리
		for(int i=1;i<=5;i++) {
			final int taskId = i;
			executor.submit(()->{
				String threadName = Thread.currentThread().getName();
				System.out.println("작업 : " + taskId + " 실행 중 : 담당 스레드: " + threadName);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
		
		// 더 이상 새로운 작업 받지 않고, 기존 작업 끝나면 스레드풀 종료
		executor.shutdown();
		executor.awaitTermination(5, TimeUnit.SECONDS);
		System.out.println("모든 스레드풀 종료");
		
	}

	public void syncronizationExample() throws InterruptedException {
		SharedCounter counter = new SharedCounter();
		
		Runnable task = ()->{
			for(int i=0;i<100000;i++) {
				counter.incrementUnsafe();
				counter.incrementSafe();
			}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("동기화 X 결과 : " + counter.unsafeCount);
		System.out.println("동기화 O 결과 : " + counter.safeCount);
		
	}
	
}

class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			System.out.println("[Thread 상속 작업 중]" + i);
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println("[Runnable 구현 작업 중]" + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class SharedCounter{
	int unsafeCount = 0;
	int safeCount = 0;
	
	// 여러 스레드 접속 시 경쟁
	public void incrementUnsafe() {
		unsafeCount++;
	}
	
	// 한 번에 하나의 thread만 허용
	public synchronized void incrementSafe() {
		safeCount++;
	}
}
