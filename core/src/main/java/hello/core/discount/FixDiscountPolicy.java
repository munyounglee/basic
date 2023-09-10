package hello.core.discount;
import hello.core.member.Grade;
import hello.core.member.Member;
public class FixDiscountPolicy implements DiscountPolicy{


    //고정이니까 1000원으로
    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount; // VIP면 1000원을 깎아 주겠다.
        }else{ // 그게 아니라면... 할인을 안해주니까 0이겠지?
            return 0;
        }

            }
}
