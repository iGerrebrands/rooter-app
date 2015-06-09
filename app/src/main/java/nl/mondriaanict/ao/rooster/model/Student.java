package nl.mondriaanict.ao.rooster.model;

public class Student {

    private String firstname, middlename, surname, email;
    private int cardId, mondriaanId, magisterId;


    public Student(String firstname, String middlename, String surname, int cardId, String email, int mondriaanId, int magisterId) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.surname = surname;
        this.cardId = cardId;
        this.email = email;
        this.mondriaanId = mondriaanId;
        this.magisterId = magisterId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public int getCardId() {
        return cardId;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getEmail() {
        return email;
    }

    public int getMondriaanId() {
        return mondriaanId;
    }

    public int getMagisterId() {
        return magisterId;
    }
}
