package pjatk.pl;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int clientId;
  //  private List<Client> boughtProducts = new ArrayList<Client>();

    public Client(int clientId) {
        this.clientId = clientId;
    }


    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
             //   ", boughtProducts=" + boughtProducts +
                '}';
    }
}
