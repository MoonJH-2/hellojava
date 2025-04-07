package com.javaex.problem09;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendManager {
    private static ArrayList<Friend> friends = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1. 추가 2.목록 3.수정 4.종료");
            System.out.println("----------------------------------------");
            System.out.print("선택>");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addFriend();
                    break;
                case 2:
                    listFriends();
                    break;
                case 3:
                    updateFriend();
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }

    private static void addFriend() {
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("전화번호: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("이메일: ");
        String email = scanner.nextLine();
        
        friends.add(new Friend(name, phoneNumber, email));
        System.out.println("친구가 추가되었습니다.");
    }

    private static void listFriends() {
        if (friends.isEmpty()) {
            System.out.println("등록된 친구가 없습니다.");
            return;
        }
        for (Friend friend : friends) {
            System.out.println(friend);
        }
    }

    private static void updateFriend() {
        System.out.print("이름: ");
        String name = scanner.nextLine();
        for (Friend friend : friends) {
            if (friend.getName().equals(name)) {
                System.out.print("전화번호: ");
                friend.setPhoneNumber(scanner.nextLine());
                System.out.print("이메일: ");
                friend.setEmail(scanner.nextLine());
                System.out.println("정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println("그런 이름의 친구는 없습니다.");
    }
}
