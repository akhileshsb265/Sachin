class Galaxy{
	public static void main(String[]args){
		String GalaxyName = "Milky Way";
		int size = 100000;
		if(GalaxyName == "Andromeda Galaxy" && size ==10000 ){
			System.out.println("The biggest galaxy name =" + GalaxyName);
		}
		if(GalaxyName=="Cygnus A" && size ==1000 ){
			System.out.println("The biggest galaxy name = "+ GalaxyName);
		}
		if(GalaxyName=="Virgo A" && size ==1000000 ){
			System.out.println("The biggest galaxy name =" + GalaxyName);
		}
		if(GalaxyName=="Milky Way" && size ==1000000 ){
			System.out.println("The biggest galaxy name =" + GalaxyName);
		}
		else{
			System.out.println("The code is invalid");
		}
		
	}
}