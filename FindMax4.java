void main(){
    int a = 10;
    int b = 555;
    int c = 25;
    if((a>b) && (a>c)){
        IO.print("A");
    } else {
        if((b>a) && (b>c)){
            IO.print("B");
        }else {

            IO.print("C");
        }
    }
}