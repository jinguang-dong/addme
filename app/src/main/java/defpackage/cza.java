package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cza {
    public static final byte[] a = new byte[0];
    public static HashMap b;
    public static final String[] c;
    private static final String[] d;

    static {
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        d = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", GAQqzWiWWcYOgy.dVSH, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", VnmwoBe.OcCVAJSSwtbt, "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", TOnSyMaYeslEl.JJJYwAp, "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        c = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    }

    public static long a(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return rkf.k(j, rkf.k(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return rkf.m(j, rkf.k(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 >= j && j3 % j == 0) {
            return rkf.k(j2, rkf.k(j3, j, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j && j % j3 == 0) {
            return rkf.m(j2, rkf.k(j, j3, RoundingMode.UNNECESSARY));
        }
        long jM = rkf.m(j, j2);
        if (jM != Long.MAX_VALUE && jM != Long.MIN_VALUE) {
            return rkf.k(jM, j3, roundingMode);
        }
        long jL = rkf.l(Math.abs(j2), Math.abs(j3));
        long jK = rkf.k(j2, jL, RoundingMode.UNNECESSARY);
        long jK2 = rkf.k(j3, jL, RoundingMode.UNNECESSARY);
        long jL2 = rkf.l(Math.abs(j), Math.abs(jK2));
        long jK3 = rkf.k(j, jL2, RoundingMode.UNNECESSARY);
        long jK4 = rkf.k(jK2, jL2, RoundingMode.UNNECESSARY);
        long jM2 = rkf.m(jK3, jK);
        if (jM2 != Long.MAX_VALUE && jM2 != Long.MIN_VALUE) {
            return rkf.k(jM2, jK4, roundingMode);
        }
        double d2 = jK3 * (jK / jK4);
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return svs.a(d2, roundingMode);
    }

    public static String b(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static HashMap c() throws MissingResourceException {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = d.length;
        HashMap map = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = d;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static byte[] d(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] e(float f) {
        return ske.ah(Float.floatToIntBits(f));
    }

    public static byte[] f(int... iArr) {
        byte[] bArr = new byte[36];
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = iArr[i2];
            bArr[i] = (byte) (i3 >> 24);
            bArr[i + 1] = (byte) (i3 >> 16);
            bArr[i + 2] = (byte) (i3 >> 8);
            bArr[i + 3] = (byte) i3;
            i += 4;
        }
        return bArr;
    }

    public static void g(int i) {
        Integer.toString(i, 36);
    }
}
