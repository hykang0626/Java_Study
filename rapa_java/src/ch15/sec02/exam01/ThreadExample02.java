package ch15.sec02.exam01;

public class ThreadExample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread run01 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println("run01: " + i);
				}
			}
		};
		Thread run02 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.err.println("run02: " + i);
				}
			}
		};
		//스레드 시작
		run01.start();
		run02.start();
		
		try {
			run01.join();
			run02.join();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
