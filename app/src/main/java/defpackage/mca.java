package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.googlex.gcam.BufferUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mca implements mci {
    public static final sgv a = sgv.g("mca");
    private static final Duration p = Duration.ofMillis(25);
    public final String b;
    public final Context c;
    public final syw d;
    public final syw e;
    public final Object f;
    public final pbn g;
    public final List h;
    public mbz i;
    public mcg j;
    public mce k;
    public AssetFileDescriptor l;
    public final hbj m;
    public ggg n;
    public final qpt o;
    private boolean q;

    static {
        Duration.ofMillis(500L);
    }

    public mca(Context context, hbj hbjVar, pbn pbnVar) {
        String strF = hbjVar.f(haq.f);
        syw sywVarA = ske.A(Executors.newFixedThreadPool(50));
        syw sywVarA2 = ske.A(ojl.bZ("SEnhWorker"));
        this.f = new Object();
        this.h = new ArrayList();
        this.i = mbz.UNINITIALIZED;
        this.c = context;
        this.m = hbjVar;
        this.b = strF;
        this.g = pbnVar;
        this.d = sywVarA;
        this.e = sywVarA2;
        this.o = new mby(this);
    }

    public static final void k(Runnable runnable, syw sywVar) {
        ske.W(sywVar.submit(runnable), new fzq(3), sxo.a);
    }

    @Override // defpackage.mci
    public final paq a(mch mchVar) {
        List list = this.h;
        if (list.remove(mchVar)) {
            ((sgt) a.c().M(4652)).s("Remove existing duplicate listener.");
        }
        list.add(mchVar);
        return new loe(this, mchVar, 3, null);
    }

    @Override // defpackage.mci
    public final Duration b() {
        return p;
    }

    @Override // defpackage.mci
    public final void c() {
        synchronized (this.f) {
            if (this.i.equals(mbz.PROCESSING)) {
                k(new man(this, 5), this.e);
            }
        }
    }

    @Override // defpackage.mci
    public final void d(mcg mcgVar) {
        this.j = mcgVar;
        this.k = new mce(mcgVar.a);
    }

    @Override // defpackage.mci
    public final void e() {
        synchronized (this.f) {
            if (this.i.equals(mbz.UNINITIALIZED)) {
                k(new man(this, 6), this.e);
            }
        }
    }

    @Override // defpackage.mci
    public final void f(final ByteBuffer byteBuffer, final int i, final int i2, final int i3, final long j, final rwc rwcVar) {
        synchronized (this.f) {
            if (this.i.equals(mbz.PROCESSING)) {
                k(new Runnable() { // from class: mbw
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j2;
                        int i4;
                        rwc rwcVar2;
                        int i5;
                        rus rusVar = rus.MONOCHROME;
                        rusVar.getClass();
                        ByteBuffer byteBufferC = BufferUtils.c(byteBuffer);
                        byteBufferC.getClass();
                        mca mcaVar = this.a;
                        mce mceVar = mcaVar.k;
                        long j3 = mceVar.b;
                        long j4 = j;
                        if (j3 == Long.MIN_VALUE) {
                            mceVar.b = j4;
                            j2 = 0;
                        } else {
                            j2 = (mceVar.a * (j4 - j3)) / 1000000000;
                        }
                        int i6 = i3;
                        int i7 = i2;
                        int i8 = i;
                        rwc rwcVar3 = rwcVar;
                        rwc rwcVarJ = rwc.j(Long.valueOf(j2));
                        int i9 = i6 % 180;
                        if (i9 == 0) {
                            i4 = i7;
                            rwcVar2 = rwcVarJ;
                            i5 = i8;
                        } else {
                            i4 = i7;
                            rwcVar2 = rwcVarJ;
                            i5 = i4;
                        }
                        mcj mcjVar = new mcj(byteBufferC, i5, i9 != 0 ? i8 : i4, rusVar, rwcVar2, rwcVar3);
                        pbn pbnVar = mcaVar.g;
                        pbnVar.f("SEController#provideVideoFrame");
                        ggg gggVar = mcaVar.n;
                        gggVar.getClass();
                        Optional.empty();
                        Optional.empty();
                        Optional.empty();
                        Optional.empty();
                        ByteBuffer byteBuffer2 = mcjVar.a;
                        byteBuffer2.getClass();
                        int i10 = mcjVar.b;
                        int i11 = mcjVar.c;
                        rus rusVar2 = mcjVar.d;
                        rusVar2.getClass();
                        rva rvaVar = new rva(byteBuffer2, i10, i11, rusVar2, Optional.ofNullable((Long) ((rwg) mcjVar.e).a), Optional.ofNullable(null));
                        rul rulVar = (rul) gggVar.a;
                        AtomicReference atomicReference = rulVar.b;
                        rnt.M((atomicReference.get() == ruk.UNINITIALIZED || atomicReference.get() == ruk.INITIALIZING) ? false : true, "'initialize()' must be called before calling 'provideVideoFrame()'.");
                        rnt.M(atomicReference.get() != ruk.READY, "'start()' must be called before calling 'provideVideoFrame()'.");
                        rnt.M((atomicReference.get() == ruk.SHUTTING_DOWN || atomicReference.get() == ruk.SHUT_DOWN) ? false : true, "Can't call 'provideVideoFrame()' after calling 'shutdown()'.");
                        if (atomicReference.get() == ruk.PAUSED) {
                            ((ruk) atomicReference.get()).name();
                        } else {
                            ruz ruzVar = rulVar.e;
                            rux ruxVar = ruzVar.b;
                            if (ruxVar.b) {
                                ruy ruyVar = ruzVar.c;
                                ruyVar.b();
                                Instant instantNow = Instant.now();
                                if ((ruzVar.f.isAfter(Instant.EPOCH) ? Duration.between(ruzVar.f, instantNow) : ruxVar.h.plusSeconds(1L)).compareTo(ruxVar.h) >= 0) {
                                    ruzVar.f = instantNow;
                                    double dA = ruyVar.a();
                                    double d = ruxVar.d;
                                    double d2 = ruxVar.e;
                                    if (dA < d || dA > d2) {
                                        rtl rtlVar = ruzVar.k;
                                        String str = "StoredVideoFrameProcessor: current input FPS (" + ((int) dA) + ") is outside the allowed range (" + ((int) d) + ", " + ((int) d2) + ").";
                                        sgv sgvVar = ruz.a;
                                        ((sgt) sgvVar.c().M(5821)).v("%s", str);
                                        ((sgt) sgvVar.c().M(5822)).s("SVFP: Input FPS warning");
                                    }
                                }
                            }
                            int i12 = ruzVar.i;
                            int i13 = i12 - 1;
                            if (i12 == 0) {
                                throw null;
                            }
                            if (i13 == 0) {
                                ruzVar.h.set(rvaVar);
                            }
                        }
                        pbnVar.g();
                    }
                }, this.e);
            }
        }
    }

    public final void g(mbz mbzVar) {
        synchronized (this.f) {
            this.i = mbzVar;
        }
    }

    @Override // defpackage.mci
    public final void h() {
        synchronized (this.f) {
            if (this.i.equals(mbz.PREINITIALIZED) || this.i.equals(mbz.STOPPED)) {
                k(new Runnable() { // from class: mbx
                    /* JADX WARN: Removed duplicated region for block: B:169:0x0387 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r2v10, types: [sgt, shi] */
                    /* JADX WARN: Type inference failed for: r2v3, types: [sgt, shi] */
                    /* JADX WARN: Type inference failed for: r9v3 */
                    /* JADX WARN: Type inference failed for: r9v4 */
                    /* JADX WARN: Type inference failed for: r9v9, types: [ruk] */
                    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 1070
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbx.run():void");
                    }
                }, this.e);
            } else {
                ((sgt) a.c().M(4667)).v("Cannot start from state %s", this.i);
            }
        }
    }

    @Override // defpackage.mci
    public final void i() {
        synchronized (this.f) {
            if (!this.i.equals(mbz.STARTED) && !this.i.equals(mbz.PROCESSING)) {
                ((sgt) a.c().M(4668)).v("Cannot stop from state %s", this.i);
                return;
            }
            k(new man(this, 4), this.e);
            this.k.b = Long.MIN_VALUE;
            this.q = false;
        }
    }

    @Override // defpackage.mci
    public final boolean j(ByteBuffer byteBuffer) {
        synchronized (this.f) {
            if (this.i.equals(mbz.STARTED)) {
                g(mbz.PROCESSING);
            } else if (!this.i.equals(mbz.PROCESSING)) {
                ((sgt) a.c().M(4665)).v("Ignore audio buffer provided. State: %s.", this.i);
                return false;
            }
            k(new lsn(this, BufferUtils.c(byteBuffer), 13), this.e);
            if (!this.q) {
                this.q = true;
            }
            return true;
        }
    }
}
