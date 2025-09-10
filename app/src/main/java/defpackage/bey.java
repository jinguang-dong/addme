package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bey extends bew {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        this.b = i + 2;
        return this.a[i];
    }
}
