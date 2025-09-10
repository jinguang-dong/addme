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
public final class icj {
    public final InterleavedImageU8 a;
    public final YuvImage b;
    public final HardwareBuffer c;
    public final ShotMetadata d;
    public final JpgEncoderMetadata e;
    public final poe f;
    public final long g;
    public final Optional h;
    public final syu i;
    public final hkw j;
    public final InterleavedImageU8 k;
    public final loz l;
    public final ShotParams m;
    public final Optional n;
    public final Optional o;
    public final Optional p;
    public final hxu q;
    public final gga r;
    public final jod s;

    public icj() {
        throw null;
    }

    public static ici a() {
        ici iciVar = new ici((byte[]) null);
        iciVar.g(Optional.empty());
        return iciVar;
    }

    public final pas b() {
        InterleavedImageU8 interleavedImageU8 = this.a;
        if (interleavedImageU8 != null) {
            return new pas(interleavedImageU8.d(), interleavedImageU8.b());
        }
        YuvImage yuvImage = this.b;
        if (yuvImage != null) {
            return new pas(yuvImage.b(), yuvImage.a());
        }
        HardwareBuffer hardwareBuffer = this.c;
        if (hardwareBuffer != null) {
            return new pas(hardwareBuffer.getWidth(), hardwareBuffer.getHeight());
        }
        throw new IllegalStateException("Format is none of the known ones.");
    }

    public final boolean equals(Object obj) {
        JpgEncoderMetadata jpgEncoderMetadata;
        jod jodVar;
        hkw hkwVar;
        InterleavedImageU8 interleavedImageU8;
        loz lozVar;
        ShotParams shotParams;
        if (obj == this) {
            return true;
        }
        if (obj instanceof icj) {
            icj icjVar = (icj) obj;
            InterleavedImageU8 interleavedImageU82 = this.a;
            if (interleavedImageU82 != null ? interleavedImageU82.equals(icjVar.a) : icjVar.a == null) {
                YuvImage yuvImage = this.b;
                if (yuvImage != null ? yuvImage.equals(icjVar.b) : icjVar.b == null) {
                    HardwareBuffer hardwareBuffer = this.c;
                    if (hardwareBuffer != null ? hardwareBuffer.equals(icjVar.c) : icjVar.c == null) {
                        if (this.d.equals(icjVar.d) && ((jpgEncoderMetadata = this.e) != null ? jpgEncoderMetadata.equals(icjVar.e) : icjVar.e == null) && this.f.equals(icjVar.f) && this.g == icjVar.g && this.q.equals(icjVar.q) && this.h.equals(icjVar.h) && ((jodVar = this.s) != null ? jodVar.equals(icjVar.s) : icjVar.s == null) && this.i.equals(icjVar.i) && this.r.equals(icjVar.r) && ((hkwVar = this.j) != null ? hkwVar.equals(icjVar.j) : icjVar.j == null) && ((interleavedImageU8 = this.k) != null ? interleavedImageU8.equals(icjVar.k) : icjVar.k == null) && ((lozVar = this.l) != null ? lozVar.equals(icjVar.l) : icjVar.l == null) && ((shotParams = this.m) != null ? shotParams.equals(icjVar.m) : icjVar.m == null) && this.n.equals(icjVar.n) && this.o.equals(icjVar.o) && this.p.equals(icjVar.p)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        InterleavedImageU8 interleavedImageU8 = this.a;
        int iHashCode = interleavedImageU8 == null ? 0 : interleavedImageU8.hashCode();
        YuvImage yuvImage = this.b;
        int iHashCode2 = yuvImage == null ? 0 : yuvImage.hashCode();
        int i = iHashCode ^ 1000003;
        HardwareBuffer hardwareBuffer = this.c;
        int iHashCode3 = ((((((i * 1000003) ^ iHashCode2) * 1000003) ^ (hardwareBuffer == null ? 0 : hardwareBuffer.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        JpgEncoderMetadata jpgEncoderMetadata = this.e;
        int iHashCode4 = (((iHashCode3 ^ (jpgEncoderMetadata == null ? 0 : jpgEncoderMetadata.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        long j = this.g;
        int iHashCode5 = (((((iHashCode4 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        jod jodVar = this.s;
        int iHashCode6 = (((((iHashCode5 ^ (jodVar == null ? 0 : jodVar.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003;
        hkw hkwVar = this.j;
        int iHashCode7 = (iHashCode6 ^ (hkwVar == null ? 0 : hkwVar.hashCode())) * 1000003;
        InterleavedImageU8 interleavedImageU82 = this.k;
        int iHashCode8 = (iHashCode7 ^ (interleavedImageU82 == null ? 0 : interleavedImageU82.hashCode())) * 1000003;
        loz lozVar = this.l;
        int iHashCode9 = (iHashCode8 ^ (lozVar == null ? 0 : lozVar.hashCode())) * 1000003;
        ShotParams shotParams = this.m;
        return this.p.hashCode() ^ ((((((iHashCode9 ^ (shotParams != null ? shotParams.hashCode() : 0)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003);
    }

    public final String toString() {
        Optional optional = this.p;
        Optional optional2 = this.o;
        Optional optional3 = this.n;
        ShotParams shotParams = this.m;
        loz lozVar = this.l;
        InterleavedImageU8 interleavedImageU8 = this.k;
        hkw hkwVar = this.j;
        gga ggaVar = this.r;
        syu syuVar = this.i;
        jod jodVar = this.s;
        Optional optional4 = this.h;
        hxu hxuVar = this.q;
        poe poeVar = this.f;
        JpgEncoderMetadata jpgEncoderMetadata = this.e;
        ShotMetadata shotMetadata = this.d;
        HardwareBuffer hardwareBuffer = this.c;
        YuvImage yuvImage = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(yuvImage) + ", " + String.valueOf(hardwareBuffer) + ", " + String.valueOf(shotMetadata) + ", " + String.valueOf(jpgEncoderMetadata) + ", " + String.valueOf(poeVar) + ", " + this.g + ", " + String.valueOf(hxuVar) + ", " + String.valueOf(optional4) + ", " + String.valueOf(jodVar) + ", " + String.valueOf(syuVar) + ", " + String.valueOf(ggaVar) + ", " + String.valueOf(hkwVar) + ", " + String.valueOf(interleavedImageU8) + ", " + String.valueOf(lozVar) + ", " + String.valueOf(shotParams) + ", " + String.valueOf(optional3) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + "}";
    }

    public icj(InterleavedImageU8 interleavedImageU8, YuvImage yuvImage, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, JpgEncoderMetadata jpgEncoderMetadata, poe poeVar, long j, hxu hxuVar, Optional optional, jod jodVar, syu syuVar, gga ggaVar, hkw hkwVar, InterleavedImageU8 interleavedImageU82, loz lozVar, ShotParams shotParams, Optional optional2, Optional optional3, Optional optional4) {
        this.a = interleavedImageU8;
        this.b = yuvImage;
        this.c = hardwareBuffer;
        this.d = shotMetadata;
        this.e = jpgEncoderMetadata;
        this.f = poeVar;
        this.g = j;
        this.q = hxuVar;
        this.h = optional;
        this.s = jodVar;
        this.i = syuVar;
        this.r = ggaVar;
        this.j = hkwVar;
        this.k = interleavedImageU82;
        this.l = lozVar;
        this.m = shotParams;
        this.n = optional2;
        this.o = optional3;
        this.p = optional4;
    }
}
