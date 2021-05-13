import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.security.auth.login.Configuration;

public class main {
    public static void main(String[] args){
    Session session = null;

    try
    {
            //stworzenie nowej sesji
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        session = sessionFactory().openSession();


        session.save();
    }
    //łapanie wyjatkow
        catch(Exception e)
        {
        System.out.println(e.getMessage());

        }
    //wrzucenie oczekujacych rekordow do bazy
    finally {
        session.flush();
        session.close();
    }






    }
}














