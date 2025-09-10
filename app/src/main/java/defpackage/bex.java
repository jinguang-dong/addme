package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bex extends bew {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 2;
        Object[] objArr = this.a;
        return new bek(objArr[i], objArr[i + 1]);
    }
}
