package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jpc implements qfc {
    final /* synthetic */ jpd c;
    private final qfc d;
    public final AtomicInteger a = new AtomicInteger(0);
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final szh b = new szh();

    public jpc(jpd jpdVar, qfc qfcVar) {
        this.c = jpdVar;
        this.d = qfcVar;
    }

    @Override // defpackage.qfc
    public final void a(syu syuVar) {
        this.d.a(syuVar);
        this.b.f(syuVar);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [sgt, shi] */
    @Override // defpackage.qlv
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.d.b(byteBuffer, bufferInfo);
            this.a.incrementAndGet();
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            ((sgt) ((sgt) jpd.a.c().i(th)).M((char) 2994)).s("Error occurred while writing");
            this.c.b.c();
        }
    }

    @Override // defpackage.qlv, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList;
        int i;
        int i2;
        this.e.set(true);
        try {
            jpd jpdVar = this.c;
            int iDecrementAndGet = jpdVar.d.decrementAndGet();
            if (jpdVar.f && !jpdVar.b.b().isCancelled() && iDecrementAndGet == 0) {
                Object obj = jpdVar.e;
                synchronized (obj) {
                    arrayList = new ArrayList();
                    synchronized (obj) {
                        Iterator it = jpdVar.c.iterator();
                        i = -1;
                        while (true) {
                            i2 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            jpc jpcVar = (jpc) it.next();
                            szh szhVar = jpcVar.b;
                            if (szhVar.isDone()) {
                                String string = ((MediaFormat) ske.U(szhVar)).getString("mime");
                                if (qsp.v(string)) {
                                    arrayList.add(Integer.valueOf(jpcVar.a.get()));
                                } else if (string.equals("application/microvideo-meta-stream")) {
                                    i = jpcVar.a.get();
                                }
                            } else {
                                rnt.L(jpcVar.a.get() == 0);
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new RuntimeException("No video tracks are being added; aborting microvideo.");
                }
                if (i != -1) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (Math.abs(((Integer) it2.next()).intValue() - i) < 25) {
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        sb.append(((Integer) it3.next()).intValue());
                        sb.append(",");
                    }
                    throw new RuntimeException(String.format("Number of motion and video frames substantially differ (video=%s motion=%d).", sb, Integer.valueOf(i)));
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    int iIntValue = ((Integer) it4.next()).intValue();
                    if (i2 < iIntValue) {
                        i2 = iIntValue;
                    }
                }
                if (i2 < 10) {
                    throw new RuntimeException(String.format(Locale.US, "Too few video frames (max: %d) in microvideo", Integer.valueOf(i2)));
                }
                this.c.c.clear();
            }
        } catch (CancellationException unused) {
        } catch (Throwable th) {
            try {
                ((sgt) ((sgt) jpd.a.c().i(th)).M(2992)).s("Error occurred while closing");
                this.c.b.c();
            } finally {
                this.d.close();
            }
        }
    }
}
