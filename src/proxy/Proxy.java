package proxy;

public class Proxy implements WebServer {

	private final WebServer realServer;

	public Proxy(WebServer realServer) {
		this.realServer = realServer;
	}

	@Override
	public String serve(String url) {
		if (url.equals("google.com")) {
			return realServer.serve(url);
		}
		return "Cached Contents.";
	}
}
