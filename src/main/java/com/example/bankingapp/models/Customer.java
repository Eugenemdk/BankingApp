package com.example.bankingapp.models;

import java.util.UUID;

public class Customer{
    private final String id;
    private String customerName;
    private String accNumber;
    private String address;
    private String phone;

    public Customer(String id,String customerName,String accNumber,String address,String phone){
        this.id=id;
        this.customerName=customerName;
        this.accNumber=accNumber;
        this.address=address;
        this.phone=phone;
    }

    public Customer(String customerName){
        this(UUID.randomUUID().toString(),customerName,"","","");
    }
    public Customer(String customerName,String accNumber,String address,String phone){
        this(UUID.randomUUID().toString(),customerName,accNumber,address,phone);
    }
    /**
 * @return String return the customerName
 */
public String getCustomerName() {
    return customerName;
}

/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
    this.customerName = customerName;
}

/**
 * @return String return the accNumber
 */
public String getAccNumber() {
    return accNumber;
}

/**
 * @param accNumber the accNumber to set
 */
public void setAccNumber(String accNumber) {
    this.accNumber = accNumber;
}

/**
 * @return String return the address
 */
public String getAddress() {
    return address;
}

/**
 * @param address the address to set
 */
public void setAddress(String address) {
    this.address = address;
}

/**
 * @return String return the phone
 */
public String getPhone() {
    return phone;
}

/**
 * @param phone the phone to set
 */
public void setPhone(String phone) {
    this.phone = phone;
}
public String getId(){
return id;
}

@Override
public String toString(){
    return this.id+" "+this.accNumber+" "+this.customerName+" "+this.address+" "+this.phone;
}


}
