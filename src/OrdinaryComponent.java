import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OrdinaryComponent extends UnicastRemoteObject implements Component_RMI{

	protected OrdinaryComponent() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrdinaryComponent(Server s, int i) throws RemoteException {
		potential_owner = null;
		owner = null;
		id = i;
		level = -1;
		owner_id = -1;
		server = s;
	}

	@Override
	public void setRegistrySet(Component_RMI[] c) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive(int level, int id, Component_RMI c) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(int level, int id, Component_RMI c) throws RemoteException {
		// TODO Auto-generated method stub
		
	}	

}
