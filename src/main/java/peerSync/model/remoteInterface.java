package peerSync.model;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mark Levie Mendoza <markolo25@gmail.com>
 */
public interface remoteInterface extends Remote{
    public void openRecieveSocket(PeerFile pf) throws RemoteException;
}