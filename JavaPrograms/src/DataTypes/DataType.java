package DataTypes;

public class DataType {

 public static void main(String[] args) {
	 
boolean stdPass = true;        // conditional data type only TRUE or FALSE	 
byte stdMaxMarks = 100;        //values from -128 to 127 instead of int to save memory
short stdTotalMarks = 900;     // values from -32768 to 32767
int stdRollName = 332767889;   // greater than short value
long stdMobileNumber = 8483858395l; // L is mandatory when declaring Long
double stdAvgMarks  = 18.84838583; // use for fractional number maximum 15 digits (after point)
float stdPercentage = 85.84F; // F is mandatory 
char stdGrade = 'B';

System.out.println(stdPass);
System.out.println(stdMaxMarks);
System.out.println(stdTotalMarks);
System.out.println(stdRollName);
System.out.println(stdMobileNumber);
System.out.println(stdAvgMarks);
System.out.println(stdPercentage);
System.out.println(stdGrade);







 }
 
}
