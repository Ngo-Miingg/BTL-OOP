package BTLJava;

class HoSo extends TaiLieu {
    private String maHoSo;
    private String danhSachTaiLieuLienQuan;
    private String phongBan;
    private String noiDungTomTat;
    
	public HoSo(String id, String tieuDe, String noiDung, String ngayTao, String nguoiTao, String phanLoai,
			String trangThai, String ngayHetHan, String ghiChu, String maHoSo,
			String danhSachTaiLieuLienQuan, String phongBan, String noiDungTomTat) {
		super(id, tieuDe, noiDung, ngayTao, nguoiTao, phanLoai, trangThai, ngayHetHan, ghiChu);
		this.maHoSo = maHoSo;
		this.danhSachTaiLieuLienQuan = danhSachTaiLieuLienQuan;
		this.phongBan = phongBan;
		this.noiDungTomTat = noiDungTomTat;
	}
	public String getMaHoSo() {
		return maHoSo;
	}
	public void setMaHoSo(String maHoSo) {
		this.maHoSo = maHoSo;
	}
	public String getDanhSachTaiLieuLienQuan() {
		return danhSachTaiLieuLienQuan;
	}
	public void setDanhSachTaiLieuLienQuan(String danhSachTaiLieuLienQuan) {
		this.danhSachTaiLieuLienQuan = danhSachTaiLieuLienQuan;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getNoiDungTomTat() {
		return noiDungTomTat;
	}
	public void setNoiDungTomTat(String noiDungTomTat) {
		this.noiDungTomTat = noiDungTomTat;
	}
}