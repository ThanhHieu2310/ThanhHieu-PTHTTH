package tuan8_RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppImpl extends Remote {
    public int dem(String str) throws RemoteException;

    public String daoNguoc(String str) throws RemoteException;

    public String inHoa(String chuHoa) throws RemoteException;

    public int addNum(int soA, int soB, int soC) throws RemoteException;

}
