package logic;

public class ManageWorker {

	
	
	public boolean addWorker(Worker worker) {
		ManageWorkerController manageWorkerController = new ManageWorkerController(20000.0);
		return manageWorkerController.insertWorker(worker);
	}
	
	public double setSalary(Worker worker, double balance) {
		ManageWorkerController manageWorkerController = new ManageWorkerController(balance);
		return manageWorkerController.calculateSalary(worker);
	}
	
	
}
