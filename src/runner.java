
public class runner {


    public static void main(String[] args) {
        System.out.println(startHi("Matt"));
    }

    public static boolean startHi(String str) {
        if(str.length() < 2){

            return false;

        }

        String hiSpace = str.substring(0,2);

        if(hiSpace.equals("hi")) {

            return true;

        }else {

            return false;

        }

    }

    public static int stringMatch(String a, String b) {
        int count = 0;
        int smallest = Math.min(a.length(),b.length());
        for(int i = 0; i < smallest-1; i++) {
            if(i == smallest-2) {

                String first = a.substring(i);
                String second = b.substring(i);
                if(first.equals(second)) {

                    count += 1;
                    return count;
                }

            }
            String first = a.substring(i,i+2);
            String second = b.substring(i,i+2);
            if(first.equals(second)) {

                count += 1;

            }

        }

        return count;
    }
    public static String helloName(String name) {
        String hello = "Hello ";
        return hello + name + "!";
    }


    public boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0]) {

            return true;

        }else if(a[a.length-1] == b[b.length-1]) {

            return true;

        }else {

            return false;

        }
    }
}
