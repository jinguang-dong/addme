package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bez extends bew {
    private final boi c;

    public bez(boi boiVar) {
        this.c = boiVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new bel(this.c, objArr[i], objArr[i + 1]);
    }
}
