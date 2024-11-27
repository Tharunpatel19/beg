public class prime{
public static void main(string[] args){
int num=100;
boolean isprime=true;
for(int i=2;i<=num/2;i++)
{
if(num%i==0){
isprime =flase;
break;
}
}
if(isprime){
system.out.println(num+"is a prime number");
}
else{
system.out.println(num+"is not prime");
}
}
}
