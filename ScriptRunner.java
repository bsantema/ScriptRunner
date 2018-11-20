import java.io.IOException;

public class ScriptRunner {
	private String scriptPath;
	private String appPath;
	
	public ScriptRunner(String scriptPath)
	{
		appPath = "C:\\Program Files\\AutoHotkey\\AutoHotKey.exe";
		this.scriptPath = scriptPath;
	}
	
	public ScriptRunner(String appPath, String scriptPath)
	{
		this.appPath = appPath;
		this.scriptPath = scriptPath;
	}
	
	public void run() throws IOException
	{
		Runtime runtime = Runtime.getRuntime();
		String[] script = new String[] {appPath, scriptPath};
		
		Process p = runtime.exec(script);
		try
        {
            p.waitFor();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
	}
}
