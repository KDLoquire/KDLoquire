class BloodData {
	private String bloodType;
	private String rhFactor;
	
	public BloodData() {
    	bloodType="O";
    	rhFactor="+";
    }
	
    public void setBloodType(String bloodType) {
    	this.bloodType=bloodType;
    }
    public String getBloodType(){
    	return bloodType;
    }
    public void setRhFactor(String rhFactor){
    	this.rhFactor=rhFactor;
    }
    public String getRhFactor(){
    	return rhFactor;
    }
    public void display(){
    	System.out.print(getBloodType()+getRhFactor()+" is added to the blood bank.");
    }
    
}