class Switch {
	public static void main(String[] args) {
		int n = 6;
		String day = "";
		switch (n) {

		case 1:
			day = "Monday";
			break;

		case 2:
			day = "Tuesday";
			break;

		case 3:
			day = "Wednesday";
			break;

		case 4:
			day = "Thursday";
			break;

		case 5:
			day = "Friday";
			break;

		case 6:
		case 7:
			day = "Weekend";
			break;

		default:
			day = "Out of Range";
		} // switch

		System.out.println("It's " + day);
	} // main
} // Switch
