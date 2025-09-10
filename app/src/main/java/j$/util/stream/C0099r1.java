package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;

/* renamed from: j$.util.stream.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0099r1 extends AbstractC0094p1 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final void end() {
        List.EL.sort(this.d, this.b);
        InterfaceC0079k1 interfaceC0079k1 = (InterfaceC0079k1) this.a;
        interfaceC0079k1.c(this.d.size());
        if (this.c) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (interfaceC0079k1.e()) {
                    break;
                } else {
                    interfaceC0079k1.d((InterfaceC0079k1) obj);
                }
            }
        } else {
            Collection.EL.a(this.d, new j$.desugar.sun.nio.fs.h(13, interfaceC0079k1));
        }
        interfaceC0079k1.end();
        this.d = null;
    }
}
