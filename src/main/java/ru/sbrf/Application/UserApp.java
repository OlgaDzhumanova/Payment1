package ru.sbrf.Application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserApp {
    private float amount;
    private String phoneNumber;
    private String currency;

    public UserApp() {
    }

    public float inAmount(float amount) {
        this.amount = amount;
        return amount;
    }
    public String inPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }

    public String inCurrency( String currency) {
        this.currency = currency;
        return currency;
    }

        public enum Curr {
            EUR(978),
            RUB(810),
            USD(840);
            private int code;

            Curr(int code){
                this.code = code;
            }

            public int getCode(){
                return code;
            }
        }
    }
