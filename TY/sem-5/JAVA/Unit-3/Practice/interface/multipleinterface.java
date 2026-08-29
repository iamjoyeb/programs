interface d6{
	void draw();
}

interface d7{
	void show();
}

class d8 implements d6,d7{
	public void draw(){
		System.out.println("Interface Call From Draw D6:");
	}
	
	public void show(){
		System.out.println("Interface Call From Show D7:");
	}
}

class multipleinterface{
	public static void main(String args[]){
		d8 d=new d8();
		d.draw();
		d.show();
	}
}
/*
	OUTPUT:
	Interface Call From Draw D6:
	Interface Call From Show D7:
*/