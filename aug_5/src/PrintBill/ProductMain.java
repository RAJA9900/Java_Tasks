package PrintBill;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList = new ArrayList<>();
		System.out.println("Java Systems");
		productList.add(new Product(100, "MotherBoard", 6000.00, 1));
		productList.add(new Product(201, "Cabinet", 45000.00, 1));
		productList.add(new Product(302, "Ram", 3500.00, 2));
		productList.add(new Product(400, "Harddisk", 4000.00, 4));
		productList.add(new Product(509, "Monitor", 6000.00, 1));
		productList.add(new Product(612, "cables", 399.99, 15));
		productList.add(new Product(709, "Mouse", 239.99, 4));
		productList.add(new Product(810, "Keyboard", 449.99, 3));

		Collections.sort(productList, (Product p1, Product p2) -> {
			String s1 = p1.getName();
			String s2 = p2.getName();
			return s1.compareTo(s2);
		});

		ProductMain pm = new ProductMain();
		pm.printMainProducts(productList);
	}

	public void printMainProducts(List<Product> productList) {
		System.out.println("---------------------------------------------------");
		System.out.println("#  Name           Price          Qty.         Total");
		System.out.println("---------------------------------------------------");
		int  i = 1;
		for(Product p: productList) {
			Product.printProducts(i++, p);
		}
		System.out.println("------------------------------------------------");
		Double totalBill = productList.stream().map(e -> e.getCost()*e.getQuantity()).reduce(0.0, (sum, bill) -> sum + bill);
		
		System.out.println("Total                    " + totalBill);
		System.out.println("5% GST                   " + totalBill*0.05);
		System.out.println("------------------------------------------------");
		System.out.println("Final Bill               " + (totalBill*1.05));
		System.out.println("------------------------------------------------");
	}
}