public class StackUsingArray {
   
    private int[] arr;
    private int size=0;
    private int top=-1;
    
    StackUsingArray(int size)
    {
        this.size=size;
        arr=new int[size];
    }
    public void push(int no)
    {
        if(top==size-1)
        {
           throw new Error("Index out of Bound");
        }
        arr[++top]=no;
        
    }
    public void pop()
    {
        if(top==-1)
        {
            throw new Error("No element Present in the Erray");
        }
        top--;

    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            return ;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);

        }
    }
    public int peek()
    {
        if(top==-1)
        {
            return -1;
        }
        return arr[top];
    }
    public int length()
    {
        return top+1;
    }


    public static void main(String args[]) {
        StackUsingArray m=new StackUsingArray(2);
        m.push(2);
        m.push(3);
        // m.pop();
        m.display();
        System.out.println(m.peek());
        System.out.println(m.length());
    }

}
