import javax.persistence.*;

//import org.hibernate.annotations.Table;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.*;


public class Role {
    public int Id;
    public String Nazwa;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }



    @OneToMany(mappedBy = "User", fetch = FetchType.LAZY)
    private User Role_id = new User();
}
