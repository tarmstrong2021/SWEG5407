
public class Clock {

	private int hr, min, sec;

	public Clock() {

	}

	public Clock(int hour, int minute, int second) {

		setTime(hour, minute, second);
	}

	public void setTime(int hour, int minute, int second) {

		hr = hour;
		min = minute;
		sec = second;

	}

	public int getHr() {
		return hr;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	public void printTime() {

		String twoDigitHr = String.format("%02d", hr);
		String twoDigitMin = String.format("%02d", min);
		String twoDigitSec = String.format("%02d", sec);

		System.out.println(twoDigitHr + ":" + twoDigitMin + ":" + twoDigitSec);
	}

	public void incrementSecs() {

		sec++;
		if (sec > 59) {
			incrementMins();
			sec = 0;
		}

	}

	public void incrementMins() {

		min++;
		if (min > 59) {
			incrementHour();
			min = 0;
		}
	}

	public void incrementHour() {

		hr++;
		if (hr > 23) {
			hr = 0;
		}

	}

	public boolean equals(Clock clk) {

		return ((hr == clk.hr) && (min == clk.min) && (sec == clk.sec));
	}

	public void makeCopy(Clock clk) {

		hr = clk.hr;
		min = clk.min;
		sec = clk.sec;
		
		
		
	}
}
