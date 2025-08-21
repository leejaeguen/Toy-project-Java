package org.com.worms.section03.reference;

public class Member {
    private String memberId;

    public Member(){
        System.out.println("기본 생성자 사용함");
    }
    public Member(String memberId) {
        System.out.println(memberId + "가 넘어온 생선자 사용함");
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                '}';
    }
}
