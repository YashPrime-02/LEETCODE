class ParkingSystem {
    int big,med,small;
    public ParkingSystem(int big, int medium, int small) {
        this.big=big;
        med=medium;
        this.small=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && big>0){
            big--;
            return true;
        }
        else if(carType==2 && med>0){
            med--;
            return true;
        }
        else if(carType==3 && small>0){
            small--;
            return true;
        }
        return false;
    }
}