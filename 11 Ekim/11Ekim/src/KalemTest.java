
public class KalemTest {

	public static void main(String[] args) {
		int sayi; //int degisken
		Kalem kalemBos= new Kalem(); //kalem tipinde nesne yaratt�k.
	//	kalemBos.kalemAnlat();
		
	 	Kalem kalemDolu= new Kalem("K�rm�z�","07");
	 //	kalemDolu.kalemAnlat();
	 	
	 	kalemBos.setKrenk("Sari");
	 	kalemBos.setKtip("tukenmez");
	 	
	 	System.out.println("Kalemin rengi: \t" + kalemDolu.getKrenk());
	 	System.out.println("Kalemin tipi: \t" + kalemDolu.getKtip());
		
	}

}
