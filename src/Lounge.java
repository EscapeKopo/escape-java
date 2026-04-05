import java.util.Scanner;

public class Lounge {
    private Scanner sc = new Scanner(System.in);
    private ImageViewer viewer = new ImageViewer();

    private boolean running = true;

    public void start() {
        System.out.println("방탈출 게임을 시작합니다.");

        while (running) {
            showMenu();
        }

        System.out.println("게임이 종료되었습니다.");
        System.exit(0);
    }

    private void showMenu() {
        viewer.showImage("images/lounge.jpg");

        System.out.println("\n[ 📍 라운지 ]");
        System.out.println("🔍 라운지를 조사해 단서를 찾아보자");
        System.out.println("1. 소파 조사");
        System.out.println("2. 사물함 조사");
        System.out.println("3. 책장 조사");
        System.out.println("4. [ 서버실 ] 장소 이동");
        System.out.println("5. 종료");
        System.out.print("선택: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                checkSofa();
                break;
            case 2:
                checkLocker();
                break;
            case 3:
                checkBook();
                break;
            case 4:
                moveToServer();
                break;
            case 5:
                running = false;
                break;
            default:
                System.out.println("잘못 입력했습니다.");
        }
    }

    private void checkSofa() {
        System.out.println("소파를 조사했습니다.");
        System.out.println("소파 밑에 끼어 있던 작은 메모.");
        System.out.println();
        System.out.println("\t" + "「 ...110... 」" + "\t");
        System.out.println();
        System.out.println("정체 모를 숫자가 적혀 있다.");
        System.out.println("탈출 비밀번호와 관련이 있어 보인다.");
    }

    private void checkLocker() {
        System.out.println("\n[ 📍 사물함 조사 ]");
        System.out.print("조사할 사물함 번호를 입력하세요: ");

        int lockerNumber = sc.nextInt();

        if (lockerNumber == 415) {
            System.out.println("415번 사물함을 열었습니다.");
            System.out.println();
            System.out.println("\t" + "🎀" + "\t");
            System.out.println();
            System.out.println("\t" + "으 ..." + "\t");
            System.out.println();
            System.out.println("사물함 속 분홍색 물건 밖에 없다.");
            System.out.println("단순히 사물함 주인의 취향일까?");
        }
        else if (lockerNumber == 417) {
            System.out.println("417번 사물함을 열었습니다.");
            System.out.println();
            System.out.println("\t" + "🍴" + "\t");
            System.out.println();
            System.out.println("\t" + "「 수저와 포크 」" + "\t");
            System.out.println();
            System.out.println("학생들이 배달 음식을 많이 시켜먹은 듯하다.");
            System.out.println("이건 필요 없겠지?");
        }
        else {
            System.out.println("빈 사물함입니다.");
        }
    }

    private void checkBook() {
        System.out.println("책장을 조사했습니다.");
        System.out.println("책 사이에서 편지를 발견했습니다.");
        System.out.println();
        System.out.println("\t" + "✉" + "\t");
        System.out.println();
        System.out.println("\t" + "「 이 편지는 영국에서 최초로 시작되어... 」" + "\t");
        System.out.println();
        System.out.println("에이씨...");
        System.out.println("7통을 보내야 한다고?");
    }

    private void moveToServer() {
            Server server = new Server(sc, viewer);
            server.enter();
    }

}