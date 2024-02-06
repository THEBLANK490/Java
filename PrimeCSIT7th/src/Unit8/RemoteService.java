package Unit8;

//remote object
import java.rmi.*;

public interface RemoteService extends Remote {//it is remote object
    String findOdd(int x) throws RemoteException;
    String findPrime(int x)throws RemoteException;
}
