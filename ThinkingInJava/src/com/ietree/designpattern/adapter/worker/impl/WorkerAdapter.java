package com.ietree.designpattern.adapter.worker.impl;

import com.ietree.designpattern.adapter.ICooker;
import com.ietree.designpattern.adapter.IProgrammer;
import com.ietree.designpattern.adapter.IWorkerAdapter;

/**
 * 适配器
 * 
 * @author Root
 */
public class WorkerAdapter implements IWorkerAdapter {

	@Override
	public String work(Object worker) {
		String workContent = "";

		if (worker instanceof ICooker) {
			workContent = ((ICooker) worker).cook();
		}

		if (worker instanceof IProgrammer) {
			workContent = ((IProgrammer) worker).programme();
		}
		return workContent;
	}

}
