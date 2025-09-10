package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fzk extends PipedInputStream implements InputStreamRetargetInterface {
    private final gaf a;
    private final scf b;

    public fzk(int i, int i2) {
        super(i2);
        this.a = new gaf(i, i2);
        this.b = new scf();
    }

    public final synchronized qaq a(ByteBuffer byteBuffer, int i) {
        scf scfVar = this.b;
        Object obj = scfVar.a;
        if (obj == null) {
            scfVar.a = new byte[i];
        } else if (((byte[]) obj).length != i) {
            scfVar.a = new byte[i];
        }
        Object obj2 = scfVar.a;
        int i2 = read((byte[]) obj2, 0, ((byte[]) obj2).length);
        if (i2 <= 0) {
            return null;
        }
        long jA = this.a.a(i2);
        byteBuffer.put((byte[]) obj2, 0, i2);
        byteBuffer.flip();
        return new qaq(new qkz(byteBuffer, i2, jA));
    }

    public final synchronized void b(qaq qaqVar) {
        byte[] bArrArray = qaqVar.t().array();
        int iR = qaqVar.r();
        int i = 0;
        while (iR > 0) {
            int i2 = i + 1;
            receive(bArrArray[i]);
            notifyAll();
            int i3 = iR - 1;
            if (this.in > this.out) {
                int iMin = Math.min(i3, this.buffer.length - this.in);
                System.arraycopy(bArrArray, i2, this.buffer, this.in, iMin);
                this.in += iMin;
                i2 += iMin;
                i3 -= iMin;
                if (this.in == this.buffer.length) {
                    this.in = 0;
                }
                if (i3 == 0) {
                    break;
                }
            }
            int iMin2 = Math.min(i3, this.out - this.in);
            System.arraycopy(bArrArray, i2, this.buffer, this.in, iMin2);
            this.in += iMin2;
            iR = i3 - iMin2;
            i = i2 + iMin2;
        }
        this.a.b(qaqVar.s(), qaqVar.r());
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
