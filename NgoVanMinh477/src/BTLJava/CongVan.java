package BTLJava;

class CongVan extends TaiLieu {
    private String maCongVan;
    private String donViGui;
    private String donViNhan;
    private String nguoiKy;
    private String chucVuNguoiKy;
    
	public CongVan(String id, String tieuDe, String noiDung, String ngayTao, String nguoiTao, String phanLoai,
			String trangThai, String ngayHetHan, String ghiChu, String maCongVan,
			String donViGui, String donViNhan, String nguoiKy, String chucVuNguoiKy) {
		super(id, tieuDe, noiDung, ngayTao, nguoiTao, phanLoai, trangThai, ngayHetHan, ghiChu);
		this.maCongVan = maCongVan;
		this.donViGui = donViGui;
		this.donViNhan = donViNhan;
		this.nguoiKy = nguoiKy;
		this.chucVuNguoiKy = chucVuNguoiKy;
	}

	public String getMaCongVan() {
		return maCongVan;
	}

	public void setMaCongVan(String maCongVan) {
		this.maCongVan = maCongVan;
	}

	public String getDonViGui() {
		return donViGui;
	}

	public void setDonViGui(String donViGui) {
		this.donViGui = donViGui;
	}

	public String getDonViNhan() {
		return donViNhan;
	}

	public void setDonViNhan(String donViNhan) {
		this.donViNhan = donViNhan;
	}

	public String getNguoiKy() {
		return nguoiKy;
	}

	public void setNguoiKy(String nguoiKy) {
		this.nguoiKy = nguoiKy;
	}

	public String getChucVuNguoiKy() {
		return chucVuNguoiKy;
	}

	public void setChucVuNguoiKy(String chucVuNguoiKy) {
		this.chucVuNguoiKy = chucVuNguoiKy;
	}

}