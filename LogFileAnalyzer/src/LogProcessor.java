
public class LogProcessor extends Thread {
    
	private String[] lines;
	public int infoCount=0;
	public int errorCount=0;
	public int warningCount=0;
	
	
	public LogProcessor(String[] lines) {
		this.lines=lines;
	}
	
	public void run() {
		for(String line : lines) {
			if(line.contains("INFO")){
				infoCount++;
			}
			else if(line.contains("EROOR")){
				errorCount++;
			}
			else if(line.contains("WARNING")) {
				warningCount++;
			}
		}
	}
}
