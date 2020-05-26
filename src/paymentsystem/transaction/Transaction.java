
package paymentsystem.transaction;

import paymentsystem.bank.account.NormalAccount;
import paymentsystem.bank.framework.Account;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class Transaction {
    // 목적
    // transaction 의 구현
    // begin() ~ commit() 까지  register 를 통한 method 실행

    // register 의 인자로 실행하고자 하는 객체와 똑같은 객체를 생성하여 먼저 그 행동을 실행한다.
    // Register 한 Method 가 실패 시 (exception) 저장되어 있는 객체를 다시 복구

    // 그리고 모든 등록한 메소드가 잘 실행되고 commit 메소드가 실행되면, 기존 객체에 메소드가 실행된 객체를 덮어씌운다.
    // .. 될까?


    public Transaction() {
    }

    public void begin() {

    }
    public void commit() {

    }

    public void register(Class className, Object object, String methodName, String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(object.getClass());
    }
}

