import java.util.Scanner;
public class Automarpic{
public static void Automarpic(int n){
int squere=n*n;
int temp=n;
int digit=0;
while(temp>0){
digit++;
temp=temp/10;
}
int power=1;
for(int i=1;i<=digit;i++){
power=power*10;
}
if(squere%power==n){
System.out.println("automorpic");
}
else{
System.out.println("Not");
}
}
public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
Automarpic(n);
}
}