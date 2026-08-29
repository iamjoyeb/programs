interface d1{
	void draw();
}

class d2 implements d1{
	public void draw(){
		System.out.println("Interface Call From Draw D2:");
	}
}

class singleinterface{
	public static void main(String args[]){
		d2 d=new d2();
		d.draw();
	}
}
/*
	OUTPUT:
	Interface Call From Draw D2:
*/