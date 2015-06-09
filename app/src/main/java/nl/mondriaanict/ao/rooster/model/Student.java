package nl.mondriaanict.ao.rooster.model;

public class Student {

    private String firstName;
    private String middleName;
    private String surname;
    private String email;
    private String cardId;
    private String mondriaanId;
    private String magisterId;

    public Student(String firstName, String middleName, String surname, String email,
                   String cardId, String mondriaanId, String magisterId) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.email = email;
        this.cardId = cardId;
        this.mondriaanId = mondriaanId;
        this.magisterId = magisterId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCardId() {
        return cardId;
    }

    public String getMondriaanId() {
        return mondriaanId;
    }

    public String getMagisterId() {
        return magisterId;
    }
}
