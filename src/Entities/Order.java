package Entities;

import Entities.Enum.OrdemStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrdemStatus status;
    private Client client;
    private List<OrdemItem> items = new ArrayList<>();

    public Order(){

    }

    public Order(Date moment, OrdemStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrdemStatus getStatus() {
        return status;
    }

    public void setStatus(OrdemStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrdemItem> getItems() {
        return items;
    }

    public Double total(){
        double sum = 0.0;
        for (OrdemItem o : items){
            sum += o.subTotal();
        }
        return sum;
    }


    public void addItem(OrdemItem i){
        items.add(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sfd.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrdemItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
