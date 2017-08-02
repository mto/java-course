* *Class* & *object* & *method*
* Cấu trúc *array*
* Lập trình game *3 cây*

## 1. *Class* & *object* & *method*

__Bài tập 1:__

*Tạo file **Doctor.java** với nội dung như dưới đây, sau đó biên dịch và chạy trên dòng lệnh và thảo luận về cấu trúc của **Doctor.java** với các kiến thức đã học*

```java
public class Doctor{

    public String name;

    public int age;

    public String hospital;

    public String clinic;

    public Doctor(String _name, int _age, String _hospital, String _clinic){
       this.name = _name;
       this.age = _age;
       this.hospital = _hospital;
       this.clinic = _clinic;
    }

    public String basicInfo(){
       return "Name: " + name + ", age: " + age;
    }

    public String getHospital(){
       return hospital;
    }

    public String getClinic(){
       return clinic;
    }

    public static void main(String[] args){
       Doctor d = new Doctor("Mai Trong Hung", 40, "BVPS Hanoi", "PKDK Van Bao");

       System.out.println(d.basicInfo());
       System.out.println(d.getHospital());
       System.out.println(d.getClinic());
    }
}
```

### 1.1 Cấu trúc *hoàn chỉnh* của *class*

Trong các bài học trước, ta đã biết trong *class* có thể có các khai báo *method*. Tuy nhiên, cấu trúc *hoàn chỉnh* của *class* chứa nhiều hơn thế và bao gồm:

* Fields
* Constructors
* Methods


```java
public class CLASS_NAME{

/* Block khai báo fields của class */
FIELD_DECLARATIONS

/* Block khai báo constructors của class */
CONSTRUCTOR_DECLARATIONS

/* Block khai báo methods trong class */
METHOD_DECLARATIONS

}
```

* FIELD_DECLARATIONS:

Ví dụ:

```java
public class Doctor{

public String firstName;

public String lastName;

private int age;

private String email;

}
```

__Chú ý:__

*Để đơn giản thì trong các buổi học đầu ta coi như chỉ sử dụng **public** trong khai báo field của *class**

* CONSTRUCTOR_DECLARATIONS

Ví dụ:

```java
public class Doctor{

  public Doctor(String firstName, String lastName, int age, String email){
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.email = email;
  }
}
```

Constructor của class *CLASS_NAME* được dùng để khởi tạo *object* thuộc kiểu *CLASS_NAME* thông qua toán tử *new*

```java
CLASS_NAME obj = new CLASS_NAME(...);
```

Ví dụ:

```java
Doctor d = new Doctor("Băm", "Nguyễn Lang", 40, "nlb@gmail.com");
```

* METHOD_DECLARATIONS

Ví dụ:

```java
public class Doctor{

    public String basicInfo(){
       return "Name: " + name + ", age: " + age;
    }

    public String getHospital(){
       return hospital;
    }

    public String getClinic(){
       return clinic;
    }

    public static void main(String[] args){
       Doctor d = new Doctor("Mai Trong Hung", 40, "BVPS Hanoi", "PKDK Van Bao");

       System.out.println(d.basicInfo());
       System.out.println(d.getHospital());
       System.out.println(d.getClinic());
    }
}
```

*Học viên xem lại cấu trúc khai báo *method* trong bài học 2*

### 1.3 Khái niệm *object*


__Bài tập 2:__

*Thêm khai báo field **phoneNumber** vào trong class **Doctor**, cập nhật constructor của class, khai báo thêm method trả về số phone của doctor và cập nhật hàm **main** để in ra màn hình số phone*

## 2. Cấu trúc *array*

__Bài tập 3:__

*Tạo file **ArrayMaster.java** với nội dung như dưới đây rồi biên dịch và chạy từ dòng lệnh*

```java
public class ArrayMaster{

public static void main(String[] args){

 int[] nbs = new int[5];

 for(int i=0;i< nbs.length;i++){
    nbs = i*i;
 }

 for(int i=0;i< nbs.length;i++){
    System.out.print(nbs[i] + " ");
 }

}
```

### 2.1 Cấu trúc *array*

*array* là cấu trúc cho phép lưu trữ một **số lượng cố định** các giá trị **thuộc cùng một kiểu**

Ví dụ:

* 10 số nguyên
* 52 quân bài
* 7 ngày trong tuần
* 200 trang sách

Cú pháp khai báo cấu trúc *array* như sau:

```java
TYPE[] VARIABLE_NAME = new TYPE[50];

hoặc

TYPE[] VARIABLE_NAME = new TYPE[]{....};
```

TYPE: Nhận các giá trị *int, double, float, char, long* hoặc bất kỳ *class* nào

Ví dụ:

```java
int[] nbs = new int[10];

String[] dates = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

Card[] cards = new Card[52];
```

### 2.2 Tương tác với cấu trúc *array*

*Đọc & ghi theo index*

```java
public class ArrayMaster{

    public static void main(String[] args){
        String[] names = new String[]{"Tí", "Sửu", "Dần", "Mão"};

        System.out.println(names[2]);

        names[2] = "Nguyễn Văn " + names[2];
        System.out.println(names[2]);
    }
}
```

__Bài tập 4:__

*Khai báo mảng gồm 10 số nguyên và điền vào mảng 10 số nguyên ngẫu nhiên nhỏ hơn 100, in ra màn hình*

### 2.3 Vòng lặp *for* trên *array*

```java
TYPE[] items = new TYPE[10];

for(int i =0;i< items.length;i++){

  TYPE item = items[i];

  //Do something
}
```

hoặc

```java
TYPE[] items = new TYPE[10];

for(TYPE item : items){
 //Do something
}
```

Ví dụ:

```java
String[] dates = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

for(String date : dates){
   System.out.println(date);
}
```

## 3. Game *3 cây*

![](./materials/3_cay.png)

Trong phần này, học viên được yêu cầu hoàn thiện game *3 cây* **dựa trên một phần mã nguồn được cung cấp**. Game dựa trên luật chơi *3 cây* thông thường với sửa đổi duy nhất:

* Toàn bộ 52 quân bài được dùng trong trò chơi

### 3.1. *Bóc tách* chương trình

Trò chơi *3 cây* trong thực tế bao gồm các thành phần sau

* Quân bài
* Người chơi
* Người chia

Do vậy, một cách tự nhiên thì chương trình game ta cần viết có thể được tách thành các *class* sau đây:

* *Card.java* : Mô phỏng quân bài trong bộ bài
* *CardHand.java* : Mô phỏng người chơi với 3 quân bài được chia
* *Dealer.java* : Mô phỏng người chia bài
* *TCGame.java* : Class chứa hàm *main* của chương trình

```java
public class TCGame{

    public static void main(String[] args) {
        TCGame g = new TCGame();
        for (int i = 0; i < 25; i++) {
            g.newRound();
        }
    }
}
```

### 3.2. Hoàn thiện code được cung cấp

3.2.1 **Card.java**

**Card.java** mô phỏng quân bài và có 2 *fields* chính

* rank: Giá trị số cuả quân bài
* suit: Chất của quân bài

```java
public class Card {

    public final static char SPADE = '\u2660';

    public final static char CLUB = '\u2663';

    public final static char DIAMOND = '\u2666';

    public final static char HEART = '\u2665';

    public int rank;

    public int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        if (rank > 0 && rank < 14 && suit >= 0 && suit < 4) {
            //TODO: Trả về chuỗi bao gồm giá trị quân bài + ký tự Unicode cho chất của quân bài
            //theo quy tắc:
            // rank: 1 -> A, 2 -> 2,..., 10 -> 10, 11 -> J, 12-> Q, 13 -> K
            // suit: 0 -> SPADE, 1 -> CLUB, 2 -> DIAMOND, 3 -> HEART
            // Ví dụ:
            // rank = 11, suit = 1  -> trả về chuỗi "J\u2663"
        } else {
            return "INVALID_CARD";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Card(8, 2));
    }
}
```

__Bài tập 5:__

*Hoàn thiện method **toString** trong **Card.java** theo yêu cầu và biên dịch, chạy Card.java trên dòng lệnh*

__Yêu cầu:__

Kết quả in ra màn hình của bài tập 5 phải giống như hình dưới đây

![](./materials/card_main.png)

3.2.2 **CardHand.java**

**CardHand.java** mô phỏng tay cầm bài của người chơi và bao gồm 2 *fields* chính:

* cards: *array* chứa 3 quân bài được chia
* name: Tên của người chơi: Tí, Sửu, Dần, Mão,...

```java
public class CardHand {

    public Card[] cards;

    public String name;

    private int count;

    public CardHand(String name) {
        this.name = name;
        this.cards = new Card[3];
    }

    public void addCard(Card c) {
        if (count >= 3) {
            System.out.println("Cannot add more card");
        } else {
            cards[count] = c;
            count++;
        }
    }

    public void reset() {
        for (int i = 0; i < count; i++) {
            cards[i] = null;
        }
        count = 0;
    }

    public int getScore() {
        if (count != 3) {
            throw new IllegalArgumentException("Need to deal 3 cards");
        } else {
          //TODO: Trả về giá trị điểm tính theo trò 3 cây trong thực tế
        }
    }

    @Override
    public String toString() {
        return name + ": " + getScore() + " | " + cards[0] + " " + cards[1] + " " + cards[2];
    }

    public static void main(String[] args){
        CardHand h = new CardHand("Tí");
        h.addCard(new Card(1, 2));
        h.addCard(new Card(6, 3));
        h.addCard(new Card(11, 0));

        System.out.println(h);
    }

}

```

__Bài tập 6:__

*Hoàn thiện method **getScore** theo yêu cầu trong **CardHand.java**, biên dịch và chạy trên dòng lệnh*

__Yêu cầu:__

Kết quả in ra màn hình phải giống hình dưới đây

![](./materials/card_hand_main.png)

3.2.3 **Dealer.java**

**Dealer.java** mô phỏng người chia bài trong trò chơi và bao gồm 1 field chính

* cards: *array* chứa 52 quân bài được sắp xếp theo thứ tự ngẫu nhiên ban đầu.

Ngoài ra **Dealer.java** có chứa method *shuffle* mô phỏng việc tráo bài trước khi chia.

```java
public class Dealer {

    public final Card[] cards = new Card[52];

    private int dealtIndex = 51;

    public Dealer() {
        int[] idxs = MathUtil.randomPermutation(52);

        for (int i = 0; i < 52; i++) {
            int idx = idxs[i];

            cards[i] = new Card((idx / 4) + 1, idx % 4);
        }
    }

    public void shuffle() {
        int k = new Random().nextInt(52);
        basicShuffle(k);
    }

    private void basicShuffle(int k) {
        //TODO: Hoán vị vị trí các quân bài sao cho k quân bài đầu tiên trong mảng
        //sẽ được chuyển xuống phía cuối của mảng, giống với cách tráo bài thông thường
    }

    public void showCards() {
        for (Card c : cards) {
            System.out.print(c + " ");
        }
    }

    public Card dealCard() {
        Card c = cards[dealtIndex];
        dealtIndex--;

        return c;
    }

    public void reset() {
        dealtIndex = 51;
    }

    public static void main(String[] args) {
        Dealer d = new Dealer();
        d.showCards();

        for (int i = 0; i < 10; i++) {
            d.shuffle();
        }
        System.out.println();
        d.showCards();
    }
}
```

__Bài tập 7:__

*Hoàn thiện method **basicShuffle** theo như yêu cầu, sau đó biên dịch và chạy **Dealer.java***

__Yêu cầu:__

Nội dung in ra màn hình phải cho thấy có 1 số quân bài đã được chuyển xuống cuối, tương tự với hình sau

![](./materials/dealer_main.png)

3.2.4 **MathUtil.java**

**MathUtil.java** cung cấp method cho phép tạo ra *hoán vị* ngẫu nhiên của 52 số từ 0->51. Thông qua đó, có thể tạo ra sắp xếp ngẫu nhiên ban đầu của 52 quân bài

```java
import java.util.Random;

/**
 * @author <a href="hoang281283@gmail.com">Minh Hoang TO</a>
 * @date: 7/31/17
 */
public class MathUtil {

    public static int[] randomPermutation(int n) {
        return randomPermutation(n, 0);
    }

    public static int[] randomPermutation(int n, int base) {
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + base;
        }

        for (int k = 1; k < n; k++) {
            int ridx = new Random().nextInt(n - k + 1);
            int tmp = p[n - k];
            p[n - k] = p[ridx];
            p[ridx] = tmp;
        }

        return p;
    }

}
```

3.2.5 **TCGame.java**

**TCGame.java** chứa hàm *main* của ứng dụng và thực thi các công việc

* Khởi tạo *array* gồm 4 người chơi + khởi tạo *Dealer*
* Lần lượt thực thi 25 vòng chơi

```java
public class TCGame {

    public final CardHand[] hands = new CardHand[4];

    public final Dealer dealer;

    public int round = 1;

    public TCGame() {
        hands[0] = new CardHand("Tí ");
        hands[1] = new CardHand("Sửu");
        hands[2] = new CardHand("Dần");
        hands[3] = new CardHand("Mão");

        dealer = new Dealer();
    }

    public void newRound() {
        reset();
        shuffleTenTimes();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < hands.length; j++) {
                Card c = dealer.dealCard();
                hands[j].addCard(c);
            }
        }

        System.out.println("ROUND " + round + "\n");
        for (int i = 0; i < hands.length; i++) {
            System.out.println(hands[i]);
        }
        System.out.println();

        round++;
    }

    public void shuffleTenTimes() {
        for (int i = 0; i < 10; i++) {
            dealer.shuffle();
        }
    }

    public void reset() {
        for (CardHand h : hands) {
            h.reset();
        }

        dealer.reset();
    }

    public static void main(String[] args) {
        TCGame g = new TCGame();
        for (int i = 0; i < 25; i++) {
            g.newRound();
        }
    }
}
```

__Bài tập 8:__

*Biên dịch và chạy **TCGame.java***

__Yêu cầu:__

Kết quả in ra màn hình phải tương tự như hình dưới đây

![](./materials/tcgame_main.png)