package com.nk.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {
    private List<Lesson> lessons;
    private Map<String,Teacher> teacherMap;
    private String sid;
    private String sname;

    public void run(){
        System.out.println("学生编号："+sid+"    学生姓名："+sname);
        System.out.println(teacherMap);
        System.out.println(lessons);
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherMap=" + teacherMap +
                ", sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
