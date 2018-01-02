package text;

import java.util.Random;
/**
 * PC含むキャラクタの生成
 */
public class Ones {
	int i;
	final short HumanBlood = 1000;//cc
	
	Random rand = new Random();
	boolean servive;
	String name;
	short speed;
	short Mbody;//要考慮
	short body;
	short[] blood = new short[5];//0:fire 1:water 2:wind 3:earth 4:ether
	byte type; //0:human 1:phlebotomy 2:lover 3:butterfly
	
	String[][] recipeName = new String[4][32];
	short[][] recipe = new short[4][5];

	
	public Ones(String s,int b,int t){

		servive = true;
		name = s;
		type = (byte)t;	
		body = Mbody = (short)b;
		
		switch(type) {
			case 0:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = HumanBlood;
				}
				break;
				
			case 1:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = (short)rand.nextInt(HumanBlood * 4);
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
					blood[i] = (short)rand.nextInt(HumanBlood * 10);
					if(Mbody < blood[i]) {
						body = Mbody = blood[i];
					}
				}
				break;
				
		}
	}

	public Ones() {//for enemy

	}
	
	void setStates() {
		servive = true;
		name = null;
		type = (byte)rand.nextInt(4);	
		body = Mbody = (short)rand.nextInt((int)HumanBlood);
		
		switch(type) {
			case 0:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = HumanBlood;
				}
				break;
				
			case 1:
				for(i =0; i< 5 ;i++ ) {
					blood[i] = (short)rand.nextInt(HumanBlood * 4);
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
					blood[i] = (short)rand.nextInt(HumanBlood * 10);
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

	short magic(int n) {
		short damege = 0;
		return damege;
	}
	short magic(int[] cost) {
		short damege = 0;
		return damege;
	}
	short melee(int power) {
		short damege = 0;
		return damege;
	}
	boolean living(short damege) {
		boolean l;
		body -= damege;
		l = body > 0 ? true : false;
		return l;
		
	}
}


