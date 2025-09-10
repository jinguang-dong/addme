package defpackage;

import com.google.android.apps.camera.backup.cNHl.ibINv;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsu {
    private static final SimpleDateFormat e;
    public final lsw a;
    public final pos b;
    public hqp c;
    public boolean d;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        e = simpleDateFormat;
    }

    public lsu(lsw lswVar, pos posVar, hqp hqpVar, boolean z) {
        hqpVar.getClass();
        this.a = lswVar;
        this.b = posVar;
        this.c = hqpVar;
        this.d = z;
        if (z) {
            lswVar.h().c(posVar);
        }
    }

    public final void a() {
        this.a.f(this, lsv.ABANDON);
    }

    public final void b() {
        this.a.f(this, lsv.PUBLISH);
    }

    public final void c(hqp hqpVar) {
        hqpVar.getClass();
        Set set = lnj.a;
        Set set2 = lnj.a;
        if (set2.contains(this.c) && !set2.contains(hqpVar)) {
            lnj.a();
        }
        if (!set2.contains(this.c) && set2.contains(hqpVar)) {
            lnj.a();
        }
        this.c = hqpVar;
    }

    public final String toString() {
        lsw lswVar = this.a;
        String str = lswVar.e;
        String strConcat = (str == null || str.length() == 0) ? "" : ibINv.RVZSfiJ.concat(str);
        return "PXL_" + e.format(new Date(lswVar.b)) + strConcat + " (" + this.b + " isprimary=" + this.d + ")";
    }
}
