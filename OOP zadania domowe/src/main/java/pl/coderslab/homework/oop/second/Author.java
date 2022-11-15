public class Author extends Person {
    private String pseudonym;
    public Author(int id, String firstName, String lastName, String pseudonym) {
        super(id, firstName, lastName);
        this.pseudonym = pseudonym;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }
}
