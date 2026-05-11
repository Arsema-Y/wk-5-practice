package Monday;

public class Teacher extends Person {

    String subject;
    int accessCode;
    boolean isSponsor;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //____________________________________


    public int getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(int accessCode) {
        this.accessCode = accessCode;
    }

    //____________________________________

    public boolean isSponsor() {
        return isSponsor;
    }

    public void setSponsor(boolean sponsor) {
        isSponsor = sponsor;
    }
}
