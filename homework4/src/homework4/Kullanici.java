package homework4;

public class Kullanici {
	 private String kullaniciAdi;
	 private String kullaniciEmail;
	 private String kullaniciAdres;
	 
	 
	 public Kullanici(String kullaniciAdi, String kullaniciEmail, String kullaniciAdres) {
	        this.kullaniciAdi=kullaniciAdi;
	        this.kullaniciEmail=kullaniciEmail;
	        this.kullaniciAdres=kullaniciAdres;
	        
	    }
 
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getKullaniciEmail() {
		return kullaniciEmail;
	}
	public void setKullaniciEmail(String kullaniciEmail) {
		this.kullaniciEmail = kullaniciEmail;
	}
	public String getKullaniciAdres() {
		return kullaniciAdres;
	}
	public void setKullaniciAdres(String kullaniciAdres) {
		this.kullaniciAdres = kullaniciAdres;
	}
	 
	 public void printUserInfo(){
	        System.out.println("Kullanıcı adı: " + kullaniciAdi);
	        System.out.println("E-posta: " + kullaniciEmail);
	        System.out.println("Adres: " + kullaniciAdres);
	        System.out.println();
	    }
}
