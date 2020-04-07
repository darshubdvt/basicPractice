package com.evolvusion.test.main;

public class TesterThread {
	public static void main(String[] args) throws CustomException {

		RunnableThread rn = new RunnableThread();
		rn.run();

		Thread t = new Thread(rn);
		t.start();

		Threads ths = new Threads();
		ths.start();

		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		String s = null;
		
		if (s == null || s.isEmpty()) {
			//s = "";
			System.out.println("null");
		}

		// Thread t1= new Thread(new SyncTh, target)

		throw new CustomException("running both thereads");

	}
}
