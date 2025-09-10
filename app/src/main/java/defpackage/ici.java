package defpackage;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.JpgEncoderMetadata;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.YuvImage;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ici {
    public InterleavedImageU8 a;
    public YuvImage b;
    public HardwareBuffer c;
    public JpgEncoderMetadata d;
    public syu e;
    public hkw f;
    public InterleavedImageU8 g;
    public loz h;
    public ShotParams i;
    public Optional j;
    public Optional k;
    public jod l;
    private ShotMetadata m;
    private poe n;
    private long o;
    private Optional p;
    private Optional q;
    private byte r;
    private hxu s;
    private gga t;

    public ici() {
        throw null;
    }

    public final icj a() {
        ShotMetadata shotMetadata;
        poe poeVar;
        hxu hxuVar;
        syu syuVar;
        gga ggaVar;
        if (this.r != 1 || (shotMetadata = this.m) == null || (poeVar = this.n) == null || (hxuVar = this.s) == null || (syuVar = this.e) == null || (ggaVar = this.t) == null) {
            throw new IllegalStateException();
        }
        icj icjVar = new icj(this.a, this.b, this.c, shotMetadata, this.d, poeVar, this.o, hxuVar, this.p, this.l, syuVar, ggaVar, this.f, this.g, this.h, this.i, this.q, this.j, this.k);
        int i = icjVar.a != null ? 1 : 0;
        if (icjVar.b != null) {
            i++;
        }
        if (icjVar.c != null) {
            i++;
        }
        if (i == 1) {
            return icjVar;
        }
        throw new IllegalArgumentException(a.bv(i, "We need exactly one image set; we have "));
    }

    public final void b() {
        this.b = null;
        this.a = null;
        this.c = null;
    }

    public final void c(iea ieaVar) {
        this.p = Optional.of(ieaVar);
    }

    public final void d(hxu hxuVar) {
        hxuVar.getClass();
        this.s = hxuVar;
    }

    public final void e(poe poeVar) {
        poeVar.getClass();
        this.n = poeVar;
    }

    public final void f(ShotMetadata shotMetadata) {
        shotMetadata.getClass();
        this.m = shotMetadata;
    }

    public final void g(Optional optional) {
        optional.getClass();
        this.q = optional;
    }

    public final void h(long j) {
        this.o = j;
        this.r = (byte) 1;
    }

    public final void i(gga ggaVar) {
        ggaVar.getClass();
        this.t = ggaVar;
    }

    public ici(byte[] bArr) {
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
    }

    public ici(icj icjVar) {
        this.p = Optional.empty();
        this.q = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.a = icjVar.a;
        this.b = icjVar.b;
        this.c = icjVar.c;
        this.m = icjVar.d;
        this.d = icjVar.e;
        this.n = icjVar.f;
        this.o = icjVar.g;
        this.s = icjVar.q;
        this.p = icjVar.h;
        this.l = icjVar.s;
        this.e = icjVar.i;
        this.t = icjVar.r;
        this.f = icjVar.j;
        this.g = icjVar.k;
        this.h = icjVar.l;
        this.i = icjVar.m;
        this.q = icjVar.n;
        this.j = icjVar.o;
        this.k = icjVar.p;
        this.r = (byte) 1;
    }
}
