package ouss.issib.proxy;

import ouss.issib.services.IService;
import ouss.issib.services.ServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ProxyCache  implements IService {
    private ServiceImpl service = new ServiceImpl() ;
    private Map<Integer,Double> cache = new HashMap<>();

    @Override
    public double compute(int t) {
        if(cache.containsKey(t)){
            return cache.get(t);
        }
        else {
            double result = service.compute(t);
            cache.put(t,result);
            return result;
        }
    }
}
