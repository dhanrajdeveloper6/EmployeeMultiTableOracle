package in.nit.Test;

import org.hibernate.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.nit.Util.HibernateUtil;
import in.nit.model.EmployeeMultiTableOracleClass;

public class TestDelete {

	public static void main(String[] args) {
		Session ses = HibernateUtil.getSf().openSession();
		Transaction tx = null;
		
		try(ses){
			tx  = ses.beginTransaction();
			EmployeeMultiTableOracleClass cl4 = new EmployeeMultiTableOracleClass();
			cl4.setEmpId(15);
			
			ses.delete(cl4);
			tx.commit();
			
		}catch( HibernateException he) {
			System.out.println(he.getMessage());
			tx.rollback();
			
		}
		System.out.println("Enhanced Form of try with resource block");
		System.out.println("Enhanced Try With Resource  version-9");
	}
}
