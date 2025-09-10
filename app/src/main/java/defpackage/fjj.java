package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fjj {
    public ShotMetadata a;
    public String b;
    public Optional c;
    public Optional d;
    public Optional e;
    public lsu f;
    public Optional g;
    public hxu h;
    public gga i;
    private InterleavedImageU8 j;
    private boolean k;
    private byte l;

    public fjj() {
        throw null;
    }

    public final fjk a() {
        InterleavedImageU8 interleavedImageU8;
        ShotMetadata shotMetadata;
        hxu hxuVar;
        gga ggaVar;
        String str;
        lsu lsuVar;
        if (this.l != 1 || (interleavedImageU8 = this.j) == null || (shotMetadata = this.a) == null || (hxuVar = this.h) == null || (ggaVar = this.i) == null || (str = this.b) == null || (lsuVar = this.f) == null) {
            throw new IllegalStateException();
        }
        return new fjk(interleavedImageU8, shotMetadata, hxuVar, ggaVar, this.k, str, this.c, this.d, this.e, lsuVar, this.g);
    }

    public final void b(boolean z) {
        this.k = z;
        this.l = (byte) 1;
    }

    public final void c(InterleavedImageU8 interleavedImageU8) {
        interleavedImageU8.getClass();
        this.j = interleavedImageU8;
    }

    public fjj(byte[] bArr) {
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.g = Optional.empty();
    }

    public fjj(fjk fjkVar) {
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        this.g = Optional.empty();
        this.j = fjkVar.a;
        this.a = fjkVar.b;
        this.h = fjkVar.j;
        this.i = fjkVar.k;
        this.k = fjkVar.c;
        this.b = fjkVar.d;
        this.c = fjkVar.e;
        this.d = fjkVar.f;
        this.e = fjkVar.g;
        this.f = fjkVar.h;
        this.g = fjkVar.i;
        this.l = (byte) 1;
    }
}
