/*
* File: Main.java
* Author: Batki Zoltan Krisztian
* Copyright: 2024, Batki Zoltan Krisztian
* Group: Szoft II-1-N
* Date: 2024-10-05
* Github: https://github.com/BZKrisztian
* Licenc: None
*/
public class Main{
    public static void main(String[] args){
        Connectable network = new Network();

        network.connectToNetwork(null);

        network.disconnectFromNetwork();
    }
}
