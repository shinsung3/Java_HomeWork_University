package Part1;

public class DesignRecipeExamples {
    int perimeter (int width, int height) {
        return (width*2) + (height*2);
    }

    int p1=this.perimeter (15,10); // (15*2)+(10*2)=50
    int p2=this.perimeter (10,8); // (10*2)+(8*2)=36

    int borderArea (int width, int height, int width1, int height2) {
        return ((width*height)-((width1)*(height2)));
    }
    int b1= this.borderArea(20,15,14,11); // ((20*15)-((24)*(11))=146
    int b2= this.borderArea(16,10,10,6); // ((16*10)-((10)*(6))=100

    int weight (int pounds) {
        // I converted pounds to kilogram using this equation using formula (x pounds * 0.454= y kg)
        return pounds * (22/10);  
    }     
    
    int w1=this.weight (125); // 125/ (22/10) =56.8 
    int w2=this.weight (200); // 200 / (22/10)=90.9

    int hourtomin (int hour, int min) { 
        // it converts hours to minutes and combines all minutes. My reference is l hour = 60 min
        return ((hour*60)+min); 
    }

    int hm1=this.hourtomin (1,30); //(1*60)+30 =90
    int hm2=this.hourtomin (2,45);// (2*60)+45=165
    // since int can only account the number before 2147483647, it can not calculate the number above it
    int hm3=this.hourtomin (1000000000, 60); // (1000000000*60) + 60= 60000000060 

}


