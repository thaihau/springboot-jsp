package com.hellokoding.springboot;

import java.math.BigDecimal;

/**
 * Created by thaihau on 07/03/2017.
 */
public class Payee {

  private String payeeId;
  private String billAccountNo;
  private String billReferenceNo;
  private BigDecimal amount;

  public String getPayeeId() {
    return payeeId;
  }

  public void setPayeeId(final String payeeId) {
    this.payeeId = payeeId;
  }

  public String getBillAccountNo() {
    return billAccountNo;
  }

  public void setBillAccountNo(final String billAccountNo) {
    this.billAccountNo = billAccountNo;
  }

  public String getBillReferenceNo() {
    return billReferenceNo;
  }

  public void setBillReferenceNo(final String billReferenceNo) {
    this.billReferenceNo = billReferenceNo;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(final BigDecimal amount) {
    this.amount = amount;
  }
}
