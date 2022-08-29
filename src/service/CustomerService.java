package service;

import domain.Customer;

import java.util.Map;

public class CustomerService {

    public static Customer getCustomerByKey(Map<String, Customer> customers, String key){

        return customers.get(key); //recorre las entradas del mapa y busca si la llave es la misma que le pasamos por parametro.

    }

}
