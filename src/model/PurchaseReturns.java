package model;

import java.sql.Date;

public class PurchaseReturns {
    
    
        public Date  Date;
        public String F19No;

        
        public void PurchaseReturn(String F19No, Date Date){
            this.Date = Date;
            this.F19No = F19No;
        
        }
        public Date getDate()
        { 
            return Date;
        }
        
        public String getF19No()
        {
            return F19No;
        }
        //purchasereturnitems

        public int Code ;
        public Double Qty;
        public Double cancelQty;
        
        public void PurchasereturnItems(int Code,Double Qty, Double cancelQty)
        {
            this.Code= Code;
            this.Qty = Qty;
            this.cancelQty = cancelQty;
                 
                 
        }
        public int getCode(){
            return Code;
        }      
        
        public Double getQty()
        {  
            return Qty;
        }
        
        public Double getCancelQty()
        {return cancelQty;
        }

//        purchasereturnrecords
        public String F16Bno;
        public String 	Stcode;
        public int suppilerID;
        public String PaymentType;
        public double 	totalCanceledPrice;
        public double canceldiscount;
        public double 	canceledvat;
        public double canceleditemdecrease;
        public double 	canceledloadRent;
        public double canceledfreelssue;
        public double subTotalCanceledAmount;
        
        public void  purchasereturnrecords(String F16Bno,String Stcode,int suppilerID,String PaymentType,double totalCanceledPrice,double canceldiscount,double canceledvat,double canceleditemdecrease,double canceledloadRent,double canceledfreelssue,double subTotalCanceledAmount){
        
            this.F16Bno= F16Bno;
            this.Stcode= Stcode;
            this.suppilerID= suppilerID;
            this.PaymentType= PaymentType;
            this.totalCanceledPrice= totalCanceledPrice;
            this.canceldiscount= canceldiscount;
            this.canceledvat=  canceledvat;
            this.canceleditemdecrease= canceleditemdecrease;
            this.canceledloadRent= canceledloadRent;
            this.canceledfreelssue= canceledfreelssue;
            this.subTotalCanceledAmount= subTotalCanceledAmount;
        
        }
        public String getF16Bno()
        { 
            return F16Bno;
        }
        
        public String getStcode()
        {
            return Stcode;
        }
        
        public int getSuppilerID()
        {
            return suppilerID;
        }
        
        public String getPaymentType()
        {
            return PaymentType;
        }
        
        public double getTotalCanceledPrice()
        {
            return totalCanceledPrice;
        }
        
        public double getCanceldiscount()
        {
            return canceldiscount;
        }
        
        public double getCanceledvat()
        {
            return canceledvat;
        }
        
        public double getCanceleditemdecrease()
        {
            return canceleditemdecrease;
        }
        
        public double getCanceledloadRent()
        {
            return canceledloadRent;
        }
        
        public double getCanceledfreelssue()
        {
            return canceledfreelssue;
        }
        
        
        public double getSubTotalCanceledAmount()
        {
            return subTotalCanceledAmount;
        }
        
        
        private int freeCode;
        private double cancelFreeQty;
        
        public void setPurchaseReturnFree(int code, double qty){
            System.out.println("helo");
            this.freeCode = code;
            this.cancelFreeQty = qty;
        }
        
        public int getFreeCode(){
            return freeCode;
        }
        
        public double cancelFreeQty(){
            return this.cancelFreeQty;
        }
}
        
      
