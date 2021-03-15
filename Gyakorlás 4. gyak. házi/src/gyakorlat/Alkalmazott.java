package gyakorlat;

public class Alkalmazott {
	private String nev;
	private int fizetes;
	
	
	public void setNev(String nev) {
		this.nev = nev;
	}
	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}
	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", fizetes=" + fizetes + "]";
	}
	
	public void fizetesNovel(int osszeg) {
		this.fizetes += osszeg;
	}
	public void setNevesFizeteses(String nev, int fizetes) {
		this.nev = nev;
		this.fizetes = fizetes;
	}
	
	//c
	public boolean visszaAd(int also, int felso) {
		if((this.fizetes) < felso && (this.fizetes) > also) {
			return true;
		}
		return false;
	}
	
	public double visszaAdSzazalekos() {
		return (this.fizetes / 100) * 16;
	}
	public boolean visszaAdFizetesEldontes(Alkalmazott alkalmazott) {
		if(this.fizetes > alkalmazott.fizetes) {
			return true;
		}
		return false;
	}
	//c
	
	
	
	
}
