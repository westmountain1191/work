//���	�ӏ��@Java��bA_1
package e4_4;

public class Sample_1 {
	public static void main(String[] args) {


		// �����̕ϐ��錾������B
		int num1 = 88;
		System.out.println("1�ځ�" + num1);
		int num2 = 8;
		System.out.println("2�ځ�" + num2);

		// �v�Z���s��
		int wa = num1 + num2;
		int sa = num1 - num2;
		int seki = num1 * num2;
		int sho = num1 / num2;
		int amari = num1 % num2;

		// �v�Z���ʂ�\������
		System.out.println("�a��" + w);
		System.out.println("����" + sa);
		System.out.println("�ρ�" + seki);
		System.out.println("����" + sho);
		System.out.println("�]�聁" + amari);
	}
}
// wwwwwwwwwwwwwwwwwwwwwwwwww
/*�G���[�R�[�h
Exception in thread "main" java.lang.Error: Unresolved compilation problem:
	w ��ϐ��ɉ����ł��܂���

	at e4_4.Sample_1.main(Sample_1.java:22)
�G���[���e
�ϐ���w�Ƃ����ϐ������݂��Ă��Ȃ����߁B

�������@
int w = num1 + num2;
�Ƃ����ϐ�w��
System.out.println("�a��" + w);
�̑O�ɒ�`���Ă����Ȃ���΂����Ȃ������B
*/