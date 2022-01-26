class ADDMATRIX
{  
    public static void main(String args[])
    {     
        int i,j;
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};      
        int c[][]=new int[3][3];
        System.out.println("ADDITION OF MATRIX:");
        for(i=0;i<3;i++)
        {    
            for(j=0;j<3;j++)
            {    
                c[i][j]=0; 
                c[i][j]=a[i][j]+b[i][j];     
                System.out.print(c[i][j]+" "); 
            }  
            System.out.println("\t");    
        }    
    }
} 