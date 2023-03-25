package basicprograms;
class TCS
{
	int comId;
	String comname;
	Address adrress;//entity
	public int getComId() {
		return comId;
	}
	public String getComname() {
		return comname;
	}
	public Address getAdrress() {
		return adrress;
	}
	public TCS(int comId, String comname, Address adrress) {
		this.comId = comId;
		this.comname = comname;
		this.adrress = adrress;
	}
	
	}
public class Aggregation {

	public static void main(String[] args) {
		Address add1=new Address(700032, "kolkata", "India", "WB");
		Address add2=new Address(756904, "New York", "USA","xyz");
		TCS com1=new TCS(101,"TCS",add1);
		TCS com2=new TCS(102,"TCS BPS",add2);
		System.out.println("com Id: "+com1.getComId()+"\n"+"company name: "+com1.getComname()+
				"\nPincode: "+com1.getAdrress().getPincode()+"\ncity: "+com1.getAdrress().getCity()+
				"\ncountrty: "+com1.getAdrress().getCountry()+"\nState: "+com1.getAdrress().getState());
		System.out.println("=========================================================");
		System.out.println("com Id: "+com2.getComId()+"\n"+"company name: "+com2.getComname()+
				"\nPincode: "+com2.getAdrress().getPincode()+"\ncity: "+com2.getAdrress().getCity()+
				"\ncountrty: "+com2.getAdrress().getCountry()+"\nState: "+com2.getAdrress().getState());
	}

}