class Continue {
	public static void main(String[] args) {
		int i = 1;

		while (i <= 10) {
			if (i == 3 || i == 7){
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		} // while
	} // main
} // Continue
