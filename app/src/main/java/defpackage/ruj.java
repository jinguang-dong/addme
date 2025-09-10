package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruj implements ruo {
    public Optional a = Optional.empty();
    private final Optional b;
    private final int c;

    public ruj(int i, Optional optional) {
        this.c = i;
        this.b = optional;
    }

    @Override // defpackage.ruo
    public final void a(byte[] bArr) {
        if (this.c == 1) {
            this.b.ifPresent(new mdw(bArr, 13));
        } else {
            this.a.ifPresent(new mdw(bArr, 14));
        }
    }

    @Override // defpackage.ruo
    public final void b(int i) {
        this.b.ifPresent(new iph(i, 3));
    }

    @Override // defpackage.ruo
    public final void c() {
        if (this.c == 1) {
            this.b.ifPresent(new lig(20));
        }
    }

    @Override // defpackage.ruo
    public final void d() {
        if (this.c == 1) {
            this.b.ifPresent(new lig(19));
        }
    }
}
