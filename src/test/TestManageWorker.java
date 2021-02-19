package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import logic.ManageWorker;
import logic.ManageWorkerController;
import logic.Worker;

class TestManageWorker {
	
	private static final ManageWorker manageWorker = new ManageWorker();

	@Test
	void testAddWorker() {
		Worker worker = new Worker("Guido", "La Vespa", 30); 
		Assert.assertTrue(manageWorker.addWorker(worker));
	}
	
	@Test
	void testSalary() {
		
		Worker worker = new Worker("Guido", "La Vespa", 30); 
		Assert.assertEquals(3000.0 ,manageWorker.setSalary(worker, 20000.0));
		
	}

	
}
