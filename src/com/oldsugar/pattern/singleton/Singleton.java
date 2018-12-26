package com.oldsugar.pattern.singleton;

public class Singleton {
	
	private volatile static Singleton uniqueInstance;
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized(Singleton.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	public void exec() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				// for (int j = 0; j < 10; j++) {
				// try {
				// System.out.println("数据:" + j);
				// Thread.sleep(1000);
				// } catch (InterruptedException e) {
				// e.printStackTrace();
				// }
				// }
				while (true) {
					try {
						System.out.println("数据");
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		getInstance().exec();
	}
}
