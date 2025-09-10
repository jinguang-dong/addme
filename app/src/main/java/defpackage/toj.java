package defpackage;

import com.google.android.apps.camera.modeldownloader.uD.uCzt;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class toj implements Iterable, Serializable {
    public static final toj b = new toh(tpx.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    private static toj c(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return (toj) it.next();
        }
        int i2 = i >>> 1;
        toj tojVarC = c(it, i2);
        toj tojVarC2 = c(it, i - i2);
        if (Integer.MAX_VALUE - tojVarC.d() < tojVarC2.d()) {
            throw new IllegalArgumentException("ByteString would be too long: " + tojVarC.d() + "+" + tojVarC2.d());
        }
        int[] iArr = trf.a;
        if (tojVarC2.d() == 0) {
            return tojVarC;
        }
        if (tojVarC.d() == 0) {
            return tojVarC2;
        }
        int iD = tojVarC.d() + tojVarC2.d();
        if (iD < 128) {
            return trf.g(tojVarC, tojVarC2);
        }
        if (tojVarC instanceof trf) {
            trf trfVar = (trf) tojVarC;
            toj tojVar = trfVar.f;
            if (tojVar.d() + tojVarC2.d() < 128) {
                return new trf(trfVar.e, trf.g(tojVar, tojVarC2));
            }
            toj tojVar2 = trfVar.e;
            if (tojVar2.f() > tojVar.f() && trfVar.g > tojVarC2.f()) {
                return new trf(tojVar2, new trf(tojVar, tojVarC2));
            }
        }
        if (iD >= trf.c(Math.max(tojVarC.f(), tojVarC2.f()) + 1)) {
            return new trf(tojVarC, tojVarC2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        sla.v(tojVarC, arrayDeque);
        sla.v(tojVarC2, arrayDeque);
        toj trfVar2 = (toj) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            trfVar2 = new trf((toj) arrayDeque.pop(), trfVar2);
        }
        return trfVar2;
    }

    static int m(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a.bE(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(a.bu(i2, i, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a.bu(i3, i2, "End index: ", " >= "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static toj o(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? b : c(iterable.iterator(), size);
    }

    public static toj p(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        m(0, iRemaining, byteBuffer.remaining());
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        return new toh(bArr);
    }

    public static toj q(byte[] bArr) {
        return r(bArr, 0, bArr.length);
    }

    public static toj r(byte[] bArr, int i, int i2) {
        m(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new toh(bArr2);
    }

    static void s(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.bu(i2, i, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(a.bv(i, "Index < 0: "));
        }
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    protected abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    protected abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int iD = d();
            i = i(iD, 0, iD);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    protected abstract int i(int i, int i2, int i3);

    public abstract toj j(int i, int i2);

    public abstract void k(tob tobVar);

    public abstract void l(OutputStream outputStream);

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public tof iterator() {
        return new toc(this);
    }

    public final boolean t() {
        return d() == 0;
    }

    public final byte[] u() {
        int iD = d();
        if (iD == 0) {
            return tpx.b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    @Deprecated
    public final void v(byte[] bArr, int i, int i2) {
        m(0, i2, d());
        m(i, i + i2, bArr.length);
        if (i2 > 0) {
            e(bArr, 0, i, i2);
        }
    }

    public final String toString() {
        return String.format(Locale.ROOT, uCzt.IOyfzdSNUL, Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? sla.u(this) : sla.u(j(0, 47)).concat("..."));
    }
}
