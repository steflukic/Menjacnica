package interfejsi;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKursValuteNaDan(String nazivNove, String skracenicaNove, GregorianCalendar datumNove, double kupovniNove, double prodajniNove, double srednjiNove);

	public void brisanjeKursaValuteNaDan(String skracenica, GregorianCalendar datum);

	public Valuta pronadjiKursValuteNaDan(String skracenica, GregorianCalendar datum);

}
