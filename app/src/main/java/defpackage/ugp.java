package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugp extends ugo implements Iterator, ukd {
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugp(ugq ugqVar, int i, byte[] bArr) {
        super(ugqVar);
        this.d = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            a();
            int i = this.b;
            ugq ugqVar = this.a;
            if (i >= ugqVar.e) {
                throw new NoSuchElementException();
            }
            this.b = i + 1;
            this.c = i;
            Object obj = ugqVar.b[i];
            b();
            return obj;
        }
        a();
        int i2 = this.b;
        ugq ugqVar2 = this.a;
        if (i2 >= ugqVar2.e) {
            throw new NoSuchElementException();
        }
        this.b = i2 + 1;
        this.c = i2;
        Object[] objArr = ugqVar2.c;
        objArr.getClass();
        Object obj2 = objArr[i2];
        b();
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugp(ugq ugqVar, int i) {
        super(ugqVar);
        this.d = i;
    }
}
