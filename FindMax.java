void main(){
    IO.println("Find Max");
    int a = 100;
    int b = 555;
    int c = 25;
    int max = 0;
    if((a>b) && (a>c)){
        max = a;
        IO.print("Max : "+max);
    } else {
        if((b>a) && (b>c)){
            max = b;
            IO.print("Max : "+max);
        }else {
            max = c;
            IO.print("Max : "+max);
        }
    }


}