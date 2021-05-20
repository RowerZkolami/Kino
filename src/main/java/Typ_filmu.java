import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Typ_filmu {
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

    public int Id;
    public String Nazwa;




    @OneToMany(mappedBy = "Filmy", fetch = FetchType.LAZY)
    private Filmy Typ_Filmu_Id = new Filmy();
}

