package com.example.myfarmshop;

public class Farm {
    private  int id;
    private String name;
    private String address;
    private String city;
    private String province;
    private String phone;
    private String email;
    private String url;

    public Farm(){
    }

    public Farm(int id, String name, String address, String city, String province, String phone, String email, String url){
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
        this.phone = phone;
        this.email = email;
        this.url = url;
    }

    public void setId ( int id){ this.id = id; }

    public void setName ( String name) { this.name = name; }
    public void setAddress ( String address) { this.address = address; }
    public void setCity ( String city ) { this.city = city; }
    public void setProvince ( String province ) { this.province = province; }
    public void setPhone ( String phone ) { this.phone = phone; }
    public void setEmail ( String email ) { this.email = email; }
    public void setUrl ( String url ) { this.url = url; }
    public int getId () { return this.id; }
    public String getName () { return name; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getProvince() { return province; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getUrl() { return url; }

}

