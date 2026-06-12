interface Readable {
    public void read();
}
interface Writable{
    public void write();
}
interface Storable{
    public void store();
}
class File implements Readable,Writable,Storable{
    public void read() {
        System.out.println("Read this!");
    }
    public void write(){
        System.out.println("Write this!");
    }
    public void store() {
        System.out.println("Store this!");
    }
}
class q24{
    public static void main(String args[]) {
        File f1 = new File();
        f1.read();
        f1.write();
        f1.store();
    }
}