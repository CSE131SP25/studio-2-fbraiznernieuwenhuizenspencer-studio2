package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you want to gamble today?");
		double money = in.nextDouble();

		System.out.println("What are your chances (%)?");
		double winChance = in.nextDouble();
		winChance = winChance / 100;
		
		
		System.out.println("When will you leave happy?");
		double winLimit = in.nextDouble();
		System.out.println("When do you plan on tapping out?");		
		double loseLimit = in.nextDouble();
		
		
		while (loseLimit < money && money < winLimit) {
			double rando = Math.random();
			if (rando >= winChance) {
				System.out.println(money+1);
				money = money + 1;
			}
			else if (rando < winChance){
				System.out.println(money-1);
				money = money - 1;
			}
			else {
				System.out.println("We made a mistake :(");
				}
				
			}
		if (money <= loseLimit) {
			System.out.println("Ruin.");
		}
		else if (money >= winLimit) {
			System.out.println("Success!!");
		}
			
		}
		
		
		/*while (loseLimit < money && money < winLimit) {
			System.out.println("Play again?");
			String answer = in.next();
			
			if (answer.equals("no") == false ) {
				System.out.println("Yay!");
			}
			else {
				System.out.println("Ruin.");
			}
		} */
	}


