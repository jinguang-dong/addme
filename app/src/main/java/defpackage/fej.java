package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fej implements fex {
    private final fei a;
    private final nan b;
    private int c = 1;
    private final imi d;

    public fej(imi imiVar, Context context, fei feiVar) {
        this.d = imiVar;
        this.a = feiVar;
        nao naoVar = new nao();
        naoVar.e = (String) feiVar.c;
        naoVar.h = context;
        naoVar.a = feiVar.a;
        naoVar.b = feiVar.b;
        naoVar.j = 3;
        this.b = naoVar.a();
    }

    @Override // defpackage.fex
    public final void a() {
        this.d.f(this.b);
        this.c = 3;
        ((ezh) this.a.d).b();
    }

    @Override // defpackage.fex
    public final void b() {
        this.d.a(this.b);
        this.c = 2;
        ((ezh) this.a.d).c();
    }

    @Override // defpackage.fex
    public final int c() {
        return this.c;
    }
}
