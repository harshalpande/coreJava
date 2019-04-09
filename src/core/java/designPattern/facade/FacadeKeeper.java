package core.java.designPattern.facade;

public class FacadeKeeper {
	
	IDataSource apacheDS;
	IDataSource postgreDS;
	IDataSource springDS;
	
	
	public FacadeKeeper() {
		apacheDS = new ApacheDataSource();
		postgreDS = new PostGreSqlDataSource();
		springDS = new SpringDataSource();
	}

	/**
	 * Returns Apache Data Source
	 * @return
	 */
	public String getApacheDS() {
		return apacheDS.dataSource();
	}

	/**
	 * Returns PostGreSql Data Source
	 * @return
	 */
	public String getPostGreDS() {
		return postgreDS.dataSource();
	}

	/**
	 * Returns Spring Data Source
	 * @return
	 */
	public String getSpringDS() {
		return springDS.dataSource();
	}

}
