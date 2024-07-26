import java.util.*;
class sq{
    Scanner sc=new Scanner(System.in);
    double a,b;
    sq() {
        System.out.println("enter the side of square:-");
        a=sc.nextDouble();
        b=a*a;
        System.out.println("area of the square is:-"+b);
    }
}
class rect extends sq {
    double c,l,b;
        rect() {
        System.out.println("enter the length and breadth of rectangle:-");
        l=sc.nextDouble();
        b=sc.nextDouble();
        c=2*(l+b);
        System.out.println("area of the rectangle is:-"+c);
    }
}
class cir extends rect {
    double e,d,r,pi;
    cir() {
        System.out.println("enter the radius of the circle:-");
        pi=3.141;
        r=sc.nextDouble();
        e=pi*r*r;
        System.out.println("area of the circular is:-"+e);
    }
}
class tri extends cir {
    double ba,hi,f;
    tri() {
        System.out.println("enter the base and height of triangle:-");
        ba=sc.nextDouble();
        hi=sc.nextDouble();
        f=0.5*ba*hi;
        System.out.println("area of the triangle is:-"+f);
    }
}
class area{
    public static void main(String[] args) {
        tri ob=new tri();
    }
}
// repo cloning