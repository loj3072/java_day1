
public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("ȫ�浿");
		c.setAddress("����");
		c.setGrade(1);	
		System.out.println(c); // c.toString()
		
		Customer c2 = new Customer("��ö��","�λ�",3);
		System.out.println(c2);

	}

}
