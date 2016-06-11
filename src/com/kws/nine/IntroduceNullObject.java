package com.kws.nine;

/**
 * Created by jihoon on 2016. 6. 11..
 * null 검사를 널객체에 위임
 */
public class IntroduceNullObject {
    /*
    if(customer == null) {
        plan = BillingPlan.basic();
    }else {
        plan = customer.getPlan();
    }
    */

    //예제
    class site {
        Customer _customer;

        Customer getCustomer() {
            return _customer;
        }
    }

    class Customer {
        String name;
        String plan;
        String history;

        public String getName() {
            return this.getName();
        }

        public String getPlan() {
            return this.getPlan();
        }

        public String getHistory() {
            return getHistory();
        }
    }


    class PayMentHistory {
        int getWeekDelinquentInLastYear() {
            return 0;
        };
    }

}
