package nl.mondriaanict.ao.rooster.model;

import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

public class Student implements Serializable{

    @SerializedName("first_name")
    private String firstName;

    @SerializedName("middle_name")
    private String middleName;

    @SerializedName("surname")
    private String surname;

    private String email;

    @SerializedName("card_id")
    private String cardId;

    @SerializedName("mondriaan_id")
    private String mondriaanId;

    @SerializedName("magister_id")
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
