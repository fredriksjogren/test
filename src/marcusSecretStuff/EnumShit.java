package marcusSecretStuff;

public enum EnumShit {
        MARCUS("Aronsson"),
        AUGUST("Axelsson"),
        OSKAR("Lundberg");

        private final String lastName;

        private EnumShit(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName(){
            return this.lastName;
        }

        public void getAllNames(){
            for(EnumShit currentEnum: EnumShit.values()){
                System.out.println(currentEnum.getLastName());
            }
        }







}
