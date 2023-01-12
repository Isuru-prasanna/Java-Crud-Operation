/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author USER
 */
public class SubjectDetails {
    private String st_id;
    private String st_name;
    private String sub1;
    private String sub2;
    private String sub3;

    public SubjectDetails(String st_id, String st_name, String sub1, String sub2, String sub3) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public String getSub3() {
        return sub3;
    }

    public void setSub3(String sub3) {
        this.sub3 = sub3;
    }

    public String getSt_id() {
        return st_id;
    }

    public void setSt_id(String st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSub1() {
        return sub1;
    }

    public void setSub1(String sub1) {
        this.sub1 = sub1;
    }

    public String getSub2() {
        return sub2;
    }

    public void setSub2(String sub2) {
        this.sub2 = sub2;
    }
}

// mysql -u root -p
// show databases;
// use db_name;
// show tables;
/* SELECT a.ID, a.Name, b.sub_1, b.sub_2, b.sub_3 FROM `2nd db_table` b INNER JOIN `1st db_table` a ON a.ID = b.st_id;
*/
