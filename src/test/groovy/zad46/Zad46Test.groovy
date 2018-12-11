package zad46

import dzien2.Zad46
import spock.lang.Specification

class Zad46Test extends Specification {
    def 'should correctly calculate number with the biggest sum of dividers'() {
        given:
        int a = value1
        when:
        int result = Zad46.findNumberWithTheBiggestSumOfDividers(a);
        then:
        result == wynik
        where:
        value1 | wynik
        1      | 1
        2      | 2
        5      | 4
        7      | 6
    }
}
