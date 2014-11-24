package compsci.programs.lesson017.encrypt;

public class Encrypt {
	
	public Encrypt(){
	}
	
	public String encryptIt(String msg){
		String emsg = "";
		for(int i=0; i<msg.length(); i++){
			char c = msg.charAt(i);
			String n = ""+c;
			
			if(c == 'v'){
				n = "ag',r";
			}
			if(c == 'm'){
				n = "ssad";
			}
			if(c == 'g'){
				n = "jeb..w";
			}
			if(c == 'b'){
				n = "dug>?/";
			}
			
			emsg += n;
		}
		/*msg = msg.replace("v", "ag',r");
		msg = msg.replace("m", "ssad");
		msg = msg.replace("g", "jeb..w");
		msg = msg.replace("b", "dug>?/");*/
		return emsg;
	}
	
	public String decryptIt(String msg){
		msg = msg.replace("ag',r", "v");
		msg = msg.replace("ssad", "m");
		msg = msg.replace("jeb..w", "g");
		msg = msg.replace("dug>?/", "b");
		return msg;
	}
	
	//This is a very big morning.

}
