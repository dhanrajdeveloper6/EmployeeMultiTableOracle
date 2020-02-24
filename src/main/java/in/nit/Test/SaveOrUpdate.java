package in.nit.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.Util.HibernateUtil;
import in.nit.model.EmployeeMultiTableOracleClass;

public class SaveOrUpdate {

	public static void main(String[] args) {
		Session ses= HibernateUtil.getSf().openSession();
		Transaction tx = null;
		
		try(ses){
			tx = ses.beginTransaction();
			
			EmployeeMultiTableOracleClass cl3 = new EmployeeMultiTableOracleClass();
			cl3.setEmpId(30);
			cl3.setEmpName("B");
			cl3.setEmpSal(4.5);
			cl3.setEmpPrj("MNO");
			cl3.setEmpDept("Security-Analysist");
			
			ses.saveOrUpdate(cl3);
			tx.commit();
			
		}catch( HibernateException he) {
			System.out.println(he.getMessage());
			tx.rollback();
		}
		System.out.println("Enhanced Try with resource block");
		System.out.println("Try Resource of version- 9");
	}

}
