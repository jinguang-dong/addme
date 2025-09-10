package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trf extends toj {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final toj e;
    public final toj f;
    public final int g;
    private final int h;

    public trf(toj tojVar, toj tojVar2) {
        this.e = tojVar;
        this.f = tojVar2;
        int iD = tojVar.d();
        this.h = iD;
        this.d = iD + tojVar2.d();
        this.g = Math.max(tojVar.f(), tojVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static toj g(toj tojVar, toj tojVar2) {
        int iD = tojVar.d();
        int iD2 = tojVar2.d();
        byte[] bArr = new byte[iD + iD2];
        tojVar.v(bArr, 0, iD);
        tojVar2.v(bArr, iD, iD2);
        return new toh(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.toj
    public final byte a(int i) {
        s(i, this.d);
        return b(i);
    }

    @Override // defpackage.toj
    public final byte b(int i) {
        int i2 = this.h;
        return i < i2 ? this.e.b(i) : this.f.b(i - i2);
    }

    @Override // defpackage.toj
    public final int d() {
        return this.d;
    }

    @Override // defpackage.toj
    protected final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.e.e(bArr, i, i2, i6);
            this.f.e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.toj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof toj)) {
            return false;
        }
        toj tojVar = (toj) obj;
        int i = this.d;
        if (i != tojVar.d()) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        int i2 = this.c;
        int i3 = tojVar.c;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        tre treVar = new tre(this);
        tog togVarA = treVar.next();
        tre treVar2 = new tre(tojVar);
        tog togVarA2 = treVar2.next();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iD = togVarA.d() - i4;
            int iD2 = togVarA2.d() - i5;
            int iMin = Math.min(iD, iD2);
            if (!(i4 == 0 ? togVarA.g(togVarA2, i5, iMin) : togVarA2.g(togVarA, i4, iMin))) {
                return false;
            }
            i6 += iMin;
            if (i6 >= i) {
                if (i6 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                i4 = 0;
                togVarA = treVar.next();
            } else {
                i4 += iMin;
                togVarA = togVarA;
            }
            if (iMin == iD2) {
                togVarA2 = treVar2.next();
                i5 = 0;
            } else {
                i5 += iMin;
            }
        }
    }

    @Override // defpackage.toj
    protected final int f() {
        return this.g;
    }

    @Override // defpackage.toj
    public final boolean h() {
        return this.d >= c(this.g);
    }

    @Override // defpackage.toj
    protected final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.toj, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new trd(this);
    }

    @Override // defpackage.toj
    public final toj j(int i, int i2) {
        int i3 = this.d;
        int iM = m(i, i2, i3);
        if (iM == 0) {
            return toj.b;
        }
        if (iM == i3) {
            return this;
        }
        int i4 = this.h;
        if (i2 <= i4) {
            return this.e.j(i, i2);
        }
        int i5 = i2 - i4;
        if (i >= i4) {
            return this.f.j(i - i4, i5);
        }
        toj tojVar = this.e;
        return new trf(tojVar.j(i, tojVar.d()), this.f.j(0, i5));
    }

    @Override // defpackage.toj
    public final void k(tob tobVar) {
        this.e.k(tobVar);
        this.f.k(tobVar);
    }

    @Override // defpackage.toj
    public final void l(OutputStream outputStream) {
        this.e.l(outputStream);
        this.f.l(outputStream);
    }

    @Override // defpackage.toj
    /* renamed from: n */
    public final tof iterator() {
        return new trd(this);
    }

    Object writeReplace() {
        return new toh(u());
    }
}
