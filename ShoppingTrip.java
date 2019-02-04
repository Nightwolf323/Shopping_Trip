
public class ShoppingTrip {
	static Mall mall;
	
	public static void main(String[] args) {
		mall = new BurlingtonMall();
		mall.setUpConnections();
		Shopper player = new Shopper("Lucas", 1000);
		
		player.visit(mall);
	}
	
	public static Mall getMall() {
		return mall;
	}
}
