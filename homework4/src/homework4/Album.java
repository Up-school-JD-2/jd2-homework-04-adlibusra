package homework4;

import java.util.Arrays;

public class Album {

	private String albumName;
	private String sanatciName;
	private int yayinTarihi;
	private double fiyat;
	private String[] sarkiList;
	
	public Album(String albumName,String sanatciName, int yayinTarihi,String[] sarkiList,double fiyat) {
		this.albumName=albumName;
		this.setSanatciName(sanatciName);
		this.setYayinTarihi(yayinTarihi);
		this.setSarkiList(sarkiList);
		this.fiyat=fiyat;
		
	}
	
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName=albumName;
	}

	public String getSanatciName() {
		return sanatciName;
	}

	public void setSanatciName(String sanatciName) {
		this.sanatciName = sanatciName;
	}

	public int getYayinTarihi() {
		return yayinTarihi;
	}

	public void setYayinTarihi(int yayinTarihi) {
		this.yayinTarihi = yayinTarihi;
	}
	

	public double  getPrice() {
		return fiyat;
	}

	public void SetPrice(double fiyat) {
		this.fiyat = fiyat;
	}

	public String[] getSarkiList() {
		return sarkiList;
	}

	public void setSarkiList(String[] sarkiList) {
		this.sarkiList = sarkiList;
	}
	  public void printAlbumInfo(){
	        System.out.println("Album Adı: " + albumName);
	        System.out.println("Sanatci Adı : " + sanatciName);
	        System.out.println("Yayın yılıı : " + yayinTarihi);
	        System.out.println("Şarkı Listesi : " + Arrays.toString(sarkiList));
	        System.out.println("Fiyatı  : " + fiyat);
	        System.out.println();
	    }
	
}
