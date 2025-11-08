package ouss.issib.proxy;

import ouss.issib.services.IService;
import ouss.issib.services.ServiceImpl;

public class SecuredProxy implements IService {
    private IService target;
    private String password;

    @Override
    public double compute(int t) {
        if(password.equals("1234")){
            return target.compute(t);
        }
        else {
         throw new RuntimeException("Unauthorized access");
        }
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setTarget(IService target){
        this.target = target;
    }


}
