package java.mirea.lab_2;

public class HumanTest {
    public static void main(String[] args) {
    Human jc=new Human(25,100,true);
    Human.Hand jcHand=new Human.Hand(100);
    Human.Leg jcLeg = new Human.Leg(100);
    Human.Head jchead =new Human.Head(100);
    jchead.headshot(100);
    jc.checkHP(jchead,jcLeg,jcHand);
    System.out.println(jc);
    }
}
