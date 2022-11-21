package org.test;



public class Test {

	static int a=10;
		
		private void m1() {
			a=100;

         System.out.println(a);		
		}
		
	private void m2() {
			
			System.out.println(a);
		
		}
		private void m3() {
			
		}
		private void m4() {
			// TODO Auto-generated method stub

		}
		public static void main(String[] args)
		{
		Test T1 =new Test();
		T1.m1();
		T1.m2();
		Test t = new Test();
		t.m2();
		t.m1();
		
		}
				
				
				
			}

	
		
	
	
	
	
	
	
