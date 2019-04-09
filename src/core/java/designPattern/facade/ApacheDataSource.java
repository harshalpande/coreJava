package core.java.designPattern.facade;

public class ApacheDataSource implements IDataSource {

	@Override
	public String dataSource() {
		return "Apache Data Source Loaded to Memory";
	}

}
