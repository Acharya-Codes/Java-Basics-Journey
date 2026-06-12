interface Playable{
    void play();
}
class Guitar implements Playable{
     public void play() {
        System.out.println("Guitar is playing");
     }
}
class Piano implements Playable{
    public void play() {
        System.out.println("Piano is playing");
    }
}
class q22{
    public static void main(String args[]) {
        Guitar g1 = new Guitar();
        Piano p1 = new Piano();
        g1.play();
        p1.play();
    }
}