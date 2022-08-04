public class TriangleClassifier {
    public static String triangleClassifier(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0) {
            return "Không phải là tam giác";
        }else {
            if (a == b || b ==c ||c == a){
                if (a ==b && b == c ){
                    return "Là tam giác đều";
                }
                System.out.println(a*a + b*b);
                System.out.println(c*c);

                if (Math.abs(b * b - a * a - c * c) < 0.0001 || Math.abs(a * a - b * b - c * c) < 0.0001 || Math.abs(c * c - a * a - b * b) < 0.0001 ){
                    return "Là tam giác vuông cân";
                }
                return "Là tam giác cân";
            }
            if (b * b == a*a + c*c || a*a == b*b + c*c || c*c ==a*a +b*b){
                return "Là tam giác vuông";
            }

            return "Là tam giác thường";

        }
    }
}