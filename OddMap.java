

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class OddMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		Scanner s=new Scanner(System.in);
		int key;
		int value;
		float avg=0;
		int count=0;
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			key=s.nextInt();
			value=s.nextInt();
			hm.put(key, value);
		}
		Set set=hm.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Map.Entry me=(Entry) it.next();
			
			if((int)me.getKey()%2!=0){
				avg=avg+(int)me.getValue();
				count++;
			}
		}
		avg=avg/count;
		System.out.println(avg);

	}

}
