package text;

/**
 * PC含むキャラクタの生成
 */
public class Ones {
	
	int i;
	final short HumanBlood = 1000;//cc
	
	byte arraynumber;

	boolean servive;
	String name;
	short speed;
	float energy;
	short Mbody;//要考慮
	short body;
	short protection;
	short[] blood = new short[5];//0:fire 1:water 2:wind 3:earth 4:ether
	byte type; //0:human 1:phlebotomy 2:lover 3:butterfly
	
	String[][] recipeName = new String[4][32];
	short[][] recipe = new short[4][5];

	

	void setStates(int n){
		arraynumber = (byte)n;
		servive = true;
		name = null;
		type = (byte)Main.rand.nextInt(4);
		speed = (short)Main.rand.nextInt(100);
		body = Mbody = (short)Main.rand.nextInt(HumanBlood);
		energy = 0;
		switch(type) {
			case 0:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = HumanBlood;
				}
				break;
				
			case 1:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = (short)Main.rand.nextInt(HumanBlood * 4);
					if(Mbody < blood[i]) {
						body = Mbody = blood[i];
					}
				}
				break;
				
			case 2:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = 0;
				}
				break;
				
			case 3:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = (short)Main.rand.nextInt(HumanBlood * 10);
					if(Mbody < blood[i]) {
						body = Mbody = blood[i];
					}
				}
				break;
				
		}

	}
	
 	void makeRecipe(int n, String s, int[] cost){//配列は5つまで……　指定したい
		recipeName[n][32] = s;
		for(i =0; i< 5 ;i++ ) {
			blood[i] = (short)cost[i];
			
		}
		
	}

 	void magic(int[] cost) {

		short damege = 0;
		living(damege);
	}
 	
	void melee(int power) {
		short damege = (short) (power - protection);
		living(damege);
	}
	
	void living(short damege) {

		body -= damege;
		servive = body > 0 ? true : false;
		if(body <= 0 || arraynumber == 0)
				System.out.println("GameOver");
	}

	void act(int i) {
		energy += speed / 60;
		if (energy >= 60) {
			energy -= 60;
			if(i == 0) {
				
			}else {
				
			}	
		}
	}

}


