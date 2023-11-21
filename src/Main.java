import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String userName, password;
        int right =3, search, price;
        double balance = 1000;
        while (right >0){  // Şifre yanlış girildiğinde tekrar şifre girme hakkı.
            System.out.print("Kullanıcı Adınız : ");
            userName = sc.nextLine();
            System.out.print("Kullanıcı şifreniz : ");
            password = sc.nextLine();
            if (userName.equals("firat") && password.equals("1969") ){
                do {
                    System.out.println("Merhaba, ER bankasına hoş geldiniz");
                    System.out.print("1- Para Yatır\n2- Para Çek\n3- Bakiye Sorgula\n4- İşlemi Sonlandır\nLütfen yapmak istediğiniz işlemi seçiniz : ");
                    search = sc.nextInt();
                    switch (search) {
                        case 1:
                            System.out.print("Eklemek istediğiniz para tutarını giriniz : ");
                            price = sc.nextInt();
                            balance += price;
                            System.out.println(balance);
break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı yazın : ");
                            price = sc.nextInt();
                            if (price < balance) {
                                balance -= price;
                                System.out.println(balance);
                            } else {
                                System.out.println("Geçersiz Bakiye");
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + balance);
                            break;
                        case 4:

                    }

                }while (search!=4);
                    System.out.println("Tekrar görüşmek üzere!");
                    break;
            }else {
                System.out.println("hatalı giriş Lütfen tekrar deneyin.\nKalan Hakkınız : "+ --right);
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur. Lütfen en yakın bankanıza giderek aktif edin!");
                }
            }
        }
    }
}