package Fun;

import java.util.*;

//ComicBook question. Given N books, X CASH IN DOLLARS. Print all the comics the person can purchase for the given conditions. He can only buy comics in pairs. He can buy comics only if totalprice is less than X. And he wants to purachse the max amount books as possible. If two books have same price, the output should print books in alphabetically order.
public class cepheidContest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine(); // Consume the newline after the integer input

        List<ComicBook> comics = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.nextLine();
            comics.add(new ComicBook(0, name)); // Prices are initially set to 0
        }

        String[] prices = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            comics.get(i).price = Integer.parseInt(prices[i]);
        }

        comics.sort((o1, o2) -> {
            if (o1.price == o2.price)
                return o1.name.compareTo(o2.name);
            return Integer.compare(o1.price, o2.price);
        });

        if(comics.get(0).price + comics.get(1).price>X){
            System.out.println("NONE");
            return;
        }

        for(int i=0; i<N-1;i+=2){
            int pairprice = comics.get(i).price + comics.get(i+1).price;
            if(pairprice<=X){
                System.out.println(comics.get(i).name+" - "+comics.get(i).price);
                System.out.println(comics.get(i+1).name+" - "+comics.get(i+1).price);
                X-=pairprice;
            }
            else
                break;
        }
    }
}

class ComicBook {
    int price;
    String name;
    ComicBook(int price, String name){
        this.price = price;
        this.name = name;
    }
}
