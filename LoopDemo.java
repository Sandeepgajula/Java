class LoopDemo{  
    static void change(int arr[],int i,int v)
    {
        arr[i]=v;    }
    static void c(int x,int l){

        x=l;
    }
    public static void main(String[] args){   
            int arr[]={12,13,14,44};   
             change(arr,2,5);
            for(int i:arr){   // Line 1
                System.out.println(i);   
            }   
            int x=10;
            c(x,5);
            System.out.println(x);

     }
    }