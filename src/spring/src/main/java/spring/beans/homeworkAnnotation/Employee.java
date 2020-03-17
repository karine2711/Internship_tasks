package spring.beans.homeworkAnnotation;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
    Company company;

    public Employee(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return company.toString();
    }
}
