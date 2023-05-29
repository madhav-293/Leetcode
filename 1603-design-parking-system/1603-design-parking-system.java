class ParkingSystem {
    public int big1,medium1,small1;
    public ParkingSystem(int big, int medium, int small) {
        big1=big;
        medium1=medium;
        small1=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(big1==0)
                return false;
            big1--;
        }
        if(carType==2){
            if(medium1==0)
                return false;
            medium1--;
        }
        if(carType==3){
            if(small1==0)
                return false;
            small1--;
        }
        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */