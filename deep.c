# include <stdio.h>
Display(int Arr[],int isize)
{
    int icnt=0;
   
    while(icnt<isize)
    {
        if((Arr[icnt])%2==0)
        {
            printf(Arr(icnt));
        }
        icnt++;
    }
}
int main()
{
    int Arr[]=[10,20,30,40,50];
    int isize=5;
    Display(Arr,isize);
    return 0;
}