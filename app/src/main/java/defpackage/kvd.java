package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kvd implements kgd {
    private static final sgv c = sgv.g(qcjAcSmlN.sQU);
    public final long a;
    public final ixp b;
    private final Optional d;
    private final Optional e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private boolean j;
    private final pfz k;

    public kvd(pfz pfzVar, long j, ixp ixpVar, int i, juv juvVar, boolean z, boolean z2, boolean z3) {
        this.k = pfzVar;
        this.a = j;
        this.b = ixpVar;
        this.f = i;
        this.d = juvVar.d;
        this.e = juvVar.e;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // defpackage.kgd
    public final long a() {
        return this.a;
    }

    @Override // defpackage.kgd
    public final kit b() {
        int i;
        if (this.b == ixp.NIGHT_SIGHT && (i = this.f) != -1) {
            Optional optional = this.d;
            if (optional.isPresent()) {
                Optional optional2 = this.e;
                if (optional2.isPresent()) {
                    return qpt.ck(new pej(CaptureRequest.FLASH_MODE, 2), new pej((CaptureRequest.Key) optional.get(), true), new pej((CaptureRequest.Key) optional2.get(), Integer.valueOf(i)));
                }
            }
        }
        return qpt.cl();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    @Override // defpackage.kgd, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        try {
            pfz pfzVar = this.k;
            ske.W(pfzVar.a.e(this.g, this.h, this.i, false), new kvc(), sxo.a);
        } catch (pco e) {
            ((sgt) ((sgt) c.b().i(e)).M((char) 3480)).s("Error unlocking 3A.");
        }
    }
}
