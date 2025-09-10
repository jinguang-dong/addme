package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class egu implements egy, egg {
    public final ehd a;
    public eja b;
    private final efs c;

    public egu(efs efsVar, ejh ejhVar, eiz eizVar) {
        this.c = efsVar;
        ehd ehdVarA = eizVar.a.a();
        this.a = ehdVarA;
        ejhVar.i(ehdVarA);
        ehdVarA.h(this);
    }

    public static int a(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.egy
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.egg
    public final String g() {
        throw null;
    }

    @Override // defpackage.egg
    public final void f(List list, List list2) {
    }
}
