package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="empMulti")
@SecondaryTables({ @SecondaryTable(name="empproftaba"), @SecondaryTable(name="empproftabb" , pkJoinColumns = @PrimaryKeyJoinColumn(name="aid")) })
public class EmployeeMultiTableOracleClass {
	@Id
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private  String empName;
	@Column(name="esal")
	private Double empSal;
	@Column(name="prjs", table= "empproftaba")
	private String empPrj;
	@Column(name="dept" , table = "empproftabb")
	private String empDept;
	
	public EmployeeMultiTableOracleClass() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpPrj() {
		return empPrj;
	}

	public void setEmpPrj(String empPrj) {
		this.empPrj = empPrj;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "EmployeeMultiTableOracleClass [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal
				+ ", empPrj=" + empPrj + ", empDept=" + empDept + "]";
	}
	
	
	
	

}
