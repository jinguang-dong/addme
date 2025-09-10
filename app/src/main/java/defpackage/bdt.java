package defpackage;

import j$.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdt extends ufm implements List, bdu {
    private final bdu a;
    private final int b;
    private final int c;
    private final int d;

    public bdt(bdu bduVar, int i, int i2) {
        this.a = bduVar;
        this.b = i;
        this.c = i2;
        a.ak(i, i2, bduVar.size());
        this.d = i2 - i;
    }

    @Override // defpackage.ufi
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ufm, java.util.List
    public final Object get(int i) {
        a.ai(i, this.d);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.ufm, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        a.ak(i, i2, this.d);
        bdu bduVar = this.a;
        int i3 = this.b;
        return new bdt(bduVar, i + i3, i3 + i2);
    }
}
