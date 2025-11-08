package ouss.issib.services;

public class ServiceImpl implements IService{
    @Override
    public double compute(int t) {
        return Math.cos(t * Math.PI/180 + Math.sqrt(t));
    }
}
