package kr.ac.kopo41.service.dto;

public class Pagination {
	//페이징 처리용 dto
	private int pp;	//앞 페이지 끝으로 가기
	private int p;
	private int	c;
	private int	n;
	private int	nn;
	private int	start;
	private int	end;
	
	public int getPp() {
		return pp;
	}
	public void setPp(int pp) {
		this.pp = pp;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getNn() {
		return nn;
	}
	public void setNn(int nn) {
		this.nn = nn;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
}
