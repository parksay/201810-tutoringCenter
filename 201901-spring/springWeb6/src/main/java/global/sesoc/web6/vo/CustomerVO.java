package global.sesoc.web6.vo;

public class CustomerVO {

	String custid;
	String password;
	String name;
	String email;
	String division;
	String idno;
	String address;
	
	public CustomerVO(){}

	public CustomerVO(String custid, String password, String name, String email, String division, String idno,
			String address) {
		super();
		this.custid = custid;
		this.password = password;
		this.name = name;
		this.email = email;
		this.division = division;
		this.idno = idno;
		this.address = address;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getIdno() {
		return idno;
	}

	public void setIdno(String idno) {
		this.idno = idno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerVO [custid=" + custid + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", division=" + division + ", idno=" + idno + ", address=" + address + "]";
	}
	
	
	
	
}
