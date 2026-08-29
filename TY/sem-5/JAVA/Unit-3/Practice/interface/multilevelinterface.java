interface d3{
	void draw();
}

interface d4 extends d3{
	void show();
}

class d5 implements d4{
	public void draw(){
		System.out.println("Interface Call From Draw D3:");
	}
	
	public void show(){
		System.out.println("Interface Call From Show D4:");
	}
}

class multilevelinterface{
	public static void main(String args[]){
		d5 d=new d5();
		d.draw();
		d.show();
	}
}
/*
	OUTPUT:
	Interface Call From Draw D3:
	Interface Call From Show D4:
*/