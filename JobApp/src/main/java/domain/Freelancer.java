
package domain;


public class Freelancer {
   private String fullname;
    private String email;
    private String contact;
    private String typeofwork;
    private String workdscript;
    private String area;
    private String hourr;
    private String flatr;
    private String promo;
    private String book;
    private String response;
     private String xp;
     private String password;

    public Freelancer() {
    }

    public Freelancer(String fullname, String email, String contact, String typeofwork, String workdscript, String area, String hourr, String flatr, String promo, String book, String response, String xp, String password) {
        this.fullname = fullname;
        this.email = email;
        this.contact = contact;
        this.typeofwork = typeofwork;
        this.workdscript = workdscript;
        this.area = area;
        this.hourr = hourr;
        this.flatr = flatr;
        this.promo = promo;
        this.book = book;
        this.response = response;
        this.xp = xp;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTypeofwork() {
        return typeofwork;
    }

    public void setTypeofwork(String typeofwork) {
        this.typeofwork = typeofwork;
    }

    public String getWorkdscript() {
        return workdscript;
    }

    public void setWorkdscript(String workdscript) {
        this.workdscript = workdscript;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHourr() {
        return hourr;
    }

    public void setHourr(String hourr) {
        this.hourr = hourr;
    }

    public String getFlatr() {
        return flatr;
    }

    public void setFlatr(String flatr) {
        this.flatr = flatr;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getXp() {
        return xp;
    }

    public void setXp(String xp) {
        this.xp = xp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Freelancer{" + "fullname=" + fullname + ", email=" + email + ", contact=" + contact + ", typeofwork=" + typeofwork + ", workdscript=" + workdscript + ", area=" + area + ", hourr=" + hourr + ", flatr=" + flatr + ", promo=" + promo + ", book=" + book + ", response=" + response + ", xp=" + xp + ", password=" + password + '}';
    }
    
}
