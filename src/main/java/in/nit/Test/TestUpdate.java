package in.nit.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.Util.HibernateUtil;
import in.nit.model.EmployeeMultiTableOracleClass;

public class TestUpdate {

	public static void main(String[] args) {
		
		Transaction tx = null;
		try(Session ses = HibernateUtil.getSf().openSession(); ){
			
			tx = ses.beginTransaction();
			
			EmployeeMultiTableOracleClass cl2 = new EmployeeMultiTableOracleClass();
			 cl2.setEmpId(15);
			 cl2.setEmpName("B");
			 cl2.setEmpSal(3.6);
			 cl2.setEmpPrj("HCL");
			 cl2.setEmpDept("DEVP");
			 
			 ses.update(cl2);
			 tx.commit();
		}catch( HibernateException he) {
			System.out.println(he.getMessage());
			tx.rollback();
		}
		System.out.println("Try with Resource block ");
		System.out.println("Try  Resource of version- 7");
		
	}

}
