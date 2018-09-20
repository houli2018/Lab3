public class Main {

    public static void main(String[] args) {
        System.out.println(WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        String OK_World = "abcdefghigklmnopqrstuvwxyz";
        String Ok_World2 = OK_World.toUpperCase();
        char[] abc = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt").toCharArray();
        int start = 0;
        int end = 0;
        boolean flage1 = true;
        boolean flage2 = true;
        String theWorld;
        int count = 0;
        String thatWorld ="Prince";
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
            if (OK_World.indexOf(abc[i - 1]) == -1 && Ok_World2.indexOf(abc[i - 1]) == -1) {
                start = i - 1;
            }
            if (OK_World.indexOf(abc[i + 1]) == -1 && Ok_World2.indexOf(abc[i + 1]) == -1) {
                end = i + 1;
                if (OK_World.indexOf(abc[i ]) != -1 && Ok_World2.indexOf(abc[i ]) != -1) {
                    theWorld = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt").substring(start, end + 1);
                    if (theWorld.toUpperCase().equals( thatWorld.toUpperCase())) {
                        count++;
                    }
                }
            }

                //String world = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt").substring(start, end + 1);
                // System.out.println(world);




        }
        System.out.println("AAAA" + count);


	// write your code here
    }
}
