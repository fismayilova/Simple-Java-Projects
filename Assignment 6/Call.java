package as06;

public class Call {
	public String date;
	public String time;
	public String number;
	public int duration;

	public Call(String callDate, String callTime, String phoneNumber, int callDuration) {
		date = callDate;
		time = callTime;
		number = phoneNumber;
		duration = callDuration;
	}

	public String getDate() {
		return date;
	}

	public int getDuration() {
		return duration;
	}

	public String getNumber() {
		return number;
	}

	public String getTime() {
		return time;
	}
}
