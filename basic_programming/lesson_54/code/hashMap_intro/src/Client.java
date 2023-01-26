import java.util.Objects;

public class Client {
    String firstName;
    String secondName;
    boolean isMale;

    public Client(String firstName, String secondName, boolean isMale) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return isMale == client.isMale && Objects.equals(firstName, client.firstName) && Objects.equals(secondName, client.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, isMale);
    }
}
