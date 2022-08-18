package springfield.academy.schoolinformationsystem.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Grade implements Serializable {

    @Id
    @Column(nullable = false)
    private int value;
    private int label;

    private String sectional_head;

    // default constructor
    public Grade() {
    }

    // getters and setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    public String getSectional_head() {
        return sectional_head;
    }

    public void setSectional_head(String sectional_head) {
        this.sectional_head = sectional_head;
    }
}
