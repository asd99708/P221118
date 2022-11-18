package Parent;

public class ChildExample {
	public static void main(String[] args) {
		Child cd = new Child();
		Parent pr = new Parent();
		
		pr.mothod1();
		pr.mothod2();
//		pr.mothod3();  //호출 불가능 부모클래스이기때문에 자식클래스에있는 메소드는 불러올수없음
		
		
		cd.mothod1();	// 부모클래스에서 상속을 받아와 출력.
		cd.mothod2();
		cd.mothod3();
		
		System.out.println("----------------");
		
		pr = cd;
		
		pr.mothod1();
		pr.mothod2();
		
	}

}
