package Risorsa;
import java.rmi.*;
import java.rmi.server.*;

public class Risorsa extends UnicastRemoteObject implements IRisorsa {
	private String nome;
	private int parti;

	public Risorsa(String n, int num) throws RemoteException {
		nome = n;
		parti = num;
	}

	public String getNome() throws RemoteException {
		return nome;
	}
	public int getParti() throws RemoteException {
		return parti;
	}

	public boolean confronta(IRisorsa r) throws RemoteException {
		if (nome.equals(r.getNome()) && parti == r.getParti()) return true;
		else return false;
	}
}
