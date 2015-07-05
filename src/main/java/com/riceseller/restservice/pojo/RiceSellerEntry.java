package com.riceseller.restservice.pojo;

import java.io.Serializable;

public final class RiceSellerEntry implements Serializable {

	
	private static final long serialVersionUID = -7960884453413642564L;

	private String partyName, dealDate, riceRate, paymentDate,
			noOfbagsAndBillNo, weight, result, amount, cheque, dealerName;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPartyName() {
		return partyName;
	}

	public String getDealDate() {
		return dealDate;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public void setRiceRate(String riceRate) {
		this.riceRate = riceRate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public void setNoOfbagsAndBillNo(String noOfbagsAndBillNo) {
		this.noOfbagsAndBillNo = noOfbagsAndBillNo;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setCheque(String cheque) {
		this.cheque = cheque;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getRiceRate() {
		return riceRate;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public String getNoOfbagsAndBillNo() {
		return noOfbagsAndBillNo;
	}

	public String getWeight() {
		return weight;
	}

	public String getResult() {
		return result;
	}

	public String getAmount() {
		return amount;
	}

	public String getCheque() {
		return cheque;
	}

	public String getDealerName() {
		return dealerName;
	}
	
	/*public static void buildEntriesFromCursor(
            List<RiceSellerEntry> entries, Cursor cEntries) {
        
        while (cEntries.moveToNext()) {
            RiceSellerEntry e = generateEntriesFromCursor(cEntries);
            
            entries.add(e);
        }
    }
	public static RiceSellerEntry generateEntriesFromCursor(Cursor cEntries) {
		RiceSellerEntry e = new RiceSellerEntry();

        e.partyName = cEntries.getString(EditEntryHelper.PARTY_NAME);
        e.dealDate = cEntries.getString(EditEntryHelper.DEAL_DATE);
        e.riceRate = cEntries.getString(EditEntryHelper.RICE_RATE);
        e.paymentDate = cEntries.getString(EditEntryHelper.PAYMENT_DATE);
        e.noOfbagsAndBillNo = cEntries.getString(EditEntryHelper.NO_OF_BAGS_BILL_NO);
        e.weight = cEntries.getString(EditEntryHelper.WEIGHT);
        e.result = cEntries.getString(EditEntryHelper.RESULT);
        e.amount = cEntries.getString(EditEntryHelper.AMOUNT);
        e.cheque = cEntries.getString(EditEntryHelper.CHEQUE_NO);
        e.dealerName = cEntries.getString(EditEntryHelper.DEALER_NAME);
       
        return e;
    }*/
}
