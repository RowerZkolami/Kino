import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class User {
public int Id;
public String Login;
public String Haslo;
public int Role_id;
public String Email;


public int getid() {
    return Id;
}

    public String getLogin() {
    return Login;
}

    public String getHaslo() {
        return Haslo;
    }

    public int getRole_id() {
        return Role_id;
    }

    public String getEmail() {
        return Email;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setHaslo(String haslo) {
        Haslo = haslo;
    }

    public void setRole_id(int role_id) {
        Role_id = role_id;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @OneToMany(mappedBy = "Bilety", fetch = FetchType.LAZY)
    private Bilety User_Id = new Bilety();

@OneToMany(mappedBy = "Osoba", fetch = FetchType.LAZY)
    private Osoba User_id = new Osoba();
}








