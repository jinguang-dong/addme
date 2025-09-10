package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jyn implements poj {
    public final pdk a;
    final /* synthetic */ jyo b;
    private final kfl c;
    private final kbz d;
    private final pas e;
    private final int f;
    private poj g = null;

    public jyn(jyo jyoVar, pdk pdkVar, kfl kflVar, kbz kbzVar, int i) {
        this.b = jyoVar;
        this.a = pdkVar;
        this.c = kflVar;
        this.d = kbzVar;
        this.f = i;
        poj pojVarP = jyoVar.b.a(pdkVar).p();
        try {
            pojVarP.getClass();
            this.e = new pas(pojVarP.c(), pojVarP.b());
            pojVarP.close();
        } catch (Throwable th) {
            if (pojVarP != null) {
                try {
                    pojVarP.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private final synchronized poj k() {
        szh szhVar = new szh();
        if (this.g == null) {
            jyo jyoVar = this.b;
            jyoVar.a.b(this.a, this.c, this.f, this.d, new jym(this, szhVar));
            this.g = (poj) ske.V(szhVar);
        }
        return this.g;
    }

    @Override // defpackage.poj
    public final int a() {
        return 35;
    }

    @Override // defpackage.poj
    public final int b() {
        return this.e.b;
    }

    @Override // defpackage.poj
    public final int c() {
        return this.e.a;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
        poj pojVar = this.g;
        if (pojVar != null) {
            pojVar.close();
        }
    }

    @Override // defpackage.poj
    public final long d() {
        pdo pdoVarB = this.a.b();
        pdoVarB.getClass();
        return pdoVarB.b;
    }

    @Override // defpackage.poj
    public final Rect e() {
        pas pasVar = this.e;
        return new Rect(0, 0, pasVar.a, pasVar.b);
    }

    @Override // defpackage.poj
    public final HardwareBuffer f() {
        poj pojVarK = k();
        if (pojVarK != null) {
            return pojVarK.f();
        }
        return null;
    }

    @Override // defpackage.poj
    public final List g() {
        if (k() != null) {
            return k().g();
        }
        int i = sbp.d;
        return sex.a;
    }

    @Override // defpackage.poj
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.pns
    public final qaq j() {
        return new qaq((Object) null);
    }

    @Override // defpackage.poj
    public final /* synthetic */ void h(pof pofVar) {
    }
}
