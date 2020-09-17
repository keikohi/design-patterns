package proxy;

public class Google implements WebServer {
	@Override
	public String serve(String url) {
		return "Google web page.";
	}
}
