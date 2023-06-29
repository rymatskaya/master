import Child.Child;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Child son = new Child();
        int sonHeight=180;
        son.setName("Ваня");
        son.setHeight(sonHeight);
        son.setAge((byte)14);
        int sonage=(int)son.getAge();
        System.out.println("Имя сына: " + son.getName());
        System.out.println("Возраст сына: " + son.getAge());
        System.out.println("Рост сына: " + son.getHeight());

        char myd = 'Л';
        Child daugter = new Child(Character.toString(myd),(byte)9);
        String daugterName = daugter.getName();
        int daugterAge = daugter.getAge();
        daugter.setHeight(130);
        System.out.println("Имя дочери: " + daugter.getName());
        System.out.println("Возраст дочери: " + daugter.getAge());
        System.out.println("Рост дочери: " + daugter.getHeight());

        System.out.println("Let's go to school!!! ");
        boolean summer=true;
        son.GotoSchool(summer);

        String s="0";
        daugter.GotoSchool(Boolean.parseBoolean(s) );

        System.out.println("Do you want to GrandMa?" );
        son.ToGrandMa();
        daugter.ToGrandMa();

    }
}