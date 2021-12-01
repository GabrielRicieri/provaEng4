package br.edu.univas.configuration;

public class DatabaseConfiguration {

	private static final String HOST = "192.168.1.1";
	private static final String PORT = "4321";
	private static final String DATABASE = "mydatabase";
	
	
	private static DatabaseConfiguration DataBaseinstance;
	
	private DatabaseConfiguration() { }
	
	public static DatabaseConfiguration getInstance() {
		if (DataBaseinstance == null) {
			DataBaseinstance = new DatabaseConfiguration();
		}else{
			return DataBaseinstance;
		}
		
	}
	
	public String getConfiguration() {
		return "jdbc:postgresql://" + HOST + ":" + PORT + "/" + DATABASE;
	}
}
