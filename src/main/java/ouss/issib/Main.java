package ouss.issib;

import ouss.issib.controllers.Client;
import ouss.issib.services.IService;
import ouss.issib.services.ServiceImpl;

public class Main {
    public static void main(String[] args) {
        IService service = new ServiceImpl();
        Client client = new Client();
        client.setService(service);
        System.out.println("Result = " + client.perform(45));
    }
}