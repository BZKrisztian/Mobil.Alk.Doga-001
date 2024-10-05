public class Network implements Connectable {
    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Network-hoz valo csatlakozas bekovetkezett");
    };

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Network-tol valo lecsatlakozas megtortent");
    };
    
}
