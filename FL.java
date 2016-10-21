package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class FL{
	public static void main(String[] args){
		int[] w1={1,2,2};//w1仓库中的A产品1个，B产品2个，C产品2个，下列如同。
		int[] w2={2,1,2};
		int[] w3={1,3,1};
		
		Map map=new HashMap<Integer, int[]>();
		map.put(1, w1);
		map.put(2, w2);
		map.put(3, w3);
		//n代表将要取哪个产品0代表A,1代表B,2代表C，len代表将要取的数量
		int n=0;//A产品
		int len=2;//取两个
		FL fl = new FL();
		//根据优先级获取排序
		int[]w=fl.quantity(w1, w2, w3, n);//仓库量排序
	  	//int[]w=fl.priority(w1, w2, w3, n);//优先级排序
	  	//int[]w=fl.distance(w1, w2, w3,n);//距离排序
		//得到排序后，取出相应的值
		fl.print(map, w, n, len);
	
	}

//数量优先

public int[] quantity(int[] w1,int[]w2,int[]w3,int n)
{
	int[] w ={1,2,3};//默认排序
	//排序,排好序后放入w中存着
	if(w1[n]<w2[n])
	{
		int s=w[0];
		w[0]=w[1];
		w[1]=w[0];
	}
	if(w2[n]<w3[n])
	{
		int s=w[1];
		w[1]=w[2];
		w[2]=s;
	}
	return w;
}
//按优先级排序
public int[] priority(int[] w1,int[]w2,int[]w3,int n){
	//根据优先级来，w1<w2<w3
	int [] w={3,2,1};
	
	return w;
}
//距离排序
public int[] distance(int[] w1,int[]w2,int[]w3,int n){
	//距离w3=w2>w1
	
	int[]wr={3,2,1};
	int[]wl={2,3,1};
	int[]w =wl;
	//为w2和w3随机取
	if(0==(int)(Math.random()*2))
	{
		w=wr;	
	}
	return w;
	
}
//结果输出
public void print(Map<Integer,int[]> map,int[] w,int n,int len){
	int sum=0;
	for(int i=0;i<w.length;i++){
		int wn=map.get(w[i])[n];
		sum+=wn;
		if(sum<len){
			System.out.println("取w"+w[i]+"仓库"+wn+"个产品"+n);
		}
		else{
			//当取满了，结束循环
			System.out.println("取w"+w[i]+"仓库"+(len-(sum-wn))+"个产品"+n);
			break;
		}
	}
}
}
