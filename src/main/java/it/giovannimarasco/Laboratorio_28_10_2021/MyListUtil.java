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
			int n = list.size();
			int temp = 0;
			 for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(list.get(j-1) > list.get(j)){  
                                 //swap elements  
                                 temp = list.get(j-1);  
                                 list.set(j-1, list.get(j));  
                                 list.set(j, temp);  
                         }  
                          
                 }  
         }  
		
			break;
		case 1:
			int n1 = list.size();
			int temp1 = 0;
			 for(int i=0; i < n1; i++){  
                 for(int j=1; j < (n1-i); j++){  
                          if(list.get(j-1) < list.get(j)){  
                                 //swap elements  
                                 temp1 = list.get(j-1);  
                                 list.set(j-1, list.get(j));  
                                 list.set(j, temp1);  
                         }  
                          
                 }  
         }  
		
			break;

		default:
			break;
		}
		 return list;
	}
	
	public void stampa(MyListUtil list) {
		for(int i = 0; i < list.getList().size(); ++i)
			System.out.println(list.getList().get(i));
	}
	
	public static void main(String[] args) {
		MyListUtil list = new MyListUtil();
		list.sort(list.getList(), 0);
		for(int i = 0; i < list.getList().size(); ++i)
			System.out.println(list.getList().get(i));
	}
	
}
