
import java.util.ArrayList;

public class VoteProcessor {
	public String calculateElectionWinner(ArrayList<String> votes) {
		
		ArrayList<String> ar=new ArrayList<String>();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<votes.size();i++) {
			boolean c=false;
			for(int x=0;x<ar.size();x++) {
				if(votes.get(i).toLowerCase().equals(ar.get(x))) {
					arr.set(x, arr.get(x)+1);
					c=true;
				}
					
			}
			if(c==false) {
				ar.add(votes.get(i).toLowerCase());
			}
		}
		if(arr.get(0)>arr.get(1)) {
			return ar.get(0);
		}
		if(arr.get(0)<arr.get(1)) {
			return ar.get(1);
		}
		else {
			return "TIE";
		}
		
	}

}
