import designpattern.adapter.delegation.AdapterDelegationTest;
import designpattern.adapter.example.AdapterExampleTest;
import designpattern.adapter.inheritance.AdapterInheritanceTest;
import designpattern.factorymethod.FactoryMethodTest;
import designpattern.iterator.BookShelfIteratorPatternTest;
import designpattern.iterator.usingArrayList.BookShelfIteratorPatternArrayList;
import designpattern.prototype.PrototypeTest;
import designpattern.singleton.SingletonTest;
import designpattern.templatemethod.TemplateMethodTest;

// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main {
    public static void main(String[] args) {
        iteratorPattern();
        adapterPattern();
        templateMethodPattern();
        factoryMethodPattern();
        singletonPattern();
        prototypePattern();
    }

    public static void printTitle(String title) {
        System.out.println("============================= " + title + " =============================");
    }

    public static void iteratorPattern() {
        printTitle("Iterator Pattern");
        BookShelfIteratorPatternTest.run();

        printTitle("Iterator Pattern Using ArrayList");
        BookShelfIteratorPatternArrayList.run();
    }

    public static void adapterPattern() {
        printTitle("Adapter Pattern Inheritance");
        AdapterInheritanceTest.run();

        printTitle("Adapter Pattern Delegation");
        AdapterDelegationTest.run();

        printTitle("Adapter Pattern FileIO Example");
        AdapterExampleTest.run();
    }

    public static void templateMethodPattern() {
        printTitle("Template Method Pattern");
        TemplateMethodTest.run();
    }

    public static void factoryMethodPattern() {
        printTitle("Factory Method Pattern");
        FactoryMethodTest.run();
    }

    public static void singletonPattern() {
        printTitle("Singleton Pattern");
        SingletonTest.run();
    }

    public static void prototypePattern() {
        printTitle("Prototype Pattern");
        PrototypeTest.run();
    }
}