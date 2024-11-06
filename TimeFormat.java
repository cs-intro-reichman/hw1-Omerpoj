// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		boolean pm = hours>=12;
		String pmOrAmStr="AM";
		if (hours<10) {
			hours = args[0].charAt(1);
		}
		if (pm==true) {
			hours=hours-12;
			pmOrAmStr = "PM";
		}
        System.out.println(hours+":"+minutes+" "+pmOrAmStr);
	}
}
