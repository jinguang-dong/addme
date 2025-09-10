package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqx {
    public Optional a;
    public Optional b;
    public szh c;
    public szh d;
    private Optional e;
    private Optional f;
    private boolean g;
    private boolean h;
    private sbp i;
    private byte j;

    public iqx() {
        throw null;
    }

    public final iqy a() {
        szh szhVar;
        szh szhVar2;
        sbp sbpVar;
        if (this.j != 3 || (szhVar = this.c) == null || (szhVar2 = this.d) == null || (sbpVar = this.i) == null) {
            throw new IllegalStateException();
        }
        return new iqy(this.a, this.e, this.b, this.f, this.g, szhVar, szhVar2, this.h, sbpVar);
    }

    public final void b(sbp sbpVar) {
        sbpVar.getClass();
        this.i = sbpVar;
    }

    public final void c(Optional optional) {
        optional.getClass();
        this.e = optional;
    }

    public final void d(Optional optional) {
        optional.getClass();
        this.f = optional;
    }

    public final void e(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 2);
    }

    public final void f(boolean z) {
        this.g = z;
        this.j = (byte) (this.j | 1);
    }

    public iqx(byte[] bArr) {
        this.a = Optional.empty();
        this.e = Optional.empty();
        this.b = Optional.empty();
        this.f = Optional.empty();
    }

    public iqx(iqy iqyVar) {
        this.a = Optional.empty();
        this.e = Optional.empty();
        this.b = Optional.empty();
        this.f = Optional.empty();
        this.a = iqyVar.a;
        this.e = iqyVar.b;
        this.b = iqyVar.c;
        this.f = iqyVar.d;
        this.g = iqyVar.e;
        this.c = iqyVar.f;
        this.d = iqyVar.g;
        this.h = iqyVar.h;
        this.i = iqyVar.i;
        this.j = (byte) 3;
    }
}
