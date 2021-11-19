
import java.util.Scanner;


public class Proje9 {

    public static void main(String[] args){
       int mat, fiz, tur, kim, muz, total, dersSayı = 5;
       double average;


       Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        tur = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = input.nextInt();

        total = mat + fiz + tur + kim + muz;

        if((mat < 0) || (mat > 100)) {
            dersSayı = dersSayı - 1;
            total = total - mat;
           if ((fiz < 0) || (fiz > 100)) {
                dersSayı = dersSayı - 1;
                total = total - fiz;

                if ((tur < 0) || (tur > 100)) {
                    dersSayı = dersSayı - 1;
                    total = total - tur;

                  if ((kim < 0) || (kim > 100)) {
                        dersSayı = dersSayı - 1;
                        total = total - kim;

                      if ((muz < 0) || (muz > 100)) {
                            dersSayı = dersSayı - 1;
                            total = total - muz;
                        }
                    }
                }
            }
        }
        

        if(dersSayı == 0) {

            System.out.println("Notlarınızı 0 - 100 Aralığında Giriniz.");
        } else {
            average = total / dersSayı;

            if (average > 55) {
                System.out.println("Geçtiniz!");
            } else {
                System.out.println("Kaldınız");
            }

            System.out.println("Not Ortalamanız: " + average);
        }







    }
}
