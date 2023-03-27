package homework4;

public class Sarki {

	private String sarkiName;
	private String sanatciName;
	private Album album;
	private int uzunluk;
	
	
	
	public Sarki(String sarkiName, String sanatciName, Album album, int uzunluk) {
		this.album=album;
		this.sarkiName=sarkiName;
		this.sanatciName=sanatciName;
		this.uzunluk=uzunluk;		
		
	}


	public String getSarkiName() {
		return sarkiName;
	}


	public void setSarkiName(String sarkiName) {
		this.sarkiName = sarkiName;
	}


	public Album getAlbum() {
		return album;
	}


	public void setAlbum(Album album) {
		this.album = album;
	}


	public String getSanatciName() {
		return sanatciName;
	}


	public void setSanatciName(String sanatciName) {
		this.sanatciName = sanatciName;
	}


	public int getUzunluk() {
		return uzunluk;
	}


	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	
	public void printSarkiInfo() {
		System.out.println("Album name : " + album.getAlbumName() );
		System.out.println("Şarkı Name: " + sarkiName);
		System.out.println("Sanatçı  Name: " + sanatciName);
		System.out.println("uzunluk : " + uzunluk);
	}
}
