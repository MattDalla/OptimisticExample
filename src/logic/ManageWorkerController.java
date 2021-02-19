package logic;

public class ManageWorkerController {

	private double balance;
	
	public ManageWorkerController(double balance) {
		this.balance = balance; 
	}
	
	public boolean checkFields(Worker worker) {
		boolean res = false;
		if (worker.getFirstName() != null && worker.getLastName() != null) {
			if (worker.getAge() > 18) {
				res = true;
			}
		}return res;
	}
	
	public boolean insertWorker(Worker worker) {
		boolean res = false;
		WorkerDao workerDao = new WorkerDao();
		if(checkFields(worker)) {
			res =  workerDao.stupidInsertDB(worker);
		}
		return res; 
	}
	
	public double calculateSalary(Worker worker) {
		double salary = 0.0;
		if(!(worker.getFirstName().equals(" ")) && !(worker.getLastName().equals(" "))){
			salary = (worker.getAge()*(balance*0.05)/10);
		}
		return salary; 
	}

}
