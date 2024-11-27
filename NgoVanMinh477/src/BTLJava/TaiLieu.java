package BTLJava;

class TaiLieu {
    private String id;
    private String tieuDe;
    private String noiDung;
    private String ngayTao;
    private String nguoiTao;
    private String phanLoai;
    private String trangThai;
	private String ngayHetHan;
    private String ghiChu;

	public TaiLieu(String id, String tieuDe, String noiDung, String ngayTao, String nguoiTao, String phanLoai,
			String trangThai, String ngayHetHan, String ghiChu) {
		this.id = id;
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayTao = ngayTao;
		this.nguoiTao = nguoiTao;
		this.phanLoai = phanLoai;
		this.trangThai = trangThai;
		this.ngayHetHan = ngayHetHan;
		this.ghiChu = ghiChu;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public String getPhanLoai() {
		return phanLoai;
	}

	public void setPhanLoai(String phanLoai) {
		this.phanLoai = phanLoai;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(String ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
}