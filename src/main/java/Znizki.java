import org.hibernate.mapping.Set;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class Znizki {
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

    public double getProcent_znizki() {
        return Procent_znizki;
    }

    public void setProcent_znizki(double procent_znizki) {
        Procent_znizki = procent_znizki;
    }

    public int Id;
    public String Nazwa;
    public double Procent_znizki;

    @OneToMany(mappedBy = "Bilety", fetch = FetchType.LAZY)
    private Bilety Znizki_Id = new Bilety();
}
