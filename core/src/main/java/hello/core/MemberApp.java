package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args){

        AppConfig appConfig = new AppConfig();
        //MemberService memberService = new MemberServiceImpl();
        MemberService memberService = appConfig.memberService();
        //멤버
        Member member = new Member(1L, "memberA", Grade.VIP);

        //회원등록
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }
}
