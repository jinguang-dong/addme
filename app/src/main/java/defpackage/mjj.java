package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mjj {
    final /* synthetic */ out a;
    final /* synthetic */ mkl b;
    final /* synthetic */ mkr c;
    final /* synthetic */ Context d;
    public final /* synthetic */ mjl e;
    final /* synthetic */ imi f;

    public mjj(mjl mjlVar, out outVar, mkl mklVar, mkr mkrVar, imi imiVar, Context context) {
        this.a = outVar;
        this.b = mklVar;
        this.c = mkrVar;
        this.f = imiVar;
        this.d = context;
        this.e = mjlVar;
    }

    public final void a() {
        mjl mjlVar = this.e;
        ovx ovxVar = mjlVar.l;
        if (((mii) ovxVar.d).equals(mii.STATE_RECORDING_ERROR) || ((mii) ovxVar.d).equals(mii.STATE_UNINITIALIZED)) {
            return;
        }
        this.a.c(new lqd((Object) this, (Object) this.b, (Object) this.c, 9, (short[]) null));
        mjlVar.h(false);
        mjlVar.f();
    }

    public final void b(int i) {
        this.e.j(i);
    }
}
