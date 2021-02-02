import beans.Role;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateFactoryUtils;

public class Main {
    public static void main(String[] args) {
        Add("Iryna");
    }

    private static void Add(String name) {
        try {
            Session session = HibernateFactoryUtils.getSessionFactory().openSession();
            Transaction tx1 = session.beginTransaction();

            Role role = new Role(name);
            session.save(role);

            tx1.commit();
            session.close();
        } catch (Exception ex) {
            System.out.println("Propblem " + ex.getMessage());
        }
    }
}
