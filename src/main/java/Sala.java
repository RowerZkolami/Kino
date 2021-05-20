import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Sala")
@Table

public class Sala {
    @Id
    @GeneratedValue
    public int Id;
    public String Rzad;
    public String Miejsce;

    public Sala (){

    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRzad() {
        return Rzad;
    }

    public void setRzad(String rzad) {
        Rzad = rzad;
    }

    public String getMiejsce() {
        return Miejsce;
    }

    public void setMiejsce(String miejsce) {
       Miejsce = miejsce;
    }

}