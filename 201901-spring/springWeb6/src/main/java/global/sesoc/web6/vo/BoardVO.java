package global.sesoc.web6.vo;

public class BoardVO {
int boardnum;
String id;
String title;
String content;
String inputDate;
int hits;
String originalFile;
String savedFile;

//not null - boardNum id title content



public BoardVO() {
	super();
}




public BoardVO(int boardNum, String id, String title, String content, String inputDate, int hits, String originalFile,
		String saveFile) {
	super();
	this.boardnum = boardNum;
	this.id = id;
	this.title = title;
	this.content = content;
	this.inputDate = inputDate;
	this.hits = hits;
	this.originalFile = originalFile;
	this.savedFile = saveFile;
}




public int getBoardnum() {
	return boardnum;
}




public void setBoardnum(int boardNum) {
	this.boardnum = boardNum;
}




public String getId() {
	return id;
}




public void setId(String id) {
	this.id = id;
}


public String getCustid() {
	return id;
}




public void setCustid(String id) {
	this.id = id;
}


public String getTitle() {
	return title;
}




public void setTitle(String title) {
	this.title = title;
}




public String getContent() {
	return content;
}




public void setContent(String content) {
	this.content = content;
}




public String getInputDate() {
	return inputDate;
}




public void setInputDate(String inputDate) {
	this.inputDate = inputDate;
}




public int getHits() {
	return hits;
}




public void setHits(int hits) {
	this.hits = hits;
}




public String getOriginalFile() {
	return originalFile;
}




public void setOriginalFile(String originalFile) {
	this.originalFile = originalFile;
}




public String getSaveFile() {
	return savedFile;
}




public void setSaveFile(String saveFile) {
	this.savedFile = saveFile;
}






public String getSavedFile() {
	return savedFile;
}




public void setSavedFile(String savedFile) {
	this.savedFile = savedFile;
}




@Override
public String toString() {
	return "BoardVO [boardNum=" + boardnum + ", id=" + id + ", title=" + title + ", content=" + content + ", inputDate="
			+ inputDate + ", hits=" + hits + ", originalFile=" + originalFile + ", saveFile=" + savedFile + "]";
}













}
