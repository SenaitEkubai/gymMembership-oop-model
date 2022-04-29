package com.company;

public class Main {
    static Member member = new Member();


    public static void main(String[] args) {
       /* System.out.println(member.getAddress().getStreetName());
        System.out.println(member.getAddress().houseNumber);
        System.out.println(member.getContact().getEmail());
        System.out.println(member.getContact().getWorkPhone());
        */

        System.out.println("full name : " + member.getPerson().getFullName());
        System.out.println("date of birth: " + member.getPerson().getDateOfBirth());
        System.out.println("is an existing member : " + member.isExisting());
        System.out.println(member.isAStudent());
        System.out.println(member.getPayment());
    }
}
