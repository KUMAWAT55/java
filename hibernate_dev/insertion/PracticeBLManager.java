
package com.model;

//import java.util.logging.Logger;

//import org.hibernate.Criteria;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.criterion.Restrictions;




import org.hibernate.criterion.Restrictions;

import com.common.HibernateUtil;
import com.view.Serv;



public class PracticeBLManager 
{
	
	SessionFactory s = HibernateUtil.getSessionFactory();
	public void insert(Serv r)
	{
		 Session s1 =s.openSession();
		    Transaction t =s1.beginTransaction();
		    s1.save(r);
		    t.commit();
		    s1.close();
		
	}
}
