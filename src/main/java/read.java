import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public  class read {
    List<String > datatypes = new ArrayList<>();
    List<String>  objects  = new ArrayList<>();
    List<String> methods  = new ArrayList<>();
    Map<String,List<String>> methodmap = new HashMap<>();

    Map<String,List<String>> objmap = new HashMap<>();
    Map<String,String> methodreturn = new HashMap<>();
    public   read() {
        try {

            File file = new File("/Users/shriraamreddyb/IdeaProjects/datatype/src/main/java/def");
            Scanner fileread = new Scanner(file);
            String type = "";
            while (fileread.hasNextLine()) {

                String data = fileread.nextLine();

                //StringTokenizer st = new StringTokenizer(data, ":");
                String[] tokens = data.split("\\s+", -1);

                if (tokens[0].equals("datatype")) {
                    objects = new ArrayList<>();
                    methods = new ArrayList<>();
                    this.datatypes.add(tokens[2]);
                    type = tokens[2];
                }
                if (tokens[0].equals("obj")) {
//                    System.out.println(tokens[2]);
//                    System.out.println(type);

                    objects.add(tokens[2]);
                }
                if (tokens[0].equals("method")) {

                    methods.add(tokens[2]);
                    this.methodreturn.put(tokens[2], tokens[3]);
                }
                if(tokens[0].equals("}")){
                    if(!objects.isEmpty()){

                        this.objmap.put(type, objects);

                       // System.out.println(objmap);

                    }

                    if(!methods.isEmpty()){

                        this.methodmap.put(type, methods);
                       // System.out.println(methodmap);

                    }
                }
            }


            //System.out.println(objmap);
        }
        catch(FileNotFoundException e){
            System.out.println("filenotfound");
        }

}
    public List<String> getdata(){

        return datatypes;
    }
    public Map<String,List<String>> getobj(){
      //  System.out.println(objmap);
        return objmap;
    }

    public Map<String,List<String>> getmethod(){
       // System.out.println(methodmap);
        return methodmap;
    }
    public Map<String,String> getmethodreturn(){

        return methodreturn;
    }

}
