import java.util.Scanner;

public class Classroom {
    static String Item[][] = new String[20][2];
    static int icount = 0;
    static boolean profcom = false;
    static boolean hasServerKey = false; // 서버실 키 여부

    public static void main(String[] args) {
        boolean init = false;
        boolean end = false;

        Scanner s = new Scanner(System.in);

        Classroom.P_MainScreen();

        while (true) {
            if (end) break;

            System.out.println("탐색할 곳을 입력하세요.");
            String con = s.nextLine();

            if (con.equals("Profcom") || con.equals("profcom") || con.equals("prof_com")) {
                Classroom.ProfCom();
                init = true;
            }
            else if (con.equals("BACK") || con.equals("back") || con.equals("Back")) {
                Classroom.P_MainScreen();
                init = false;
            }
            else if (con.equals("mycom") || con.equals("my_com") || con.equals("My_com") || con.equals("My_com")) {
                Classroom.mycom();
            }
            else if (con.equals("password") || con.equals("Password") || con.equals("PASSWORD")) {
                System.out.println("비밀 번호를 입력하시오. ");
                int a = s.nextByte();
                s.nextLine(); // 버퍼 비우기

                if (a == 9917) {
                    profcom = true;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                    Classroom.ProfCom();
                }
            }
            else if (con.equals("Paper") || con.equals("paper")) {
                System.out.println("┌─────────────────────────────────────────────────────────────────────── ─┐" + "    BACK ->");
                System.out.println("│                        2026학년도 학번선정 명부                            │");
                System.out.println("│ 학교: 김제넥스하이테크고등학교   학년: 2   과정: 하이테크과정               │");
                System.out.println("├────┬────────┬────┬────┬──────┬────────────┬────────────┬──────┬────────┤");
                System.out.println("│ No │ 학번   │ 학년│ 성별│ 이름 │ 생년월일   │ 연락처     │ 고건 │ 운전점수 │");
                System.out.println("├────┼────────┼────┼────┼──────┼────────────┼────────────┼──────┼────────┤");

                System.out.println("│ 1  │2660143 │ 2  │ A  │ 김신우│2007-11-11 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│ 2  │2660143 │ 2  │ A  │ 장대현│2007-03-06 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│ 3  │2660143 │ 2  │ A  │ 과회원│2007-03-06 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│ 4  │2660143 │ 2  │ A  │ 인턴님│2007-09-03 │010-2230    │ 시흥시│ 14     │");
                System.out.println("│ 5  │2660142 │ 2  │ A  │ 이윤호│2007-09-12 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│ 6  │2660143 │ 2  │ A  │ 김승수│2007-03-12 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│ 7  │2660149 │ 2  │ A  │ 신동진│2007-09-03 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│ 8  │2660147 │ 2  │ A  │ 정아현│2007-12-15 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│ 9  │2660148 │ 2  │ A  │ 전결현│2006-09-08 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│10  │2660348 │ 2  │ A  │ 김선호│1999-10-17 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│10  │2660348 │ 2  │ A  │ 김선호│1999-10-17 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│11  │2660243 │ 2  │ A  │ 김아영│2002-02-12 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│12  │2660243 │ 2  │ A  │ 신승은│2001-01-02 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│13  │2660096 │ 2  │ A  │ 김아영│2002-02-06 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│14  │26602143│ 2  │ A  │ 김아영│2001-01-02 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│15  │26602143│ 2  │ A  │ 최영은│2001-01-02 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│16  │26602142│ 2  │ A  │ 김혜린│2001-01-02 │010-2230    │ 시흥시│ 15     │");
                System.out.println("│17  │26602143│ 2  │ A  │ 한상진│2001-01-17 │010-2230    │ 시흥시│ 15     │");

                System.out.println("└───────────────────────────────────────────────────────────────────── ──┘");
            }
            else if (con.equals("Hint_2")) {
                System.out.println("┌──────────────────────────────────────────────┐");
                System.out.println("│                [ CLASS BOARD ]               │");
                System.out.println("│                                              │");
                System.out.println("│    25   →   5                                │");
                System.out.println("│    92   →   9                                │");
                System.out.println("│    45   →   5                                │");
                System.out.println("│    21   →   2                                │");
                System.out.println("│                                              │");
                System.out.println("│                                              │");
                System.out.println("│                                              │");
                System.out.println("└──────────────────────────────────────────────┘");
            }
            else if (con.equals("Crumpled Paper") || con.equals("crumpledpaper") || con.equals("Crumpled_paper") || con.equals("CrumpledPaper")) {
                System.out.println("      /─────────────────────────────────────\\");
                System.out.println("    //     [ 구겨진 종이 ]                  \\\\");
                System.out.println("   /  │    오늘 누구 생일이야?               │ \\");
                System.out.println("  /   │      |_ 오늘 큰형 생일이잖아         │  \\");
                System.out.println(" │    │         |_ 아 맞다 ㅋㅋ              │   │");
                System.out.println(" │    │                                     │   │");
                System.out.println(" │   /                                      │  /");
                System.out.println("  \\ /                                       │ /");
                System.out.println("   X                                        │/");
                System.out.println("  / \\                                       /");
                System.out.println(" /   \\_____________________________________/ ");
            }
            else if (con.equals("unlock") || con.equals("UNLOCK") || con.equals("Unlock") || con.equals("UnLock")) {
                boolean out = false;
                while (true) {
                    if (out) {
                        break;
                    }
                    System.out.println("┌──────────────────────────────────────────────────────────────────────────────┐");
                    System.out.println("│                                                                   BACK ->    │" + "              *최종 비밀 번호 입력 창입니다. ");
                    System.out.println("│                                                                              │" + "              *BACK 입력 시 뒤로가기가 가능합니다. ");
                    System.out.println("│                                                                              │");
                    System.out.println("│                                                                              │");
                    System.out.println("│                                                                              │");
                    System.out.println("│                            [  _  _  _  _   ]                                 │");
                    System.out.println("│                                PASSWORD                                      │");
                    System.out.println("│                                                                              │");
                    System.out.println("│                                                                              │");
                    System.out.println("│                                                                              │");
                    System.out.println("│                                                                              │");
                    System.out.println("│                                                                              │");
                    System.out.println("└──────────────────────────────────────────────────────────────────────────────┘");
                    System.out.println("최종 비밀번호를 입력하십시오.");
                    String a = s.next();

                    if (a.equals("0162")) {
                        System.out.println("축하드립니다~!! 비밀 번호를 맞히셨습니다.");
                    }
                    else if (a.equals("back") || a.equals("BACK") || a.equals("Back")) {
                        s.nextLine();
                        Classroom.ProfCom();
                        break;
                    }
                    else {
                        System.out.println("틀렸습니다.");
                    }
                    s.nextLine();
                }
            }
            else if (con.equals("Notebook") || con.equals("notebook")) {
                System.out.println("┌─────────────────────────────────────────────────┐");
                System.out.println("│                                                 │");
                System.out.println("│                                                 │");
                System.out.println("│    숫    은 같 이         하지만                   │");
                System.out.println("│      자들                                        │");
                System.out.println("│                            ㅅ ㅔ ㅇ   마   ㅇ ㅏ  │");
                System.out.println("│  ㄷ  ㄴ    느  거             ㅅ  ㅡㄴ   ㄴ     |  │");
                System.out.println("│    ㅏ  ㅣ ㄴ  ㄹ                                 │");
                System.out.println("│                                                 │");
                System.out.println("│   조  아  해                                      │");
                System.out.println("└─────────────────────────────────────────────────┘");
            }
            else if (con.equals("Map") || con.equals("map") || con.equals("MAP")) {
                Classroom.showMap();
                String place = s.nextLine();

                if (place.equals("장석주 교수님 교수실")) {
                    Classroom.JangProfessorRoom();
                }
                else if (place.equals("정원치 교수님 교수실")) {
                    Classroom.JungProfessorRoom();
                }
                else if (place.equals("라운지")) {
                    Classroom.Lounge();
                }
                else if (place.equals("서버실")) {
                    if (!hasServerKey) {
                        System.out.println("현재는 키가 없어 들어가실 수 없습니다.");
                    } else {
                        Classroom.ServerRoom();
                    }
                }
                else if (place.equals("BACK") || place.equals("back") || place.equals("Back")) {
                    Classroom.P_MainScreen();
                }
                else {
                    System.out.println("존재하지 않는 장소입니다.");
                }
            }
            else if (con.equals("serverkey") || con.equals("ServerKey") || con.equals("SERVERKEY")) {
                hasServerKey = true;
                System.out.println("서버실 열쇠를 획득했습니다.");
            }
            else {
                System.out.println("존재하지 않는 입력입니다.");
            }
        }
    }

    static void showMap() {
        System.out.println("┌──────────────────────────[ MAP ]──────────────────────────┐");
        System.out.println("│                                                           │");
        System.out.println("│  이동 가능한 장소                                            │");
        System.out.println("│                                                           │");
        System.out.println("│  - 장석주 교수님 교수실                                      │");
        System.out.println("│  - 정원치 교수님 교수실                                      │");
        System.out.println("│  - 서버실                                                  │");
        System.out.println("│  - 라운지                                                  │");
        System.out.println("│                                                          │");
        System.out.println("│  이동할 장소 이름을 정확히 입력하세요.                         │");
        System.out.println("│  뒤로 가려면 BACK 입력                                      │");
        System.out.println("└──────────────────────────────────────────────────────────┘");
    }

    static void P_MainScreen() {
        System.out.println("┌──────────────────────────────────────────────────────────────────────────────┐" + "--Map--");
        System.out.println("│                                                                              │");
        System.out.println("│ Notice     ┌──────────────────── White Board ─────────────────────┐          │");
        System.out.println("│ [Paper]    │                                                      │          │");
        System.out.println("│            │                  [   Hint_2   ]                      │          │");
        System.out.println("│            └──────────────────────────────────────────────────────┘          │");
        System.out.println("│                                                                              │");
        System.out.println("│     ┌──────────────┐        ┌──────────────┐        ┌──────────────┐         │");
        System.out.println("│     │   [____]     │        │   [____]     │        │   [____]     │         │" + "              *주변을 탐색 하실 수 있습니다.");
        System.out.println("│     │    |__|      │        │    |__|      │        │    |__|      │         │" + "              *[ ]안에 입력된 글자를 입력하시면 탐색이 가능합니다. ");
        System.out.println("│     └──────────────┘        └──────────────┘        └──────────────┘         │" + "              *Map 검색시 이동가능한 장소가 출력됩니다. ");
        System.out.println("│                                                                              │" + "              *언제든지 최종 비밀번호를 시도해 보실 수 있습니다.");
        System.out.println("│           ┌──────────────┐        ┌──────────────┐        ┌──────────────┐   │" + "               UNLOCK을 입력하시면 도전이 가능합니다.");
        System.out.println("│           │   [____]     │        │   [My_Com]   │        │   [____]     │   │");
        System.out.println("│           │    |__|      │        │     |__|     │        │    |__|      │   │");
        System.out.println("│           └──────────────┘        └──────────────┘        └──────────────┘   │");
        System.out.println("│                                                                              │");
        System.out.println("│                 ┌───────────────────────────────┐                            │");
        System.out.println("│                 │          [ Prof_com ]         │                            │");
        System.out.println("│                 │                               │                            │");
        System.out.println("│                 │                               │                            │");
        System.out.println("│                 └───────────────────────────────┘                            │");
        System.out.println("│                                                             |*  UNLOCK  *|   │");
        System.out.println("└──────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("MyItem List ▽");

        if (Item == null) {
        } else {
            for (int i = 0; i < icount; i++) {
                System.out.println(Item[i]);
            }
        }
    }

    static void ProfCom() {
        if (profcom) {
            System.out.println("┌──────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│                                                                   BACK ->    │" + "              *BACK 입력 시 뒤로가기가 가능합니다. ");
            System.out.println("│                                 ■   ■  ■                                     │" + "              *비밀번호를 풀었습니다 다른 방을 탐색하십시오. ");
            System.out.println("│                              ■            ■                                  │");
            System.out.println("│                            ■                ■                                │");
            System.out.println("│                                            ■                                 │");
            System.out.println("│                                         ■                                    │");
            System.out.println("│                                      ■                                       │");
            System.out.println("│                                  ■                                           │");
            System.out.println("│                               ■                                              │");
            System.out.println("│                           ■   ■   ■   ■   ■   ■                              │");
            System.out.println("│                                                                              │");
            System.out.println("│                         Y    E    L    L    O    W                           │");
            System.out.println("└──────────────────────────────────────────────────────────────────────────────┘");
        } else {
            System.out.println("┌──────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│                                                                   BACK ->    │" + "              *비밀번호 창이 존재할 경우 Password 입력 후 비밀번호 창이 활성화 될 때 ");
            System.out.println("│                 ┌──────────────────────────────────────┐                     │" + "               비밀번호를 입력하시면 됩니다. ");
            System.out.println("│                 │                                      │                     │" + "              *BACK 입력 시 뒤로가기가 가능합니다. ");
            System.out.println("│                 │                                      │                     │");
            System.out.println("│                 │                                      │                     │");
            System.out.println("│                 │          [  _  _  _  _   ]           │                     │");
            System.out.println("│                 │          PASSWORD REQUIRED           │                     │");
            System.out.println("│                 │                                      │                     │");
            System.out.println("│                 │                                      │                     │");
            System.out.println("│                 │                                      │                     │");
            System.out.println("│                 └──────────────────────────────────────┘                     │");
            System.out.println("│                                                                              │");
            System.out.println("└──────────────────────────────────────────────────────────────────────────────┘");
        }
    }

    static void mycom() {
        System.out.println("┌──────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│                                                                    BACK ->   │");
        System.out.println("│                                                                              │");
        System.out.println("│                    ┌──────────────────────────────────────┐                  │");
        System.out.println("│                    │                                      │                  │");
        System.out.println("│                    │                                      │                  │");
        System.out.println("│                    │                                      │                  │");
        System.out.println("│                    │                                      │                  │");
        System.out.println("│                    │            Monitor Screen            │                  │" + "              *주변을 탐색 하실 수 있습니다.");
        System.out.println("│                    └──────────────────────────────────────┘                  │" + "              *[ ]안에 입력된 글자를 입력하시면 탐색이 가능합니다. ");
        System.out.println("│                                       |                                      │" + "              *BACK 입력 시 뒤로가기가 가능합니다. ");
        System.out.println("│                                   _________                                  │");
        System.out.println("│                                                                              │");
        System.out.println("│                             [Crumpled Paper]                                 │");
        System.out.println("│                         ((      ________      ))                             │");
        System.out.println("│                       ((     __/  __   \\__     ))                           │");
        System.out.println("│                         ((  /  _ /  \\ _  \\   ))                            │");
        System.out.println("│                            \\_/ /_/\\_\\ \\_/                                │");
        System.out.println("│                                                                              │");
        System.out.println("│                                                                              │");
        System.out.println("│     ┌───────────────────────┐                    ┌───────────────────────┐   │");
        System.out.println("│     │  / / / / / / / / / /  │                    │  / / / / / / / / / /  │   │");
        System.out.println("│     │ / / / / / / / / / /   │                    │ / / / / / / / / / /   │   │");
        System.out.println("│     │/ / / / / / / / / /    │                    │/ / / / / / / / / /    │   │");
        System.out.println("│     │                       │                    │      [Notebook]       │   │");
        System.out.println("│     └───────────────────────┘                    └───────────────────────┘   │");
        System.out.println("│                                                                              │");
        System.out.println("└──────────────────────────────────────────────────────────────────────────────┘");
    }

    static void JangProfessorRoom() {
        System.out.println("┌──────────────────────────────────────────────────────────┐");
        System.out.println("│               장석주 교수님 교수실로 이동했습니다.             │");
        System.out.println("│                                                          │");
        System.out.println("│                  조용한 교수실 내부입니다.                   │");
        System.out.println("└──────────────────────────────────────────────────────────┘");
    }

    static void JungProfessorRoom() {
        System.out.println("┌──────────────────────────────────────────────────────────┐");
        System.out.println("│               정원치 교수님 교수실로 이동했습니다.             │");
        System.out.println("│                                                          │");
        System.out.println("│                  책상 위를 조사할 수 있을 것 같습니다.         │");
        System.out.println("└──────────────────────────────────────────────────────────┘");
    }

    static void Lounge() {
        System.out.println("┌──────────────────────────────────────────────────────────┐");
        System.out.println("│                    라운지로 이동했습니다.                    │");
        System.out.println("│                                                          │");
        System.out.println("│               잠시 쉴 수 있는 공간처럼 보입니다.               │");
        System.out.println("└──────────────────────────────────────────────────────────┘");
    }

    static void ServerRoom() {
        System.out.println("┌──────────────────────────────────────────────────────────┐");
        System.out.println("│                    서버실로 이동했습니다.                │");
        System.out.println("│                                                          │");
        System.out.println("│              기계음이 들리는 차가운 공간입니다.           │");
        System.out.println("└──────────────────────────────────────────────────────────┘");
    }
}