package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxa {
    private boolean a;
    private scn b;
    private byte c;

    public final pxc a() {
        if (this.b == null) {
            this.b = sfd.a;
        }
        if (this.c == 1) {
            return new pxc(this.a, this.b);
        }
        throw new IllegalStateException();
    }

    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) 1;
    }

    public final void c(Set set) {
        this.b = scn.F(set);
    }
}
