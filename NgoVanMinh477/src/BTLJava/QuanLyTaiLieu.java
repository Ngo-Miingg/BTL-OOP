package BTLJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class QuanLyTaiLieu {
    private static final List<HoSo> quanLyHoSo = new ArrayList<>();
    private static final List<CongVan> quanLyCongVan = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon;
        do {
            hienThiMenu();
            luaChon = scanner.nextInt();
            scanner.nextLine();
            switch (luaChon) {
                case 1 -> themHoSo();
                case 2 -> themCongVan();
                case 3 -> hienThiTaiLieu();
                case 4 -> timKiemTaiLieu();
                case 5 -> suaTaiLieu();
                case 6 -> xoaTaiLieu();
                case 7 -> sapXepTaiLieu();
                case 8 -> capNhatTrangThai();
                case 9 -> xuatBaoCao();
                case 0 -> {
                    System.out.println("Tạm biệt!");
                    System.exit(0);
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (luaChon != 0);
    }
    private static void hienThiMenu() {
        System.out.println("Quản lý tài liệu");
        System.out.println("1. Thêm hồ sơ");
        System.out.println("2. Thêm công văn");
        System.out.println("3. Hiển thị tài liệu");
        System.out.println("4. Tìm kiếm tài liệu");
        System.out.println("5. Sửa tài liệu");
        System.out.println("6. Xóa tài liệu");
        System.out.println("7. Sắp xếp tài liệu");
        System.out.println("8. Cập nhật trạng thái tài liệu");
        System.out.println("9. Xuất báo cáo");
        System.out.println("0. Thoát chương trình");
    }
	//1. Thêm hồ sơ
    private static void themHoSo() {
        System.out.println("Thêm hồ sơ");
        HoSo hoSoMoi = nhapThongTinHoSo();
        quanLyHoSo.add(hoSoMoi);
        luuHoSoVaoFile(hoSoMoi);
    }

    private static HoSo nhapThongTinHoSo() {
		System.out.print("Nhập ID: ");
		String id = scanner.nextLine();
		System.out.print("Nhập mã hồ sơ: ");
		String maHoSo = scanner.nextLine();
		System.out.print("Nhập tiêu đề: ");
		String tieuDe = scanner.nextLine();
		System.out.print("Nhập nội dung tóm tắt: ");
		String noiDungTomTat = scanner.nextLine();
		System.out.print("Nhập nội dung: ");
		String noiDung = scanner.nextLine();
		System.out.print("Nhập ngày tạo (dd/MM/yyyy): ");
		String ngayTao = scanner.nextLine();
		System.out.print("Nhập ngày hết hạn (dd/MM/yyyy): ");
		String ngayHetHan = scanner.nextLine();
		System.out.print("Nhập người tạo: ");
		String nguoiTao = scanner.nextLine();
		System.out.print("Nhập phòng ban: ");
		String phongBan = scanner.nextLine();
		System.out.print("Nhập phân loại: ");
		String phanLoai = scanner.nextLine();
		System.out.print("Nhập trạng thái: ");
		String trangThai = scanner.nextLine();
		System.out.print("Nhập ghi chú: ");
		String ghiChu = scanner.nextLine();
		System.out.print("Nhập danh sách tài liệu liên quan (cách nhau bởi dấu phẩy): ");
		String danhSachTaiLieuLienQuan = scanner.nextLine();	

        return new HoSo(id, maHoSo, tieuDe, noiDungTomTat, noiDung, ngayTao, ngayHetHan, nguoiTao, phongBan, phanLoai, trangThai, ghiChu, danhSachTaiLieuLienQuan);
    }

    private static void luuHoSoVaoFile(HoSo hoSo) {
        try (PrintWriter out = new PrintWriter(new FileWriter("HoSo.txt", true))) {
            out.println(hoSo.getId() + "," + hoSo.getMaHoSo() + "," + hoSo.getTieuDe() + "," + hoSo.getNoiDungTomTat() + "," + hoSo.getNoiDung() + "," + hoSo.getNgayTao() + ","
                    + hoSo.getNgayHetHan() + "," + hoSo.getNguoiTao() + "," + hoSo.getPhongBan() + "," + hoSo.getPhanLoai() + ","
                    + hoSo.getTrangThai() + "," + hoSo.getGhiChu() + "," + hoSo.getDanhSachTaiLieuLienQuan());
            System.out.println("Hồ sơ đã được thêm thành công và lưu vào file!");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi lưu hồ sơ vào file: " + e.getMessage());
        }
    }

	//2. Thêm công văn
    private static void themCongVan() {
        System.out.println("Thêm công văn");
        CongVan congVanMoi = nhapThongTinCongVan();
        quanLyCongVan.add(congVanMoi);
        luuCongVanVaoFile(congVanMoi);
    }

    private static CongVan nhapThongTinCongVan() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        System.out.print("Nhập mã công văn: ");
        String maCongVan = scanner.nextLine();
        System.out.print("Nhập tiêu đề: ");
        String tieuDe = scanner.nextLine();
        System.out.print("Nhập nội dung: ");
        String noiDung = scanner.nextLine();
        System.out.print("Nhập ngày tạo (dd/MM/yyyy): ");
        String ngayTao = scanner.nextLine();
        System.out.print("Nhập người tạo: ");
        String nguoiTao = scanner.nextLine();
        System.out.print("Nhập phân loại: ");
        String phanLoai = scanner.nextLine();
        System.out.print("Nhập trạng thái: ");
        String trangThai = scanner.nextLine();
        System.out.print("Nhập ngày hết hạn (dd/MM/yyyy): ");
        String ngayHetHan = scanner.nextLine();
        System.out.print("Nhập ghi chú: ");
        String ghiChu = scanner.nextLine();
        System.out.print("Nhập đơn vị gửi: ");
        String donViGui = scanner.nextLine();
        System.out.print("Nhập đơn vị nhận: ");
        String donViNhan = scanner.nextLine();
        System.out.print("Nhập người ký: ");
        String nguoiKy = scanner.nextLine();
        System.out.print("Nhập chức vụ người ký: ");
        String chucVuNguoiKy = scanner.nextLine();
    
        return new CongVan(id, maCongVan, tieuDe, noiDung, ngayTao, nguoiTao, phanLoai, trangThai, ngayHetHan, ghiChu, donViGui, donViNhan, nguoiKy, chucVuNguoiKy);
    }

    private static void luuCongVanVaoFile(CongVan congVan) {
        try (PrintWriter out = new PrintWriter(new FileWriter("CongVan.txt", true))) {
            out.println(congVan.getId() + "," 
                    + congVan.getMaCongVan() + "," 
                    + congVan.getTieuDe() + "," 
                    + congVan.getNoiDung() + "," 
                    + congVan.getNgayTao() + "," 
                    + congVan.getNguoiTao() + "," 
                    + congVan.getPhanLoai() + "," 
                    + congVan.getTrangThai() + "," 
                    + congVan.getNgayHetHan() + "," 
                    + congVan.getGhiChu() + "," 
                    + congVan.getDonViGui() + "," 
                    + congVan.getDonViNhan() + "," 
                    + congVan.getNguoiKy() + "," 
                    + congVan.getChucVuNguoiKy());
            System.out.println("Công văn đã được thêm thành công và lưu vào file!");
        } catch (IOException e) {
            System.out.println("Có lỗi xảy ra khi lưu công văn vào file: " + e.getMessage());
        }
    }
	//3. Hiển thị tài liệu
    private static void hienThiTaiLieu() {
        System.out.println("Chọn loại tài liệu để hiển thị:");
        System.out.println("1. Hiển thị hồ sơ");
        System.out.println("2. Hiển thị công văn");
        System.out.print("Lựa chọn của bạn: ");
        int hienThiChoice = scanner.nextInt();
        scanner.nextLine();
        switch (hienThiChoice) {
            case 1 -> hienThiHoSo();
            case 2 -> hienThiCongVan();
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    private static void hienThiHoSo() {
        try (BufferedReader reader = new BufferedReader(new FileReader("HoSo.txt"))) {
            String line;
            System.out.println("Danh sách hồ sơ:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
        }
    }

    private static void hienThiCongVan() {
        try (BufferedReader reader = new BufferedReader(new FileReader("CongVan.txt"))) {
            String line;
            System.out.println("Danh sách công văn:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
        }
    }
	//4. Tìm kiếm tài liệu
    private static void timKiemTaiLieu() {
        System.out.println("Chọn loại tìm kiếm:");
        System.out.println("1. Tìm kiếm theo ID");
        System.out.println("2. Tìm kiếm theo tiêu đề");
        System.out.println("3. Tìm kiếm theo ngày tạo");
        System.out.print("Lựa chọn của bạn: ");
        int timKiemChoice = scanner.nextInt();
        scanner.nextLine();
        switch (timKiemChoice) {
            case 1 -> timKiemTheoId();
            case 2 -> timKiemTheoTieuDe();
            case 3 -> timKiemTheoNgayTao();
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }

	private static void timKiemTheoId() {
		System.out.print("Nhập ID cần tìm: ");
		String id = scanner.nextLine();
		boolean found = timKiemTrongFile("HoSo.txt", id, 0) || timKiemTrongFile("CongVan.txt", id, 0);
		if (!found) {
			System.out.println("Không tìm thấy tài liệu với ID: " + id);
		}
	}
	
	private static void timKiemTheoTieuDe() {
		System.out.print("Nhập tiêu đề cần tìm: ");
		String tieuDe = scanner.nextLine().toLowerCase();
		boolean found = timKiemTrongFile("HoSo.txt", tieuDe, 2) || timKiemTrongFile("CongVan.txt", tieuDe, 2);
		if (!found) {
			System.out.println("Không tìm thấy tài liệu với tiêu đề chứa: " + tieuDe);
		}
	}
	
	private static void timKiemTheoNgayTao() {
		System.out.print("Nhập ngày tạo cần tìm (dd/MM/yyyy): ");
		String ngayTao = scanner.nextLine();
		boolean found = timKiemTrongFile("HoSo.txt", ngayTao, 5) || timKiemTrongFile("CongVan.txt", ngayTao, 5);
		if (!found) {
			System.out.println("Không tìm thấy tài liệu được tạo vào ngày: " + ngayTao);
		}
	}

	private static boolean timKiemTrongFile(String fileName, String keyword, int columnIndex) {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if (parts.length > columnIndex && parts[columnIndex].toLowerCase().contains(keyword.toLowerCase())) {
					System.out.println(line);
					return true;
				}
			}
		} catch (IOException e) {
			System.out.println("Có lỗi khi đọc file: " + e.getMessage());
		}
		return false;
	}
	//5. Sửa tài liệu
    private static void suaTaiLieu() {
        System.out.println("Chọn loại tài liệu để sửa:");
        System.out.println("1. Sửa hồ sơ");
        System.out.println("2. Sửa công văn");
        System.out.print("Lựa chọn của bạn: ");
        int suaChoice = scanner.nextInt();
        scanner.nextLine();
        switch (suaChoice) {
            case 1 -> suaHoSo();
            case 2 -> suaCongVan();
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    private static void suaHoSo() {
        System.out.print("Nhập ID hồ sơ cần sửa: ");
        String id = scanner.nextLine();
    
        Collection<String> lines = new ArrayList<>();
        boolean timThay = false;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("HoSo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] thongTin = line.split(",");
                if (thongTin.length >= 12 && thongTin[0].equals(id)) {
                    System.out.println("Nhập thông tin mới cho hồ sơ:");
                    System.out.print("Nhập tiêu đề mới: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập nội dung tóm tắt mới: ");
                    String noiDungTomTat = scanner.nextLine();
                    System.out.print("Nhập nội dung mới: ");
                    String noiDung = scanner.nextLine();
                    System.out.print("Nhập ngày tạo mới (dd/MM/yyyy): ");
                    String ngayTao = scanner.nextLine();
                    System.out.print("Nhập ngày hết hạn mới (dd/MM/yyyy): ");
                    String ngayHetHan = scanner.nextLine();
                    System.out.print("Nhập người tạo mới: ");
                    String nguoiTao = scanner.nextLine();
                    System.out.print("Nhập phòng ban mới: ");
                    String phongBan = scanner.nextLine();
                    System.out.print("Nhập phân loại mới: ");
                    String phanLoai = scanner.nextLine();
                    System.out.print("Nhập trạng thái mới: ");
                    String trangThai = scanner.nextLine();
                    System.out.print("Nhập ghi chú mới: ");
                    String ghiChu = scanner.nextLine();
                    System.out.print("Nhập danh sách tài liệu liên quan mới (cách nhau bởi dấu phẩy): ");
                    String danhSachTaiLieuLienQuan = scanner.nextLine();
    
                    line = id + "," + tieuDe + "," + noiDungTomTat + "," + noiDung + "," + ngayTao + ","
                            + ngayHetHan + "," + nguoiTao + "," + phongBan + "," + phanLoai + ","
                            + trangThai + "," + ghiChu + "," + danhSachTaiLieuLienQuan;
                    
                    timThay = true;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
            return;
        }
    
        if (timThay) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("HoSo.txt"))) {
                for (String line : lines) {
                    writer.println(line);
                }
                System.out.println("Hồ sơ đã được cập nhật thành công.");
            } catch (IOException e) {
                System.out.println("Có lỗi khi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy hồ sơ với ID: " + id);
        }
    }
    

    private static void suaCongVan() {
        System.out.print("Nhập ID công văn cần sửa: ");
        String id = scanner.nextLine();
    
        Collection<String> lines = new ArrayList<>();
        boolean timThay = false;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("CongVan.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] thongTin = line.split(",");
                if (thongTin.length >= 15 && thongTin[0].equals(id)) {
                    System.out.println("Nhập thông tin mới cho công văn:");
                    System.out.print("Nhập tiêu đề: ");
                    String tieuDe = scanner.nextLine();
                    System.out.print("Nhập nội dung: ");
                    String noiDung = scanner.nextLine();
                    System.out.print("Nhập ngày tạo (dd/MM/yyyy): ");
                    String ngayTao = scanner.nextLine();
                    System.out.print("Nhập người tạo: ");
                    String nguoiTao = scanner.nextLine();
                    System.out.print("Nhập phân loại: ");
                    String phanLoai = scanner.nextLine();
                    System.out.print("Nhập trạng thái: ");
                    String trangThai = scanner.nextLine();
                    System.out.print("Nhập ngày hết hạn (dd/MM/yyyy): ");
                    String ngayHetHan = scanner.nextLine();
                    System.out.print("Nhập ghi chú: ");
                    String ghiChu = scanner.nextLine();
                    System.out.print("Nhập đơn vị gửi: ");
                    String donViGui = scanner.nextLine();
                    System.out.print("Nhập đơn vị nhận: ");
                    String donViNhan = scanner.nextLine();
                    System.out.print("Nhập người ký: ");
                    String nguoiKy = scanner.nextLine();
                    System.out.print("Nhập chức vụ người ký: ");
                    String chucVuNguoiKy = scanner.nextLine();
    
                    line = id + "," + tieuDe + "," + noiDung + "," + ngayTao + ","
                            + ngayHetHan + "," + nguoiTao + "," + phanLoai + ","
                            + trangThai + "," + ghiChu + "," + donViGui + "," + donViNhan + "," + nguoiKy + "," + chucVuNguoiKy;
                    
                    timThay = true;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
            return;
        }
    
        if (timThay) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("CongVan.txt"))) {
                for (String line : lines) {
                    writer.println(line);
                }
                System.out.println("Công văn đã được cập nhật thành công.");
            } catch (IOException e) {
                System.out.println("Có lỗi khi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy công văn với ID: " + id);
        }
    }

    private static void xoaTaiLieu() {
        System.out.println("Chọn loại tài liệu để xóa:");
        System.out.println("1. Xóa hồ sơ");
        System.out.println("2. Xóa công văn");
        System.out.print("Lựa chọn của bạn: ");
        int xoaChoice = scanner.nextInt();
        scanner.nextLine();
        switch (xoaChoice) {
            case 1 -> xoaHoSo();
            case 2 -> xoaCongVan();
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void xoaHoSo() {
        System.out.print("Nhập ID hồ sơ cần xóa: ");
        String id = scanner.nextLine();
        List<String> lines = new ArrayList<>();
        boolean found = false;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("HoSo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    found = true;
                    continue;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
            return;
        }
    
        if (found) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("HoSo.txt"))) {
                for (String line : lines) {
                    writer.println(line);
                }
                System.out.println("Hồ sơ đã được xóa thành công.");
            } catch (IOException e) {
                System.out.println("Có lỗi khi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy hồ sơ với ID: " + id);
        }
    }
    
    private static void xoaCongVan() {
        System.out.print("Nhập ID công văn cần xóa: ");
        String id = scanner.nextLine();
        List<String> lines = new ArrayList<>();
        boolean found = false;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("CongVan.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    found = true;
                    continue;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
            return;
        }
    
        if (found) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("CongVan.txt"))) {
                for (String line : lines) {
                    writer.println(line);
                }
                System.out.println("Công văn đã được xóa thành công.");
            } catch (IOException e) {
                System.out.println("Có lỗi khi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy công văn với ID: " + id);
        }
    }
    
    private static void sapXepTaiLieu() {
        System.out.println("Chọn loại sắp xếp:");
        System.out.println("1. Sắp xếp theo ngày tạo");
        System.out.println("2. Sắp xếp theo ngày hết hạn");
        System.out.println("3. Sắp xếp theo mức độ quan trọng");
        System.out.print("Lựa chọn của bạn: ");
        int sapXepChoice = scanner.nextInt();
        scanner.nextLine();
        switch (sapXepChoice) {
            case 1 -> sapXepTheoNgayTao();
            case 2 -> sapXepTheoNgayHetHan();
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void sapXepTheoNgayTao() {
        Collections.sort(quanLyHoSo, Comparator.comparing(HoSo::getNgayTao));
        Collections.sort(quanLyCongVan, Comparator.comparing(CongVan::getNgayTao));
        System.out.println("Danh sách đã được sắp xếp theo ngày tạo.");
    }

    private static void sapXepTheoNgayHetHan() {
        Collections.sort(quanLyHoSo, Comparator.comparing(HoSo::getNgayHetHan));
        Collections.sort(quanLyCongVan, Comparator.comparing(CongVan::getNgayHetHan));
        System.out.println("Danh sách đã được sắp xếp theo ngày hết hạn.");
    }
    private static void capNhatTrangThai() {
        System.out.println("Chọn loại tài liệu để cập nhật trạng thái:");
        System.out.println("1. Cập nhật trạng thái hồ sơ");
        System.out.println("2. Cập nhật trạng thái công văn");
        System.out.print("Lựa chọn của bạn: ");
        int capNhatChoice = scanner.nextInt();
        scanner.nextLine();
        switch (capNhatChoice) {
            case 1 -> capNhatTrangThaiHoSo();
            case 2 -> capNhatTrangThaiCongVan();
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
    }
    
    private static void capNhatTrangThaiHoSo() {
        System.out.print("Nhập ID hồ sơ cần cập nhật: ");
        String id = scanner.nextLine();
        System.out.print("Nhập trạng thái mới: ");
        String trangThaiMoi = scanner.nextLine();
    
        List<String> lines = new ArrayList<>();
        boolean timThay = false;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("HoSo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    parts[7] = trangThaiMoi;
                    line = String.join(",", parts);
                    timThay = true;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
            return;
        }
    
        if (timThay) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("HoSo.txt"))) {
                for (String line : lines) {
                    writer.println(line);
                }
                System.out.println("Trạng thái hồ sơ đã được cập nhật thành công.");
            } catch (IOException e) {
                System.out.println("Có lỗi khi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy hồ sơ với ID: " + id);
        }
    }
    
    private static void capNhatTrangThaiCongVan() {
        System.out.print("Nhập ID công văn cần cập nhật: ");
        String id = scanner.nextLine();
        System.out.print("Nhập trạng thái mới: ");
        String trangThaiMoi = scanner.nextLine();
    
        List<String> lines = new ArrayList<>();
        boolean timThay = false;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("CongVan.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(id)) {
                    parts[7] = trangThaiMoi;
                    line = String.join(",", parts);
                    timThay = true;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file: " + e.getMessage());
            return;
        }
    
        if (timThay) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("CongVan.txt"))) {
                for (String line : lines) {
                    writer.println(line);
                }
                System.out.println("Trạng thái công văn đã được cập nhật thành công.");
            } catch (IOException e) {
                System.out.println("Có lỗi khi ghi file: " + e.getMessage());
            }
        } else {
            System.out.println("Không tìm thấy công văn với ID: " + id);
        }
    }
    
    private static void xuatBaoCao() {
        int totalHoSo = 0;
        int totalCongVan = 0;
        Map<String, Integer> thongKeTrangThai = new HashMap<>();
    
        try (BufferedReader reader = new BufferedReader(new FileReader("HoSo.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalHoSo++;
                String[] parts = line.split(",");
                if (parts.length > 7) {
                    String trangThai = parts[7];
                    thongKeTrangThai.merge(trangThai, 1, Integer::sum);
                }
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file Hồ sơ: " + e.getMessage());
        }
            try (BufferedReader reader = new BufferedReader(new FileReader("CongVan.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalCongVan++;
                String[] parts = line.split(",");
                if (parts.length > 7) {
                    String trangThai = parts[7];
                    thongKeTrangThai.merge(trangThai, 1, Integer::sum);
                }
            }
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file Công văn: " + e.getMessage());
        }
    
        int totalDocuments = totalHoSo + totalCongVan;
    
        try (PrintWriter writer = new PrintWriter(new FileWriter("BaoCaoTongHop.txt"))) {
            writer.println("BÁO CÁO TỔNG HỢP");
            writer.println("Tổng số tài liệu: " + totalDocuments);
            writer.println("Số lượng hồ sơ: " + totalHoSo);
            writer.println("Số lượng công văn: " + totalCongVan);
    
            writer.println("\nThống kê theo trạng thái:");
            thongKeTrangThai.forEach((trangThai, soLuong) ->writer.println(trangThai + ": " + soLuong)
            );
    
            System.out.println("Đã xuất báo cáo tổng hợp thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi xuất báo cáo tổng hợp: " + e.getMessage());
        }
    }
}