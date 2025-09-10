package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfq {
    public final pci a;
    public final Handler b;
    public paq c;
    private paq d;

    public hfq(pci pciVar, Handler handler) {
        this.a = pciVar;
        this.b = handler;
    }

    public final void a(String str) {
        out.a();
        if (this.d == null) {
            this.d = this.a.b("CameraActivity onResume: ".concat(String.valueOf(str)));
        }
        b();
    }

    public final void b() {
        paq paqVar = this.c;
        if (paqVar != null) {
            paqVar.close();
            this.c = null;
        }
    }

    public final void c() {
        out.a();
        paq paqVar = this.d;
        if (paqVar != null) {
            paqVar.close();
            this.d = null;
        }
        b();
    }
}
