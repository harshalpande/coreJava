package core.java.designPattern.facade;

public class SpringDataSource implements IDataSource {

	@Override
	public String dataSource() {
		return "Spring Data Source Loaded to Memory";
	}

}
