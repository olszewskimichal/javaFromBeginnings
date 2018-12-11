package zad45

import dzien2.Zad45
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class Zad45Test extends Specification {

    def 'should correctly calculate sum of dividers'() {
        given:
        int v = n
        when:
        int result = Zad45.sumaDzielnikow(v)
        then:
        result == wynik
        where:
        n  | wynik
        0  | 0
        1  | 1
        2  | 3
        3  | 4
        10 | 18
    }
}
