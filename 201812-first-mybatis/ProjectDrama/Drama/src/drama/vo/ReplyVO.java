package drama.vo;

public class ReplyVO {

	int rnum; int psw; int  rcmd; double rating; int dnum;
	String userid; String content;

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public int getPsw() {
		return psw;
	}

	public void setPsw(int psw) {
		this.psw = psw;
	}

	public int getRcmd() {
		return rcmd;
	}

	public void setRcmd(int rcmd) {
		this.rcmd = rcmd;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


	public int getDnum() {
		return dnum;
	}

	public void setDnum(int dnum) {
		this.dnum = dnum;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ReplyVO [���̵�" + userid + ", ��� ����=" + dnum + ", ��� ����=" + content + ", ��õ=" + rcmd
				+ ", ����=" + rating + "]";
	}
	
	
}
