import java.util.Scanner;

public class ProfessorJang{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("============================================");
        System.out.println("|                                          |");
        System.out.println("|     3.나침반                   1.모니터    |");
        System.out.println("|                        2.메모지           |");
        System.out.println("|                                          |");
        System.out.println("|                                          |");
        System.out.println("============================================");
        System.out.println("|번호를 눌러 힌트를 찾으세요.                   |");

        while(true){
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println(
                            "모니터를 켰는데 배경화면이 조금 이상하다.\n" +
                            "세모, 네모, 동그라미, 육각형\n" +
                            "왜 동그라미만 색깔이 다를까?");
                    break;
                case 2:
                    System.out.println("교수님의 메모지다.");
                    System.out.println("mEmo.\n" +
                            "duddjfh 2");
                    System.out.println("무슨뜻이지...");
                    break;
                case 3:
                    System.out.println("나침반: N이 유난히 눈에 띈다");
                    break;
                default:
                    sc.close();
                    System.out.println("실행을 종료합니다.");
                    return;
            }
        }
    }
}