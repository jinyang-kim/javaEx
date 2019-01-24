package ex1213;

/* ��¥ : 2018.12.13
 * ���� : Ŭ������ ��ü ���� - ���� �� �ʵ�
 * ��Ÿ : 1) Ŭ������ �Ӽ�(Attribute)�� ����(Behavior)�� ������ ��
 *      2) ��ü�� Ŭ�����κ��� �����ȴ�. (��, Ŭ������ ��ü�� �����ϴ� Ʋ�̴�.)
 *      
 *      [Ŭ���� �ۼ� ����] 
 *      - ��ü �𵨸�(�߻�ȭ) > Ŭ���� ���� > ��ü ���� > ������ ��ü �̿�
 *      
 *      [��ü]
 *      1) �����ִ� �����Ϳ� �ڵ带 �ϳ��� ���� ���� ����
 *      2) ȿ���� ���� �����ϱ� �����̰� ������� �ǹ̸� �ο��ϰ� �з��ϴ� �������� ����
 * */

// Ŭ���� ����
//public class Test { // [������ ����] Ŭ�������� public�� �� �������� �� ���� ��� ����
class Task { // Ŭ���� �̸��� �ĺ��ڷ� ����ڿ� ���� �����Ǹ�, �Ϲ������� �빮�ڷ� ����
	// �ʵ�(Field) : Ŭ������ ������ Ŭ�������� ����� ���� (��� �ڷ��� ���� �� ������, �ʵ忡 ���� ���� ���� ����)
	private String name; // �ν��Ͻ� ���� : ��ü�� �޸𸮸� �Ҵ� ���� �� ���� ���ο� ���� ������ �Ҵ� �޴´�. (��ü���� �޸� �Ҵ�)
	private int age; // �ν��Ͻ� ���� : ��(heap) ������ �޸𸮸� �Ҵ� �޴´�. 
	                 // (��ü�� null�� �ǰų� ��ü�� �� �̻� �������� �ʰ� �Ǿ����� ������ �÷��Ϳ� ���� �޸𸮰� ����) 
	private static char eng = 'a'; // Ŭ���� ���� (static�߰�) : Ŭ������ �ε��ɶ� �� �ѹ� �޸𸮰� �Ҵ� �Ǹ�, ��ü ������ �����ϰ� ��밡��
	                               // �ܺο��� ���� ����, �޼ҵ念���� �޸𸮸� �Ҵ� ������, Ŭ���� ������ ���α׷��� ���� �� �� �Ҹ�
								   // Ŭ���� ������ Ŭ���� �̸��� ���Ͽ� ����
	
	// ������(Constructor) : �����ڴ� Ŭ������ ������ �̸��� ������ ��ü ���� �� �ʱ�ȭ�� ���� ȣ���
	// �����ڸ� ������ ���� ���, ������ �Ҷ� ����Ʈ �����ڰ� ������
	public Task() {
		
	}
	
	// �޼ҵ�(Method) : ������ ��ü�� ������ �� �ִ� �ൿ ����
	public String setName() { // �ν��Ͻ� �޼ҵ�
		int a; // �������� : �޼ҵ峪 ������ ���ο��� ���̸� �ʱ�ȭ ���� ���ο� ����� ����
		       // �޼ҵ带 ȣ���Ҷ� Stack������ �޸𸮸� �Ҵ� �ް� �޼ҵ尡 ����Ǹ� �Ҹ�
		a = 10;
		
		return name;
	}
	
	public int setAge(int a) { // �ν��Ͻ� �޼ҵ� / (int a) : �Ű����� (Parameters)
		                       // �Ű�����(Parameters) : �޼ҵ带 ȣ���ϴ� ������ �޼ҵ忡 ���� �����ϱ� ���� ���Ǵ� ��������
		return age;
	}
	
	public static char setEng() { // Ŭ���� �޼ҵ� (static�߰�)
		//System.out.println(name + " , " + a + " , " + eng);
		
		System.out.println(eng);
		
		return eng;
	}
}

// [Ŭ���� ���� ����] 
// 1) ����(����Ʈ) : ������ ��Ű�� ���� �ִ� Ŭ�������� ��ü ���� ����
// 2) public : ������� ��𿡼��� ��ü ���� ���� (public�� �� �������� �� ���� ��� ����)
// 3) private, protected : ���� Ŭ�������� ��� �Ұ�, ��ø Ŭ�������� ��� ����
public class Task_Ex { // public[���ٱ�ȯ] class[Ŭ����Ű����] Task_Ex[Ŭ���� �̸�]
	
	// main���� static�� ����� �ȴٸ� Ŭ���� �޼ҵ尡�ִ� main�� ã�´�.
	public static void main(String[] args) {
		
	}

}