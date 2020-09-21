class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }


    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null){
            this.firstName = firstName;
        }else {
            this.firstName = "";
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null){
            this.lastName = lastName;
        }else {
            this.lastName = "";
        }
    }

    public String getFullName() {
        if (this.firstName == null && this.lastName == null) {
            return "Unknown";
        }else if (this.firstName == null){
            return this.lastName;
        }else if (this.lastName == null){
            return this.firstName;
        }else {
            return this.firstName + " " + this.lastName;
        }
    }
}