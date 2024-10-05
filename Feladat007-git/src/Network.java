public class Network implements Connectable {
    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Interface-hez valo csatlakozas bekovetkezett");
    };

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Interface-tol valo lecsatlakozas megtortent");
    };
    
}
