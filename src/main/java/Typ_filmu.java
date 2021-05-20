import javax.persistence.*;

@Entity(name="Typ_filmu")
@Table
public class Typ_filmu {

    @Id @GeneratedValue
    public int Id;
    public String Nazwa;

    public Typ_filmu (){

    };

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNazwa() {
        return Nazwa;
    }




    @OneToMany(mappedBy = "Filmy", fetch = FetchType.LAZY)
    private Filmy Typ_Filmu_Id = new Filmy();
}

