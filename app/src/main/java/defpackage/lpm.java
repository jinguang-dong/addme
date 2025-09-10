package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpm {
    public final ovx b;
    public boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final hem g;
    private final ovx i;
    public int h = 1;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public lpm(hbj hbjVar, fqg fqgVar, hem hemVar, Executor executor, pbn pbnVar) {
        ovx ovxVar = new ovx(0);
        this.b = ovxVar;
        ovx ovxVar2 = new ovx(false);
        this.i = ovxVar2;
        this.c = false;
        int iMax = Math.max(((Integer) hbjVar.a(hae.b).get()).intValue() - (true != hbjVar.p(gzs.X) ? 1 : 2), 0);
        float f = iMax;
        this.d = (int) (0.2f * f);
        this.e = (int) (0.4f * f);
        this.f = (int) (f * 0.8f);
        this.g = hemVar;
        fqgVar.b.d(owl.a(new lpl(ovxVar, iMax - 1), ovxVar2).dK(new leg(this, pbnVar, 5), executor));
        fqgVar.b.d(new khc(this, 8));
    }

    public final synchronized void a(boolean z) {
        this.c = true;
        this.i.a(Boolean.valueOf(z));
    }

    public final synchronized void b(int i) {
        this.c = true;
        this.b.a(Integer.valueOf(i));
    }

    public final synchronized int c() {
        return this.h;
    }
}
