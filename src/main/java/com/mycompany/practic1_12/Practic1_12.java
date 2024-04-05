/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practic1_12;
import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author Erm
 */
public class Practic1_12 {

     public static void main(String[] args) {
        System.out.println("Практическая работа 1.12 Ермошин РИБО-03-22");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String filePath = scanner.nextLine(); 
        File file = new File(filePath);
        
        if (file.exists()) {
            try (
                FileInputStream fis=new FileInputStream(filePath);
                ObjectInputStream ois=new ObjectInputStream(fis);){          
            
                Message message = (Message) ois.readObject();
                System.out.println(message.toString());                
                ois.close();
                System.out.println(message.toString());
             }     
            catch (Exception e) {
                System.out.println("Произошла ошибка");
             }
         }
        else{            
            System.out.println("Файл не найден.");            
        }
    }
}
