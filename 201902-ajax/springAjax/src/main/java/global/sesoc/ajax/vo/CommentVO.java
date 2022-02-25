package global.sesoc.ajax.vo;

public class CommentVO {
int num;
String name;
String text;


public CommentVO(int num, String name, String text) {
	super();
	this.num = num;
	this.name = name;
	this.text = text;
}
public CommentVO() {
	super();
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
@Override
public String toString() {
	return "CommentVO [num=" + num + ", name=" + name + ", text=" + text + "]";
}


}
