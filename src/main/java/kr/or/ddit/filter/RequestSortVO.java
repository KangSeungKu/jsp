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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		result = prime * result + uriCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestSortVO other = (RequestSortVO) obj;
		if (method == null) {
			if (other.method != null)
				return false;
		} else if (!method.equals(other.method))
			return false;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		if (uriCount != other.uriCount)
			return false;
		return true;
	}

	
}
