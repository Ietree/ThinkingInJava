package com.ietree.designpattern.adapter.worker.test;

import com.ietree.designpattern.adapter.worker.IWorkerAdapter;
import com.ietree.designpattern.adapter.worker.impl.Cooker;
import com.ietree.designpattern.adapter.worker.impl.Programmer;
import com.ietree.designpattern.adapter.worker.impl.WorkerAdapter;

public class AdapterTest {
	public static void main(String[] args) {
		Cooker cooker = new Cooker();
		Programmer programmer = new Programmer();

//		List<Object> list = new ArrayList<>();
//		list.add(cooker);
//		list.add(programmer);
//
//		for (Object obj : list) {
//			if (obj instanceof Cooker) {
//				System.out.println(cooker.work());
//			} else {
//				System.out.println(programmer.work());
//			}
//		}
		IWorkerAdapter adapter = new WorkerAdapter();
		Object[] workers = {cooker, programmer};
		for (Object worker : workers) {
			String workContent = adapter.work(worker);
			System.out.println(workContent);
		}
	}
}
