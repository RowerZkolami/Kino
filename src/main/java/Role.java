import javax.persistence.*;

//import org.hibernate.annotations.Table;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.*;
@Entity(name="Role")
@Table
public class Role {
    @Id
    @GeneratedValue
    public int Id;
    public String Nazwa;

public Role(){

};
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
