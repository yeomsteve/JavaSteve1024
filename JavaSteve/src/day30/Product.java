package day30;

import lombok.Data;

//분류, 제품명, 수량, 구매가격, 판매가격
@Data
public class Product {
	private String productName, type;
	int productCnt;
	private int buyPrice,sellPrice;
	
	public Product(String productName, String type, int productCnt, int buyPrice, int sellPrice) {
		
		this.productName = productName;
		this.type = type;
		this.productCnt = productCnt;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
	}
	
}
