package defpackage;

import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsr implements Window.OnFrameMetricsAvailableListener {
    public static final /* synthetic */ int a = 0;
    private boolean b;
    private long c;
    private final ArrayMap d;
    private final rww e = rnt.y(new kus(3));
    private final uem f;

    public qsr(ArrayMap arrayMap, uem uemVar) {
        this.d = arrayMap;
        this.f = uemVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2;
        int i3;
        char c;
        int i4;
        int i5 = 1;
        if (!this.b) {
            this.b = true;
            uem uemVar = this.f;
            if (uemVar.a() == null || !((Boolean) uemVar.a()).booleanValue()) {
                this.c = ((Long) this.e.fr()).longValue();
            } else {
                this.c = (long) (1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate());
            }
        }
        if (frameMetrics.getMetric(9) == 1) {
            return;
        }
        char c2 = '\b';
        long metric = frameMetrics.getMetric(8);
        long j = this.c;
        long metric2 = frameMetrics.getMetric(13);
        ArrayMap arrayMap = this.d;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            int i6 = 0;
            while (i6 < size) {
                qsu qsuVar = (qsu) arrayMap.valueAt(i6);
                int i7 = i5;
                long j2 = metric;
                int i8 = (int) (j2 / 1000000);
                if (i8 < 0) {
                    qsuVar.i += i7;
                    c = c2;
                    i2 = i7;
                } else {
                    qsuVar.h += i7;
                    if (qsuVar.o) {
                        qsuVar.q.add(Long.valueOf(j2));
                        qsuVar.p.add(Long.valueOf(metric2));
                    }
                    i2 = i7;
                    if (metric2 > 0) {
                        i3 = i8;
                        int i9 = (int) ((j2 - metric2) / 1000000);
                        if (qsuVar.n < i9) {
                            qsuVar.n = i9;
                        }
                        int[] iArr = qsuVar.e;
                        int i10 = i9 < 20 ? i9 >= -20 ? ((i9 + 20) >> 1) + 12 : i9 >= -30 ? ((i9 + 30) / 5) + 10 : i9 >= -100 ? ((i9 + 100) / 10) + 3 : i9 >= -200 ? ((i9 + 200) / 50) + 1 : 0 : i9 < 30 ? ((i9 - 20) / 5) + 32 : i9 < 100 ? ((i9 - 30) / 10) + 34 : i9 < 200 ? ((i9 - 50) / 100) + 41 : i9 < 1000 ? ((i9 - 200) / 100) + 43 : 51;
                        iArr[i10] = iArr[i10] + 1;
                        if (j2 > metric2) {
                            qsuVar.f++;
                            qsuVar.k += i3;
                        }
                        if (j2 > j) {
                            qsuVar.g++;
                            qsuVar.l += i3;
                        }
                    } else {
                        i3 = i8;
                        if (j2 > j) {
                            qsuVar.f++;
                            qsuVar.k += i3;
                        }
                    }
                    int[] iArr2 = qsuVar.d;
                    if (i3 <= 20) {
                        c = '\b';
                        i4 = i3 >= 8 ? (i3 >> 1) - 2 : i3 / 4;
                    } else {
                        c = '\b';
                        i4 = i3 <= 30 ? (i3 / 5) + 4 : i3 <= 100 ? (i3 / 10) + 7 : i3 <= 200 ? (i3 / 50) + 15 : i3 <= 1000 ? (i3 / 100) + 17 : i3 < 5000 ? 27 : 28;
                    }
                    iArr2[i4] = iArr2[i4] + 1;
                    qsuVar.i += i;
                    if (qsuVar.j < i3) {
                        qsuVar.j = i3;
                    }
                    qsuVar.m += i3;
                }
                i6++;
                c2 = c;
                metric = j2;
                i5 = i2;
            }
        }
    }
}
