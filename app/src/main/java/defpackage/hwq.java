package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;
import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hwq extends ojl {
    public static final sgv a = sgv.g("hwq");
    public final int b;
    public final Set c;
    private final Executor d;
    private final Set e;

    public hwq(Integer num, Executor executor, Set set, Set set2) {
        super((short[]) null);
        this.b = num.intValue();
        this.d = executor;
        this.e = set;
        this.c = set2;
    }

    @Override // defpackage.ojl
    public final void a(final poe poeVar) {
        this.d.execute(new Runnable() { // from class: hwo
            /* JADX WARN: Type inference failed for: r0v12, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r0v17, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r0v21, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r0v24, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r0v29, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r0v35, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r0v39, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r0v8, types: [sgt, shi] */
            @Override // java.lang.Runnable
            public final void run() {
                CaptureResult.Key key;
                CaptureResult.Key key2;
                CaptureResult.Key key3;
                hwq hwqVar = this.a;
                poe poeVar2 = poeVar;
                synchronized (hwqVar) {
                    String str = (String) poeVar2.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                    pnx pnxVar = str != null ? (pnx) poeVar2.g().get(str) : null;
                    if (pnxVar == null) {
                        pnxVar = poeVar2;
                    }
                    if (str == null) {
                        str = "0";
                    }
                    String str2 = str;
                    int i = hwqVar.b;
                    if (i == 0) {
                        CaptureResult.Key key4 = nvi.e;
                        if (key4 == null || (key = nvi.f) == null) {
                            ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1644)).s("Null OIS keys (version: 0)");
                        } else {
                            long[] jArr = (long[]) pnxVar.a(nvi.d);
                            int[] iArr = (int[]) pnxVar.a(key4);
                            int[] iArr2 = (int[]) pnxVar.a(key);
                            if (jArr == null || iArr == null || iArr2 == null) {
                                ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1648)).s("Null pointer for OIS data. OIS API version: 0");
                            } else {
                                for (int i2 = 0; i2 < jArr.length; i2++) {
                                    hwqVar.i(jArr[i2], iArr[i2], iArr2[i2], str2);
                                }
                            }
                        }
                    } else if (i == 1) {
                        CaptureResult.Key key5 = nvi.g;
                        if (key5 == null || (key2 = nvi.h) == null) {
                            ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1645)).s("Null OIS keys (version: 1)");
                        } else {
                            long[] jArr2 = (long[]) pnxVar.a(nvi.d);
                            float[] fArr = (float[]) pnxVar.a(key5);
                            float[] fArr2 = (float[]) pnxVar.a(key2);
                            if (jArr2 == null || fArr == null || fArr2 == null) {
                                ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1649)).s(cdVQ.eJU);
                            } else {
                                for (int i3 = 0; i3 < jArr2.length; i3++) {
                                    hwqVar.i(jArr2[i3], fArr[i3], fArr2[i3], str2);
                                }
                            }
                        }
                    } else if (i != 2) {
                        if (i != 3) {
                            ((sgt) ((sgt) hwq.a.b().g(10000, TimeUnit.MILLISECONDS)).M(1643)).t("Invalid OIS API version: %d", i);
                        } else {
                            CaptureResult.Key key6 = nvm.s;
                            if (key6 == null || (key3 = nvm.t) == null) {
                                ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1647)).s("Null OIS keys (version: 3)");
                            } else {
                                long[] jArr3 = (long[]) pnxVar.a(nvm.r);
                                int[] iArr3 = (int[]) pnxVar.a(key6);
                                int[] iArr4 = (int[]) pnxVar.a(key3);
                                if (jArr3 == null || iArr3 == null || iArr4 == null) {
                                    ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1651)).s("Null pointer for OIS data. OIS API version: 3");
                                } else {
                                    for (int i4 = 0; i4 < jArr3.length; i4++) {
                                        hwqVar.i(jArr3[i4], iArr3[i4], iArr4[i4], str2);
                                    }
                                }
                            }
                        }
                    } else if (CaptureResult.STATISTICS_OIS_SAMPLES != null) {
                        OisSample[] oisSampleArr = (OisSample[]) pnxVar.a(CaptureResult.STATISTICS_OIS_SAMPLES);
                        if (oisSampleArr != null) {
                            for (OisSample oisSample : oisSampleArr) {
                                hwqVar.i(oisSample.getTimestamp(), oisSample.getXshift(), oisSample.getYshift(), str2);
                            }
                        } else {
                            ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1650)).s("Null pointer for OIS data. OIS API version: 2");
                            Long l = (Long) pnxVar.a(CaptureResult.SENSOR_TIMESTAMP);
                            hwqVar.i(l == null ? 0L : l.longValue(), 0.0f, 0.0f, str2);
                        }
                    } else {
                        ((sgt) ((sgt) hwq.a.b().g((char) 10000, TimeUnit.MILLISECONDS)).M((char) 1646)).s("Null OIS key (version: 2)");
                    }
                    Iterator it = hwqVar.c.iterator();
                    while (it.hasNext()) {
                        ((ojl) it.next()).a(poeVar2);
                    }
                }
            }
        });
    }

    public final void i(long j, float f, float f2, String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((hwp) it.next()).c(j, f, f2, str);
        }
    }
}
