package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sbm extends sbp {
    private final transient sbp a;

    public sbm(sbp sbpVar) {
        this.a = sbpVar;
    }

    private final int B(int i) {
        return (size() - 1) - i;
    }

    private final int C(int i) {
        return size() - i;
    }

    @Override // defpackage.sbp
    /* renamed from: b */
    public final sbp subList(int i, int i2) {
        rnt.K(i, i2, size());
        return this.a.subList(C(i2), C(i)).fB();
    }

    @Override // defpackage.sbp, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.sbe
    public final boolean fA() {
        return this.a.fA();
    }

    @Override // defpackage.sbp
    public final sbp fB() {
        return this.a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rnt.S(i, size());
        return this.a.get(B(i));
    }

    @Override // defpackage.sbp, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return B(iLastIndexOf);
        }
        return -1;
    }

    @Override // defpackage.sbp, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return B(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.sbp, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.sbp, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
