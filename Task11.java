import java.util.Scanner;
public class Task11{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float k=0,hig=0;
        int index=0;
        String []stn=new String[100];
        int []rl=new int[100];
        float []math=new float[100];
        float []sci=new float[100];
        float []eng=new float[100];
        float []lang=new float[100];
        float []ss=new float[100];
        System.out.println("The number of students");
        int n=obj.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("Enter the student name");
        stn[i]=obj.next();
        System.out.println("Enter the his/her Roll NUmber");
        rl[i]=obj.nextInt();
        System.out.println("Enter the his/her Marks in math");
        math[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Science");
        sci[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in English");
        eng[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Language");
        lang[i]=obj.nextFloat();
        System.out.println("Enter the his/her Marks in Social Studies");
        ss[i]=obj.nextFloat();
        } 
        System.out.println("Studentname");
        for(int j=0;j<n;j++){
         k=(math[j]+sci[j]+eng[j]+lang[j]+ss[j]);
         System.out.println(stn[j]+"\t\t\t"+k+" (Total marks)");
         if(j==0)
          hig=k;
         if(k>hig){
          hig=k;
          index=j;
         }
        }
        System.out.println("\nTopper name");
        System.out.println(stn[index]+"\t\t\t"+rl[index]+" (Roll No.)");
        System.out.println("\nAverage marks in each subject of the students:");
         for(int i=0;i<n-1;i++){
         math[i+1]=math[i]+math[i+1];
         if(i==n-2){
         float avg=+math[n-1]/n;
         System.out.println("\nAverage marks in math "+avg);
         }
         }
         for(int i=0;i<n-1;i++){
         sci[i+1]=sci[i]+sci[i+1];
         if(i==n-2){
         float avg=+sci[n-1]/n;
         System.out.println("\nAverage marks in science "+avg);
         }
         }
         for(int i=0;i<n-1;i++){
         eng[i+1]=eng[i]+eng[i+1];
         if(i==n-2){
         float avg=+eng[n-1]/n;
         System.out.println("\nAverage marks in english "+avg);
         }
         }
         for(int i=0;i<n-1;i++){
         lang[i+1]=lang[i]+lang[i+1];
         if(i==n-2){
         float avg=+lang[n-1]/n;
         System.out.println("\nAverage marks in language "+avg);
         }
         }
         for(int i=0;i<n-1;i++){
         ss[i+1]=ss[i]+ss[i+1];
         if(i==n-2){
         float avg=+ss[n-1]/n;
         System.out.println("\nAverage marks in social studies "+avg);
         }
         }
      }
    }
