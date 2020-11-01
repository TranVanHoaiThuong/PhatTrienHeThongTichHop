package lab5;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FlightPhuongThuc extends UnicastRemoteObject implements Flight {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected FlightPhuongThuc() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/*Xem thong tin chuyen bay*/
	@Override
	public String FlightInfor(String maChuyenBay, String ngayBay, String noiDi, String noiDen, String thoiGianBay,
			int tongSoGhe, int gheDaBan, int gheTrong) throws RemoteException {
		// TODO Auto-generated method stub
		return "So hieu :"+maChuyenBay+"\n Ngay gio bay :"+ngayBay+"\n Noi di :"+noiDi+"\n Noi den :"+noiDen+"\n Thoi gian bay :"
		+thoiGianBay+"\n Tong so ghe :"+tongSoGhe+"\n Ghe da ban :"+gheDaBan+" (ghe)\n Ghe con trong :"+gheTrong+" (ghe)\n";
	}
	/*Phuong thuc mua ve*/
	@Override
	public float buyTicket(int soVe, double giaVe) throws RemoteException {
		// TODO Auto-generated method stub
		return (float)soVe*(float)giaVe;
	}

	@Override
	public float cancelTicket(int soVe, double giaVe) throws RemoteException {
		// TODO Auto-generated method stub
		return (float)soVe*(float)giaVe;
	}

	
}
