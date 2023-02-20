package week08.chap04;

public class VIPCustomer extends Customer {
	// VIP용
	private int agentID;		// VIP 고객 담당 상담원
	double saleRatio;			// 할인율
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;		// 보너스 포인트 적립
		return price - (int) (price * saleRatio); // 할인된 가격을 반환
	} 
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
	}
}


