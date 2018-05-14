public class Main {

	public static void main(String[] args) {
		Hotel george = new Hotel();
		Hotel plaza = new Hotel("Plaza", "Kyiv", 200, 250);
		Hotel knyaziyDvir = new Hotel("Knyaziy Dvir", "Sokilnyky", 100, 50, 400);
		
		System.out.println(george.toString());
		System.out.println(plaza.toString());
		System.out.println(knyaziyDvir.toString());
		
		Hotel.printStaticSum();
		
		george.printSum();
		plaza.printSum();
		knyaziyDvir.printSum();
	}

}