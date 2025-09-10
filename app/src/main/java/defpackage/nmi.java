package defpackage;

import android.content.pm.PackageInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmi implements jhh, jhf {
    public final uem a;
    public final uem b;
    public final PackageInfo c;
    public final out d;
    public final luj e;
    public final luj f;
    public final mdy g;
    public final jgt h;

    public nmi(uem uemVar, uem uemVar2, luj lujVar, luj lujVar2, PackageInfo packageInfo, out outVar, jgt jgtVar, mdy mdyVar) {
        this.a = uemVar;
        this.b = uemVar2;
        this.e = lujVar;
        this.f = lujVar2;
        this.c = packageInfo;
        this.d = outVar;
        this.h = jgtVar;
        this.g = mdyVar;
    }

    @Override // defpackage.jhf
    public final void ej() {
        if (uaf.b() == -1 || ((Integer) this.e.b(luf.aA)).intValue() < uaf.b()) {
            if (uaf.c() == -1 || ((Integer) this.e.b(luf.az)).intValue() < uaf.c()) {
                ((nmm) this.a.a()).b();
            }
        }
    }
}
