package io.testsmith.prestashop.answers.types;

public enum ContactSubject {
    CUSTOMER_SERVICE("Customer service"), WEBMASTER("Webmaster");

    private final String contactSubject;

    ContactSubject(String contactSubject) {
        this.contactSubject = contactSubject;
    }

    @Override
    public String toString() {
        return contactSubject;
    }
}
