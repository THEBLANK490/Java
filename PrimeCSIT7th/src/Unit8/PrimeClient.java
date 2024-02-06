package Unit8;

import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;

public class PrimeClient {
    public static void main(String[] args){
        try{
            //connecting to server by using rim registry
            Registry reg = LocateRegistry.getRegistry(7777);
            //looking for server and extracting remote object
            RemoteService rs = (RemoteService)reg.lookup("primeserver");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number you want to find odd and prime");
            int num1 = sc.nextInt();
            System.out.println(rs.findOdd(num1));
            System.out.println(rs.findPrime(num1));
        }catch(RemoteException|NotBoundException e){
            System.out.println(e);
        }
    }
}
