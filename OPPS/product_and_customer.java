class Products{
    private String itemNo;
    private String name;
    private int price;
    private int quantity;
    //Constructor non-parametrised 
    public Products(String itemNo, String name,int price, int quantity){
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //methods get and set 
    public String getItemNo(){return itemNo;}
    public String getName(){return name;}
    public int getPrice(){return price;}
    public int getQauantity(){return quantity;}

    public void setPrice(int p){price = p;}
    public void setQuantity(int q){quantity = q;}

}

class Customer{
    private String custId;
    private String custName;
    private String custAddress;
    private String custContact;

    //constructor 
    public Customer(String custId, String custName, String custAddress, String custContact){
    this.custId = custId;
    this.custName = custName;
    setAddress(custAddress);
    setContact(custContact);
    }

    public String getCustId(){return custId;}
    public String getCustName(){return custName;}
    public String getCustAddress(){return custAddress;}
    public String getCustContact(){return custContact;}

    public void setAddress(String add){custAddress = add;}
    public void setContact(String con){custContact = con;}
}

public class product_and_customer {
    public static void main(String[] args) {
        Products pro = new Products("A140","Conditionar",165,130);
        Customer cus = new Customer("ABZB40","Prashant Kumar","Patna", "+917890987654");
        System.out.println("\n Product ItemNo : "+pro.getItemNo()+"\n Product Name : "+pro.getName()+"\n Product Price : "+pro.getPrice()+ "\n Product Quantity : "+pro.getQauantity());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n Customer ID : " + cus.getCustId() + "\n Customer Name : " + cus.getCustName()+"\n Customer Address : " + cus.getCustAddress() + "\n Customer Contact : " + cus.getCustContact());
    }
}

//!<------------------------------Output is---------------------------------------> 
/*
 Product ItemNo : A140
 Product Name : Conditionar
 Product Price : 165
 Product Quantity : 130
--------------------------------------------------------------------------------------------------------------------------------------------------------------

 Customer ID : ABZB40
 Customer Name : Prashant Kumar
 Customer Address : Patna
 Customer Contact : +917890987654
*/