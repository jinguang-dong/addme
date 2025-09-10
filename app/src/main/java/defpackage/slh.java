package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class slh extends sli implements Serializable {
    private static final long serialVersionUID = 0;
    final int a;

    public slh(int i) {
        this.a = i;
    }

    @Override // defpackage.sli
    public final int a() {
        return this.a;
    }

    @Override // defpackage.sli
    public final int b() {
        return 32;
    }

    @Override // defpackage.sli
    public final long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.sli
    public final boolean d(sli sliVar) {
        return this.a == sliVar.a();
    }

    @Override // defpackage.sli
    public final byte[] e() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
