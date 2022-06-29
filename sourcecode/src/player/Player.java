package player;
import java.util.*;

public class Player {
	public int totalPoint;
	public String name;
	private int direction; // 1: counterclockwise, -1: clockwise
	private static List<Integer> range = new ArrayList<Integer>();
	public int pointInHand = 0;
	
	public Player(String name) {
		this.totalPoint = 0;
		this.name = name;
		this.pointInHand = 0;
	}
	public int getTotalPoint() {
		return totalPoint;
	}
	public String getName() {
		return name;
	}
	public List<Integer> getRange() {
		return range;
	}
	public int getDirection() {
		return this.direction;
	}
	public void bonusPoint(int point) {
		totalPoint += point; 
	}
	public void minusPoint(int point) {
		totalPoint -= point; 
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}

	public String infor() {
		String infor = getName();
		return infor;
	}
}