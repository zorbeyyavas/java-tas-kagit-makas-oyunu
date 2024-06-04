import java.util.Random;
import java.util.Scanner;

public class asd {

    public static void main(String[] args) {
        Scanner bilgioku=new Scanner(System.in);
        Random rnd =new Random();
        String[] dizi={"tas","kagit","makas"};
        
        int dizidenal=rnd.nextInt(dizi.length);
        String bilgisayar=dizi[dizidenal];
        System.out.println(bilgisayar);
        String kullanici=bilgioku.nextLine();

        if(kullanici.equalsIgnoreCase("tas") && bilgisayar.equalsIgnoreCase("kagit")
        || kullanici.equalsIgnoreCase("kagit") && bilgisayar.equalsIgnoreCase("makas") 
        || kullanici.equalsIgnoreCase("makas") && bilgisayar.equalsIgnoreCase("tas")   
        )

        {
            System.out.println("pc kazandı");
        }
    

        else if(kullanici.equalsIgnoreCase(bilgisayar) && bilgisayar.equalsIgnoreCase(kullanici)){
            System.out.println("berabere");
        }

        else{
            System.out.println("kullanıcı kazandı");
        }
        bilgioku.close();
    }
    
}
