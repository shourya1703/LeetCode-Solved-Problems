class Solution {

static HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
static {
hm.put('I',1);
hm.put('V',5);
hm.put('X',10);
hm.put('L',50);
hm.put('C',100);
hm.put('D',500);
hm.put('M',1000);
}

public int romanToInt(String s) {

	int val=0;
	
	int i =0;
	for (i = 0; i < s.length()-1;) {
		int val1 = hm.get(s.charAt(i));
		int val2 = hm.get(s.charAt(i+1));
		if(val2>val1) {
			val += val2-val1;
			i=i+2;
		}
		else {
			val +=val1;
			i++;
		}
	}
	if(i==s.length()-1) val +=hm.get(s.charAt(i));
	return val;

}
}