package kr.co.homework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JungProfessor {

    static Scanner sc = new Scanner(System.in);
    static List<String> inventory = new ArrayList<>();
    static boolean[] taken = {false, false, false};
    static boolean escaped = false;

    public static void main(String[] args) {
        System.out.println("\n게임을 시작합니다...");
        delay(1000);

        while (!escaped) {
            printRoom();
            handleInput();
        }
    }

    /* ── 방 출력 ── */
    static void printRoom() {
        System.out.println("\n");
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("│           📍 정원치 교수님 연구실                        │");
        System.out.println("│         🔍 공간을 조사해 단서를 찾아보자                   │");
        System.out.println("├─────────────────────────────────────────────────────┤");
        System.out.println("│                                                     │");
        System.out.println("│   [1] 화분     [2] 쪽지     [3] 교수증                  │");
        System.out.println("│    🪴           📝          🪪                      │");
        System.out.println("│    " + getStatus(0) + "    " + getStatus(1) + "    " + getStatus(2) + "                │");
        System.out.println("│                                                     │");
        System.out.println("│   [4] MAP      [5] 탈출                              │");
        System.out.println("│                                                     │");
        System.out.println("├─────────────────────────────────────────────────────┤");
        printInventory();
        System.out.println("└─────────────────────────────────────────────────────┘");
        System.out.print("\n번호를 입력하세요 > ");
    }

    /* ── 획득 여부 표시 ── */
    static String getStatus(int idx) {
        return taken[idx] ? "[획득완료]" : "[미획득  ]";
    }

    /* ── 인벤토리 출력 (하단) ── */
    static void printInventory() {
        System.out.println("│  ── 아이템 ───────────────────────────────────────────│");
        if (inventory.isEmpty()) {
            System.out.println("│   (없음)                                             │");
        } else {
            StringBuilder sb = new StringBuilder("│   ");
            for (String item : inventory) {
                sb.append(item).append("  ");
            }
            // 줄 길이 맞추기
            while (sb.length() < 54) sb.append(" ");
            sb.append("│");
            System.out.println(sb);
        }
    }

    /* ── 입력 처리 ── */
    static void handleInput() {
        String input = sc.nextLine().trim();

        switch (input) {
            case "1":
                handleItem(0, "plant", "🪨 교수님의 애완돌",
                        "매끄럽고 동그란 돌멩이.\n" +
                                "교수님이 화분 옆에 소중히 올려두었다.\n" +
                                "뒷면에 작게 '행운을 빌어' 라고 새겨져 있다.");
                break;
            case "2":
                handleItem(1, "note", "📝 숫자가 적힌 쪽지",
                        "키보드 밑에 끼워진 작은 메모지.\n\n" +
                                "   「  0  」\n\n" +
                                "이 숫자가 비밀번호의 단서일까…");
                break;
            case "3":
                handleItem(2, "necklace", "🪪 교수증",
                        "파티션에 걸린 목걸이.\n" +
                                "안에 교수증이 들어있다.\n" +
                                "정원치 교수님의 얼굴과 이름이 적혀있다.");
                break;
            case "4":
                showMap();
                break;
            case "5":
                showEscape();
                break;
            default:
                System.out.println("❗ 올바른 번호를 입력하세요.");
                delay(800);
                break;
        }
    }

    /* ── 아이템 처리 ── */
    static void handleItem(int idx, String id, String name, String desc) {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│  " + name);
        System.out.println("├────────────────────────────────────────┤");
        for (String line : desc.split("\n")) {
            System.out.printf("│  %-37s│%n", line);
        }
        System.out.println("├───────────────────────────────────────┤");

        if (taken[idx]) {
            System.out.println("│  이미 획득한 아이템입니다.              │");
            System.out.println("└─────────────────────────────────────┘");
            System.out.print("  엔터를 눌러 돌아가기 > ");
            sc.nextLine();
        } else {
            System.out.println("│  [1] 획득    [2] 닫기                 │");
            System.out.println("└─────────────────────────────────────┘");
            System.out.print("  선택 > ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    taken[idx] = true;
                    inventory.add(name);
                    System.out.println("\n👜 " + name + " 을(를) 획득했습니다!");
                    delay(1000);
                    break;
                case "2":
                    break;
                default:
                    break;
            }
        }
    }

    /* ── MAP ── */
    static void showMap() {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│         🗺 MAP — 이동하기              │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│  [1] 강의실                           │");
        System.out.println("│  [2] 장석주 교수님 연구실               │");
        System.out.println("│  [3] 정원치 교수님 연구실  ← 현재       │");
        System.out.println("│  [4] 라운지                           │");
        System.out.println("│  [5] 서버실                           │");
        System.out.println("│  [0] 닫기                             │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("  선택 > ");

        String input = sc.nextLine().trim();

        switch (input) {
            case "1":
                System.out.println("\n📍 강의실로 이동합니다…");
                delay(1000);
                // new ClassRoom().start(); 연결 시 사용
                break;
            case "2":
                System.out.println("\n📍 장석주 교수님 연구실로 이동합니다…");
                delay(1000);
                break;
            case "3":
                System.out.println("현재 위치입니다.");
                delay(800);
                break;
            case "4":
                System.out.println("\n📍 라운지로 이동합니다…");
                delay(1000);
                break;
            case "5":
                System.out.println("\n📍 서버실로 이동합니다…");
                delay(1000);
                break;
            case "0":
                break;
            default:
                System.out.println("❗ 올바른 번호를 입력하세요.");
                delay(800);
                break;
        }
    }

    /* ── 탈출 팝업 ── */
    static void showEscape() {
        System.out.println("\n┌─────────────────────────────────────┐");
        System.out.println("│            🔐 탈출                    │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│  문에 자물쇠가 걸려 있다.               │");
        System.out.println("│  4자리 비밀번호를 입력해야 탈출할 수 있다. │");
        System.out.println("├─────────────────────────────────────┤");
        System.out.println("│  [0] 취소                             │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("  비밀번호 입력 > ");

        String pw = sc.nextLine().trim();

        if (pw.equals("0")) return;

        switch (pw) {
            case "0162":
                showSuccess();
                break;
            default:
                System.out.println("\n🔒 비밀번호가 틀린 것 같다…");
                delay(1000);
                break;
        }
    }

    /* ── 탈출 성공 ── */
    static void showSuccess() {
        System.out.println("\n");
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│                                     │");
        System.out.println("│             🎉 탈출 성공!             │");
        System.out.println("│                                     │");
        System.out.println("│       폴리텍에서 탈출 성공했다!          │");
        System.out.println("│                                     │");
        System.out.println("│       [1] 다시 시작   [2] 종료         │");
        System.out.println("│                                     │");
        System.out.println("└─────────────────────────────────────┘");
        System.out.print("  선택 > ");

        String input = sc.nextLine().trim();

        switch (input) {
            case "1":
                // 초기화
                inventory.clear();
                taken = new boolean[]{false, false, false};
                escaped = false;
                break;
            case "2":
                System.out.println("\n게임을 종료합니다. 안녕히 가세요!");
                escaped = true;
                System.exit(0);
                break;
            default:
                escaped = true;
                System.exit(0);
                break;
        }
    }

    /* ── 딜레이 ── */
    static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}