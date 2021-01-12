package dto;

public class AuditLogGetSet {
	
	
	/*public AuditLogGetSet(String dao_name, String dao_position, String date_appointed, String download_pdf, String init_training_completed_date, String last_annual_refresher_training_completed_date, int training_overdue, String training_record_link) {
		this.setDao_name(dao_name);
		this.setDao_position(dao_position);
		this.setDate_appointed(date_appointed);
		this.setDownload_pdf(download_pdf);
		this.setInit_training_completed_date(init_training_completed_date);
		this.setLast_annual_refresher_training_completed_date(last_annual_refresher_training_completed_date);
		this.setTraining_overdue(training_overdue);
		this.setTraining_record_link(training_record_link);
	}
	
	public AuditLogGetSet(){
		
	}*/
	
	private String dao_name;
	private String dao_position;
	private String date_appointed;
	private String download_pdf;
	private String init_training_completed_date;
	private String last_annual_refresher_training_completed_date;
	private int training_overdue;
	private String training_record_link;
	/**
	 * @return the dao_name
	 */
	public String getDao_name() {
		return dao_name;
	}

	/**
	 * @param dao_name the dao_name to set
	 */
	public void setDao_name(String dao_name) {
		this.dao_name = dao_name;
	}

	/**
	 * @return the dao_position
	 */
	public String getDao_position() {
		return dao_position;
	}

	/**
	 * @param dao_position the dao_position to set
	 */
	public void setDao_position(String dao_position) {
		this.dao_position = dao_position;
	}

	/**
	 * @return the date_appointed
	 */
	public String getDate_appointed() {
		return date_appointed;
	}

	/**
	 * @param date_appointed the date_appointed to set
	 */
	public void setDate_appointed(String date_appointed) {
		this.date_appointed = date_appointed;
	}

	/**
	 * @return the download_pdf
	 */
	public String getDownload_pdf() {
		return download_pdf;
	}

	/**
	 * @param download_pdf the download_pdf to set
	 */
	public void setDownload_pdf(String download_pdf) {
		this.download_pdf = download_pdf;
	}

	/**
	 * @return the init_training_completed_date
	 */
	public String getInit_training_completed_date() {
		return init_training_completed_date;
	}

	/**
	 * @param init_training_completed_date the init_training_completed_date to set
	 */
	public void setInit_training_completed_date(String init_training_completed_date) {
		this.init_training_completed_date = init_training_completed_date;
	}

	/**
	 * @return the last_annual_refresher_training_completed_date
	 */
	public String getLast_annual_refresher_training_completed_date() {
		return last_annual_refresher_training_completed_date;
	}

	/**
	 * @param last_annual_refresher_training_completed_date the last_annual_refresher_training_completed_date to set
	 */
	public void setLast_annual_refresher_training_completed_date(String last_annual_refresher_training_completed_date) {
		this.last_annual_refresher_training_completed_date = last_annual_refresher_training_completed_date;
	}

	/**
	 * @return the training_overdue
	 */
	public int getTraining_overdue() {
		return training_overdue;
	}

	/**
	 * @param training_overdue the training_overdue to set
	 */
	public void setTraining_overdue(int training_overdue) {
		this.training_overdue = training_overdue;
	}

	/**
	 * @return the training_record_link
	 */
	public String getTraining_record_link() {
		return training_record_link;
	}

	/**
	 * @param training_record_link the training_record_link to set
	 */
	public void setTraining_record_link(String training_record_link) {
		this.training_record_link = training_record_link;
	}
	
	
	
}
