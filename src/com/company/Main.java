package com.company;
import com.company.Doctor.Doctor;
import com.company.Doctor.DoctorsMenu;
import com.company.Patient.Patient;
import com.company.PatientMenu.PatientMenu;

import java.util.Date;


public class Main {

    public static void main(String[] args) {
//        DoctorsMenu.showMenu();
//        PatientMenu.showPatientMenu();
        Doctor myDoctor = new Doctor("Esteban Gomez", "plastic");
        myDoctor.showName();
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6pm");
        myDoctor.addAvailableAppointment(new Date(), "8pm");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + " " + availableAppointment.getTime());
        }

        Patient myPatient = new Patient("Pablo", "picaPiedra@mail.com");

    }
}



//
//        int[] arrDesordenado = {2,2,5,6,7,4,3,1,2,4};
//        Arrays.sort(arrDesordenado);
//        System.out.println(Arrays.toString(arrDesordenado) + " Array with sort");
//
//        for(int i = 0; i < arrDesordenado.length; i++){
//            for (int j = 1; j < (arrDesordenado.length-i); j++){
//                if(arrDesordenado[j - 1] > arrDesordenado[j]){
//                    int temp = arrDesordenado[j-1];
//                    arrDesordenado[j-1] = arrDesordenado[j];
//                    arrDesordenado[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arrDesordenado) + " Arr with for ");
