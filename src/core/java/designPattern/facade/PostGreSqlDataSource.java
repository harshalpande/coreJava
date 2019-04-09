package core.java.designPattern.facade;

public class PostGreSqlDataSource implements IDataSource {

	@Override
	public String dataSource() {
		return "PostGreSql Data Source Loaded to Memory";
	}

}
