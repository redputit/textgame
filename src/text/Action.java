package text;

public class Action{
	long sleeptime = 10;//24時間制 0:午前 1:午後
	byte second, minute, hour, noon, day, month;
	long year;
	Ones[] characters = new Ones[32];
	
	public Action() {

		for(int i = 0; i<32;i++) {
			characters[i].setStates(i);
			second = minute = noon = 0;
			hour = 8;
			year = Main.rand.nextInt(1000) + 2;//大体フレーバー
		}
	}

	void gameloop() {
		
		while(true) {
			second++;
			if(second >= 60) {
				minute++;
				second -= 60;
			}
			if(minute >= 60) {
				hour++;
				minute -=60;
			}
			if(hour >= 12) {
				noon = 1;
			}else {
				noon = 0;
			}
			if(hour>=24) {
				day++;
				hour -= 24;
			}
			if(day >= 31) {
				month++;
				day -=30;
			}
			if(month >= 13) {
				year++;
				month -= 12;
			}
			for(int i = 0;i< 32; i++) 
				characters[i].act(i);


		}
		
	}

}
