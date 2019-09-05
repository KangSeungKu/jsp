package kr.or.ddit.filter;

public class RequestSortVO {
	private String uri;
	private String method;
	private int uriCount;
	
	public RequestSortVO() {	}
	
	public RequestSortVO(String uri, String method, int uriCount) {
		this.uri = uri;
		this.method = method;
		this.uriCount = uriCount;
	}

	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	public int getUriCount() {
		return uriCount;
	}

	public void setUriCount(int uriCount) {
		this.uriCount = uriCount;
	}

	@Override
	public String toString() {
		return "RequestSortVO [uri=" + uri + ", method=" + method + ", uriCount=" + uriCount + "]";
	}

	
}
