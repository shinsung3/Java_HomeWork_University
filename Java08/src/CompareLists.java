import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class CompareLists {
	public static void main(String[] args) {
		PointCompare pc = new PointCompare();
		int answer = pc.compare(new Point(3, 3), new Point(2, 4));
//		System.out.println(answer);
		System.out.println("HelloWorld".compareTo("abc"));

	}
}

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double distance(Point other) {
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}
}

class PointCompare implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		if (o1.y < o2.y) {
			return -1;
		} else if (o1.y == o2.y) {
			if (o1.x < o2.x) {
				return -1;
			} else if (o1.x > o2.x) {
				return 1;
			}
		} else {
			return 1;
		}
		return 0;
	}

}

class PointDistanceCompare implements Comparator<Point> {

	@Override
	public int compare(Point o1, Point o2) {
		double distance1 = o1.distance(new Point(0, 0));
		double distance2 = o2.distance(new Point(0, 0));
		if (distance1 < distance2) {
			return -1;
		} else if (distance1 > distance2) {
			return 1;
		}
		return 0;
	}

}

class StringCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.compareTo(o2) > 0) {
			return 1;
		} else if (o1.compareTo(o2) < 0) {
			return -1;
		}
		return 0;
	}

}

class StringLengthCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() < o2.length()) {
			return -1;
		} else if (o1.length() > o2.length()) {
			return 1;
		}
		return 0;
	}

}

class BooleanCompare implements Comparator<Boolean> {

	@Override
	public int compare(Boolean o1, Boolean o2) {
		if (o1 == true && o2 == false) {
			return 1;
		} else if (o1 == false && o2 == true) {
			return -1;
		} else {
			return 0;
		}
	}

}