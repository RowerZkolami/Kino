import org.hibernate.mapping.Set;

import javax.persistence.*;

@Entity(name="Filmy")
@Table
public class Filmy {
    @Id @GeneratedValue
    public int Id;
    public String Nazwa;
    public int Rok_produkcji;
    public String Rezyser;
    public int Typ_filmu_Id;
    public String Ograniczenie_wiekowe;

    public Filmy(){

    };

    public int getId() {
        return Id;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public int getRok_produkcji() {
        return Rok_produkcji;
    }

    public String getRezyser() {
        return Rezyser;
    }

    public int getTyp_filmu_Id() {
        return Typ_filmu_Id;
    }

    public String getOgraniczenie_wiekowe() {
        return Ograniczenie_wiekowe;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public void setRok_produkcji(int rok_produkcji) {
        Rok_produkcji = rok_produkcji;
    }

    public void setRezyser(String rezyser) {
        Rezyser = rezyser;
    }

    public void setTyp_filmu_Id(int typ_filmu_Id) {
        Typ_filmu_Id = typ_filmu_Id;
    }

    public void setOgraniczenie_wiekowe(String ograniczenie_wiekowe) {
        Ograniczenie_wiekowe = ograniczenie_wiekowe;
    }

    @OneToMany(mappedBy = "Bilety", fetch = FetchType.LAZY)
    private Bilety Filmy_Id = new Bilety();
}
