package hello.core.member;

public interface MemberRepository {
    //회원 저장소.
    //member을 저장하겠다.
    void save(Member member);


    //id를 기준으로 멤버를 찾겠다.
    Member findById(Long memberId);
}
