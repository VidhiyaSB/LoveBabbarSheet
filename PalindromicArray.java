class GfG
{
	public static int palinArray(int[] a, int n)
           {
                for(int i=0;i<n;i++){
                    int rev =0;
                    int digit =0;
                    int e = a[i];
                        while(e>0){
                        digit = e%10;
                         rev = rev *10 + digit;
                         e = e/10;
                        }
                        if(rev!=a[i]){
                            return 0 ;
                        }
                        
                }
                return 1 ;
}
}
