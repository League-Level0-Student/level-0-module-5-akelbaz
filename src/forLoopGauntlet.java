
public class forLoopGauntlet {
public static void main(String[] args) {
for (int i = 0; i < 101; i++) {
System.out.println(i);	
}
for (int j = 100; j > -1; j--) {
System.out.println(j);	
}
for (int k = 2; k < 101; k++) {
if(k%2==0) {
System.out.println(k);	
}
	for (int l = 1; l < 101; l++) {
		if(l%2==1) {
		System.out.println(l);	
}
	}
for (int m = 1; m < 501; m++) {
if(m%2==0) {
System.out.println(m +" is even");
}
else {
	System.out.println(m +" is odd");
}
}	
for (int n = 1; n < 778; n++) {
if(n%7==0) {
System.out.println(n);
}
}
for (int o = 0; o < 15; o++) {
if(o<14) {
	System.out.println("In " + (o + 2005) + " I was "+ o );	
}else{
System.out.println("In " +(o + 2005)+ " I am 13");
}
}

for (int p = 0; p < 3; p++) {
	for (int q = 0; q < 3; q++) {
		System.out.println(p+""+q);	
}	
}

}
for (int r = 0; r < 3; r++) {
	for (int s = 0; s < 3; s++) {
	System.out.print((r*3)+(s+1));
	}
	System.out.println("");
}	

for (int t = 0;t < 10; t++) {
	for (int u = 0; u < 10; u++) {
	System.out.print((t*10) + (u+1)+"\t");
	}
	System.out.println("");
}
for (int v = 1; v < 7; v++) {
	for (int w = 0; w < v; w++) {
		System.out.print("* ");
}	
	System.out.println();
}
}

}

