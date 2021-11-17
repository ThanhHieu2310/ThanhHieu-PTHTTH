package tuan8_RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {

            App obj = new App();
            System.out.println("Khoi tao Server thanh cong");

            LocateRegistry.createRegistry(4000);
            Registry reg = LocateRegistry.getRegistry(4000);
            reg.bind("DemTu", obj);
            System.out.println("Da dang ky doi tuong DemTu voi Registry");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
