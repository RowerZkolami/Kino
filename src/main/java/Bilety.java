import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity(name="Bilety")
@Table
public class Bilety {
    @Id @GeneratedValue
    public int Id;
    public int Filmy_Id;
    public int User_Id;
    public int Znizki_Id;

    public Bilety(){

    };

    public void setId(int id) {
        Id = id;
    }

    public void setFilmy_Id(int filmy_Id) {
        Filmy_Id = filmy_Id;
    }

    public void setUser_Id(int user_Id) {
        User_Id = user_Id;
    }

    public void setZnizki_id(int znizki_id) {
        Znizki_Id = znizki_id;
    }

    public int getId() {
        return Id;
    }

    public int getFilmy_Id() {
        return Filmy_Id;
    }

    public int getUser_Id() {
        return User_Id;
    }

    public int getZnizki_id() {
        return Znizki_Id;
    }













}
