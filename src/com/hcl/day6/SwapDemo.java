/**
 *
 */
package com.hcl.day6;

/**
 * @author ksluc
 *
 */
class Swapper {
	int a;
	int b;
Swapper(int x, int y)
{
	a = x;
	b = y;
}
void swap(int x, int y)
{
	int temp;
	temp = x;
	x = y;
	y = temp;
}
}
public class SwapDemo {
     /**
	 * @param args
	 */
	public static void main(String[] args) {
		Swapper obj = new Swapper(10, 20);
		System.out.println("Before Swap : "+ obj.a + obj.b);
		obj.swap(obj.a, obj.b);
		System.out.println("After Swap : "+ obj.a + obj.b);

	}

}
