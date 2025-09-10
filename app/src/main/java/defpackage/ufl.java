package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ufl extends ufm implements RandomAccess {
    private final ufm a;
    private final int b;
    private final int c;

    public ufl(ufm ufmVar, int i, int i2) {
        this.a = ufmVar;
        this.b = i;
        a.ak(i, i2, ufmVar.a());
        this.c = i2 - i;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ufm, java.util.List
    public final Object get(int i) {
        a.ai(i, this.c);
        return this.a.get(this.b + i);
    }
}
