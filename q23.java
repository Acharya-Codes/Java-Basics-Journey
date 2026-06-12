interface Printable {
   public void display();
}
interface Showable {
    public void display();
}
class Document implements Printable,Showable {
    public void display() {
      System.out.println("I did it!");
    }
}
class q23{
    public static void main(String args[]){
        Document d1 = new Document();
        d1.display();
    }
}