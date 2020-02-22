package in.nit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	@Column
	private String ename;
	@Column
	private String addrs;
	
}
