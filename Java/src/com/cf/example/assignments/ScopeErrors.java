package com.cf.example.assignments;

class ScopeErrors {
	
	public static void main(String [] args) {
		ScopeErrors s = new ScopeErrors();
		s.go3();
}
	/*void go() {
		int y = 5;
		go2();
		y++; // once go2() completes, y is back in scope
		}
	void go2() {
		y++; // won't compile, y is local to go()
		}*/

		void go3() {
		for(int z = 0; z < 5; z++) {
			boolean test = false;
			if(z == 3) {
					test = true;
					break;
			}
			
		}
	//	System.out.print(test);
		//  'test' is an ex-variable, it has ceased to be...
}  
	
	
}
	
	