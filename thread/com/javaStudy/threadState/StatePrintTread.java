package com.javaStudy.threadState;

public class StatePrintTread extends Thread {
	private Thread targetThread;

	public StatePrintTread(TargetThread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟스레드 상태 : " + state);
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			if (state == Thread.State.TERMINATED) {
				break;
			}
			
				try {
					Thread.sleep(100);
				} catch (Exception e) {

				}
			
		}
	}
}
