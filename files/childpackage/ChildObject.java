package org.example.childpackage;

import org.example.DefaultObject;

public class ChildObject {
    public static void main(String[] args){
    DefaultObject dob= new DefaultObject();
    dob.defaultmethod();
    dob.privatemethod();
    dob.publicmethod();
    dob.protectedmethod();
    }
}
