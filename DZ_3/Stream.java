package DZ_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<Group>, Comparable<Stream>{
    private ArrayList<Group> groups;
    private Integer size;
    public Stream(ArrayList<Group> groups){
        this.groups = groups;
        this.size = this.groups.size();
    }
    public ArrayList<Group> getGroups() {
        return groups;
    }
    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
    public Integer getSize() {
        return size;
    }

    @Override
    public Iterator<Group> iterator() {
        return new StreamIterator(groups);
    }

    @Override
    public int compareTo(Stream stream) {
        // String s1 = "0" + this.size;
        // String s2 = "0" + stream.size;
        return this.size.compareTo(stream.getSize());
    }
    
}
