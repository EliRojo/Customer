import domain.Customer;
import service.CustomerService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Customer coto = new Customer("1"," coto S.A","san martin");
        Customer samsung = new Customer("2"," samsung Co. Ltd","buenos aires 123");
        Customer mcDonals = new Customer("3"," mcDonals arcos dorados","independencia1234");
        Customer carrefour = new Customer("4"," carrefour S.A","san martin 7541");
        Customer fravega = new Customer("5"," fravega S.A","mendoza 7475");
        Map<String,Customer> customer = new HashMap<>();
        customer.put(coto.getCodigoRegistro(),coto);
        customer.put(samsung.getCodigoRegistro(),samsung);
        customer.put(mcDonals.getCodigoRegistro(),mcDonals);
        customer.put(carrefour.getCodigoRegistro(),carrefour);
        customer.put(fravega.getCodigoRegistro(),fravega);
        System.out.println(customer);
        System.out.println("------------------------------------------");
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un codigo de registro para buscar");
        String codigo = leer.next();

        if (CustomerService.getCustomerByKey(customer,codigo)== null){
            System.out.println("el codigo de registro no se encontro");


        }else {
            System.out.println(CustomerService.getCustomerByKey(customer,codigo).toString());
        }





    }
}
