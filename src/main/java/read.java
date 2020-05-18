import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public  class read {
    List<String > datatypes = new ArrayList<>();
    List<String>  objects  = new ArrayList<>();
    List<String> methods  = new ArrayList<>();
    HashMap<String,List<String>> methodmap = new HashMap<>();
    HashMap<String,List<String>> objmap = new HashMap<>();
    HashMap<String,String> methodreturn = new HashMap<>();
    public  read() {
        try {
            File file = new File("/Users/shriraamreddyb/IdeaProjects/datatype/src/main/java/def");
            Scanner fileread = new Scanner(file);
            String type = "";
            while (fileread.hasNextLine()) {

                String data = fileread.nextLine();

                //StringTokenizer st = new StringTokenizer(data, ":");
                String[] tokens = data.split("\\s+", -1);

                if (tokens[0].equals("datatype")) {
                    this.datatypes.add(tokens[2]);
                    type = tokens[2];
                }
                if (tokens[0].equals("obj")) {
//                    System.out.println(tokens[2]);
//                    System.out.println(type);
                    this.objects.add(tokens[2]);
                }
                if (tokens[0].equals("method")) {
                    this.methods.add(tokens[2]);
                    this.methodreturn.put(tokens[2], tokens[3]);
                }
            }
            this.objmap.put(type, objects);
            this.methodmap.put(type, methods);
            //System.out.println(objmap);
        }
        catch(FileNotFoundException e){
            System.out.println("filenotfound");
        }

}
    public List<String> getdata(){

        return datatypes;
    }
    public HashMap<String,List<String>> getObj(){

        return objmap;
    }

    public HashMap<String,List<String>> getmethod(){

        return methodmap;
    }
    public HashMap<String,String> getmethodreturn(){

        return methodreturn;
    }

}
