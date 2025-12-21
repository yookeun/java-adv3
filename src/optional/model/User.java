package optional.model;

/**
 * 사용자 정보를 담는 모델 클래스
 *
 * 사용자의 이름과 주소 정보를 포함하며,
 * Optional 예제에서 중첩된 null 체크를 설명하기 위해 사용됩니다.
 */
public class User {
    private String name;        // 사용자 이름
    private Address address;    // 사용자 주소 (null 가능)

    /**
     * User 객체를 생성하는 생성자
     *
     * @param name 사용자 이름
     * @param address 사용자 주소 (null 가능 - Optional 예제를 위함)
     */
    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    /**
     * 사용자 이름을 조회
     *
     * @return 사용자 이름
     */
    public String getName() {
        return name;
    }

    /**
     * 사용자 이름을 설정
     *
     * @param name 설정할 사용자 이름
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 사용자 주소를 설정
     *
     * @param address 설정할 주소 객체 (null 가능)
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 사용자 주소를 조회
     *
     * @return 사용자 주소 객체 (null일 수 있음)
     */
    public Address getAddress() {
        return address;
    }


}
