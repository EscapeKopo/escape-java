import java.util.Scanner;

public class Server {
    private Scanner sc;
    private ImageViewer viewer;

    public Server(Scanner sc, ImageViewer viewer) {
        this.sc = sc;
        this.viewer = viewer;
    }

    private boolean running = true;

    // true = 켜짐, false = 꺼짐
    private boolean cooler = true;

    public boolean enter() {
        System.out.println("서버실에 들어왔습니다.");

        while (running) {
            showMenu();
        }

        return true;
    }

    private void showMenu() {
        viewer.showImage("images/server.jpg");

        System.out.println("\n[ 📍 서버실 ]");
        System.out.println("🔍 서버실을 조사해 단서를 찾아보자");
        System.out.println("1. 서버실 조사");
        System.out.println("2. 쿨러 버튼 누르기");
        System.out.println("3. [ 라운지 ] 장소 이동");
        System.out.println("4. 종료");
        System.out.print("선택: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                checkServer();
                break;
            case 2:
                coolerButton();
                break;
            case 3:
                moveToLounge();
                break;
            case 4:
                running = false;
                System.out.println("게임이 종료되었습니다.");
                System.exit(0);
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }
    }

    private void checkServer() {
        System.out.println("서버실을 조사했습니다.");
        System.out.println("서버 벽면에 작은 표식이 남겨져 있다.");
        System.out.println();
        System.out.println("\t" + "「 \uD83E\uDDE1❤\uFE0F\uD83E\uDE77\uD83D\uDC9B 」" + "\t");
        System.out.println();
        System.out.println("이 색깔 순서는 뭐지?");
    }

    private void coolerButton() {
        if (cooler) {
            cooler = false;

            System.out.println("쿨러 버튼을 눌렀습니다.");
            System.out.println();
            System.out.println("\t" + "🔴" + "\t");
            System.out.println();
            System.out.println("쿨러가 꺼졌습니다.");
            System.out.println("이대로 두면 서버실이 위험해질 것 같다.");
            System.out.println("다시 버튼을 눌러 쿨러를 켜야 할 것 같다.");
        } else {
            cooler = true;

            System.out.println("쿨러 버튼을 다시 눌렀습니다.");
            System.out.println();
            System.out.println("\t" + "🟢" + "\t");
            System.out.println();
            System.out.println("쿨러가 다시 작동합니다.");
            System.out.println("서버실의 온도가 안정된 느낌이다.");
        }
    }

    private void moveToLounge() {
        System.out.println("라운지로 돌아갑니다.");
        running = false;
    }
}