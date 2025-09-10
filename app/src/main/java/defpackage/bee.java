package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bee extends bdz {
    private final Object[] c;
    private final bei d;

    public bee(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int iD = bdq.d(i2);
        this.d = new bei(objArr, ukc.o(i, iD), iD, i3);
    }

    @Override // defpackage.bdz, java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        bei beiVar = this.d;
        if (beiVar.hasNext()) {
            this.a++;
            return beiVar.next();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i - beiVar.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        bei beiVar = this.d;
        int i3 = beiVar.b;
        if (i <= i3) {
            this.a = i2;
            return beiVar.previous();
        }
        Object[] objArr = this.c;
        this.a = i2;
        return objArr[i2 - i3];
    }
}
