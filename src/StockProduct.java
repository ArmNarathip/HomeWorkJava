import java.util.*;
import java.text.*;
public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat frm = new DecimalFormat("#,###.00");
	public static void main(String[] args) {
		Product[] productList = new Product[4];
		for(int i=0;i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product ID : ");
			productList[i].setId(scan.next());
			
			System.out.print("Input product unit : ");
			productList[i].setUnit(scan.nextInt());
			while(!(productList[i].getUnit()>0)) {
				
				System.out.print("Input product unit : ");	
				productList[i].setUnit(scan.nextInt());
			}
			
			System.out.print("Input product price : ");
			productList[i].setPice(scan.nextDouble());
			while(!(productList[i].getPrice()>0)) {
				System.out.print("Input product price : ");
				productList[i].setPice(scan.nextDouble());
			}
			System.out.println();
		}
			System.out.println("---------------------------------");
			double sum = 0;
			for(Product _productList:productList) {
				System.out.println("Product ID : "+_productList.getId()+
						"Total Price = " + frm.format(_productList.calculate())+" baht.");
				sum += _productList.calculate();
			
			}
			System.out.println("---------------------------------");
			System.out.println("Total price of all product is "+frm.format(sum)+" baht.");
		}
		

	}


