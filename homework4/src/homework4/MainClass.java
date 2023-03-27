package homework4;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Kullanici kullanici1=new Kullanici("adlibusra", "adlibusra@gmail.com", "İstanbul");
		Kullanici kullanici2=new Kullanici("sumeyyeduru", "sumeyyeduru@gmail.com", "İstanbul");
		
		
		
		
		
		
Album album1=new Album("Sonses", "Tarkan",1997,  new String[]{"kuzu kuzu,Ölürüm sana, Dudu, Yine Sessiz "} ,50);		
Album album2=new Album("Vay Canım", "Müslüm Gürses",1999,  new String[]{"Elveda Meyhaneci , Serversen Aliyi , Nurtanem Nurtanem , Bakma Bana Öyle"},100);			
		
Sarki sarki=new Sarki("Kuzu Kuzu", "Tarkan",  album1, 5);
Sarki sarki2=new Sarki("Seversen Aliyi", "Müslüm Gürses",  album2, 4);
Sarki sarki3=new Sarki("Bakma Bana Öyle", "Müslüm Gürses ",  album2, 5);



		Sepet sepet = new Sepet();
		
		sepet.addKullanici(kullanici1);
		sepet.addKullanici(kullanici2);
		sepet.listKullanici();
		sepet.addAlbum(album1);
		sepet.addAlbum(album2);
		sepet.addAlbum(album2);
		sepet.listAlbum();
		
		sepet.addSarki(sarki);
		sepet.addSarki(sarki2);
		sepet.addSarki(sarki3);
		sepet.listSarki();
		sepet.searchAlbum(album1);
		sepet.totalPrice(album1);
		
	/*Store store =new Store();
	store.searchAlbum(album1); */
	}

}
