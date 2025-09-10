package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class pdf {
    public final pcp b;
    public final OutputStream c;
    private int f = 0;
    public int d = 0;
    public int e = 0;
    private int a = 0;

    public pdf(OutputStream outputStream, pcp pcpVar) {
        this.c = outputStream;
        this.b = pcpVar;
    }

    protected abstract int a(int i);

    protected final short b(int i) throws pde {
        d();
        c(2, i);
        d();
        pcp pcpVar = this.b;
        int i2 = pcpVar.b;
        if (i2 + 2 > pcpVar.c) {
            throw new IllegalStateException("Byte queue is too short");
        }
        byte[] bArr = pcpVar.a;
        int i3 = i2 + 1;
        pcpVar.b = i3;
        int i4 = bArr[i2] & 255;
        pcpVar.b = i2 + 2;
        return (short) ((i4 << 8) + (bArr[i3] & 255));
    }

    public final void c(int i, int i2) throws pde {
        if (this.b.a() < i || this.e != 0 || this.d != 0) {
            throw new pde(i, i2);
        }
    }

    public final void d() {
        if (this.e != 0 || this.d != 0) {
            throw new IllegalStateException("Can not read or write bytes while forwarding or skipping");
        }
    }

    public final void e(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        if (i3 >= i2 || i3 < 0) {
            if (i3 > 0) {
                this.d = i3 - i2;
                return;
            }
            return;
        }
        int i4 = this.e;
        if (i4 >= i2 || i4 < 0) {
            this.c.write(bArr, i, i2);
            int i5 = this.e;
            if (i5 > 0) {
                this.e = i5 - i2;
                return;
            }
            return;
        }
        if (i3 > 0) {
            i += i3;
            i2 -= i3;
            this.d = 0;
        } else if (i4 > 0) {
            this.c.write(bArr, i, i4);
            int i6 = this.e;
            i += i6;
            i2 -= i6;
            this.e = 0;
        }
        pcp pcpVar = this.b;
        pcpVar.b(i2);
        System.arraycopy(bArr, i, pcpVar.a, pcpVar.c, i2);
        pcpVar.c += i2;
        f();
    }

    public final void f() {
        while (this.b.a() >= this.f && this.e == 0 && this.d == 0) {
            try {
                this.f = 0;
                this.a = a(this.a);
            } catch (pde e) {
                this.f = e.a;
                this.a = e.b;
                return;
            }
        }
    }

    protected final void g(byte[] bArr) throws IOException {
        d();
        this.c.write(bArr);
    }

    protected final void h(short s) throws IOException {
        d();
        OutputStream outputStream = this.c;
        outputStream.write((s >> 8) & 255);
        outputStream.write(s & 255);
    }

    protected final void i(int i) throws IOException {
        d();
        pcp pcpVar = this.b;
        if (pcpVar.a() >= i) {
            pcpVar.c(this.c, i);
        } else {
            this.e = i - pcpVar.a();
            pcpVar.c(this.c, pcpVar.a());
        }
    }

    protected final void j(int i) {
        d();
        pcp pcpVar = this.b;
        if (pcpVar.a() >= i) {
            pcpVar.d(i);
        } else {
            this.d = i - pcpVar.a();
            pcpVar.d(pcpVar.a());
        }
    }
}
