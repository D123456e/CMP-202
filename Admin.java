package OOP;

public class Admin extends User {
    String staffNo;
    void uploadResults(String course, float score) {
        System.out.println(course + " " + score);
    }
    public static void main(String[] args) {
        Admin adminName = new Admin();
        adminName.name ="Emmanuel";
        adminName.password = "363849";
        System.out.println(adminName.register());
    }
} 
