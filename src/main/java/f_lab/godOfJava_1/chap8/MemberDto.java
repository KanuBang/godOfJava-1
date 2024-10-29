package f_lab.godOfJava_1.chap8;

public class MemberDto {
    public String name;
    public String phone;
    public String email;

    // 아무 것도 모를 때
    public MemberDto() {
    }

    // 이름만 알 때
    public MemberDto(String name) {
        this.name = name;
    }

    // 이름, 전화번호만 알 때
    public MemberDto(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // 모두 알 때
    public MemberDto(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
