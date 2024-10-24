#include<stdio.h>
#define max 15
int arr[max];
void create(int data,int index){
    if(index>=max){
        return;
    }
    else{
        if(arr[index]==0){
            arr[index]=data;
            
        }
        else if(data<arr[index]){
            create(data,(2*index)+1);
        }
        else{
            create(data,(2*index)+2);
        }

    }
}
void create1(int data){
    create(data,0);
}

void print(){
    for (int i = 0; i < max; i++)
    {
        /* code */
        printf("%d ",arr[i]);
    }
    
}

int main(){
    create1(10);
    create1(5);
    create1(20);
    create1(15);
    create1(3);
    create1(7);
    create1(12);
    create1(25);
    print();
    return 0;
}