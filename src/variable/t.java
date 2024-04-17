package variable;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("당신은 운동이 좋습니까?"); // 운동의 호불호 조사
        String a = sc.nextLine();

        if(a.equals("네")){
            System.out.println("얼만큼 좋으신가요? (1~5)");
            String b = sc.nextLine(); // 얼마나 운동을 좋아하는 지 묻기
            switch(b){
                case "1": // 여러가지의 case를 확인 하고 그에 맞는 결과를 출력
                    System.out.println("1만큼 좋으시군요");
                    System.out.println("----------");
                    System.out.println("무슨 운동을 해보실래요?");
                    System.out.println("----------");
                    System.out.println("헬스, 요가");
                    String c = sc.nextLine();
                    if(c.equals("헬스")){
                        System.out.println("헬린이 좋죠, 좋은 운동되세요~");
                    }
                    else{
                        System.out.println("초보의 요기라, 좋죠, 좋은 운동되세요~");
                    }
                    break;

                case "2":
                    System.out.println("2만큼 좋으시군요");
                    System.out.println("----------");
                    System.out.println("무슨 운동을 해보실래요?");
                    System.out.println("----------");
                    System.out.println("헬스, 요가");
                    String d = sc.nextLine();
                    if(d.equals("헬스")){
                        System.out.println("헬린이 좋죠, 좋은 운동되세요~");
                    }
                    else{
                        System.out.println("초보의 요가라, 좋죠, 좋은 운동되세요~");
                    }
                    break;

                case "3":
                    System.out.println("3만큼 좋으시군요");
                    System.out.println("----------");
                    System.out.println("무슨 운동을 해보실래요?");
                    System.out.println("----------");
                    System.out.println("헬스, 요가");
                    String e = sc.nextLine();
                    if(e.equals("헬스")){
                        System.out.println("헬린이 좋죠, 좋은 운동되세요~");
                    }
                    else{
                        System.out.println("초보의 요가라, 좋죠, 좋은 운동되세요~");
                    }
                    break;

                case "4":
                    System.out.println("4만큼 좋으시군요");
                    System.out.println("----------");
                    System.out.println("무슨 운동을 해보실래요?");
                    System.out.println("----------");
                    System.out.println("헬스, 요가");
                    String f = sc.nextLine();
                    if(f.equals("헬스")){
                        System.out.println("좋죠, 좋은 운동되세요~");
                    }
                    else{
                        System.out.println("좋죠, 좋은 운동되세요~");
                    }
                    break;

                case "5":
                    System.out.println("5만큼 좋으시군요");
                    System.out.println("----------");
                    System.out.println("무슨 운동을 해보실래요?");
                    System.out.println("----------");
                    System.out.println("헬스, 요가");
                    String g = sc.nextLine();
                    if(g.equals("헬스")){
                        System.out.println("좋죠, 좋은 운동되세요~");
                    }
                    else{
                        System.out.println("요기라, 좋죠, 좋은 운동되세요~");
                    }
                    break;
            }
        }
        else{ // 아니요 라고 답한 경우의 코드
            System.out.println("얼만큼 싫으신가요? (1~5)");
            String m = sc.nextLine(); // 얼마나 싫어하는지 묻는다.
            switch (m){
                case "1" : // case마다 확인후 내용 출력
                    System.out.println("그렇군요.. 아쉽네요.. 좋은 하루되세요.");
                    break;

                case "2" :
                    System.out.println("그렇군요.. 아쉽네요.. 좋은 하루되세요.");
                    break;

                case "3" :
                    System.out.println("그렇군요.. 아쉽네요.. 좋은 하루되세요.");
                    break;

                case "4" :
                    System.out.println("그렇군요.. 아쉽네요.. 좋은 하루되세요.");
                    break;

                case "5" :
                    System.out.println("그렇군요.. 아쉽네요.. 좋은 하루되세요.");
                    break;
            }
        }
    }
}