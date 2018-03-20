package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skracenica;
	private GregorianCalendar datum;
	private double kupovni;
	private double prodajni;
	private double srednji;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv==null)
			throw new RuntimeException();
		this.naziv = naziv;
	}

	public String getSkracenica() {
		return skracenica;
	}

	public void setSkracenica(String skracenica) {
		if(skracenica==null)
			throw new RuntimeException();
		this.skracenica = skracenica;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if(kupovni<0)
			throw new RuntimeException();
		this.kupovni = kupovni;
	}

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		if(prodajni<0)
			throw new RuntimeException();
		this.prodajni = prodajni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if(srednji<0)
			throw new RuntimeException();
		this.srednji = srednji;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skracenica=" + skracenica + ", datum=" + datum + ", kupovni=" + kupovni
				+ ", prodajni=" + prodajni + ", srednji=" + srednji + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}

}
