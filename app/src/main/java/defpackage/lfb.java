package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lfb implements paq {
    private static final sgv a = sgv.g("lfb");
    private static final long b = TimeUnit.SECONDS.toNanos(1);
    private static final long c = TimeUnit.MILLISECONDS.toNanos(5);
    private final long d;
    private final long e;
    private long f;
    private final iwd g;

    public lfb(long j, float f, float f2, iwd iwdVar) {
        float f3 = b;
        long j2 = (long) (f3 / f2);
        this.e = j2;
        this.d = f > -1.0f ? ((long) (f * f3)) + j + (j2 / 2) : -1L;
        this.f = j > -1 ? j + j2 : -1L;
        this.g = iwdVar;
    }

    public final synchronized void a(pdk pdkVar) {
        pdk pdkVarA;
        if (pdkVar != null) {
            if (pdkVar.b() != null) {
                try {
                    pdo pdoVarB = pdkVar.b();
                    pdoVarB.getClass();
                    long j = pdoVarB.b;
                    long j2 = this.d;
                    if (j2 > -1 && j > j2) {
                        iwd iwdVar = this.g;
                        iwe iweVar = iwdVar.c;
                        iwdVar.a.e(true);
                        synchronized (iweVar) {
                            iweVar.c = false;
                            iwo iwoVar = iwdVar.b;
                            if (iwoVar != null) {
                                iwoVar.e(false);
                                iwdVar.b = null;
                            }
                        }
                        return;
                    }
                    if (j > this.f - c && (pdkVarA = pdkVar.a()) != null) {
                        pdkVar.b();
                        iwd iwdVar2 = this.g;
                        iwe iweVar2 = iwdVar2.c;
                        synchronized (iweVar2) {
                            try {
                                if (iweVar2.c) {
                                    tht thtVarI = iweVar2.d.i(pdkVarA);
                                    if (thtVarI == null) {
                                        pdo pdoVarB2 = pdkVarA.b();
                                        ((sgt) iwe.a.c().M(2489)).u("No valid RAW image found, ignoring frame %s.", pdoVarB2 != null ? pdoVarB2.c : -1L);
                                    } else if (iwdVar2.b != null) {
                                        String.format("Reporting selected frame %s.", Long.valueOf(thtVarI.b.d()));
                                        iwo iwoVar2 = iwdVar2.b;
                                        iwoVar2.getClass();
                                        iwoVar2.b(thtVarI);
                                    } else {
                                        String.format("Caching filtered frame %s", Long.valueOf(thtVarI.b.d()));
                                        iweVar2.b.add(thtVarI);
                                    }
                                }
                            } finally {
                                pdkVarA.close();
                            }
                        }
                        pdo pdoVarB3 = pdkVar.b();
                        pdoVarB3.getClass();
                        this.f = pdoVarB3.b + this.e;
                    }
                    return;
                } finally {
                    pdkVar.close();
                }
            }
        }
        ((sgt) a.c().M(4086)).s("BufferFilter: Received invalid frame.");
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
    }
}
