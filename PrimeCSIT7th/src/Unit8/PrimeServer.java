//RMI stands for remote method incorelation in which one object can invoke method of other object runningin another JVM.
//It is used for distributed system. It involves three part client,server,remote object(interface)
//stub:refers ti object that reqest services from server. It writes and request parameter to server object known as marshalling.
//It is a gateway for client. It also accept needed parameter from server and transfer to client object known as unmarshalling

//Step ro create RMI program
//Step 1: Create remote onkect(interface) that tell what services are provided
//Step 2: Create server that will use remote object to provide services by registering rmi
//Step 3: Create client that will use service provided by server object by requesting rmi object
//two exception are thrown: remote exception if remote object is not found
//NotBoundException if remote object us nit bind with RMI registry
package Unit8;

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
//server ckass have to invoke remote object(interface) so UnicastRemoteObject have to be inherit 

public class PrimeServer extends UnicastRemoteObject implements RemoteService{
    public PrimeServer() throws RemoteException{
        
    }
    @Override
    public String findOdd(int x){
        if(x%2 != 0){
            return("no. is odd");
        }else{
            return("no. is even");
        }
    }
    @Override
    public String findPrime(int x){
        int temp=0;
        for (int i=1; i<=x;i++){
            if(x%i == 0){
                temp++;
            }
        }
        if(temp==2){
            return("no. is prime number");
        }else{
            return( "no. is even number");
        }
    }
    public static void main(String[] args) {
        //registering RMI server by using registry and setting port of server
        try{
            Registry reg = LocateRegistry.createRegistry(7777);
            //binding object into registry
            reg.rebind("primeserver",new PrimeServer());
            System.out.println("Server is ready to provide service");
        }catch(RemoteException r){
            System.out.println("r");
        }
        
    }
    
}
