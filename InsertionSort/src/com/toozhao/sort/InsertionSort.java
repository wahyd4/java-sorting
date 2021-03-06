package com.toozhao.sort;

public class InsertionSort {

	// 定义需要排序的数组
	private static int[] array = { 1, 20, 6, 3, 19, 7, 14, 12, 10 };

	public static void main(String args[]) {

		for (int outer = 1; outer < array.length; outer++) {
			int temp = array[outer];
			for (int inner = outer - 1; inner >= 0 && temp < array[inner]; inner--) {

				/**
				 * 将最大的赋值给目前比较的数组尾部 由于这里的数组下标需要跟随循环而变化，所以只能使用 j来表示
				 */
				array[inner + 1] = array[inner];
				// 重新赋值第二大的数
				array[inner] = temp;
				// 重新赋值参考值，接着下标-1
				temp = array[inner];
			}
		}
		// 便利排序后的数组
		for (int flag : array) {
			System.out.println(flag);
		}
	}
}
