import java.util.Scanner;
import java.lang.String;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static String[] op1;
    public static String[] op2;
    public static String a;
    public static String b;
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);
        out.println("¬ведите выражение в следующем формате:\"a\"+\"b\" или \"a\"+b, где b число");
        String oper = scan.nextLine();
        op1 = oper.split("[\"]");
        String str = String.join("", op1);
        op2 = str.split("[/*+-]");
        String str1 = String.join("", op2);
        String[] op3 = oper.split("");
        if (str1.length() > 10 ){
            out.println("ќшибка: строка должна содержать не более 10 символов");
        } else if (op3[0].equals("\"")) {
            a = op1[1];
                if (oper.contains("/")) {
                Divided div = new Divided();
                div.divided();
            } else if (oper.contains("*")) {
                Multiply mul = new Multiply();
                mul.multiply();
            } else if (oper.contains("+")) {
                Plus pl = new Plus();
                pl.plus();
            } else if (oper.contains("-")) {
                Minus mns = new Minus();
                mns.minus();
            }
        }else out.println("ќшибка: не верно введено выражение");
    }
         static class Plus {
            public void plus() {
                b = op2[1];
                System.out.println(a + b);
            }
         }
        static class Minus {
            public void minus() {
            b = op2[1];
            String[] ar =a.split(b);
            a = String.join("",ar);
            System.out.println(a);
            }
        }
        static class Multiply {
            public void multiply() {
                int z = Integer.parseInt(op2[1]);
                int c = a.length();
                if ((z * c) > 40) {
                    int r = 40 / c;
                    a = a.repeat(r);
                    out.println(a + "...");
                } else out.println(a.repeat(z));
            }
    }
        static class Divided{
            public void divided (){
                    b = op2[1];
                    int c = a.length();
                    int z = Integer.parseInt(op2[1]);
                    c = c / z ;
                    for (int i = 0; i < c; i++) {
                        char rez = a.charAt(i);
                    System.out.print(rez);
                    }
            }
    }
}

