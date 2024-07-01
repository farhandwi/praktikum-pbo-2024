package util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateUtil {
    public static long selisihHari(Date tglAwal, Date tglAkhir) {
        long diffInMillies = Math.abs(tglAkhir.getTime() - tglAwal.getTime());
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
}
