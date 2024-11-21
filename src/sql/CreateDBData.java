package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateDBData {

		String dbname = "computer";
		boolean PERMIT_DELETE_FROM = true;
		boolean PERMIT_CREATE_TABLE = true;
		boolean PERMIT_DROP_TABLE = true;
		private String tablename_pc_case = "pc_case";
		private String tablename_pc_graphicscard = "pc_graphics_card";
		private String tablename_pc_ram = "pc_ram";
		private String tablename_pc_ram_config = "pc_ram_config";
		private String tablename_pc_disk = "pc_disk";
		private String tablename_pc_motherboard = "pc_motherboard";
		private String tablename_pc_computer = "pc_computer";
		private String tablename_pc_marke = "pc_marke";
		private String [] tablenames = new String[] {
				tablename_pc_case,
				tablename_pc_graphicscard,
				tablename_pc_ram,
				tablename_pc_ram_config,
				tablename_pc_disk,
				tablename_pc_motherboard,
				tablename_pc_computer,
				tablename_pc_marke
		};
		boolean SHOW_SQL_QUERY_PREPARED_STATEMENT = false;
		/*
		 * code with prepared statements won't let you read resulting sql query in cleartext
		 */
		boolean SHOW_SQL_QUERY = true;
		/*
		 * tables:
		 * pc_case
		 * pc_graphics_card
		 * pc_ram
		 * pc_disk_drive
		 * pc_motherboard
		 * pc_computer
		 */
		
		public static void main(String[] args) {
			new CreateDBData().dbFun();
		}
		public void dbFun() {
			getConnection();
		    if(connection == null) {
		    	System.out.println("Database not connected!");
		    }else{
		    	System.out.println("Database connected!");
		    	dropTable_pc_case();
		    	dropTable_pc_graphicscard();
		    	dropTable_pc_ram();
		    	dropTable_pc_disk_space();
		    	dropTable_pc_ram_config();
		    	dropTable_pc_motherboard();
		    	dropTable_pc_marke();
		    	dropTable_pc_computer();
		    	///////////////////////
		    	createTable_pc_case();
		    	createTable_pc_graphicscard();
		    	createTable_pc_ram();
		    	createTable_pc_disk();
		    	createTable_pc_ram_config();
		    	createTable_pc_motherboard();
		    	createTable_pc_marke();
		    	createTable_pc_computer();
		    	insertRandomData();
		    	for(String tablename_: tablenames) {
		    		printData(connection, tablename_);
		    	}
		    	closeDBConnection(connection);
		    }
		}
		Connection connection = null;
		private void getConnection() {
			 String url = "jdbc:mysql://localhost:3306/" + dbname;
			 String username = "root";
			 String password = "";
			 if(connection == null) {
				 System.out.println("Connecting database ...");
				 try {
					 connection = DriverManager.getConnection(url, username, password);
				 } catch (SQLException e) {
					 e.printStackTrace();
				 }
			 }
		}
		private void printData(Connection connection, String tablename) {
			try {
				if(connection.isClosed()) {
					System.out.println("Connection is closed :O");
				} else {
					String sql = "select * from " + tablename + ";";
					if(SHOW_SQL_QUERY) {
						System.out.println(sql);
					}
					//PreparedStatement preparedStatement = connection.prepareStatement(sql).executeQuery()
					//ResultSet resultSet = preparedStatement.executeQuery();
					ResultSet resultSet =  connection.prepareStatement(sql).executeQuery();
					// Does not work with eclipse, without maven :O
//		    		System.out.print(Table.read().db(resultSet).print());
				}
	    	} catch (Exception e) {
	    		e.printStackTrace();
			}
		}
		private void closeDBConnection (Connection connection) {
			if(connection != null) {
				try {
					connection.close();
					connection = null;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		public void deleteFromTable_pc_case() {
			deleteFromTable(tablename_pc_case);
		}
		public void deleteFromTable_pc_disk() {
			deleteFromTable(tablename_pc_disk);
		}
		public void deleteFromTable_pc_motherboard() {
			deleteFromTable(tablename_pc_motherboard);
		}
		public void createTable_pc_case() {
			String sql = "create table if not exists " + tablename_pc_case + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100), "
					+ "isilluminated int"
					+ ");";
			createTable(sql);
		}
		public void createTable_pc_graphicscard() {
			String sql = "create table if not exists " + tablename_pc_graphicscard + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100)"
					+ ");";
			createTable(sql);
		}
		public void createTable_pc_ram() {
			String sql = "create table if not exists " + tablename_pc_ram + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100)"
					+ ");";
			createTable(sql);
		}
		public void createTable_pc_disk() {
			String sql = "create table if not exists " + tablename_pc_disk + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100),"
					+ "size_gb tinyint"
					+ ");";
			createTable(sql);
		}
		public void createTable_pc_ram_config() {
			String sql = "create table if not exists " + tablename_pc_ram_config + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100),"
					+ "size_gb tinyint"
					+ ");";
			createTable(sql);
		}
		public void createTable_pc_motherboard() {
			String sql = "create table if not exists " + tablename_pc_motherboard + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100)"
					+ ");";
			createTable(sql);
		}
		public void createTable_pc_computer() {
			String sql = "create table if not exists " + tablename_pc_computer + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100)"
					+ ");";
			createTable(sql);
		}
		public void createTable_pc_marke() {
			String sql = "create table if not exists " + tablename_pc_marke + " ("
					+ "id int primary key auto_increment, "
					+ "name varchar(100)"
					+ ");";
			createTable(sql);
		}
		public void dropTable_pc_case() {
			dropTable(tablename_pc_case);
		}
		public void dropTable_pc_graphicscard() {
			dropTable(tablename_pc_graphicscard);
		}
		public void dropTable_pc_ram() {
			dropTable(tablename_pc_ram);
		}
		public void dropTable_pc_ram_config() {
			dropTable(tablename_pc_ram_config);
		}
		public void dropTable_pc_motherboard() {
			dropTable(tablename_pc_motherboard);
		}
		public void dropTable_pc_disk_space() {
			dropTable(tablename_pc_disk);
		}
		public void dropTable_pc_marke() {
			dropTable(tablename_pc_marke);
		}
		public void dropTable_pc_computer() {
			dropTable(tablename_pc_computer);
		}
		public void deleteFromTable_pc_graphicscard() {
			deleteFromTable(tablename_pc_graphicscard);
		}
		public void deleteFromTable_pc_ram() {
			deleteFromTable(tablename_pc_ram);
		}
		public void deleteFromTable_pc_ram_config() {
			deleteFromTable(tablename_pc_ram_config);
		}
		public void insertRandomData() {
			deleteFromTable_pc_case();
			insertDataTo_pc_case("rudolf", 1);
			// Corsair
			insertDataTo_pc_case("4000D Airflow", 1);
			// Corsair
			insertDataTo_pc_case("3000D Airflow", 1);
			// Sharkoon
			insertDataTo_pc_case("VS4-V", 1);
			// Sharkoon
			insertDataTo_pc_case("VS8", 1);
			// NZXT
			insertDataTo_pc_case("H9 Flow", 1);
			/////////////////////////////////////////
			deleteFromTable_pc_graphicscard();
			// MSI
			insertDataTo_graphics_card("GeForce RTX 3060");
			// MSI
			insertDataTo_graphics_card("GeForce GT 710");
			// NVidia
			insertDataTo_graphics_card("GeForce RTX 4080");
			// Asus
			insertDataTo_graphics_card("GeForce RTX 4060");
			/////////////////////////////////////////
			deleteFromTable_pc_ram();
			// Corsair, 2 GB
			insertDataTo_pc_ram("CT51264BD160BJ");
			// Corsair, 2 GB
			insertDataTo_pc_ram("CMY8GX3M2A1866C9");
			// Crucial, 2 GB
			insertDataTo_pc_ram("CT4G4DFS824A");
			// Kingston, 2 GB
			insertDataTo_pc_ram("DDR3-RAM");
			// Samsung, 4 GB, DDR3-1333 MHz
			insertDataTo_pc_ram("M378B5273BH1-CH9");
		}
		private void insertDataTo_pc_case(String name, int isColored) {
			getConnection();
			if(connection != null) {
				try {
					String sql = "insert into " + tablename_pc_case + " (name, iscolored) values (?,?);";
					int cntPos = 1;
					if(SHOW_SQL_QUERY_PREPARED_STATEMENT) {
						System.out.println(sql);
					}
					if(SHOW_SQL_QUERY) {
						String temp = "insert into " + tablename_pc_case + " (name, iscolored) values ("
								+ "'"+name+"', "
								+ isColored
								+ ");";
						System.out.println(temp);
					}
					PreparedStatement preparedStatement =  connection.prepareStatement(sql);
					preparedStatement.setString(cntPos++, name);
					preparedStatement.setInt(cntPos++, isColored);
					preparedStatement.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		private void insertDataTo_graphics_card(String name) {
			getConnection();
			if(connection != null) {
				try {
					String sql = "insert into " + tablename_pc_graphicscard + " (name) values (?);";
					int cntPos = 1;
					if(SHOW_SQL_QUERY_PREPARED_STATEMENT) {
						System.out.println(sql);
					}
					if(SHOW_SQL_QUERY) {
						String temp = "insert into " + tablename_pc_graphicscard + " (name) values ("
								+ "'"+name+"'"
								+ ");";
						System.out.println(temp);
					}
					PreparedStatement preparedStatement =  connection.prepareStatement(sql);
					preparedStatement.setString(cntPos++, name);
					preparedStatement.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		private void insertDataTo_pc_ram(String name) {
			getConnection();
			if(connection != null) {
				try {
					String sql = "insert into " + tablename_pc_ram + " (name) values (?);";
					int cntPos = 1;
					if(SHOW_SQL_QUERY_PREPARED_STATEMENT) {
						System.out.println(sql);
					}
					if(SHOW_SQL_QUERY) {
						String temp = "insert into " + tablename_pc_ram + " (name) values ("
								+ "'"+name+"'"
								+ ");";
						System.out.println(temp);
					}
					PreparedStatement preparedStatement =  connection.prepareStatement(sql);
					preparedStatement.setString(cntPos++, name);
					preparedStatement.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		private void deleteFromTable(String tablename) {
			if(PERMIT_DELETE_FROM) {
				getConnection();
				try {
					String sql = "delete from " + tablename + ";";
					if(SHOW_SQL_QUERY) {
						System.out.println(sql);
					}
					connection
					.prepareStatement(sql)
					.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		private void dropTable(String tablename) {
			if(PERMIT_DROP_TABLE) {
				getConnection();
				try {
					String sql = "drop table if exists " + tablename + ";";
					if(SHOW_SQL_QUERY) {
						System.out.println(sql);
					}
					connection
					.prepareStatement(sql)
					.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		private void createTable(String sql) {
			if(PERMIT_CREATE_TABLE) {
				getConnection();
				try {
					if(SHOW_SQL_QUERY) {
						System.out.println(sql);
					}
					connection
					.prepareStatement(sql)
					.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
