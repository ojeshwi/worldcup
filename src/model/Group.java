package model;

    public class Group {
        String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public Group(String name) {
            this.name = name;
        }
        public void printFormat() {
            System.out.println("Group");
            System.out.println(this.name );
        }

    }


