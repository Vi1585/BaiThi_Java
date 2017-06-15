package com.example.app_sinhvien;

public class SinhVien {
	
		 String masv;  
		 String hoten;  
		 String gtinh;  
		 
		 public SinhVien(String masv, String hoten, String gtinh) {
		        this.masv = masv;
		        this.hoten = hoten;
		        this.gtinh = gtinh;
		    }

		    public SinhVien() {
		    }

		//Phương thức get, set
		    public String getSinhVien_ma()
		    {
		        return masv;
		    }
		    public String getSinhVien_ten()
		    {
		        return hoten;
		    }
		    public String getSinhVien_gt()
		    {
		        return gtinh;
		    }
		    public void setSinhVien_ma(int ma)
		    {
		        this.masv=masv;
		    }
		    public void setSinhVien_ten(String hoten)
		    {
		        this.hoten= hoten;
		    }
		    public void setSinhVien_gt(String gtinh)
		    {
		        this.gtinh= gtinh;
		    }
		  
		   
		 public String toString(){//ghi de phuong thuc toString()  
		  return masv+" "+hoten+" "+gtinh;  
		 }    

}

