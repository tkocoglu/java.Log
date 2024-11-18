/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproje;

/**
 *
 * @author Tayyip Koçoğlu
 */
public class asMain {
    public static void main(String[] args) {
        asCourse mat = new asCourse("Matematik", "MAT101", "MAT");
        asCourse fizik = new asCourse("Fizik", "FZK101", "FZK");
        asCourse kimya = new asCourse("Kimya", "KMY101", "KMY");

        asTeacher t1 = new asTeacher("Mahmut Hoca", "90550000000", "MAT");
        asTeacher t2 = new asTeacher("Fatma Ayşe", "90550000001", "FZK");
        asTeacher t3 = new asTeacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        asStudent s1 = new asStudent("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkExamQuiz(70, 80, 40);
        s1.isPass();

        asStudent s2 = new asStudent("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkExamQuiz(80, 900, 55);
        s2.isPass();

        asStudent s3 = new asStudent("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkExamQuiz(60, 40, 90);
        s3.isPass();
    }
}
