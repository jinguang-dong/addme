package defpackage;

import com.google.ar.core.ImageMetadata;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oya {
    public final oxj b;
    public oxy j;
    public final rwc a = rvk.a;
    private final boolean k = false;
    public int c = 2;
    private final boolean l = false;
    public final int d = 5;
    public final int e = 1;
    public final int f = ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    public final int g = 2;
    public final int h = 8;
    public final int i = 32768;
    private final boolean m = false;
    private final int n = 3;
    private final int o = 2;
    private final int p = 192000;
    private final int q = 48000;

    public oya(oxj oxjVar) {
        this.b = oxjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oya)) {
            return false;
        }
        oya oyaVar = (oya) obj;
        boolean z = oyaVar.l;
        int i = oyaVar.d;
        int i2 = oyaVar.e;
        int i3 = oyaVar.f;
        int i4 = oyaVar.g;
        int i5 = oyaVar.h;
        int i6 = oyaVar.i;
        boolean z2 = oyaVar.m;
        int i7 = oyaVar.n;
        int i8 = oyaVar.o;
        int i9 = oyaVar.p;
        int i10 = oyaVar.q;
        if (!Objects.equals(this.a, oyaVar.a) || !Objects.equals(this.j, oyaVar.j) || this.b != oyaVar.b) {
            return false;
        }
        boolean z3 = oyaVar.k;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.j, this.b, false, 5, 1, Integer.valueOf(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE), 2, 8, 32768, false, 3, 2, 192000, 48000, false);
    }
}
