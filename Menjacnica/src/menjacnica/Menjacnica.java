package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKursValuteNaDan(String nazivNove, String skracenicaNove, GregorianCalendar datumNove,
			double kupovniNove, double prodajniNove, double srednjiNove) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKursValuteNaDan(String skracenica, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void brisanjeKursaValuteNaDan(String skracenica, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menjacnica other = (Menjacnica) obj;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menjacnica [valute=" + valute + "]";
	}

}
