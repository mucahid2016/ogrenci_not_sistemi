public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "5071835000", "TRH");

        Teacher t2 = new Teacher("Graham Bell", "000", "FZK");

        Teacher t3 = new Teacher("Kül Yutmaz", "50715954", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji", "101", "BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Ali", "123", "4", tarih, fizik, bio);
        s1.addBulkExamNote(100, 70, 40);
        s1.isPass();

        Student s2 = new Student("Necmi", "1453", "4", tarih, fizik, bio);
        s2.addBulkExamNote(100,0,0);
        s2.isPass();
    }
}
