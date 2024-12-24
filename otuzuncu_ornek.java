package JAVA101;
public class otuzuncu_ornek {
    public static void main(String[] args) {

        System.out.println("1 ile 100 arasındaki asal sayılar: ");
        for (int i=2;i<=100;i++){
            if (i==2 || i==3 || i==5 || i==7){
                System.out.println(i);
            }
            if (i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                System.out.println( i );
            }
        }
    }
}
