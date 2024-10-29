package f_lab.godOfJava_1.chap8;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor referenceConstructor = new ReferenceConstructor();
        referenceConstructor.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDto memberDto = new MemberDto();
        MemberDto memberDto1 = new MemberDto("Sangmin");
        MemberDto memberDto2 = new MemberDto("Sangmin", "010XXXXYYYY");
        MemberDto memberDto3 = new MemberDto("Sangmin", "010XXXXYYYY", "adsf@naver.com");
    }
}
