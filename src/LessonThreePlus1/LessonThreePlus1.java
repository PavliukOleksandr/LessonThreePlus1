package LessonThreePlus1;

import java.util.Scanner;

public class LessonThreePlus1 {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        Envelope1 en1 = new Envelope1();
        Envelope2 en2 = new Envelope2();
        Answer answer = new Answer();
        do {
            System.out.println("Numeric A -");
            en1.setA(sk.nextDouble());
            System.out.println("Numeric B -");
            en1.setB(sk.nextDouble());
            System.out.println("Numeric C -");
            en2.setC(sk.nextDouble());
            System.out.println("Numeric D -");
            en2.setD(sk.nextDouble());

            if(en1.getA() < en2.getC() && en1.getB() < en2.getD()) {
                System.out.println("The envelope will fit in the envelope");
            } else if(en1.getA() > en2.getC() && en1.getB() > en2.getD()) {
                System.out.println("The envelope will fit in the envelope");
            }else{
                System.out.println("The envelope will not fit in the envelope");
            }
            System.out.println("Type to continue: Y or YES");
            answer.setAsk(sk.next().toUpperCase());
        }while(answer.getAsk().equals("Y") || answer.getAsk().equals("YES"));
        sk.close();
    }
}
