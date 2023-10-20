import designpattern.adapter.delegation.AdapterDelegationTest;
import designpattern.adapter.example.AdapterExampleTest;
import designpattern.adapter.inheritance.AdapterInheritanceTest;
import designpattern.factorymethod.FactoryMethodTest;
import designpattern.iterator.BookShelfIteratorPatternTest;
import designpattern.iterator.usingArrayList.BookShelfIteratorPatternArrayList;
import designpattern.templatemethod.TemplateMethodTest;

// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main {
    public static void main(String[] args) {
        iteratorPattern();
        adapterPattern();
        templateMethodPattern();
        factoryMethodPattern();
    }

    public static void iteratorPattern() {
        System.out.println("============================= Iterator Pattern ===========================");
        BookShelfIteratorPatternTest.run();
        System.out.println("============================= Iterator Pattern Using ArrayList ===========================");
        BookShelfIteratorPatternArrayList.run();
    }

    public static void adapterPattern() {
        System.out.println("============================= Adapter Pattern Inheitance ===========================");
        AdapterInheritanceTest.run();
        System.out.println("============================= Adapter Pattern Delegation ===========================");
        AdapterDelegationTest.run();
        System.out.println("============================= Adapter Pattern FileIO Example ===========================");
        AdapterExampleTest.run();
    }

    public static void templateMethodPattern() {
        System.out.println("============================= Template Method Pattern ===========================");
        TemplateMethodTest.run();
    }

    public static void factoryMethodPattern() {
        System.out.println("============================= Factory Method Pattern ===========================");
        FactoryMethodTest.run();
    }
}