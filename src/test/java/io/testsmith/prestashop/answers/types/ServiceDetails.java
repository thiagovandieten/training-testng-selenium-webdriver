package io.testsmith.prestashop.answers.types;

public class ServiceDetails {

    private ContactSubject subject;
    private String email;
    private String message;
    private String reference;

    public ContactSubject getSubject() {
        return subject;
    }

    public void setSubject(ContactSubject customerService) {
        this.subject = customerService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
