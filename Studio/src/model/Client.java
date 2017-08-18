/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.IDao;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Client implements IDao<Client> {

    private String ClientCPF;
    private String ClientName;
    private String ClienteEmail;
    private String ClientPhone;
    private Date ClientRegistered;

    public Client(String ClientCPF, String ClientName, String ClienteEmail, String ClientPhone) {
        this.ClientCPF = ClientCPF;
        this.ClientName = ClientName;
        this.ClienteEmail = ClienteEmail;
        this.ClientPhone = ClientPhone;
    }

    public Client(String ClientCPF, String ClientName, String ClienteEmail, String ClientPhone, Date ClientRegistered) {
        this.ClientCPF = ClientCPF;
        this.ClientName = ClientName;
        this.ClienteEmail = ClienteEmail;
        this.ClientPhone = ClientPhone;
        this.ClientRegistered = ClientRegistered;
    }

    public String getClientCPF() {
        return ClientCPF;
    }

    public void setClientCPF(String ClientCPF) {
        this.ClientCPF = ClientCPF;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getClienteEmail() {
        return ClienteEmail;
    }

    public void setClienteEmail(String ClienteEmail) {
        this.ClienteEmail = ClienteEmail;
    }

    public String getClientPhone() {
        return ClientPhone;
    }

    public void setClientPhone(String ClientPhone) {
        this.ClientPhone = ClientPhone;
    }

    public Date getClientRegistered() {
        return ClientRegistered;
    }

    public void setClientRegistered(Date ClientRegistered) {
        this.ClientRegistered = ClientRegistered;
    }

    @Override
    public boolean insert(Client client) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Client e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Client e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
