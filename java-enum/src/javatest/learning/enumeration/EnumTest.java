package javatest.learning.enumeration;

import org.junit.Test;

public class EnumTest {

	enum Phone {
		IPHONE, GALAXY, XIAOMI;
		
		Phone() {
			System.out.println("call constructor " + this);
		}
	}
	
	@Test
	public void testEnum() {
		Phone phone = Phone.GALAXY;
		
		switch (phone) {
			case IPHONE:
				System.out.println("아이폰 입니다.");
				break;
			case GALAXY:
				System.out.println("갤럭시 입니다.");
				break;
			case XIAOMI:
				System.out.println("샤오미 입니다.");
		}
	}
}
