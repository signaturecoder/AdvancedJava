package master1.DTO;

public class FundTransferDTO {
String saccno;
String bnf;
double amt;
String dt;
int transid;
public int getTransid() {
	return transid;
}
public void setTransid(int transid) {
	this.transid = transid;
}
public String getSaccno() {
	return saccno;
}
public void setSaccno(String saccno) {
	this.saccno = saccno;
}
public String getBnf() {
	return bnf;
}
public void setBnf(String bnf) {
	this.bnf = bnf;
}
public double getAmt() {
	return amt;
}
public void setAmt(double amt) {
	this.amt = amt;
}
public String getDt() {
	return dt;
}
public void setDt(String dt) {
	this.dt = dt;
}

}
