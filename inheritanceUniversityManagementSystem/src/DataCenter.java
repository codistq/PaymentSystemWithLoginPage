public class DataCenter {
    int password;
    int id;
/*
NAME --> |TOMMY SHELBY  | ARTHUR SHELBY | JOHN SHELBY
ID --->  |111           | 222           | 333
PASSWORD>|444           | 555           | 666
 */

    DataCenter(int id){
        this.id = id;

    }
    public int info(int id){
        if(id == 111){
            //this.name="Tommy Shelby";
            return id;
        }else if (id ==222){
            //this.name="Arthur Shelby";
            return id;
        }else if (id ==333){
            //this.name="John Shelby";
            return id;
        }

        return 0;
    }
    public int checkPass(int id){
        if(id ==111){
            password=444;
            return password;
        } else if (id==222) {
            password=555;
            return password;
        } else if (id==333) {
            password=666;
            return password;
        }
          return 0;
        }
        public String getName(int id){
        if(id==111){
            return "MR.Tommy Shelby";
        } else if (id ==222) {
            return "MR.Arthur Shelby";
        } else if (id==333) {
            return "MR.John Shelby";
        }

            return null;
        }

        public int debt(int id){
        if(id==111){
            return 450;
        } else if (id==222) {
            return 645;

        } else if (id==333) {
            return 870;

        }
        return 0;
        }

}
