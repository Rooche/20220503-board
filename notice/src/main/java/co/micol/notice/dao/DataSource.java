package co.micol.notice.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataSource {
	//dao는 관례적으로 DataSource 라는 이름을 씀
	private static DataSource dataSource = new DataSource(); // 자기자신 인스턴스 생성
	private DataSource() {}; //외부사용불가 private
	
	private Connection conn;
	private String driver;
	private String url;
	private String user;
	private String password;
	//이것들은 외부에서 사용할것들
	
	
	public static DataSource getInstance() {
		return dataSource;
	}
	
	public Connection getConnection() {
		dbConfig();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	private void dbConfig() {
		Properties properties = new Properties();
		String resource = getClass().getResource("/db.properties").getPath();
	
		try {
			properties.load(new FileInputStream(resource));
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
			// propertise파일에 있는 키값을 url,user,password ..
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
