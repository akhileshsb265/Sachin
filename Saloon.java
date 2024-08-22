class Saloon{
	public static void main(String[]args){
		String SaloonName ="Star Saloon";
		int price = 100;
		if(SaloonName == "RameshSaloon" && price == 50){
			System.out.println("good saloon");
		}
		if(SaloonName == "mahesSaloon" && price ==150){
			System.out.println("great saloon");
		}
		if(SaloonName =="Star Saloon" && price == 80){
			System.out.println("worst saloon");
		}
		if(SaloonName =="Star saloon" && price == 100){
			System.out.println("The best saloon in the city=="+ SaloonName);
		}
	}
}