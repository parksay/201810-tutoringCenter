package global.sesoc.web6.vo;

public class ReplyVO {

	int replynum;
	int boardnum;
	String id;
	String text;
	String inputDate;

	
	public ReplyVO(int replynum, int boardnum, String id, String text, String inputDate) {
		super();
		this.replynum = replynum;
		this.boardnum = boardnum;
		this.id = id;
		this.text = text;
		this.inputDate = inputDate;
	}


	public ReplyVO() {
		super();
	}


	public int getReplynum() {
		return replynum;
	}


	public void setReplynum(int replynum) {
		this.replynum = replynum;
	}


	public int getBoardnum() {
		return boardnum;
	}


	public void setBoardnum(int boardnum) {
		this.boardnum = boardnum;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getInputDate() {
		return inputDate;
	}


	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}


	@Override
	public String toString() {
		return "ReplyVO [replynum=" + replynum + ", boardnum=" + boardnum + ", id=" + id + ", text=" + text
				+ ", inputDate=" + inputDate + "]";
	}
	
	
	
	
}
