package drama.vo;

public class DramaVO {

	int num; double ratings; 
	String title; String genre; String cast; String channel; String bdate;



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public double getRatings() {
		return ratings;
	}



	public void setRatings(double ratings) {
		this.ratings = ratings;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getCast() {
		return cast;
	}



	public void setCast(String cast) {
		this.cast = cast;
	}



	public String getChannel() {
		return channel;
	}



	public void setChannel(String channel) {
		this.channel = channel;
	}



	public String getBdate() {
		return bdate;
	}



	public void setBdate(String bdate) {
		this.bdate = bdate;
	}



	@Override
	public String toString() {
		return "[����=" + title + ", �帣=" + genre + ", �ֿ�=" + cast + ", ��� ä��=" + channel + ", �濵 ��¥="
				+ bdate + ", ��û��=" + ratings + "]";
	}
	
	
	
}
