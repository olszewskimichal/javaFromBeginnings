package zad47

import dzien2.Zad47
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class PrimeNumberTest extends Specification {

    def 'should correctly calculate that number #value1 is prime'() {
        given:
        int a = value1
        when:
        boolean result = Zad47.isPrimeNumber(a)
        then:
        result == wynik
        where:
        value1 | wynik
        1      | false
        2      | true
        3      | true
        4      | false
        5      | true
        7      | true
    }
}
