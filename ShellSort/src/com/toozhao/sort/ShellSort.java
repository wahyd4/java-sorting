package com.toozhao.sort;

public class ShellSort {

	// 定义需要排序的数组
	private static int[] data = { 16, 20, 1, 6, 3, 19, 7, 14, 5, 60, 29, 40 };

	public static void shellSort(int[] data) {
		//获取数组长度
		int length = data.length;
		// 首先进行分组,每次组中元素为之前1/2。
		for (int gap = length / 2; gap > 0; gap = gap / 2) {
			// 对每个组进行插入比较
			for (int i = gap; i < length; i++) {
				
				for (int j = i; j >= gap && data[j] < data[j - gap]; j = j
						- gap) {
					//缓存下表最大的那个数
					int temp = data[j];
					//将两数交换位置，将较大数保存到下标最大的位置。
					data[j] = data[j - gap];
					data[j - gap] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		shellSort(data);
		for (int flag : data) {
			System.out.print(flag + " ");
		}
	}

}
