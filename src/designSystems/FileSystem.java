package designSystems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FileSystem {
    class Dir{
        HashMap<String, Dir> dirs = new  HashMap<String, Dir>();
        HashMap<String, String> files = new  HashMap<String, String>();       
    }
    
    Dir root;
    public FileSystem() {
        root = new Dir();
    }
    
    public List<String> ls(String path) {
        Dir t = root;
        List<String> files = new ArrayList<String>();
            if (!path.equals("/")) {
                String[] d = path.split("/");
            for (int i = 1; i < d.length - 1; i++) {
                t = t.dirs.get(d[i]);
            }
            if (t.files.containsKey(d[d.length - 1])) {
                files.add(d[d.length - 1]);
                return files;
            } else {
                t = t.dirs.get(d[d.length - 1]);
            }
        }
        files.addAll(new ArrayList < > (t.dirs.keySet()));
        files.addAll(new ArrayList < > (t.files.keySet()));
        Collections.sort(files);
        return files;
    }
    
    public void mkdir(String path) {
         String[] d = path.split("/");
         Dir t = root;
         for (int i = 0; i < d.length; i++) {
               Dir newDir = new Dir();
            if(!t.dirs.containsKey(d[i])){
                t.dirs.put(d[i], newDir);
             }
           t = t.dirs.get(d[i]);
        }
        
    }
    
    public void addContentToFile(String filePath, String content) {
        String[] d = filePath.split("/");
         Dir t = root;
           for (int i = 1; i < d.length - 1; i++) {
            if(!t.dirs.containsKey(d[i])){
                t = t.dirs.get(d[i]);
             }
            }
        t.files.put(d[d.length - 1], t.files.getOrDefault(d[d.length - 1], "") + content);
    }

    public String readContentFromFile(String filePath) {
        Dir t = root;
        String[] d = filePath.split("/");
        for (int i = 1; i < d.length - 1; i++) {
            t = t.dirs.get(d[i]);
        }
        return t.files.get(d[d.length - 1]);
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */