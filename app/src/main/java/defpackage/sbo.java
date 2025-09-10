package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbo extends sbp {
    final transient int a;
    final transient int b;
    final /* synthetic */ sbp c;

    public sbo(sbp sbpVar, int i, int i2) {
        this.c = sbpVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.sbe
    public final Object[] A() {
        return this.c.A();
    }

    @Override // defpackage.sbp
    /* renamed from: b */
    public final sbp subList(int i, int i2) {
        rnt.K(i, i2, this.b);
        int i3 = this.a;
        return this.c.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rnt.S(i, this.b);
        return this.c.get(i + this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // defpackage.sbp, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.sbe
    public final int y() {
        return this.c.z() + this.a + this.b;
    }

    @Override // defpackage.sbe
    public final int z() {
        return this.c.z() + this.a;
    }
}
