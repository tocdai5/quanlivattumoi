package model;

// Generated Apr 5, 2015 2:15:39 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer id;
	private String mauser;
	private String user;
	private String password;
	private Set<Hoadon> hoadons = new HashSet<Hoadon>(0);

	public User() {
	}

	public User(String mauser, String user, String password) {
		this.mauser = mauser;
		this.user = user;
		this.password = password;
	}

	public User(String mauser, String user, String password, Set<Hoadon> hoadons) {
		this.mauser = mauser;
		this.user = user;
		this.password = password;
		this.hoadons = hoadons;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMauser() {
		return this.mauser;
	}

	public void setMauser(String mauser) {
		this.mauser = mauser;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(Set<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}

	@Override
	public String toString() {
		return  user ;
	}
	
	

}
