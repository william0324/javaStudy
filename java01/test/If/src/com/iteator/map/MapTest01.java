package com.iteator.map;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        System.out.println(map.get(2));
        System.out.println(map.size());
        //equals实现
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("张三"));
        //获取所有valus
        Collection<String> values = map.values();
        for(String s : values) {
            System.out.print(s);
        }
        System.out.println();
        /*map遍历*/
        map.put(4,"1213");
        //1.获取所有的key，遍历key，来遍历value
        Set<Integer> keys = map.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        for (Integer key : keys) {
            System.out.println(key + "=" +map.get(key));
        }
        //2.Set<Map.Entry<K,V>> entrySet(),建议使用这种方式，效率高
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it1 = set.iterator();
        while (it1.hasNext()) {
            Map.Entry<Integer,String> node = it1.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }

        for (Map.Entry<Integer,String> node : set) {
            System.out.println(node.getKey() + "-->" + node.getValue());
        }
    }
}
