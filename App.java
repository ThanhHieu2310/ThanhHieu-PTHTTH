package tuan8_RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.StringTokenizer;

public class App extends UnicastRemoteObject implements AppImpl {

    protected App() throws RemoteException {
        super();
    }

    @Override
    public int dem(String str) throws RemoteException {
        // TODO Auto-generated method stub
        StringTokenizer ST = new StringTokenizer(str);
        int soTu = ST.countTokens();
        return soTu;
    }

    @Override
    public String daoNguoc(String str2) throws RemoteException {

        str2 = new StringBuffer(str2).reverse().toString();

        return str2;
    }

    @Override
    public int addNum(int soA, int soB, int soC) throws RemoteException {
        System.out.println("\n May khach yeu cau tinh!");
        return (soA + soB + soC);
    }

    @Override
    public String inHoa(String chuHoa) throws RemoteException {
        // TODO Auto-generated method stub
        return chuHoa.toUpperCase();
    }

}
