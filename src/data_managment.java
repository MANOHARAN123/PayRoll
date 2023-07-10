import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;

class Library_item
{
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    String title;
    int year;


}



class book extends Library_item
{
    String author;

}
class magazine extends Library_item
{
    int issue;

}
public class  data_managment{
    public static void main(String[] args) {
        book bk=new book();
        magazine mg=new magazine();
        bk.setId(101);
        bk.author="giant";
        bk.title="giant first publication";
        bk.year=2023;
        mg.setId(103);
        mg.title="giant second publication";
        mg.year=2023;
        mg.issue=1000;
        System.out.println("\nBOOK id "+bk.getId()+"\n Author name "+bk.author+"\n Title "+bk.title+"\n Year "+bk.year);
        System.out.println("\nMAGAZINE id "+mg.getId()+"\n Title "+mg.title+"\n"+ mg.year+"\n no of issue "+ mg.issue);



    }

}