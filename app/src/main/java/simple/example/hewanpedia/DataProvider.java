package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Rusa;
import simple.example.hewanpedia.model.Serigala;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("Kelinci Anggora", "Turki",
                "Kelebihan dari kelinci jenis ini yaitu bulunya dapat digunakan untuk pembuatan wool. Namun, kekurangan jenis kelinci ini yaitu perlu diperhatikan karena asal kelinci ini bukan dari daerah tropis sehingga mudah terkena penyakit.", R.drawable.kelinci_1));
        kelincis.add(new Kelinci("Kelinci Lop", "Inggris",
                "kelinci Lop sebagai kelinci hias yaitu bentuk telinganya yang unik seperti telinga anjing menjulur kebawah dan berbeda dari kelinci jenis lain.", R.drawable.kelinci_2));
        kelincis.add(new Kelinci("Kelinci Rex", "Perancis",
                "Kelebihan kelinci Rex ini adalah warna bulu yang indah sehingga kelinci ini sering dijadikan kelinci kontes, selain itu juga dapat dijadikan kelinci pedaging.", R.drawable.kelinci_3));
        kelincis.add(new Kelinci("Kelinci Netherland Dwarf", "Belanda",
                "Kelebihan kelinci Netherland Dwarf yaitu kegesitan yang dimiliki kelinci ini. Kelinci ini dapat berkeliling ruangan sampai ratusan kali dalam sehari. Sedangkan kekurangan dari kelinci ini yaitu susah untuk dijinakkan karena merupakan kelinci liar sehingga berbahaya dipelihara oleh anak-anak", R.drawable.kelinci_4));
        kelincis.add(new Kelinci("Kelinci Dutch", "Belanda",
                "Kelebihan dari kelinci Dutch yaitu sifat sosial kelinci ini sangat baik dan memiliki kecerdasan yang tinggi sehingga mudah untuk dilatih. Selain itu, kelinci ini memiliki sifat keibuan yang baik dan fertilitas tinggi", R.drawable.kelinci_5));
        kelincis.add(new Kelinci("Kelinci LionHead", "Inggris",
                "Kelebihan dari kelinci ini yaitu selain harganya murah, memiliki keunikan yang tidak ditemukan pada jenis kelinci lain yaitu kepala yang mirip seperti kepala singa ", R.drawable.kelinci_6));
        return kelincis;
    }

    private static List<Serigala> initDataSerigala(Context ctx) {
        List<Serigala> serigalas = new ArrayList<>();
        serigalas.add(new Serigala("Serigala Arktik", "Kanada",
                "Keberadaan hewan ini yang terisolasi ekstrim dan kondisi lingkungannya yang keras, membuatnya tidak banyak diketahui termasuk ciri-ciri fisiknya. Namun, sebagian besar orang mengetahui bahwa bulu serigala arktik putih bersih dan lebih tebal (memaksimalkan kehangatan di dalam suhu yang sangat dingin).", R.drawable.serigala_1));
        serigalas.add(new Serigala("Serigala Arab", "Arab",
                "Ukuran serigala arab lebih kecil daripada serigala pada umumnya. Serigala ini hidup dan berburu secara bergerombol (dua sampai tiga ekor serigala). Hewan ini juga termasuk serigala yang tidak tahu cara melolong.", R.drawable.serigala_2));
        serigalas.add(new Serigala("Serigala Rusia", "Utara-Tengah Rusia",
                "Russian Wolf merupakan salah satu dari lima subspesies serigala yang ditemukan di dalam Federasi Rusia. Serigala Rusia dijuluki sebagai predator juara karena salah satu serigala abu-abu terbesa", R.drawable.serigala_3));
        serigalas.add(new Serigala("Serigala Jepang", "Jepang",
                "Serigala Honsh, dikenal juga dengan sebutan serigala Jepang atau Anjing Gunung (yaminu) yang juga merupakan subspesies serigala di Jepang yang sudah punah. Serigala Honsh adalah penghuni Pulau Honsh, Shikoku dan Kysh. Serigala ini punah karena penyakit rabies dan aksi pemusnahan oleh manusia", R.drawable.serigala_4));
        serigalas.add(new Serigala("Serigala Abu-Abu", "Amerika Utara",
                "Hewan-hewan ini selamat dari zaman es dan diperkirakan adalah nenek moyang dari anjing domestik. Namun mereka bisa saja tidak selamat dari peradaban manusia  ", R.drawable.serigala_5));
        serigalas.add(new Serigala("Serigala Tundra", "Eropa Utara",
                "Di antara yang terbesar dari serigala abu-abu, hewan ini memiliki mantel bulu yang halus dan sering diburu untuk itu  ", R.drawable.serigala_6));
        return serigalas;
    }
    private static List<Rusa> initDataRusa(Context ctx) {
        List<Rusa> rusass = new ArrayList<>();
        rusass.add(new Rusa("Rusa Totol", "Sumatera",
                " Rusa totol memiliki rambut berwarna coklat kemerah-merahan yang dipenuhi dengan bintik-bintik besar warna putih", R.drawable.rusa_1));
        rusass.add(new Rusa("Rusa Bawean", "Pulau Bawean",
                "Rusa Bawean merupakan kelompok rusa berbadan kecil asli Indonesia  yang habitat aslinya hanya berada di pulau Bawean (150 km dari Gresik).", R.drawable.rusa_2));
        rusass.add(new Rusa("Rusa Timor", "Sumbar",
                "Rusa timor merupakan rusa tropis terbesar kedua setelah rusa sambar. Di Indonesia, rusa ini memiliki sub-spesies paling banyak. Berat rusa timor antara 40-120 kg, tergantung pada sub-spesiesnya.", R.drawable.rusa_3));
        rusass.add(new Rusa("Rusa Sambar", "Asia",
                "Rambut rusa sambar umumnya memiliki warna coklat dan coklat kemerah-merahan yang diikuti dengan adanya gradasi sampai agak kehitaman (gelap) pada rusa jantan atau rusa berusia tua.  Ekor rusa sambar agak pendek serta tertutup bulu yang cukup panjang", R.drawable.rusa_4));
        rusass.add(new Rusa("Kijang Kuning", "Kalimantan",
                "Secara keseluruhan, rusa ini memiliki warna rambut kekuningan-jingga dengan pola warna coklat gelap di bagian punggung terutama di bagian tengkuk", R.drawable.rusa_5));
        rusass.add(new Rusa("Kijang Muncak", "Kalimantan",
                "Rusa ini memiliki berat tubuh hanya sekitar 12 kg dan jarang ada yang mencapai 23 kg. Rambutnya terasa sangat halus dengan warna bervariasi dari coklat agak kemerahan ke keemasan di bagian punggung dan agak pucat hingga agak berwarna putih di bagian perut. ", R.drawable.rusa_6));
        return rusass;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKelinci(ctx));
        hewans.addAll(initDataSerigala(ctx));
        hewans.addAll(initDataRusa(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
