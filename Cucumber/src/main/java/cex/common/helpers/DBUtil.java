package cex.common.helpers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBUtil {

	static Logger log = LogManager.getLogger(DBUtil.class.getName());

	private static String configload = Constant.Path_Config + Constant.DBFile_Config;

	static {
		ConfigLoader.loadConfig(configload);
	}

	private static Connection getConnection() {
		Connection conn = null;
		try {
			String strDB = ConfigLoader.getValue("DB");
			String strDBURL = ConfigLoader.getValue("DB_URL");
			String strDBUsername = ConfigLoader.getValue("DB_URL");
			String strDBPassword = ConfigLoader.getValue("DB_URL");

			if (strDB.equalsIgnoreCase("SQLSERVER")) {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} else if (strDB.equalsIgnoreCase("DB2")) {
				Class.forName("COM.ibm.db2os390.sqlj.jdbc.DB2SQLJDriver");
			} else if (strDB.equalsIgnoreCase("AS400")) {
				// AS400JDBCDriver driver = new com.ibm.as400.access.AS400JDBCDriver();
				// DriverManager.registerDriver(driver);
			} else if (strDB.equalsIgnoreCase("MYSQL")) {
				Class.forName("com.mysql.jdbc.Driver");
			}

			conn = DriverManager.getConnection(strDBURL, strDBUsername, strDBPassword);
		} catch (Exception e) {
			log.error(e);
		}

		return conn;
	}

	private static ResultSet getResultSet(Connection conn, Statement stmt, String strQuery) {
		ResultSet rs = null;

		try {
			rs = stmt.executeQuery(strQuery);
			return rs;
		} catch (Exception e) {
			log.error(e);
		}

		return null;
	}

	public static String GetDBValue(String DBQry, String DBCol) throws Exception {

		Connection conn = null;
		String output = null;
		String DBQuery = TestDataUtil.GetData(DBQry);
		String DBColn = TestDataUtil.GetData(DBCol);

		try {
			conn = getConnection();
			System.out.println("Connecting to database...");
			if (conn != null) {
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				// String sql1 = "select * from dbunits..FxUnit where citicode = 'KV6'";
				ResultSet rs = getResultSet(conn, stmt, DBQuery);
				if (rs != null) {
					if (DBColn.contains(",")) {
						String[] spt1 = DBColn.split("\\,");
						while (rs.next()) {
							for (String col : spt1) {
								System.out.println(col);
								output = rs.getString(col);
							}
						}
					} else {
						while (rs.next()) {
							output = rs.getString(DBColn);
						}

					}
					rs.close();
					stmt.close();
					conn.close();
				} else {
					throw new IOException("Unable to execute " + DBQuery + " query");
				}
			} else {
				throw new IOException("Unable to establish SQL DB connection");
			}

		} catch (Exception e) {
			log.error("GetDBValue", e);
			throw new Exception(e);
		}

		if (output != null) {
			return output;
		} else {
			throw new IOException("No Data Avalible for your query: Return Value -" + output);
		}
	}

	public static ArrayList<String> GetDBValues(String DBQry, String DBCol) throws Exception {

		Connection conn = null;
		String output = null;
		String DBQuery = TestDataUtil.GetData(DBQry);
		String DBColn = TestDataUtil.GetData(DBCol);

		ArrayList<String> strValues = new ArrayList<String>();

		try {
			conn = getConnection();
			System.out.println("Connecting to database...");
			if (conn != null) {
				Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				// String sql1 = "select * from dbunits..FxUnit where citicode = 'KV6'";
				ResultSet rs = getResultSet(conn, stmt, DBQuery);
				if (rs != null) {
					if (DBColn.contains(",")) {
						String[] spt1 = DBColn.split("\\,");
						while (rs.next()) {
							for (String col : spt1) {
								System.out.println(col);
								output = rs.getString(col);
								strValues.add(output);
							}
						}
					} else {
						while (rs.next()) {
							output = rs.getString(DBColn);
							strValues.add(output);
						}
					}
					rs.close();
					stmt.close();
					conn.close();
				} else {
					throw new IOException("Unable to execute " + DBQuery + " query");
				}
			} else {
				throw new IOException("Unable to establish SQL DB connection");
			}

		} catch (Exception e) {
			log.error("GetDBValue", e);
			throw new Exception(e);
		}

		if (output != null) {
			return strValues;
		} else {
			throw new IOException("No Data Avalible for your query: Return Value -" + output);
		}
	}
}