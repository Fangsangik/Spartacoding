package NewProject;

public class Person {
    private String name;
        private String address;
        private String job;
        private int age;


        public void setName(String name){
            this.name = name;
        }
        public void setAddress(String address){
            this.address = address;
        }
        public void setJob(String job){
            this.job=job;
        }
        public void setAge(int age){
            this.age=age;
        }

        public String getName(){
            return this.name;
        }
        public String getAddress(){
            return this.address;
        }
        public String getJob(){
            return this.job;
        }
        public int getAge(){
            return this.age;
        }


    }


