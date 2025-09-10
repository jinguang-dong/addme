package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbs extends sbx {
    final /* synthetic */ sbt a;

    public sbs(sbt sbtVar) {
        this.a = sbtVar;
    }

    @Override // defpackage.sbx
    public final sbv a() {
        return this.a;
    }

    @Override // defpackage.scn, defpackage.sbe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: fz */
    public final sgj listIterator() {
        return this.a.a();
    }

    @Override // defpackage.sbx, defpackage.scn, defpackage.sbe
    public Object writeReplace() {
        return super.writeReplace();
    }
}
