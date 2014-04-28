package Cliente;	
import java.rmi.*;
import java.util.Vector;
import Risorsa.IRisorsa;


	public interface IClient extends Remote {
		public String getNomeClient() throws RemoteException;
		public Vector<IRisorsa> getListaRisorse() throws RemoteException;
		public boolean searchResource(IRisorsa i) throws RemoteException;
		public void upload(IClient v, IRisorsa r, int p) throws RemoteException, Exception;
	}
