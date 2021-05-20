import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.security.auth.login.Configuration;


public class SessionFactory {
public SessionFactory sessionFactory = new SessionFactory();
    {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder =
                new StandardServiceRegistryBuilder().applySetting(configuration.getProperties());
SessionFactory sessionFactory = (SessionFactory) configuration.buildSessionFactory(.build());
return sessionFactory;






    }

}
