package Risorsa;
import java.rmi.*;

public interface IRisorsa extends Remote {
	public String getNome() throws RemoteException;
	public int getParti() throws RemoteException;
	public boolean confronta(IRisorsa r) throws RemoteException;
}