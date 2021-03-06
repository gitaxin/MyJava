package cn.giteasy.thread.method;

import org.junit.Test;

public class Demo03Sleep {


	@Test
	public void demo1() throws InterruptedException {
		for(int i = 20; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println("倒计时第" +i + "秒");
		}
	}

	@Test
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(getName());
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(getName());
				}
			}
		}.start();
	}



}
