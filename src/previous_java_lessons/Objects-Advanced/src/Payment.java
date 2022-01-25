class Payment {

  private double amount;
  private String date;
  private boolean paid;

  public Payment(double amount, String date){
    this.amount = amount;
    this.date = date;
  }
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

  public double pay(double amount){
    if (this.amount <= amount){
      this.amount = 0;
      this.paid = true;
    }
    else {
      this.amount = (this.amount - amount);
    }
    return amount - this.amount;
  }

  public boolean isPaid(){
    return paid;
  }

  @Override
  public String toString(){
    return "Date: " + this.date + ". The amount due is " + this.amount;
  }
  
}