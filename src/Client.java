public class Client {
    private String firstName;

    private  String surName;

    private String taxReferenceCode;

    public Client() {
    }

    public Client(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTaxReferenceCode() {
        return taxReferenceCode;
    }

    public void setTaxReferenceCode(String taxReferenceCode) {
        this.taxReferenceCode = taxReferenceCode;
    }
}