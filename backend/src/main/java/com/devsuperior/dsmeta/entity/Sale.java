package com.devsuperior.dsmeta.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // id da venda
    private String sellerName; // nome do vendedor
    private String visited; // quantidade de visitas
    private String deals; // quantidade de vendas
    private Double amount; // valor total de vendas
    private LocalDate date; //  data da venda

    public Sale(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getDeals() {
        return deals;
    }

    public void setDeals(String deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
