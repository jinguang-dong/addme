package j$.util.stream;

import java.util.Comparator;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0094p1 extends Y0 {
    public final Comparator b;
    public boolean c;

    public AbstractC0094p1(InterfaceC0079k1 interfaceC0079k1, Comparator comparator) {
        super(interfaceC0079k1);
        this.b = comparator;
    }

    @Override // j$.util.stream.Y0, j$.util.stream.InterfaceC0079k1
    public final boolean e() {
        this.c = true;
        return false;
    }
}
