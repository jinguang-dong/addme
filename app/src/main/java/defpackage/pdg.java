package defpackage;

import android.util.Log;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pdg extends OutputStream {
    private final pdf a;

    public pdg(pdf pdfVar) {
        this.a = pdfVar;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.c.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        pdf pdfVar = this.a;
        int i2 = pdfVar.d;
        if (i2 != 0) {
            if (i2 > 0) {
                pdfVar.d = i2 - 1;
            }
        } else {
            if (pdfVar.e != 0) {
                pdfVar.c.write(i);
                int i3 = pdfVar.e;
                if (i3 > 0) {
                    pdfVar.e = i3 - 1;
                    return;
                }
                return;
            }
            pcp pcpVar = pdfVar.b;
            pcpVar.b(1);
            byte[] bArr = pcpVar.a;
            int i4 = pcpVar.c;
            bArr[i4] = (byte) (i & 255);
            pcpVar.c = i4 + 1;
            pdfVar.f();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        pdf pdfVar = this.a;
        pcp pcpVar = pdfVar.b;
        int iA = pcpVar.a();
        String str = TOnSyMaYeslEl.ASXVwZCIrOSc;
        if (iA > 0) {
            Log.w(str, "Warning: unwritten bytes in the buffer: ".concat(pcpVar.toString()));
        }
        int i = pdfVar.e;
        if (i > 0) {
            Log.w(str, a.bE(i, "Warning: still need to forward ", " bytes"));
        }
        if (pdfVar.d > 0) {
            Log.w(str, "Warning: still need to skip " + pdfVar.e + " bytes");
        }
        pdfVar.c.close();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.a.e(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.e(bArr, i, i2);
    }
}
