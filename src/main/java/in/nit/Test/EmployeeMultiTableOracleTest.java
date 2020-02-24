package in.nit.Test;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.EmployeeMultiTableOracleClass;
import in.nit.Util.HibernateUtil;

public class EmployeeMultiTableOracleTest {
	
	public static void main(String[] args) {
		Session ses = null;
		Transaction tx = null;
		
		try {
			ses = HibernateUtil.getSf().openSession();
			tx = ses.beginTransaction();
			 
			EmployeeMultiTableOracleClass cl1 = new EmployeeMultiTableOracleClass();
			
			cl1.setEmpId(15);
			cl1.setEmpName("A");
			cl1.setEmpSal(2.2);
			cl1.setEmpPrj("NIT");
			cl1.setEmpDept("DEV");
			
			ses.save(cl1);
			tx.commit();
			
		}catch( HibernateException he) {
			System.out.println(he.getMessage());
			tx.rollback();
		}
		System.out.println("Normal try-catch block");
		System.out.println("try catch block of vsersion-5");
	}

}
