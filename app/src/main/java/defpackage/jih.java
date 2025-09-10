package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
class jih implements jid, jhh, jgm, jgl {
    private static final sgv f = sgv.g("jih");
    public final Context a;
    public final uem b;
    public final pbn c;
    public final Executor d;
    public final luj e;
    private final out g;
    private final Executor h;
    private syu i;
    private boolean j;

    public jih(Context context, luj lujVar, uem uemVar, out outVar, pbn pbnVar, Executor executor, Executor executor2) {
        this.a = context;
        this.e = lujVar;
        this.b = uemVar;
        this.g = outVar;
        this.c = pbnVar;
        this.h = executor;
        this.d = executor2;
    }

    private final syu g(syu syuVar) {
        return swz.j(syuVar, new jie(0), this.d);
    }

    private final void h() {
        if (this.j) {
            return;
        }
        this.i = ske.R(new sxh() { // from class: jif
            /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[PHI: r1 r3
              0x009b: PHI (r1v7 android.database.Cursor) = (r1v6 android.database.Cursor), (r1v8 android.database.Cursor) binds: [B:28:0x0099, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]
              0x009b: PHI (r3v7 java.lang.String) = (r3v17 java.lang.String), (r3v11 java.lang.String) binds: [B:28:0x0099, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
            @Override // defpackage.sxh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.syu a() throws java.lang.Throwable {
                /*
                    r11 = this;
                    jih r11 = r11.a
                    pbn r0 = r11.c
                    java.lang.String r1 = "Location#isLocationEnabled"
                    r0.f(r1)
                    android.content.Context r1 = r11.a
                    java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
                    int r2 = r1.checkSelfPermission(r2)
                    r3 = 0
                    if (r2 == 0) goto L1c
                    java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
                    int r2 = r1.checkSelfPermission(r2)
                    if (r2 != 0) goto Lcc
                L1c:
                    luj r2 = r11.e
                    lur r4 = defpackage.luf.b
                    java.lang.Object r2 = r2.b(r4)
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto Lcc
                    java.lang.String r2 = "connectLocationProvider"
                    r0.f(r2)
                    odn r0 = defpackage.odn.a
                    r2 = 0
                    int r0 = r0.f(r1, r2)
                    r4 = 1
                    if (r0 != 0) goto Lbc
                    sgv r0 = defpackage.jhz.a
                    android.content.pm.PackageManager r0 = r1.getPackageManager()
                    android.content.Intent r5 = new android.content.Intent
                    java.lang.String r6 = "com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"
                    r5.<init>(r6)
                    r6 = 65536(0x10000, float:9.1835E-41)
                    android.content.pm.ResolveInfo r0 = r0.resolveActivity(r5, r6)
                    if (r0 == 0) goto Lb1
                    android.content.ContentResolver r5 = r1.getContentResolver()
                    android.net.Uri r6 = defpackage.jhz.d     // Catch: java.lang.Throwable -> L7b java.lang.RuntimeException -> L7e
                    java.lang.String r0 = "value"
                    java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L7b java.lang.RuntimeException -> L7e
                    java.lang.String r8 = "name=?"
                    java.lang.String r0 = "use_location_for_services"
                    java.lang.String[] r9 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L7b java.lang.RuntimeException -> L7e
                    r10 = 0
                    android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L7b java.lang.RuntimeException -> L7e
                    if (r1 == 0) goto L78
                    boolean r0 = r1.moveToNext()     // Catch: java.lang.RuntimeException -> L76 java.lang.Throwable -> La8
                    if (r0 == 0) goto L78
                    java.lang.String r3 = r1.getString(r2)     // Catch: java.lang.RuntimeException -> L76 java.lang.Throwable -> La8
                    goto L78
                L76:
                    r0 = move-exception
                    goto L80
                L78:
                    if (r1 == 0) goto L9e
                    goto L9b
                L7b:
                    r0 = move-exception
                    r11 = r0
                    goto Lab
                L7e:
                    r0 = move-exception
                    r1 = r3
                L80:
                    sgv r2 = defpackage.jhz.a     // Catch: java.lang.Throwable -> La8
                    shi r2 = r2.c()     // Catch: java.lang.Throwable -> La8
                    shi r0 = r2.i(r0)     // Catch: java.lang.Throwable -> La8
                    sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.Throwable -> La8
                    r2 = 2733(0xaad, float:3.83E-42)
                    shi r0 = r0.M(r2)     // Catch: java.lang.Throwable -> La8
                    sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.Throwable -> La8
                    java.lang.String r2 = "Failed to get 'Use My Location' setting"
                    r0.s(r2)     // Catch: java.lang.Throwable -> La8
                    if (r1 == 0) goto L9e
                L9b:
                    r1.close()
                L9e:
                    if (r3 != 0) goto La1
                    goto Lbc
                La1:
                    int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> Lbc
                    if (r0 != r4) goto Lbc
                    goto Lb1
                La8:
                    r0 = move-exception
                    r11 = r0
                    r3 = r1
                Lab:
                    if (r3 == 0) goto Lb0
                    r3.close()
                Lb0:
                    throw r11
                Lb1:
                    android.content.Context r0 = r11.a
                    java.util.concurrent.Executor r1 = r11.d
                    jhz r2 = new jhz
                    r2.<init>(r0, r1)
                    r3 = r2
                    goto Lc4
                Lbc:
                    uem r0 = r11.b
                    jib r1 = new jib
                    r1.<init>(r0)
                    r3 = r1
                Lc4:
                    r3.c(r4)
                    pbn r0 = r11.c
                    r0.g()
                Lcc:
                    pbn r11 = r11.c
                    syu r0 = defpackage.ske.M(r3)
                    r11.g()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jif.a():syu");
            }
        }, this.h);
        this.j = true;
    }

    @Override // defpackage.jid
    public final fse a() {
        syu syuVar = this.i;
        return syuVar == null ? fse.a() : new fse(g(syuVar), 1000L);
    }

    @Override // defpackage.jgl
    public final void b() {
        syu syuVar = this.i;
        if (syuVar != null) {
            ojl.ck(syuVar, new jig(0), this.g);
        }
        this.j = false;
    }

    @Override // defpackage.jgm
    public final void c() {
        h();
    }

    @Override // defpackage.jid
    public final rwc e() {
        syu syuVar = this.i;
        if (syuVar != null && syuVar.isDone()) {
            return d();
        }
        ((sgt) f.c().M(2764)).s("Location provider not ready, skipping.");
        return rvk.a;
    }

    @Override // defpackage.jid
    public final fse f() {
        h();
        return new fse(g(this.i), 2000L);
    }

    @Override // defpackage.jid
    public final rwc d() {
        try {
            if (this.i == null) {
                return rvk.a;
            }
            try {
                this.c.f(CZAHo.rWaHUxAL);
                return rwc.i((Location) ((swn) g(this.i)).t(1000L, TimeUnit.MILLISECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((sgt) ((sgt) f.c().i(e)).M(2763)).s("Failed to get current location.");
                this.c.g();
                return rvk.a;
            }
        } finally {
            this.c.g();
        }
    }
}
