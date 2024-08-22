class Bakery {
    public static void main(String[] args) {
        double EggPuffs = 22.57;
		double VegPuffs =15.58;
		double CreamBun =20.43;
		double ChoclateCake =40.51;
	double[] itemPrices ={EggPuffs,VegPuffs,CreamBun,ChoclateCake};
	itemPrices[1] = 16.72;
	VegPuffs=itemPrices[1];
        for (int i = 0; i < itemPrices.length; i++) {
            System.out.println("Item Price: " + itemPrices[i]);
        }
    }
}