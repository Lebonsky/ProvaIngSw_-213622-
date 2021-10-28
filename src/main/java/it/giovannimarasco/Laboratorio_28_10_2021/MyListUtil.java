package it.giovannimarasco.Laboratorio_28_10_2021;

import java.util.ArrayList;
import java.util.List;

public class MyListUtil {
	private List<Integer> list;
	
	public MyListUtil() {
		list = new ArrayList<Integer>();
	}
	
	public void setList(List<Integer> l) {
		this.list = l;
	}
	public List<Integer> getList(){
		return this.list;
	}
	
	public List<Integer> sort(List<Integer> list, int order){
		switch (order) {
		case 0:
			for(int k=1; k<list.size()-1; k++)   {  
		        int temp = list.get(k);  
		        int j= k-1;  
		        while(j>=0 && temp <= list.get(j))   {  
		            list.set(j+1, list.get(j));   
		            j = j-1;  
		        }  
		        list.set(j+1, temp);  
		    }  
		
			break;
		case 1:
			for(int k=1; k<list.size()-1; k++)   {  
		        int temp = list.get(k);  
		        int j= k-1;  
		        while(j<0 && temp >= list.get(j))   {  
		            list.set(j+1, list.get(j));   
		            j = j-1;  
		        }  
		        list.set(j+1, temp);  
		    }  
		
			break;

		default:
			break;
		}
		 return list;
	}
	
	public static void main(String[] args) {
		MyListUtil list = new MyListUtil();
		list.sort(list.getList(), 0);
		for(int i = 0; i < list.getList().size(); ++i)
			System.out.println(list.getList().get(i));
	}
	
}
