package geek.leetcode.week02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode-cn.com/problems/subdomain-visit-count/
public class Cpdomain {
    HashMap<String,Long> kv = new HashMap<String,Long>();
    public List<String> subdomainVisits(String[] cpdomains) {
        for (String domain:cpdomains) {
            String[] parse1 = domain.split(" ");
            int time = Integer.valueOf(parse1[0]);
            add(parse1[1],time);
            for (;;){
                int start = parse1[1].indexOf('.');
                String a = parse1[1].substring(start+1);
                if (a.equals(parse1[1])) {
                    break;
                }
                add(a,time);
                parse1[1] = a;
            }
        }
        ArrayList<String> res = new ArrayList<String>();
        for (String s : kv.keySet()) {
            res.add(kv.get(s)+" "+s);
        }
        return res;
    }
    private void add(String a,int time) {
        Long v = kv.get(a);
        if ( null == v) {
            kv.put(a,Long.valueOf(time));
        }else {
            kv.put(a,v+time);
        }
    }
}
