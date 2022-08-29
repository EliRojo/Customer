package domain;

import java.util.Objects;

public class Customer {
    private String codigoRegistro;
    private String razonSocial;
    private String direccion;

    public Customer(String codigoRegistro, String razonSocial, String direccion) {
        this.codigoRegistro = codigoRegistro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }

    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "codigoRegistro='" + codigoRegistro + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return codigoRegistro.equals( customer.codigoRegistro) && razonSocial.equals(customer.razonSocial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoRegistro, razonSocial);
    }
}
