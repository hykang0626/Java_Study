package ch06.check;

public class ShopService {
	//싱글톤 패턴
	private static ShopService singleton = new ShopService();
	private ShopService() {}
	static ShopService getInstance() {
		return singleton;
	}
}
