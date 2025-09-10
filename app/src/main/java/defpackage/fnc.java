package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fnc implements jhh, jhe, jhg, jhc {
    private static final sgv f = sgv.g("fnc");
    private static final Pattern g = Pattern.compile("^(\\d+)\\.(\\d+)");
    public final Activity a;
    public final owq b;
    public final AtomicBoolean c;
    public final owq d;
    public final owf e;
    private final fnd h;
    private final int i;
    private final int j;
    private final tzj k;
    private final Executor l;
    private our m;

    public fnc(Activity activity, owq owqVar, owq owqVar2, tzj tzjVar, hbj hbjVar, Executor executor, owf owfVar) {
        fne fneVar = fne.a;
        fnd fndVar = new fnd((byte[]) null);
        fndVar.a = 2;
        this.h = fndVar;
        this.c = new AtomicBoolean();
        this.m = new our();
        this.a = activity;
        this.b = owqVar;
        this.i = ((Integer) hbjVar.a(gyi.a).orElse(Integer.MAX_VALUE)).intValue();
        this.j = ((Integer) hbjVar.a(gyi.b).orElse(Integer.MAX_VALUE)).intValue();
        this.d = owqVar2;
        this.k = tzjVar;
        this.l = executor;
        this.e = owfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Type inference failed for: r9v2, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fne a(android.content.Context r9, defpackage.nkw r10) {
        /*
            r8 = this;
            nkw r0 = defpackage.nkw.COTTAGE
            boolean r10 = r10.equals(r0)
            r0 = 0
            if (r10 == 0) goto L21
            tzj r10 = r8.k
            java.lang.Object r10 = r10.a()
            fok r10 = (defpackage.fok) r10
            foj r1 = new foj
            r1.<init>(r10, r9, r0)
            java.lang.Object r10 = defpackage.ezh.k(r1)
            fnj r10 = (defpackage.fnj) r10
            j$.util.Optional r10 = j$.util.Optional.of(r10)
            goto L25
        L21:
            j$.util.Optional r10 = j$.util.Optional.empty()
        L25:
            fnd r1 = r8.h
            r1.d = r10
            fne r1 = r1.a()
            android.content.pm.PackageManager r9 = r9.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.String r2 = "com.google.ar.core"
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.String r2 = r9.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r2 != 0) goto L4f
            sgv r8 = defpackage.fnc.f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            shi r8 = r8.b()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r9 = 288(0x120, float:4.04E-43)
            shi r8 = r8.M(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            sgt r8 = (defpackage.sgt) r8     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.String r9 = "Missing version name for ARCore."
            r8.s(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            return r1
        L4f:
            java.util.regex.Pattern r2 = defpackage.fnc.g     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.String r3 = r9.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.util.regex.Matcher r2 = r2.matcher(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            boolean r3 = r2.find()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r3 != 0) goto L73
            sgv r8 = defpackage.fnc.f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            shi r8 = r8.b()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r10 = 287(0x11f, float:4.02E-43)
            shi r8 = r8.M(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            sgt r8 = (defpackage.sgt) r8     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.String r10 = "Wrong format for version name (%s)."
            java.lang.String r9 = r9.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r8.v(r10, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            return r1
        L73:
            r3 = 1
            java.lang.String r4 = r2.group(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r5 = 2
            java.lang.String r2 = r2.group(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            boolean r6 = defpackage.rnt.V(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r6 != 0) goto Ld3
            boolean r6 = defpackage.rnt.V(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r6 == 0) goto L8a
            goto Ld3
        L8a:
            int r6 = r8.i     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            int r8 = r8.j     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r4.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            int r7 = java.lang.Integer.parseInt(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r7 > r6) goto La6
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r4 != r6) goto La7
            r2.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r2 < r8) goto La7
        La6:
            r0 = r3
        La7:
            fnd r8 = new fnd     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r2 = 0
            r8.<init>(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            if (r3 == r0) goto Lb0
            goto Lb1
        Lb0:
            r5 = 3
        Lb1:
            r8.a = r5     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.String r0 = r9.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r0.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            j$.util.Optional r0 = j$.util.Optional.of(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r8.b = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            long r2 = r9.getLongVersionCode()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            j$.util.Optional r9 = j$.util.Optional.of(r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r8.c = r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r8.d = r10     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            fne r8 = r8.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            return r8
        Ld3:
            sgv r8 = defpackage.fnc.f     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            shi r8 = r8.b()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r10 = 284(0x11c, float:3.98E-43)
            shi r8 = r8.M(r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            sgt r8 = (defpackage.sgt) r8     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            java.lang.String r10 = "Missing version numbers (%s)."
            java.lang.String r9 = r9.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            r8.v(r10, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Le9
            return r1
        Le9:
            r8 = move-exception
            sgv r9 = defpackage.fnc.f
            shi r9 = r9.b()
            java.lang.String r10 = "No ARCore package found."
            r0 = 285(0x11d, float:4.0E-43)
            defpackage.mn.c(r10, r0, r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnc.a(android.content.Context, nkw):fne");
    }

    public final void d(boolean z) {
        if (!z) {
            ((sgt) f.c().M(289)).s("InstallArCore invoked without user action.");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.ar.core"));
        intent.setPackage("com.android.vending");
        this.a.startActivity(intent);
    }

    @Override // defpackage.jhc
    public final void ea() {
        this.m.close();
        this.l.execute(new fem(this, 18));
    }

    @Override // defpackage.jhe
    public final void eb() {
        fnf fnfVar = new fnf(this, 1);
        Executor executor = this.l;
        executor.execute(fnfVar);
        our ourVar = new our();
        ourVar.d(owb.a(this.e).dK(new fnb(this, 0), executor));
        this.m = ourVar;
    }

    @Override // defpackage.jhg
    public final void eu() {
        this.l.execute(new fem(this, 19));
    }
}
