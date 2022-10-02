public class QuickSort
    { public static void main(String[] args)
        { int i,n;
          int []arr= {123,2,34,213,123,32};
          n=arr.length;
          quickSort(arr,0,n-1);
          System.out.print("Array after sorting:");
          for(i=0;i<n-1;i++)
          System.out.print(arr[i]+" ");
        }
    public static int partition(int a[],int beg,int end)
    { int left, right,temp,loc,flag;
      loc=left=beg;
      right=end;
      flag=0;
      while(flag!=1)
      { while((a[loc]<=a[right])&&(loc!=right))
        right--;
        if(loc==right)
        flag=1;
        else if(a[loc]>a[right])
        { temp=a[loc];
          a[loc]=a[right];
          a[right]=temp;
          loc=right;
        }
        if(flag!=1)
        { while((a[loc]>=a[left])&&(loc!=left))
          left++;
          if(loc==left)
          flag=1;
          else if(a[loc]<a[left])
          { temp=a[loc];
            a[loc]=a[left];
            a[left]=temp;
            loc=left;
          }
        }
      }
      return loc;
    }
static void quickSort(int a[], int beg, int end)
{ int loc;
  if(beg<end)
  { loc=partition(a,beg,end);
    quickSort(a,beg,loc-1);
    quickSort(a,loc+1,end);
  }
}
}
