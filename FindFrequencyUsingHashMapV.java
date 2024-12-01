import java.util.HashMap;
public class FindFrequencyUsingHashMapV {

	public static void main(String[] args) {
		String input="Vedant Hello VAr";
		String Input=input.toUpperCase();
		HashMap<Character,Integer> frequencyMap=new HashMap<>();
		
		for(char c:Input.toCharArray()) {
			if(c!=' ') {
				frequencyMap.put(c,frequencyMap.getOrDefault(c, 0)+1);
			}
		}
		System.out.println("Character Frequency");
		
		for(HashMap.Entry<Character,Integer> entry:frequencyMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
