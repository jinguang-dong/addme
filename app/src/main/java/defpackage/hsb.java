package defpackage;

import android.graphics.PointF;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hsb {
    private static final sgv a = sgv.g("hsb");
    private final mdr i = new mdr(null);
    private final Map b = new ConcurrentHashMap();
    private int g = 1;
    private int h = 1;
    private int c = 0;
    private int d = 0;
    private long e = 0;
    private PointF f = new PointF();

    private final void e(int i, hrr hrrVar) {
        this.h = i;
        this.g = hrrVar.g;
        this.c = 1;
        this.d = 0;
        this.e = hrrVar.d;
    }

    public final void a() {
        this.g = 1;
        this.h = 1;
        this.c = 0;
        this.d = 0;
        this.e = 0L;
        this.f = new PointF();
    }

    public final synchronized paq b(hrm hrmVar, Executor executor) {
        Map map = this.b;
        map.put(hrmVar, executor);
        map.size();
        return new fid(this, hrmVar, 16);
    }

    public final synchronized void c(hrm hrmVar) {
        Map map = this.b;
        map.remove(hrmVar);
        map.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.hrr r11, defpackage.rwc r12) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsb.d(hrr, rwc):void");
    }
}
