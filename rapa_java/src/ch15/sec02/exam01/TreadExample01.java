package ch15.sec02.exam01;

public class TreadExample01 {
	public static void main(String[] args) {
		class RunClass01{
			void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("runClass01: " + i);
				}
			}
		}
		class RunClass02{
			void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("runClass02: " + i);
				}
			}
		}
		RunClass01 run01 = new RunClass01();
		RunClass02 run02 = new RunClass02();
		run01.run();
		run02.run();
	}
}
