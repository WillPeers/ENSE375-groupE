package com.uregina.app;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.uregina.exception.InvalidAgeException;
import com.uregina.exception.InvalidIDException;
import com.uregina.exception.InvalidNameException;
import com.uregina.exception.InvalidPostalCodeException;
import org.junit.Test;

public class addPatientTest 
{ 
    @Test
    public void Validate_addPatient_True() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {   
        String Name = "John John";
        String ID = "2438790";
        int Age = 24;
        String CodePostal = "254-980";
        PostalCode postalcode;
        postalcode = new PostalCode(CodePostal);
        Patient patienttest = new Patient(Name, ID,Age, postalcode);
        PatientList addpatient = new PatientList();
        boolean Legaladdpatient = addpatient.addPatient(patienttest);
        if ((Name != "") && (ID != "") && (Age != 0) && (CodePostal != ""))
        {
            assertTrue(Legaladdpatient);      
        }
        else
        {
            Legaladdpatient = false;
            assertTrue(Legaladdpatient);
        }
    }

    @Test
    public void Validate_addPatientEmptyStringName_False() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {   
        String Name = "";
        String ID = "2438790";
        int Age = 24;
        String CodePostal = "254-980";
        PostalCode postalcode;
        postalcode = new PostalCode(CodePostal);
        Patient patienttest = new Patient(Name, ID,Age, postalcode);
        PatientList addpatient = new PatientList();
        boolean Legaladdpatient = addpatient.addPatient(patienttest);
        if ((Name != "") && (ID != "") && (Age != 0) && (CodePostal != ""))
        {
            assertFalse(Legaladdpatient);      
        }
        else
        {
            Legaladdpatient = false;
            assertFalse(Legaladdpatient);
        }
    }

    @Test
    public void Validate_addPatientEmptyStringID_False() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {   
        String Name = "John John";
        String ID = "";
        int Age = 24;
        String CodePostal = "254-980";
        PostalCode postalcode;
        postalcode = new PostalCode(CodePostal);
        Patient patienttest = new Patient(Name, ID,Age, postalcode);
        PatientList addpatient = new PatientList();
        boolean Legaladdpatient = addpatient.addPatient(patienttest);
        boolean Illegaladdpatient = false;
        if ((Name != "") && (ID != "") && (Age != 0) && (CodePostal != ""))
        {
            assertFalse(Legaladdpatient);      
        }
        else
        {
            Legaladdpatient = Illegaladdpatient;
            assertFalse(Legaladdpatient);
        }
    }

    @Test
    public void Validate_addPatientZeroAge_False() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {   
        String Name = "John John";
        String ID = "2438790";
        int Age = 0;
        String CodePostal = "254-980";
        PostalCode postalcode;
        postalcode = new PostalCode(CodePostal);
        Patient patienttest = new Patient(Name, ID,Age, postalcode);
        PatientList addpatient = new PatientList();
        boolean Legaladdpatient = addpatient.addPatient(patienttest);
        boolean Illegaladdpatient = false;
        if ((Name != "") && (ID != "") && (Age != 0) && (CodePostal != ""))
        {
            assertFalse(Legaladdpatient);      
        }
        else
        {
            Legaladdpatient = Illegaladdpatient;
            assertFalse(Legaladdpatient);
        }
    }

    @Test
    public void Validate_addPatientEmptyString_False() throws InvalidNameException, InvalidAgeException, InvalidIDException, InvalidPostalCodeException
    {   
        String Name = "John John";
        String ID = "2438790";
        int Age = 24;
        String CodePostal = "";
        PostalCode postalcode;
        postalcode = new PostalCode(CodePostal);
        Patient patienttest = new Patient(Name, ID,Age, postalcode);
        PatientList addpatient = new PatientList();
        boolean Legaladdpatient = addpatient.addPatient(patienttest);
        boolean Illegaladdpatient = false;
        if ((Name != "") && (ID != "") && (Age != 0) && (CodePostal != ""))
        {
            assertFalse(Legaladdpatient);      
        }
        else
        {
            Legaladdpatient = Illegaladdpatient;
            assertFalse(Legaladdpatient);
        }
    }
}

