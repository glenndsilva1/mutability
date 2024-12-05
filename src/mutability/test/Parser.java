package mutability.test;

 class Parser {
	int parseInt(String t) {
		return 0;
	}
	
	int parseFloat(String t) {
		return 0;
	}
	

	interface Number {
		int intValue();
	}
	
	class StringAsInt  implements Number {  // This is better we make the data intelligent and we avoid temperoral coupling
		private String str;
		
		public StringAsInt(String number) {
			this.str = number;
		}
		
		@Override
		public int intValue() {
			// TODO Auto-generated method stub
			return Integer.parseInt(str);
		}
		
		public void test() {
			StringAsInt i = new StringAsInt("34");
			System.out.println(i.intValue());
		}
	}
	
	public static void main(String args[]) {
		int x = new Parser().parseInt("2");
		System.out.println(x);
	}
}
