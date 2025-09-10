package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phx extends pil {
    public final pij a;
    public final pas b;
    public final long c;
    public final int d;
    public final qpf e;

    public phx(peq peqVar, pjr pjrVar, pij pijVar, int i, boolean z) {
        super(peqVar, pjrVar, z);
        this.a = pijVar;
        this.d = i;
        pas pasVar = peqVar.d;
        this.b = pasVar;
        this.c = qpt.ax(pijVar.a, pasVar);
        this.e = new qpf(i);
    }

    @Override // defpackage.peo
    public final int a() {
        return this.a.a;
    }

    @Override // defpackage.peo
    public final pas b() {
        return this.b;
    }

    @Override // defpackage.peo
    public final void e(Surface surface) {
        throw new UnsupportedOperationException("setSurface should never be called on buffered streams.");
    }

    @Override // defpackage.pil
    public final long g() {
        return this.c;
    }

    public final Surface h() {
        return this.a.b;
    }

    @Override // defpackage.pil
    public final pet i() {
        return pet.IMAGE_READER;
    }

    @Override // defpackage.pil
    public final boolean j() {
        return this.h.m;
    }
}
