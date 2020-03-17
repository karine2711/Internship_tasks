package spring.beans.homeworkAnnotation;

import org.springframework.stereotype.Component;

@Component("company")
public class Company {

    String name="default";
    String ceoName;
    int foundationYear;

    public Company(String name) {
        this.name = name;
    }

    public Company(){}
    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

}
