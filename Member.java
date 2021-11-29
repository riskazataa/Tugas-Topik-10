package com.company;

public class Member {String nik,name,nomerTelepon; double saldo=0;

    public Member(String nik,String name,String nomerTelepon, double saldo){
        this.nik = nik;
        this.name= name;
        this.nomerTelepon = nomerTelepon;
        this.saldo = saldo;
    }

    public String getNik(){
        return nik;
    }
    public void setNik(String nik){
        this.nik = nik;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNomerTelepon(){
        return nomerTelepon;
    }
    public void setNomerTelepon(String nomerTelepon){
        this.nomerTelepon = nomerTelepon;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
