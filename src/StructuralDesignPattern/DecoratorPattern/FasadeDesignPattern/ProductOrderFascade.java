package StructuralDesignPattern.DecoratorPattern.FasadeDesignPattern;

// client will use only this class to create order .they don't need to worry about internal class
public class ProductOrderFascade {
    ProductDAO productDAO;
    Payment payment;
    Invoice invoice;
    SendNotification sendNotification;

    public ProductOrderFascade(){
        productDAO=new ProductDAO();
        payment = new Payment();
        invoice=new Invoice();
        sendNotification=new SendNotification();
    }

    public void createOrder(){
        Product p=productDAO.getProduct(98);
        payment.makePayment();
        invoice.generateInvoice();
        sendNotification.sendNotification();

    }

}
