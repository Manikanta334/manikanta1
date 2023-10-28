interface Naveen
{
    void poojitha();
}
interface RaviTeja{
    void ammu();
}
class Mani{
    void king(){
    System.out.println("peaceful life");
}
}
class Love extends Mani implements Naveen,RaviTeja
{
   public void poojitha()
    {
        System.out.println("Both sides love");
    }
   public void ammu()
    {
        System.out.println("Ravi loves Amurutha");
    }
} 
public class Interface{
    public static void main(String args[])
    {
        Love l = new Love();
        l.ammu();
        l.poojitha();
        l.king();
    }

}