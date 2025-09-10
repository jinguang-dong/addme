package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class toh extends tog {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public toh(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.toj
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.toj
    public byte b(int i) {
        return this.a[i];
    }

    protected int c() {
        return 0;
    }

    @Override // defpackage.toj
    public int d() {
        return this.a.length;
    }

    @Override // defpackage.toj
    protected void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    @Override // defpackage.toj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof toj) || d() != ((toj) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof toh)) {
            return obj.equals(this);
        }
        toh tohVar = (toh) obj;
        int i = this.c;
        int i2 = tohVar.c;
        if (i == 0 || i2 == 0 || i == i2) {
            return g(tohVar, 0, d());
        }
        return false;
    }

    @Override // defpackage.tog
    public final boolean g(toj tojVar, int i, int i2) {
        if (i2 > tojVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i2 + d());
        }
        int i3 = i + i2;
        if (i3 > tojVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + tojVar.d());
        }
        if (!(tojVar instanceof toh)) {
            return tojVar.j(i, i3).equals(j(0, i2));
        }
        toh tohVar = (toh) tojVar;
        byte[] bArr = this.a;
        byte[] bArr2 = tohVar.a;
        int iC = c() + i2;
        int iC2 = c();
        int iC3 = tohVar.c() + i;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // defpackage.toj
    protected final int i(int i, int i2, int i3) {
        return tpx.a(i, this.a, c() + i2, i3);
    }

    @Override // defpackage.toj
    public final toj j(int i, int i2) {
        int iM = m(i, i2, d());
        return iM == 0 ? toj.b : new toe(this.a, c() + i, iM);
    }

    @Override // defpackage.toj
    public final void k(tob tobVar) {
        tobVar.a(this.a, c(), d());
    }

    @Override // defpackage.toj
    public final void l(OutputStream outputStream) throws IOException {
        outputStream.write(u());
    }
}
