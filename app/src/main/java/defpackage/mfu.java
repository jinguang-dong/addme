package defpackage;

import j$.util.DesugarCollections;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfu implements mft {
    private static final SimpleDateFormat a;
    private static final SimpleDateFormat b;
    private static final SimpleDateFormat c;
    private final Set d;

    static {
        new SimpleDateFormat("'MVIMG'_yyyyMMdd_HHmmss", Locale.US);
        new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US);
        a = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US);
        b = new SimpleDateFormat("'PANO'_yyyyMMdd_HHmmss", Locale.US);
        new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss", Locale.US);
        c = new SimpleDateFormat("'VID'_yyyyMMdd_HHmmss_'LS'", Locale.US);
    }

    public mfu(mfs mfsVar) {
        mfsVar.getClass();
        this.d = DesugarCollections.synchronizedSet(new HashSet());
    }

    private final String d(long j, DateFormat dateFormat) {
        String str;
        String string;
        Date date = new Date(j);
        synchronized (dateFormat) {
            str = dateFormat.format(date);
        }
        Set set = this.d;
        synchronized (set) {
            String str2 = str + "";
            if (!set.contains(str2)) {
                set.add(str2);
                return str2;
            }
            int i = 0;
            do {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("_");
                i++;
                sb.append(i);
                sb.append("");
                string = sb.toString();
            } while (set.contains(string));
            set.add(string);
            return string;
        }
    }

    @Override // defpackage.mft
    public final String a(long j) {
        return d(j, a);
    }

    @Override // defpackage.mft
    public final String b(long j) {
        return d(j, c);
    }

    @Override // defpackage.mft
    public final String c(long j) {
        return d(j, b);
    }
}
