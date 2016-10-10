package learningJava;

public class TwoFightersOneWinner {
	public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {  
	    while (fighter1.health > 0 && fighter2.health > 0) {
	      if (fighter1.name == firstAttacker) {
	        fighter2.health = fighter2.health - fighter1.damagePerAttack;
	        if (fighter2.health > 0) {
	          fighter1.health = fighter1.health - fighter2.damagePerAttack;
	        }
	      }
	      else {
	        fighter1.health = fighter1.health - fighter2.damagePerAttack;
	        if (fighter1.health > 0) {
	          fighter2.health = fighter2.health - fighter1.damagePerAttack;
	        }
	      }
	    }
	   
	    if (fighter1.health <= 0) {
	      return fighter2.name;
	    }
	  
	    else {
	      return fighter1.name;
	    }
	  }
}
