public class Shape {
	private StringToNumber strToNum = new StringToNumber();
	private int length1;
	private int length2;
	private int length3;
	private String lengthS1;
	private String lengthS2;
	private String lengthS3;

	public Shape(int length1) {
		this.length1 = length1;
	}

	public Shape(String lengthS1) {
		this.length1 = strToNum.convert(lengthS1);
	}

	public Shape(int length1, int length2) {
		this.length1 = length1;
		this.length2 = length2;
	}

	public Shape(String lengthS1, String lengthS2) {
		this.length1 = strToNum.convert(lengthS1);
		this.length2 = strToNum.convert(lengthS2);
	}

	public Shape(int length1, int length2, int length3) {
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	}

	public Shape(String lengthS1, String lengthS2, String lengthS3) {
		this.length1 = strToNum.convert(lengthS1);
		this.length2 = strToNum.convert(lengthS2);
		this.length3 = strToNum.convert(lengthS3);
	}

	public void perimeter() {
		if (length3 > 0) {
			System.out.println(length1 + length2 + length3);
		}
		else if (length2 > 0) {
			System.out.println(2 * (length1 + length2));
		}
		else{
				System.out.println(length1 * 2 * Math.PI);
			}
		}

	public void area(){
		if (length3 > 0) {
			int p=(length1+length2+length3)/2;
			System.out.println(Math.sqrt(p * (p-length1) * (p-length2) * (p-length3)));
		}
		else if (length2 > 0) {
			System.out.println(length1 * length2);
		}
		else{
			System.out.println(length1 * length1 * Math.PI);
		}
	}
	}