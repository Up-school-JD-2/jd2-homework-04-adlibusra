package homework4;

import java.util.ArrayList;
import java.util.List;

public class Sepet {
private List<Album> albums;
private List<Sarki> sarkilar;
private List<Kullanici>  kullanicilar;

public Sepet() {
	albums = new ArrayList<>();
	sarkilar = new ArrayList<>();
	kullanicilar= new ArrayList<>();
}

public void addSarki(Sarki sarki) {
	this.sarkilar.add(sarki);
}
public void addAlbum(Album album) {
	this.albums.add(album);
}

public void addKullanici(Kullanici kullanici) {
	this.kullanicilar.add(kullanici);
	System.out.println("Kullanıcı Eklendi " );
}

public void listKullanici() {
	System.out.println("--------------  Kullanıcılar----------------");
	for(Kullanici kullanici: this.kullanicilar) {
		kullanici.printUserInfo();
		System.out.println("------------------------------------------------");
	}
}



public void   totalPrice(Album album) {
	double toplam=0;
	for(Album album1: albums) {
		toplam += album1.getPrice();
		
	}System.out.println("Toplam fiyat " + toplam);

}
	
public void listSarki() {
	System.out.println("--------------Sepete Eklenen Şarkılar----------------");
	for(Sarki sarki: this.sarkilar) {
		sarki.printSarkiInfo();
		System.out.println("------------------------------------------------");
	}
}

public void searchAlbum(Album album) {
	for(Album album1:  albums) {
		if(album1.getAlbumName().equalsIgnoreCase(album.getAlbumName())) {
			System.out.println("Album bulundu : " + album.getAlbumName());
		}
	}
	System.out.println("Album bulamadı : " );
}
public void listAlbum() {
	System.out.println("----------------Sepete Eklenen Albümler----------------");
	for(Album album: this.albums) {
		album.printAlbumInfo();
		System.out.println("--------------------------------------");
	}
	
}
	
}
