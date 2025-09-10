package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class scp extends sbx {
    final /* synthetic */ scs a;

    public scp(scs scsVar) {
        this.a = scsVar;
    }

    @Override // defpackage.scn
    public final sbp C() {
        return new sco(this);
    }

    @Override // defpackage.sbx
    public final sbv a() {
        return this.a;
    }

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return v().iterator();
    }

    @Override // defpackage.sbx, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
