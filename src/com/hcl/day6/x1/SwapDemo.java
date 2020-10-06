package com.hcl.day6.x1;

/**
 * Day # : 6.
 * Topic : Core Java.
 *
 * This class declares 2 integer values.
 * @author Dharini
 *
 */
class Swapper {
	int a;
	int b;
	/*
	 * Constructor used for assign
	 */
Swapper(int x, int y)
{
	a = x;
	b = y;
}
void swap(Swapper ref)
{
	int temp;
	temp = ref.a;
	ref.a = ref.b;
	ref.b = temp;
}
}
public class SwapDemo {
     /**
	 * @param args
	 */
	public static void main(String[] args) {
		Swapper obj = new Swapper(10, 20);
		System.out.println("Before Swap : "+ obj.a + obj.b);
		obj.swap(obj);
		System.out.println("After Swap : "+ obj.a + obj.b);

	}

}