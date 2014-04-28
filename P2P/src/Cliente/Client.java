package Cliente;
import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import java.util.*;
import Risorsa.Risorsa; import Risorsa.IRisorsa;

import java.rmi.RemoteException;
import java.util.Vector;

import Risorsa.IRisorsa;

public class Client implements IClient {
	
	private int numDownload;
	private String nome;
	private Vector<Risorsa> listaRisorse;
	
	public Client(String n, String server, int c, Vector<Risorsa> r) throws RemoteException {
        numDownload = c;
        nome = n;
        listaRisorse=r;}


	public String getNomeClient() throws RemoteException {
		return nome;
	}


	public Vector<IRisorsa> getListaRisorse() throws RemoteException {	
		
		Vector<IRisorsa> lista = new Vector<IRisorsa>();
		for (int i=0; i<listaRisorse.size(); i++) 
		{lista.add(listaRisorse.elementAt(i));}
		        
		return lista;
		    
	}

	@Override
	public boolean searchResource(IRisorsa i) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void upload(IClient v, IRisorsa r, int p) throws RemoteException,Exception {
		// TODO Auto-generated method stub

	}

}
