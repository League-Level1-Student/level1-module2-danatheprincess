package _06_tea_party;

public class TeaParty {
	    public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        
	    	String greeting="Hello ";
	    if(isWoman) {
	    	if(isKnighted) {
	    		greeting+="Lady ";
	    	}else {
	    		greeting+="Ms. ";
	    	}
	    }else {
	    	if(isKnighted) {
	    		greeting+="Sir ";
	    	}else {
	    		greeting+="Mr. ";
	    	}
	    	
	    }
	    greeting+=name;
	    return greeting;
	}
}
