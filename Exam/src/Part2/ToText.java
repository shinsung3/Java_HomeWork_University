package Part2;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	boolean belowLeftOf(Point p) {
		return this.x < p.x && this.y < p.y;
	}

	boolean aboveRightOf(Point p) {
		return this.x > p.x && this.y > p.y;
	}

	double distance(Point p) {
		int dx = p.x - this.x;
		int dy = p.y - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}

interface Region {
	boolean contains(Point p);

	// Task 3: toText method
	// Your code here
	String toText();
}

class RectRegion implements Region {
	Point lowerLeft, upperRight;

	RectRegion(Point lowerL, Point upperR) {
		this.lowerLeft = lowerL;
		this.upperRight = upperR;
	}

	public boolean contains(Point p) {
		return this.lowerLeft.belowLeftOf(p) && this.upperRight.aboveRightOf(p);
	}

	@Override
	public String toText() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	// Task 3: toText method
	// Your code here
}

class CircleRegion implements Region {
	Point center;
	int radius;

	CircleRegion(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public boolean contains(Point p) {
		return this.center.distance(p) < this.radius;
	}

	@Override
	public String toText() {
		// TODO Auto-generated method stub
		return "Circle";
	}

	// Task 3: toText method
	// Your code here
}

class UnionRegion implements Region {
	Region r1, r2;

	UnionRegion(Region r1, Region r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	public boolean contains(Point p) {
		return this.r1.contains(p) || this.r2.contains(p);
	}

	@Override
	public String toText() {
		return "Union("+r1.toText()+", "+r2.toText()+")";
	}

	// Task 3: toText method
	// Your code here
}

class IntersectRegion implements Region {
	Region r1, r2;

	IntersectRegion(Region r1, Region r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	public boolean contains(Point p) {
		return this.r1.contains(p) && this.r2.contains(p);
	}

	@Override
	public String toText() {
		// TODO Auto-generated method stub
		return "Intersect("+r1.toText()+", "+r2.toText()+")";
	}

	// Task 3: toText method
	// Your code here
}