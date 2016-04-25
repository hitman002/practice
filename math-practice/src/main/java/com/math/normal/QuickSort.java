package com.math.normal;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] datas = new int[]{23,1,34,23,123,4231,123,434,123,123,434,12312,4324};
		
		for (int k : datas) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		for (int i=0;i<datas.length;i++) {
			for (int j=0;j<datas.length;j++) {
				if(datas[i]<datas[j]){
					int tmp = datas[i];
					datas[i] = datas[j];
					datas[j] = tmp;
				}
			}
		}
		
		
		
	}
	
}
