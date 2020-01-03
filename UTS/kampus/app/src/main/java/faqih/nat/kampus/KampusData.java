package faqih.nat.kampus;

import java.util.ArrayList;

public class KampusData {
    public static String[][] data = new String[][]{
            {"0", "Institut Teknologi Bandung", "Dengan skor 3.671 – klaster 1. Peringkat universitas terbaik di Indonesia dipegang ITB, singkatan dari Institut Teknologi Bandung. PTN di Bandung ini layak menjadi institut terbaik di Indonesia yang bergerak di bidang pengembangan teknik dan sains. ITB didirikan sejak tahun 1959 dan mampu mempertahankan kualitas sebagai salah satu yang termasuk daftar PTN terbaik di Indonesia.", "https://upload.wikimedia.org/wikipedia/id/9/95/Logo_Institut_Teknologi_Bandung.png"},
            {"1", "Universitas Gajah Mada", "Dengan skor 3.594 – klaster 1. Urutan universitas terbaik di Indonesia selanjutnya adalah Universitas Gajah Mada atau biasa disingkat UGM. Kampus UGM terletak di Yogyakarta dan sudah didirikan sejak tahun 1949. UGM memang konsisten menempati posisi 1 daftar universitas terbaik di Indonesia. Dengan statusnya sebagai PTN.","https://upload.wikimedia.org/wikipedia/id/2/29/Logo_Universitas_Gadjah_Mada.png"},
            {"2", "Institut Pertanian Bogor", "Dengan skor 3.577 – klaster 1. Sama seperti ITB, Institut Pembangunan Bogor adalah perguruan tinggi berbentuk institut yang berada di provinsi Jawa Barat, tepatnya di kota Bogor. IPB lebih berfokus di bidang pertanian, meski banyak juga jurusan non-agragris. IPB konsisten masuk dalam daftar universitas terbaik di Indonesia di peringkat 10 besar.", "https://i.postimg.cc/Bv3zvk7s/Logo-IPB-baru.png"},
            {"3", "Institut Teknologi Sepuluh November", "Dengan skor 3.462 – klaster 1. Tak lengkap membahas daftar ranking universitas di Indonesia terbaru tanpa memasukkan universitas di Surabaya. Singkatan dari ITS adalah Institut Teknologi Sepuluh Nopember dan terletak di daerah Sukolilo, Surabaya. Pertama didirikan di tahun 1957, ITS berfokus untuk mengembangkan bidang teknologi dan maritim Indonesia.", "https://upload.wikimedia.org/wikipedia/id/c/c4/Badge_ITS.png"},
            {"4", "Universitas Indonesia", "Dengan skor 3.401 – klaster 1. Berikutnya dalam daftar perguruan tinggi terbaik di Indonesia adalah Universitas Indonesia atau UI. Letaknya berada di perbatasn kota Depok dan Jakarta, namun sering dianggap sebagai universitas di Jakarta. Kampus negeri di Jakarta ini pertama didirikan di tahun 1849. UI juga pernah beberapa kali menempati peringkat 1 list universitas terfavorit di Indonesia dan termasuk salah satu universitas terbesar di Indonesia.", "https://upload.wikimedia.org/wikipedia/id/9/95/Makara_UI.png"},
            {"5","Universitas Diponegoro","Dengan skor 3.207 – klaster 1. UNDIP juga termasuk dalam urutan universitas terbaik se Indonesia ini. UNDIP atau Universitas Diponegoro terletak di kota Semarang, dan layak dianggap sebagai universitas terbaik di Jawa Tengah. Letaknya yang cukup strategis serta pilihan jurusan yang bervariasi membuat UNDIP jadi salah satu rekomendasi tempat kuliah terbaik di Indonesia yang enak.","https://i.postimg.cc/15rXPnsD/Undip.png"},
            {"6","Universitas Airlangga","Dengan skor 3.056 – klaster 1. Satu lagi kampus negeri di Surabaya yang masuk 10 besar peringkat perguruan tinggi terbaik di Indonesia, apa lagi kalau bukan UNAIR. Universitas Airlangga atau UNAIR mungkin paling pas jika disebut sebagai universitas terbaik di Surabaya. UNAIR terkenal sebagai kampus yang memiliki kredibililtas dan moralitas tinggi serta salah satu universitas terbaik di Jawa Timur.","https://i.postimg.cc/cJp0f0ds/300px-Universitas-Airlangga-svg.png"},
            {"7","Universitas Hasanuddin","Dengan skor 3.036 – klaster 1. Tidak mau kalah dengan yang di jawa, Universitas Hasanuddin, masuk di daftar universitas terbaik. Universitas Hasanuddin yang kemudian disingkat UNHAS, merupakan sebuah perguruan tinggi negeri di kota Makassar, Provinsi Sulawesi Selatan, Indonesia, yang berdiri pada 10 September 1956.","https://i.postimg.cc/t4F59z72/Logo-UH.png"},
            {"8","Universitas Brawijaya","Dengan skor 2.948 – klaster 1. Tidak mau ketinggalan dari universitas di surabaya, Universitas Brawijaya juga menjadi salah satu universitas terbaik di Jawa Timur. Universitas Brawijaya atau UB didirikan di tahun 1963 dan terletak di kota Malang. Dulunya singkatan universitas ini adalah UNIBRAW, namun kemudian disederhanakan lagi menjadi UB sampai sekarang.","https://i.postimg.cc/c40YQNJM/512px-Logo-Universitas-Brawijaya-svg.png"},
            {"9","Universitas Padjadjaran","Dengan skor 2.906 – klaster 1. Tidak mau kalah dengan tetangganya ITB, Universitas Padjadjaran atau yang sering dikenal UNPAD menjadi universitas terbaik ke 10. UNPAD merupakan salah satu perguruan tinggi negeri yang terletak di Bandung, Jawa Barat, Indonesia.","https://i.postimg.cc/FsYvCY19/Logo-Unpad-Transparent.png"},
            {"10","Politeknik Negeri Semarang"," Ya ini kampus saya, walaupun bukan Universitas ya gakpapa lah saya masukin aja, Kuliah disini enak kok, gamasuk tinggal kompen bayar kuliah pasti 3 tahun atau 4 tahun lulus? pasti bareng","https://i.postimg.cc/7ZDfF1z3/Jepretan-Layar-2016-12-17-pada-09-37-12.png"},

    };

    public static ArrayList<Kampus> getListData() {
        ArrayList<Kampus> list = new ArrayList<>();
        for (String[] KampusData : data) {
            Kampus kampus = new Kampus();
            kampus.setId(Integer.parseInt(KampusData[0]));
            kampus.setName(KampusData[1]);
            kampus.setDescription(KampusData[2]);
            kampus.setPhoto(KampusData[3]);

            list.add(kampus);
        }
        return list;
    }
}

