package Entities;

public class OrdemItem {
    private Integer quantity;
    private Double price;
    private Produtct produtct;

    public Produtct getProdutct() {
        return produtct;
    }

    public void setProdutct(Produtct produtct) {
        this.produtct = produtct;
    }

    public OrdemItem(){

    }

    public OrdemItem(Integer quantity, Double price, Produtct produtct) {
        this.quantity = quantity;
        this.price = price;
        this.produtct = produtct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double  subTotal(){
        return price * quantity;
    }
}
