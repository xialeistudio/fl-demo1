package com;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JUnitTest
{
	int[] w1={1,2,2};//w1仓库中的A产品1个，B产品2个，C产品2个，下列如同。
	int[] w2={2,1,2};
	int[] w3={1,3,1};
	Map map=new HashMap<Integer, int[]>();
	FL fl = new FL();
	
	@Test
	public void test_A2_quantity()
	{
			map.put(1, w1);
			map.put(2, w2);
			map.put(3, w3);
			//n代表将要取哪个产品0代表A,1代表B,2代表C，len代表将要取的数量
			int n=0;//A产品
			int len=2;//取两个
			
			//根据优先级获取排序
			int[]w=fl.quantity(w1, w2, w3, n);//仓库量排序
			//得到排序后，取出相应的值
			fl.print(map, w, n, len);
		
	}
	@Test
	public void test_A2_priority()
	{
		map.put(1, w1);
		map.put(2, w2);
		map.put(3, w3);
		int n=0;//A产品
		int len=2;//取两个
		int[]w=fl.priority(w1, w2, w3, n);//优先级排序
		fl.print(map, w, n, len);
	}
	@Test
	public void test_A2_distance()
	{
		map.put(1, w1);
		map.put(2, w2);
		map.put(3, w3);
		int n=0;//A产品
		int len=2;//取两个
		int[]w=fl.distance(w1, w2, w3, n);//优先级排序
		fl.print(map, w, n, len);
	}
	
	@Test
	public void test_B4_quantity()
	{
			map.put(1, w1);
			map.put(2, w2);
			map.put(3, w3);
			//n代表将要取哪个产品0代表A,1代表B,2代表C，len代表将要取的数量
			int n=1;//A产品
			int len=4;//取两个
			
			//根据优先级获取排序
			int[]w=fl.quantity(w1, w2, w3, n);//仓库量排序
			//得到排序后，取出相应的值
			fl.print(map, w, n, len);
		
	}
	@Test
	public void test_B4_priority()
	{
		map.put(1, w1);
		map.put(2, w2);
		map.put(3, w3);
		int n=1;//A产品
		int len=4;//取两个
		int[]w=fl.priority(w1, w2, w3, n);//优先级排序
		fl.print(map, w, n, len);
	}
	@Test
	public void test_B4_distance()
	{
		map.put(1, w1);
		map.put(2, w2);
		map.put(3, w3);
		int n=1;//A产品
		int len=4;//取两个
		int[]w=fl.distance(w1, w2, w3, n);//优先级排序
		fl.print(map, w, n, len);
	}
}
