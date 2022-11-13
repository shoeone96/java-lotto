package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    // 보너스 숫자를 추가하는 메서드
    public void addBonus(int bonus){
        if(this.numbers.contains(bonus)) {
            System.out.println("[ERROR] 이미 선택한 숫자입니다.");
            throw new IllegalArgumentException();
        }
        numbers.add(bonus);
    }

    // TODO: 추가 기능 구현
}
