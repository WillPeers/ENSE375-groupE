package com.uregina.app;
import com.uregina.exception.*;
import java.util.ArrayList;

public class PatientHistogram 
{
	private int[][] patientCount;
    	public PatientHistogram() 
    	{
			//CHANGE
			this.patientCount = new int [20][10];
    	}
    	/**
	*
	* @return boolean: true if the a patient can be added from that region 
	*/
    	public boolean addAPatientToRegion(int VIndex,int HIndex)
    	{
			if (this.patientCount[VIndex][HIndex] == 0)
				return true;
    		
    		return false;
    	}
	/**
	*
	* @return boolean: true if the a patient can be removed from that region 
	*/
    	public boolean deleteAPatientFromRegion(int VIndex,int HIndex)
    	{
			if (this.patientCount[VIndex][HIndex] > 0)
				return true;
    		
    		return false;
    	}
    	public int getPatientsCountInRegion(int VIndex,int HIndex) throws IndexOutOfBoundsException
    	{
    		return this.patientCount[VIndex][HIndex];
    	}
}
