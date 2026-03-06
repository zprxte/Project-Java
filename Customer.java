class Customer {
    private String Cname;
    private String Caddress;
    private String Cnumber;
    
    Customer() {}

    Customer(String name) {
        this.Cname = name;
    }
    
    Customer(String name,String add) {
        this.Cname = name;
        this.Caddress = add;
    }
    
    Customer(String name,String add,String number) {
        this.Cname = name;
        this.Caddress = add;
        this.Cnumber = number;
    }

    public void setCname(String name) {
        this.Cname = name;
        }
    public String getCname() {
        return Cname;
    }
    public void setCaddress(String add) {
        this.Caddress = add;
        }
    public String getCaddress() {
        return Caddress;
    }
    public void setCnumber(String number) {
        this.Cnumber = number;
        }
    public String getCnumber() {
        return Cnumber;
    }
}