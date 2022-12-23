import java.util.*;	
public class CheckStockProduct {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		Product[] productList = new Product[scan.nextInt()];
		System.out.println();
		for(int i = 0;i<productList.length;i++) {
			productList[i] = new Product();
			System.out.print("Input product Id   : ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			productList[i].setUnit(scan.nextInt());
			System.out.println();
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'LOW' status.");
		System.out.println("--------------------------------");
		for(Product lowpro:productList) {
			if(lowpro.getUnit()<5) {
				System.out.println(">> "+lowpro.getId()+" has "+lowpro.getUnit()+" Units");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'NORMAL' status.");
		System.out.println("--------------------------------");
		for(Product lowpro:productList) {
			if(lowpro.getUnit()>=5 && lowpro.getUnit()<=50) {
				System.out.println(">> "+lowpro.getId()+" has "+lowpro.getUnit()+" Units");
			}
		}
		System.out.println("--------------------------------");
		System.out.println("List of product in 'HIGH' status.");
		System.out.println("--------------------------------");
		for(Product lowpro:productList) {
			if(lowpro.getUnit()>50) {
				System.out.println(">> "+lowpro.getId()+" has "+lowpro.getUnit()+" Units");
			}
		}


	}

}
