package journal.dev;

public class PersonComposition {
	// composition has-a relationship
	private JobComposition job;

	public PersonComposition(){
		this.job = new JobComposition();
        job.setSalary(1000L);
    }

	public long getSalary() {
		return job.getSalary();
	}
}
