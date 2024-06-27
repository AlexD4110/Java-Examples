
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductManagement {
	
	public static void addProduct(Product newProduct) {
		

}
	public static void updateProduct(Product updateProduct) {
		
	}
	public static void deleteProduct(int IdToDelete) {
		String sql = "DELETE FROM products WHERE product_id = ?";
        try (Connection conn = DatabaseUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, productIdToDelete);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
		
	}
	  public List<Product> getAllProducts() {
	        List<Product> productList = new ArrayList<>();
	        String sql = "SELECT * FROM products";
	        try (Connection conn = DatabaseUtil.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
	            while (rs.next()) {
	                Product product = new Product(
	                        rs.getInt("product_id"),
	                        rs.getString("name"),
	                        rs.getString("description"),
	                        rs.getDouble("price"),
	                        rs.getInt("stock_quantity"),
	                        rs.getInt("min_stock_level")
	                );
	                productList.add(product);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return productList;
	    }
	}