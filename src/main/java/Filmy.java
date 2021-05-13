public class Filmy {
    public int Id;
    public String Nazwa;
    public int Rok_produkcji;
    public String Rezyser;
    public int Typ_filmu_id;
    public String Ograniczenie_wiekowe;
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

    public int getTyp_filmu_id() {
        return Typ_filmu_id;
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

    public void setTyp_filmu_id(int typ_filmu_id) {
        Typ_filmu_id = typ_filmu_id;
    }

    public void setOgraniczenie_wiekowe(String ograniczenie_wiekowe) {
        Ograniczenie_wiekowe = ograniczenie_wiekowe;
    }
}
