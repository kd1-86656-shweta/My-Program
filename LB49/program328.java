import java.util.*;
import java.io.*;
class program328
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the Name of packed file which you want to unpack: ");
        string PackedFile=sobj.nextline();
        FileInputStream fiobj= new FileInputStream(fobj);
        byte Header[]=new byte[100];
        fiobj.read(Header,0,100);
        String Hstr=new String(Header);
        System.out.println(Hstr);
        System.out.println(Hstr);
        System.out.println("Length of Header string is: "+Hstr.length());
        String str=
    }
}