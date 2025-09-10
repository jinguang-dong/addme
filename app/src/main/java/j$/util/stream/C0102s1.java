package j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0102s1 extends AbstractC0094p1 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        InterfaceC0079k1 interfaceC0079k1 = (InterfaceC0079k1) this.a;
        interfaceC0079k1.c(this.e);
        if (this.c) {
            while (i < this.e && !interfaceC0079k1.e()) {
                interfaceC0079k1.accept((InterfaceC0079k1) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                interfaceC0079k1.accept((InterfaceC0079k1) this.d[i]);
                i++;
            }
        }
        interfaceC0079k1.end();
        this.d = null;
    }
}
