package defpackage;

import android.location.Location;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfm {
    public static final /* synthetic */ int a = 0;
    private static final sgv b = sgv.g("jfm");
    private static final NumberFormat c = NumberFormat.getInstance(Locale.US);

    public static Double a(Map.Entry entry) {
        try {
            return Double.valueOf(c.parse((String) entry.getValue()).doubleValue());
        } catch (ParseException e) {
            ((sgt) ((sgt) b.c().i(e)).M(2728)).E("Parse double failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }

    public static Integer b(Map.Entry entry) {
        try {
            return Integer.valueOf((String) entry.getValue());
        } catch (NumberFormatException e) {
            ((sgt) ((sgt) b.c().i(e)).M(2729)).E("Parse integer failed for %s ,value:%s", entry.getKey(), entry.getValue());
            return null;
        }
    }

    public static String c(double d) {
        String[] strArrSplit = Location.convert(Math.abs(d), 2).split(":");
        if (strArrSplit.length != 3) {
            return null;
        }
        try {
            float fFloatValue = c.parse(strArrSplit[2]).floatValue() * 1000.0f;
            return strArrSplit[0] + "/1," + strArrSplit[1] + "/1," + ((int) fFloatValue) + "/1000";
        } catch (ParseException unused) {
            ((sgt) b.c().M(2726)).v("Could not parse float: %s", strArrSplit[2]);
            return null;
        }
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Date e(Map.Entry entry) {
        try {
            return new Date(Long.parseLong((String) entry.getValue()));
        } catch (NumberFormatException unused) {
            entry.getKey();
            entry.getValue();
            return null;
        }
    }
}
