package com.cse2214.eldorado;

//Contribution
//Badrul
//2012020216

public class FrontPage
{
    void frontPage()
    {
        System.out.print("\033[H\033[2J");

        int menu;

        LogoAndUI showlogo = new LogoAndUI();
        showlogo.logo();

        System.out.println("\n\n\t\t\t\t\t\t\t         A Project by ElDorado");
        System.out.println("\t\t\t\t\t\t        Supervised By \033[3mAdil Ahmed Chowdhury Sir\033[0m");
        System.out.println("\t\t\t\t\t\t\t       Lecturer, Dept of CSE, LU");

        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.println("\t\t\t\t\t\t|               1. User Login                        |");
        System.out.println("\t\t\t\t\t\t|               2. New User Registraion              |");
        System.out.println("\t\t\t\t\t\t|               3. Emergency Helplines               |");
        System.out.println("\t\t\t\t\t\t|               4. SHUT DOWN                         |");
        System.out.println("\t\t\t\t\t\t|               5. About Developers                  |");
        System.out.println("\t\t\t\t\t\t|               6. ADMINISTRATION                    |");
        System.out.println("\t\t\t\t\t\t|               7. Exit                              |");
        System.out.println("\t\t\t\t\t\t******************************************************");
        System.out.print("\n\t\t\t\t\t\t\t Enter Your choice: ");
        
        

 

    
    }
    
}
