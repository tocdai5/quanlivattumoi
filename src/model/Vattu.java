package model;

// Generated Apr 5, 2015 2:15:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Vattu generated by hbm2java
 */
public class Vattu implements java.io.Serializable {

	private Integer id;
	private String mavattu;
	private String tenvattu;
	private String donvitinh;
	private double dongia;
	private Set<Chitiethoadon> chitiethoadons = new HashSet<Chitiethoadon>(0);

	public Vattu() {
	}

	public Vattu(String mavattu, String tenvattu, String donvitinh,
			double dongia) {
		this.mavattu = mavattu;
		this.tenvattu = tenvattu;
		this.donvitinh = donvitinh;
		this.dongia = dongia;
	}

	public Vattu(String mavattu, String tenvattu, String donvitinh,
			double dongia, Set<Chitiethoadon> chitiethoadons) {
		this.mavattu = mavattu;
		this.tenvattu = tenvattu;
		this.donvitinh = donvitinh;
		this.dongia = dongia;
		this.chitiethoadons = chitiethoadons;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMavattu() {
		return this.mavattu;
	}

	public void setMavattu(String mavattu) {
		this.mavattu = mavattu;
	}

	public String getTenvattu() {
		return this.tenvattu;
	}

	public void setTenvattu(String tenvattu) {
		this.tenvattu = tenvattu;
	}

	public String getDonvitinh() {
		return this.donvitinh;
	}

	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}

	public double getDongia() {
		return this.dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public Set<Chitiethoadon> getChitiethoadons() {
		return this.chitiethoadons;
	}

	public void setChitiethoadons(Set<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

	@Override
	public String toString() {
		return  tenvattu ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Vattu other = (Vattu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!(id== other.id))
			return false;
		return true;
	}
	
	
	
	

}