package zad44

import dzien2.Zad44
import spock.lang.Specification

class Zad44Test extends Specification {

    def 'should correctly calculate NWD'() {
        given:
        int a = value1
        int b = value2
        when:
        int result = Zad44.nwdEuklides(a, b)
        then:
        result == wynik
        where:
        value1 | value2 | wynik
        0      | 0      | 0
        1      | 1      | 1
        2      | 3      | 1
        75     | 20     | 5
        7      | 11     | 1
    }
}
