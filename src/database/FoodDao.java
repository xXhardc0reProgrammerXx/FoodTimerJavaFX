package database;

import java.sql.ResultSet;
import java.sql.SQLException;


import controller.DBAccess;
import model.Gericht;

public class FoodDao {

	private static final int BUFFER_SIZE = 4096;
	private DBAccess dbaccess;
	private Gericht gericht;

	/*
	 * Singelton Pattern
	 */
	private static FoodDao instance;

	public static FoodDao getInstance() {
		if (instance == null) {
			instance = new FoodDao();
		}
		return instance;
	}

	private FoodDao() {
		super();
		dbaccess = DBAccess.getInstance();
	}

	/*
	 * CRUD Methods
	 */
	public void update() {
		// TODO
	}

	public void insert(Gericht gericht) {
		dbaccess.connect();

		String insert = "INSERT INTO tb_gericht (gerichtname, dauermm, dauerhh) " + "VALUES('"
				+ gericht.getGerichtName() + "'," + gericht.getMinuten() + "," + gericht.getStunden() + ");";

		try {
			dbaccess.executeUpdate(insert);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbaccess.close();
			System.out.println("* Verbindung schlieﬂen");
		}
	}

	public void select(Gericht gericht) {
		dbaccess.connect();
		String select;
		Gericht result = null;

		System.out.println("* Ergebnisse anzeigen");

		try {
			select = "SELECT * FROM tb_gericht";
			ResultSet resultSet = dbaccess.executeQuery(select);
			result = new Gericht();
			while (resultSet.next()) {
				result.setGerichtID(resultSet.getInt(1));
				result.setGerichtName(resultSet.getString(2));
				result.setMinuten(resultSet.getInt(3));
				result.setStunden(resultSet.getInt(4));
				result.setImage(resultSet.getBlob(5));
				System.out.println(result.toString());
			}

		} catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("SQLState: " + sqle.getSQLState());
			System.out.println("VendorError: " + sqle.getErrorCode());
			sqle.printStackTrace();
		} finally {
			dbaccess.close();
		}
	}

	public void delete(Object dataName) {
		// TODO
	}

}
