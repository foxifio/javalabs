
public class Main {

	public static void main(String[] args) {
		Hotel George = new Hotel();
		Hotel Plaza = new Hotel("Plaza", "Kyiv", 200, 250);
		Hotel Knyaziy_Dvir = new Hotel("Knyaziy Dvir", "Sokilnyky", 100, 50, 400);
		
		System.out.println(George.toString());
		System.out.println(Plaza.toString());
		System.out.println(Knyaziy_Dvir.toString());
		
		Hotel.printStaticSum();
		
		George.printSum();
		Plaza.printSum();
		Knyaziy_Dvir.printSum();
	}

}
