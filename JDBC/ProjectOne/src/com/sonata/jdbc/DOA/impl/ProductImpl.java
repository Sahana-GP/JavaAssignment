package com.sonata.jdbc.DOA.impl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.sonata.jdbc.DOA.ProductIntf;
import com.sonata.jdbc.emodel.Product;

public class ProductImpl implements ProductIntf{
	DBConnection db = new DBConnection();
	int row = 0;
	PreparedStatement st = null;
	

	     public  int insertProd(Object object)
	     {
	    	 Product p1 = (Product) object;
	 		
	 		try {
	 			st = db.getConnection().prepareStatement("insert into product values(?,?,?)");
	 			st.setInt(1, p1.getProductID());
	 			st.setString(2, p1.getProductName());
	 			st.setDouble(3, p1.getProductPrice());
	 			row = st.executeUpdate();
	 			db.closeConnection();
	 		} catch (SQLException e) {e.printStackTrace();}
	 		System.out.print("Product inserted ");
	 		return row;
	 	}
	               
	     @Override
	 	public int deleteProd(Object object) {
	 		Product p = (Product) object;
	 		try {
	 			st = db.getConnection().prepareStatement("selet * from product where productID = ?");
	 			st.setInt(1, p.getProductID());
	 			row = st.executeUpdate();
	 			db.closeConnection();
	 		} catch (SQLException e) {e.printStackTrace();}
	 		System.out.print("Product deleted ");
	 		return row;
	 	}
	 	@Override
	 	public int updateProd(Object object) {
	 		Product p = (Product) object;
	 		try {
	 			st = db.getConnection().prepareStatement("update product set productName = ? , productPrice = ? where productID = ?");
	 			st.setString(1, p.getProductName());
	 			st.setDouble(2, p.getProductPrice());
	 			st.setInt(3, p.getProductID());
	 			row = st.executeUpdate();
	 			db.closeConnection();
	 		} catch (SQLException e) {e.printStackTrace();}
	 		System.out.print("Product updated ");
	 		return row;
	 	}
	 	
	 	@Override
	 	public int displayProd() {
	 		// SELECT * FROM table_name;
	 		try {
	 			st = db.getConnection().prepareStatement("select * from product");
	 			ResultSet rs = st.executeQuery();
	 			if (rs.next()) {
	 				//System.out.println("productID\tproductName\tproductPrice");
	 				//do {
	 				   System.out.println(rs.getInt("productID") + "\t\t" + rs.getString("productName") + "\t\t" + rs.getDouble("productPrice"));
	 				} //while (rs.next());
	 			 else {
	 				System.out.println("Zero Products");
	 			}
	 			db.closeConnection();
	 		} catch (SQLException e) {e.printStackTrace();}
			return row;
	 	}
	 	
	 	}
	 