package tuan8_RMI;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws NotBoundException {
        Registry reg;

        try {

            reg = LocateRegistry.getRegistry(4000);
            var AI = (AppImpl) reg.lookup("DemTu");

            Scanner sc = new Scanner(System.in);

            int select;

            for (;;) {
                System.out.println(
                        "Nhập lựa chọn:\n1.Đếm số từ trong chuỗi.\n2.Đảo ngược chuỗi. \n3.Cong 2 so. \n 4.In Hoa\n(Nhập 'exit' để thoát)");

                select = sc.nextInt();
                switch (select) {
                case 1:
                    String a;
                    Scanner sc1 = new Scanner(System.in);

                    System.out.print("Nhập chuỗi cần xem số từ: ");
                    a = sc1.nextLine();

                    if (a.equalsIgnoreCase("exit") == true) {
                        System.out.println(" Goodbye! ");
                        System.exit(0);
                    } else {
                        int dem = AI.dem(a);
                        System.out.println("---------------");
                        System.out.println("Số lượng từ trong chuỗi la: " + dem);
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    String b;
                    Scanner scc = new Scanner(System.in);

                    System.out.print("Nhập chuỗi cần Đảo ngược: ");
                    b = scc.nextLine();

                    if (b.equalsIgnoreCase("exit") == true) {
                        System.out.println(" Goodbye! ");
                        System.exit(0);
                    } else {
                        String p = AI.daoNguoc(b);
                        System.out.println("---------------");
                        System.out.println("Chuỗi sau khi được đảo: " + p);
                        System.out.println("\n");
                    }
                    break;

                case 3:
                    Scanner in = new Scanner(System.in);
                    System.out.print(" a = ");
                    int soA = in.nextInt();
                    System.out.print(" b = ");
                    int soB = in.nextInt();
                    System.out.print(" c = ");
                    int soC = in.nextInt();
                    System.out.println("---------------");
                    System.out.println(" Ket qua: " + AI.addNum(soA, soB, soC));
                    if (soA == 0 || soB == 0 || soC == 0) {
                        break;
                    }

                case 4:
                    Scanner inhoa = new Scanner(System.in);
                    System.out.println("Nhap chuoi: ");
                    String chuHoa = inhoa.nextLine();
                    String p1 = AI.inHoa(chuHoa);
                    System.out.println("---------------");
                    System.out.println("Chuoi sau khi dc in hoa: " + p1);
                    break;

                default:

                    break;
                }
            }

        } catch (RemoteException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}
