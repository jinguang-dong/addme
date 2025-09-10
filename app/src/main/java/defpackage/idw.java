package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idw {
    public Optional a;
    public Optional b;
    public ShotMetadata c;
    public Optional d;
    private Optional e;
    private Optional f;
    private sbp g;
    private iea h;
    private Optional i;

    public idw() {
        throw null;
    }

    public final idx a() {
        sbp sbpVar;
        iea ieaVar;
        ShotMetadata shotMetadata = this.c;
        if (shotMetadata == null || (sbpVar = this.g) == null || (ieaVar = this.h) == null) {
            throw new IllegalStateException();
        }
        idx idxVar = new idx(this.e, this.f, this.a, this.b, shotMetadata, sbpVar, this.d, ieaVar, this.i);
        if (((Integer) idxVar.a.map(new idv(1)).orElse(0)).intValue() + ((Integer) idxVar.b.map(new idv(0)).orElse(0)).intValue() + ((Integer) idxVar.c.map(new idv(2)).orElse(0)).intValue() != 1) {
            return null;
        }
        return idxVar;
    }

    public final void b(iea ieaVar) {
        ieaVar.getClass();
        this.h = ieaVar;
    }

    public final void c(sbp sbpVar) {
        sbpVar.getClass();
        this.g = sbpVar;
    }

    public final void d(RawReadView rawReadView) {
        this.e = Optional.ofNullable(rawReadView);
    }

    public final void e(InterleavedImageU8 interleavedImageU8) {
        this.f = Optional.ofNullable(interleavedImageU8);
    }

    public final void f(ShotParams shotParams) {
        this.i = Optional.of(shotParams);
    }

    public idw(byte[] bArr) {
        this.e = Optional.empty();
        this.f = Optional.empty();
        this.a = Optional.empty();
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.i = Optional.empty();
    }
}
