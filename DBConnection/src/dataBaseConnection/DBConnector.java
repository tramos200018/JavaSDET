package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://customerdatadb.csdif1jsrk1t.us-east-1.rds.amazonaws.com:3306/InventoryDB";
    static final String USER = "admin";
    static final String PASS = "admin123";
	
	
	public static void connectToDB(String url, String user, String pswd) {
		
		Connection conn = null;
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("Connecting to database...");
	    	
			conn = DriverManager.getConnection(url,user,pswd);
		
		      Statement stmt = conn.createStatement();
		      
		      System.out.println("Done");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void addProduct(String name, int price, String details, int weight, int quantity) {
		
		Connection conn = null;
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	    	conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		      
		      Statement stmt = conn.createStatement();
		      
		      
		      
		      String sql = "INSERT INTO `Products` ( " +
		      "`productName`,`productPrice`,`productDetails`,`weight`, `quantity`)" + "VALUES (?, ? , ?, ?, ?);";
		      PreparedStatement preparedStatement = conn.prepareStatement(sql);
		      preparedStatement.setString(1, name);
		      preparedStatement.setInt(2, price);
		      preparedStatement.setString(3, details);
		      preparedStatement.setInt(4, weight);
		      preparedStatement.setInt(5, quantity);
		      		      
		      preparedStatement.executeUpdate();

		      
		      
		      System.out.println("Added Product into Database");
		      System.out.println("Done");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteProduct(String name) {
		
		Connection conn = null;
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	    	conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		      
		      Statement stmt = conn.createStatement();
		      
		      String sql = "DELETE FROM `Products` WHERE productName = ?";
		      PreparedStatement preparedStatement = conn.prepareStatement(sql);
		      preparedStatement.setString(1, name);
		     
		      		      
		      preparedStatement.executeUpdate();

		      
		      
		      System.out.println("Deleted Product from Database");
		      System.out.println("Done");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateProduct(String name, String newName, int newPrice, String newDets, int newWeight, int newQuantity) {
		
		Connection conn = null;
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	    	conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		      
		      Statement stmt = conn.createStatement();
		      
		      String sql = "UPDATE `Products` SET productName = ?, productPrice = ?, productDetails = ?, weight =  ?, quantity = ? WHERE productName = ?";
		      
		      
		      PreparedStatement preparedStatement = conn.prepareStatement(sql);
		      preparedStatement.setString(1, newName);
		      preparedStatement.setInt(2, newPrice);
		      preparedStatement.setString(3, newDets);
		      preparedStatement.setInt(4, newWeight);
		      preparedStatement.setInt(5, newQuantity);
		      preparedStatement.setString(6, name);

		     
		      		      
		      preparedStatement.executeUpdate();

		      
		      
		      System.out.println("Updated Product in Database");
		      System.out.println("Done");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void viewProducts() {
		
		Connection conn = null;
	    
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	
	    	conn = DriverManager.getConnection(DB_URL,USER,PASS);
			
		      
		      Statement stmt = conn.createStatement();
		      
		      String sql = "SELECT * FROM `Products` WHERE productName IS NOT NULL";
		      
		      ResultSet rs = stmt.executeQuery(sql);
		     
		      
		      while(rs.next()) {
		    	  System.out.println(rs.getString(1));
		      }

		      
		      
		      System.out.println("Viewed Products in Database");
		      System.out.println("Done");
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
	
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    
	    connectToDB(DB_URL, USER, PASS);
	    //addProduct("jerseys", 50, "Soccer jerseys", 1, 1);
	    //addProduct("shorts", 40, "Soccer shorts", 2, 1);
	    //deleteProduct("jerseys");
	    //updateProduct("jerseys", "shirts", 30, "Soccer Shirts", 1, 1);
	    viewProducts();
	    
	    
	}

}
