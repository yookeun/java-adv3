package optional;

import java.util.Optional;
import optional.model.Address;
import optional.model.User;

/**
 * Optional의 map() 체이닝을 활용한 안전한 null 처리 예제
 *
 * 이 클래스는 Optional.map()을 연속으로 사용하여
 * 중첩된 객체의 null 체크를 간결하게 처리하는 방법을 보여줍니다.
 */
public class AddressMain2 {

    public static void main(String[] args) {
        // user1: 주소(address)가 null인 사용자
        User user1 = new User("John", null);
        // user2: 주소(address)가 있는 사용자
        User user2 = new User("Jane", new Address("Main Street"));

        // 각 사용자의 거리 정보 출력
        printStreet(user1);  // "Unknown" 출력 예상
        printStreet(user2);  // "Main Street" 출력 예상
    }

    /**
     * 사용자의 거리 정보를 출력하는 메서드
     *
     * @param user 거리 정보를 조회할 사용자 객체
     */
    public static void printStreet(User user) {
        // 사용자로부터 거리 정보를 Optional로 가져옴
        Optional<String> userStreetOpt = getUserStreet(user);

        // ifPresentOrElse: 값이 있으면 첫 번째 동작, 없으면 두 번째 동작 수행
        userStreetOpt.ifPresentOrElse(
                System.out::println,                      // 값이 있을 때: 거리명 출력
                () -> System.out.println("Unknown")       // 값이 없을 때: "Unknown" 출력
        );
    }

    /**
     * 사용자로부터 거리 정보를 안전하게 추출하는 메서드
     *
     * Optional.map() 체이닝을 사용하여 중첩된 null 체크를 우아하게 처리합니다.
     *
     * 전통적인 null 체크 방식:
     * if (user != null) {
     *     Address address = user.getAddress();
     *     if (address != null) {
     *         return address.getStreet();
     *     }
     * }
     * return null;
     *
     * @param user 거리 정보를 조회할 사용자 객체 (null 가능)
     * @return 거리 정보를 담은 Optional (값이 없으면 Optional.empty())
     */
    static Optional<String> getUserStreet(User user) {

        return Optional.ofNullable(user)       // user가 null일 수 있으므로 ofNullable 사용
               .map(User::getAddress)          // user가 있으면 getAddress() 호출, null이면 empty 반환
               .map(Address::getStreet);       // address가 있으면 getStreet() 호출, null이면 empty 반환

        // map 체이닝의 동작 원리:
        // 1. 중간에 null이 발생하면 즉시 Optional.empty()를 반환
        // 2. 모든 단계가 성공하면 최종 값을 Optional로 감싸서 반환
        // 3. NPE(NullPointerException) 발생 위험 없이 안전하게 처리
    }
}
