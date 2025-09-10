package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sas extends sav {
    final /* synthetic */ saw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sas(saw sawVar) {
        super(sawVar);
        this.a = sawVar;
    }

    @Override // defpackage.sav
    public final Object a(int i) {
        return this.a.a[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        saw sawVar = this.a;
        int iBb = ujp.bb(obj);
        int iC = sawVar.c(obj, iBb);
        if (iC == -1) {
            return false;
        }
        sawVar.i(iC, iBb);
        return true;
    }
}
