package defpackage;

import android.graphics.PointF;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljd implements npn {
    public final owq a;
    public final AtomicReference b = new AtomicReference();
    public final ovx c = new ovx(false);
    public pae d = pae.a;
    public boolean e = false;
    public float f = 1.0f;
    public float g = 0.2f;
    public int h = 0;
    public final PointF i = new PointF(-1.0f, -1.0f);
    public kuf j;
    public final noy k;

    public ljd(noy noyVar, owq owqVar) {
        this.k = noyVar;
        this.a = owqVar;
    }

    @Override // defpackage.npn
    public final npl a(npj npjVar) {
        return (npl) DesugarAtomicReference.updateAndGet(this.b, new fpn(this, npjVar, 2));
    }

    public final void b(PointF pointF) {
        this.i.set(pointF);
        ljb ljbVar = (ljb) this.b.get();
        if (ljbVar != null) {
            ljbVar.f(pointF);
        }
    }

    public final synchronized void c(kuf kufVar) {
        this.j = kufVar;
        ljb ljbVar = (ljb) this.b.get();
        if (ljbVar != null) {
            ljbVar.g(kufVar);
        }
    }

    public final void d(boolean z) {
        this.e = z;
        boolean z2 = false;
        if (((Boolean) this.c.d).booleanValue() && z) {
            z2 = true;
        }
        this.a.a(Boolean.valueOf(z2));
        ljb ljbVar = (ljb) this.b.get();
        if (ljbVar != null) {
            ljbVar.e = z;
        }
    }
}
