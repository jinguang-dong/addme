package defpackage;

import android.graphics.PointF;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcv implements nqh, paq {
    private final hnw A;
    private final mwq B;
    private final ocq C;
    public final pka a;
    public final owf b;
    public final Integer c;
    public final owf d;
    public fda e;
    public final FocusIndicatorView i;
    private final Set j;
    private final rwc k;
    private final msh l;
    private final mmk m;
    private final rwc n;
    private final owf o;
    private final gsj p;
    private final owf q;
    private final rwc r;
    private our s;
    private paq t;
    private final jkh x;
    private final hie y;
    private final hbj z;
    private boolean u = false;
    public nlt f = null;
    public nlt g = null;
    public paq h = null;
    private paq v = null;
    private final oun w = new fcu(this, 0);

    public fcv(jkh jkhVar, our ourVar, hnw hnwVar, FocusIndicatorView focusIndicatorView, pka pkaVar, Set set, rwc rwcVar, msh mshVar, mmk mmkVar, hie hieVar, rwc rwcVar2, gsj gsjVar, owf owfVar, owf owfVar2, owf owfVar3, ocq ocqVar, rwc rwcVar3, hbj hbjVar, owf owfVar4, mwq mwqVar) {
        this.x = jkhVar;
        this.i = focusIndicatorView;
        this.a = pkaVar;
        this.A = hnwVar;
        this.j = set;
        this.k = rwcVar;
        this.l = mshVar;
        this.m = mmkVar;
        this.y = hieVar;
        this.n = rwcVar2;
        this.o = owfVar;
        this.p = gsjVar;
        this.q = owfVar2;
        this.b = owfVar3;
        this.C = ocqVar;
        this.z = hbjVar;
        this.c = (Integer) hbjVar.a(gzj.b).orElse(0);
        this.r = rwcVar3;
        this.d = owfVar4;
        this.B = mwqVar;
        ourVar.d(this);
    }

    @Override // defpackage.nqh
    public final boolean a(PointF pointF) {
        return true;
    }

    public final void c(rwc rwcVar) {
        rwc rwcVar2 = this.k;
        if (rwcVar2.h()) {
            mlw mlwVar = (mlw) rwcVar2.c();
            mlv mlvVar = mlv.TOUCH_TO_FOCUS;
            mlwVar.m(mlvVar);
            ((mlw) rwcVar2.c()).k(mlvVar);
        }
        d(rwcVar);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.u = true;
        paq paqVar = this.h;
        if (paqVar != null) {
            paqVar.close();
        }
        our ourVar = this.s;
        if (ourVar != null) {
            ourVar.close();
        }
        paq paqVar2 = this.t;
        if (paqVar2 != null) {
            paqVar2.close();
        }
        paq paqVar3 = this.v;
        if (paqVar3 != null) {
            paqVar3.close();
            this.v = null;
        }
    }

    public final void d(rwc rwcVar) {
        paq paqVar = this.v;
        if (paqVar != null) {
            paqVar.close();
            this.v = null;
        }
        rwc rwcVar2 = this.n;
        if (rwcVar2.h()) {
            ((mhe) rwcVar2.c()).n(false, rwcVar);
        }
    }

    public final void e() {
        FocusIndicatorView focusIndicatorView = this.i;
        focusIndicatorView.l();
        focusIndicatorView.r();
        rwc rwcVar = this.k;
        if (rwcVar.h()) {
            ((mlw) rwcVar.c()).k(mlv.TOUCH_TO_FOCUS);
        }
        rwc rwcVar2 = this.r;
        if (rwcVar2.h()) {
            ((hko) rwcVar2.c()).g();
        }
    }

    public final boolean f() {
        return ((Boolean) this.q.dL()).booleanValue() && !this.z.p(gzy.l);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[Catch: all -> 0x0268, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:12:0x0012, B:14:0x0017, B:16:0x0021, B:18:0x002f, B:20:0x0037, B:22:0x003f, B:28:0x0063, B:30:0x0073, B:32:0x007d, B:35:0x0084, B:37:0x008f, B:39:0x0095, B:42:0x009c, B:36:0x008a, B:25:0x005a, B:49:0x00ad, B:51:0x00b5, B:56:0x00c6, B:58:0x00ca, B:59:0x00cd, B:61:0x00d1, B:62:0x00d4, B:64:0x00d8, B:65:0x00db, B:67:0x00e0, B:68:0x00e5, B:70:0x00e9, B:71:0x00ec, B:73:0x00f0, B:74:0x00f3, B:75:0x00f9, B:77:0x00ff, B:78:0x0109, B:80:0x0111, B:82:0x0117, B:83:0x0124, B:85:0x012b, B:87:0x0131, B:89:0x013d, B:91:0x014b, B:92:0x0154, B:105:0x01cd, B:107:0x01d1, B:108:0x01d8, B:110:0x01f7, B:112:0x0204, B:111:0x0200, B:93:0x0162, B:96:0x0187, B:99:0x019b, B:101:0x01a5, B:102:0x01ae, B:104:0x01be, B:97:0x018e, B:98:0x0195, B:45:0x00a3), top: B:118:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[Catch: all -> 0x0268, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:12:0x0012, B:14:0x0017, B:16:0x0021, B:18:0x002f, B:20:0x0037, B:22:0x003f, B:28:0x0063, B:30:0x0073, B:32:0x007d, B:35:0x0084, B:37:0x008f, B:39:0x0095, B:42:0x009c, B:36:0x008a, B:25:0x005a, B:49:0x00ad, B:51:0x00b5, B:56:0x00c6, B:58:0x00ca, B:59:0x00cd, B:61:0x00d1, B:62:0x00d4, B:64:0x00d8, B:65:0x00db, B:67:0x00e0, B:68:0x00e5, B:70:0x00e9, B:71:0x00ec, B:73:0x00f0, B:74:0x00f3, B:75:0x00f9, B:77:0x00ff, B:78:0x0109, B:80:0x0111, B:82:0x0117, B:83:0x0124, B:85:0x012b, B:87:0x0131, B:89:0x013d, B:91:0x014b, B:92:0x0154, B:105:0x01cd, B:107:0x01d1, B:108:0x01d8, B:110:0x01f7, B:112:0x0204, B:111:0x0200, B:93:0x0162, B:96:0x0187, B:99:0x019b, B:101:0x01a5, B:102:0x01ae, B:104:0x01be, B:97:0x018e, B:98:0x0195, B:45:0x00a3), top: B:118:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c A[Catch: all -> 0x0268, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:12:0x0012, B:14:0x0017, B:16:0x0021, B:18:0x002f, B:20:0x0037, B:22:0x003f, B:28:0x0063, B:30:0x0073, B:32:0x007d, B:35:0x0084, B:37:0x008f, B:39:0x0095, B:42:0x009c, B:36:0x008a, B:25:0x005a, B:49:0x00ad, B:51:0x00b5, B:56:0x00c6, B:58:0x00ca, B:59:0x00cd, B:61:0x00d1, B:62:0x00d4, B:64:0x00d8, B:65:0x00db, B:67:0x00e0, B:68:0x00e5, B:70:0x00e9, B:71:0x00ec, B:73:0x00f0, B:74:0x00f3, B:75:0x00f9, B:77:0x00ff, B:78:0x0109, B:80:0x0111, B:82:0x0117, B:83:0x0124, B:85:0x012b, B:87:0x0131, B:89:0x013d, B:91:0x014b, B:92:0x0154, B:105:0x01cd, B:107:0x01d1, B:108:0x01d8, B:110:0x01f7, B:112:0x0204, B:111:0x0200, B:93:0x0162, B:96:0x0187, B:99:0x019b, B:101:0x01a5, B:102:0x01ae, B:104:0x01be, B:97:0x018e, B:98:0x0195, B:45:0x00a3), top: B:118:0x0001 }] */
    @Override // defpackage.nqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean g(android.graphics.PointF r8) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcv.g(android.graphics.PointF):boolean");
    }

    @Override // defpackage.nqh
    public final void b() {
    }
}
