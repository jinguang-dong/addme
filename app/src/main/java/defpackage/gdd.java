package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import com.google.googlex.gcam.AccelSample;
import com.google.googlex.gcam.AccelSampleVector;
import com.google.googlex.gcam.FloatArray9;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import wireless.android.learning.acmi.p11.metadata.P11MetadataSerializer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gdd extends gcv {
    private static final sgv d = sgv.g("gdd");
    public final Object c;
    private final vds e;
    private final pqn f;
    private final gda g;
    private final hbc h;
    private final our j;
    private int k;
    private final hbj l;
    private final ngw m;
    private final lta n;
    public final Deque b = new ConcurrentLinkedDeque();
    private final Queue i = new ConcurrentLinkedQueue();

    public gdd(vds vdsVar, pqn pqnVar, lta ltaVar, gda gdaVar, ngw ngwVar, hbj hbjVar, hbc hbcVar, owf owfVar, pqm pqmVar) {
        our ourVar = new our();
        this.j = ourVar;
        this.c = new Object();
        this.k = 1;
        this.e = vdsVar;
        this.f = pqnVar;
        this.n = ltaVar;
        this.g = gdaVar;
        this.m = ngwVar;
        this.l = hbjVar;
        this.h = hbcVar;
        ourVar.d(owfVar.dK(new fcs(this, pqnVar, 20), sxo.a));
        gzi gziVar = gym.a;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, plb] */
    /* JADX WARN: Type inference failed for: r2v7, types: [sgt, shi] */
    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        rwc rwcVarJ;
        rwc rwcVarI;
        qvl qvlVar;
        Object obj;
        float f;
        pjr pjrVarD;
        int i;
        int i2;
        int iIntValue;
        int i3;
        AccelSampleVector accelSampleVector;
        float[] fArr;
        Rect rect;
        float[] fArr2;
        int i4;
        float[] fArr3;
        int i5;
        float[] fArr4;
        float[] fArr5;
        byte[] bArr;
        float[] fArr6;
        CaptureResult.Key key;
        String str;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        long micros = timeUnit.toMicros(this.f.a(l.longValue()));
        rwc rwcVarD = this.a.d("application/p11-image-meta");
        if (rwcVarD.h()) {
            try {
                final lta ltaVar = this.n;
                final int i6 = 0;
                if (ltaVar.c == null) {
                    rwcVarJ = rvk.a;
                } else {
                    Long l2 = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
                    l2.getClass();
                    long jLongValue = l2.longValue();
                    ((AtomicLong) ltaVar.b).compareAndSet(-1L, jLongValue);
                    Long l3 = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
                    l3.getClass();
                    long jLongValue2 = l3.longValue() + jLongValue;
                    final GyroSampleVector gyroSampleVector = new GyroSampleVector();
                    ?? r15 = ltaVar.c;
                    r15.getClass();
                    r15.b(Math.min(((AtomicLong) r4).get(), jLongValue) - 5000000, jLongValue2 + 5000000, new pla() { // from class: gdb
                        @Override // defpackage.pla
                        public final void a(List list) {
                            if (i6 == 0) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    Object obj2 = gyroSampleVector;
                                    pld pldVar = (pld) it.next();
                                    ((GyroSampleVector) obj2).b(pldVar.e, pldVar.f, pldVar.g, pldVar.h);
                                }
                                if (list.isEmpty()) {
                                    return;
                                }
                                ((AtomicLong) ((lta) ltaVar).b).set(((pld) ujp.aQ(list)).e);
                                return;
                            }
                            list.getClass();
                            ArrayList<AccelSample> arrayList = new ArrayList(ske.bq(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                pld pldVar2 = (pld) it2.next();
                                AccelSample accelSample = new AccelSample();
                                GcamModuleJNI.AccelSample_timestamp_ns_set(accelSample.a, accelSample, pldVar2.e);
                                GcamModuleJNI.AccelSample_x_set(accelSample.a, accelSample, pldVar2.f);
                                GcamModuleJNI.AccelSample_y_set(accelSample.a, accelSample, pldVar2.g);
                                GcamModuleJNI.AccelSample_z_set(accelSample.a, accelSample, pldVar2.h);
                                arrayList.add(accelSample);
                            }
                            for (AccelSample accelSample2 : arrayList) {
                                Object obj3 = gyroSampleVector;
                                AccelSampleVector accelSampleVector2 = (AccelSampleVector) obj3;
                                GcamModuleJNI.AccelSampleVector_add(accelSampleVector2.a, accelSampleVector2, accelSample2 == null ? 0L : accelSample2.a, accelSample2);
                            }
                            if (list.isEmpty()) {
                                return;
                            }
                            ((gda) ltaVar).c.set(((pld) ske.bF(list)).e);
                        }
                    });
                    rwcVarJ = rwc.j(gyroSampleVector);
                }
                GyroSampleVector gyroSampleVector2 = (GyroSampleVector) rwcVarJ.f();
                final gda gdaVar = this.g;
                plb plbVar = gdaVar.b;
                final int i7 = 1;
                if (plbVar == null) {
                    rwcVarI = rvk.a;
                } else {
                    Object objA = poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
                    if (objA == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    long jLongValue3 = ((Number) objA).longValue();
                    AtomicLong atomicLong = gdaVar.c;
                    atomicLong.compareAndSet(-1L, jLongValue3);
                    long jMin = Math.min(atomicLong.get(), jLongValue3);
                    long j = gdaVar.d;
                    long j2 = jMin - j;
                    Object objA2 = poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
                    if (objA2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    long jLongValue4 = j + jLongValue3 + ((Number) objA2).longValue();
                    final AccelSampleVector accelSampleVector2 = new AccelSampleVector();
                    plbVar.b(j2, jLongValue4, new pla() { // from class: gdb
                        @Override // defpackage.pla
                        public final void a(List list) {
                            if (i7 == 0) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    Object obj2 = accelSampleVector2;
                                    pld pldVar = (pld) it.next();
                                    ((GyroSampleVector) obj2).b(pldVar.e, pldVar.f, pldVar.g, pldVar.h);
                                }
                                if (list.isEmpty()) {
                                    return;
                                }
                                ((AtomicLong) ((lta) gdaVar).b).set(((pld) ujp.aQ(list)).e);
                                return;
                            }
                            list.getClass();
                            ArrayList<AccelSample> arrayList = new ArrayList(ske.bq(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                pld pldVar2 = (pld) it2.next();
                                AccelSample accelSample = new AccelSample();
                                GcamModuleJNI.AccelSample_timestamp_ns_set(accelSample.a, accelSample, pldVar2.e);
                                GcamModuleJNI.AccelSample_x_set(accelSample.a, accelSample, pldVar2.f);
                                GcamModuleJNI.AccelSample_y_set(accelSample.a, accelSample, pldVar2.g);
                                GcamModuleJNI.AccelSample_z_set(accelSample.a, accelSample, pldVar2.h);
                                arrayList.add(accelSample);
                            }
                            for (AccelSample accelSample2 : arrayList) {
                                Object obj3 = accelSampleVector2;
                                AccelSampleVector accelSampleVector22 = (AccelSampleVector) obj3;
                                GcamModuleJNI.AccelSampleVector_add(accelSampleVector22.a, accelSampleVector22, accelSample2 == null ? 0L : accelSample2.a, accelSample2);
                            }
                            if (list.isEmpty()) {
                                return;
                            }
                            ((gda) gdaVar).c.set(((pld) ske.bF(list)).e);
                        }
                    });
                    if (accelSampleVector2.a() < 5 || accelSampleVector2.a() > 15) {
                        accelSampleVector2.a();
                    }
                    rwcVarI = rwc.i(accelSampleVector2);
                }
                AccelSampleVector accelSampleVector3 = (AccelSampleVector) rwcVarI.f();
                vds vdsVar = this.e;
                Object obj2 = this.c;
                synchronized (obj2) {
                    while (true) {
                        Deque deque = this.b;
                        if (deque.isEmpty()) {
                            throw new IllegalStateException("The queue for zoom ratios is empty.");
                        }
                        qvlVar = (qvl) deque.peek();
                        qvlVar.getClass();
                        obj = qvlVar.b;
                        if (!((seo) obj).l() || micros <= ((Long) ((seo) obj).i()).longValue()) {
                            break;
                        } else {
                            deque.poll();
                        }
                    }
                    Long lValueOf = Long.valueOf(micros);
                    if (((seo) obj).a(lValueOf)) {
                        f = qvlVar.a;
                    } else {
                        sgt sgtVar = (sgt) d.c().M(761);
                        float f2 = qvlVar.a;
                        sgtVar.G("No zoom value was found for timestamp: %d. Using the first available zoom - %f in range - %s", lValueOf, Float.valueOf(f2), obj);
                        f = f2;
                    }
                }
                if (!this.l.p(hax.e) || (str = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID)) == null || str.isEmpty()) {
                    pjrVarD = this.m.d();
                    pjrVarD.getClass();
                } else {
                    pjrVarD = pjr.b(str);
                }
                synchronized (obj2) {
                    while (true) {
                        Queue queue = this.i;
                        if (queue.isEmpty() || micros <= ((Long) queue.element()).longValue()) {
                            break;
                        }
                        queue.poll();
                        this.k++;
                    }
                    i = this.k;
                }
                int andIncrement = ((P11MetadataSerializer) vdsVar).e.getAndIncrement() % 100;
                pnx pnxVar = (pnx) poeVar.g().get((String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID));
                Float f3 = (Float) poeVar.a(nvo.p);
                Float fValueOf = Float.valueOf(-1.0f);
                float fFloatValue = ((Float) Objects.requireNonNullElse(f3, fValueOf)).floatValue();
                CaptureResult.Key key2 = nvo.n;
                int[] iArr = key2 == null ? new int[]{-1, -1, -1, -1} : (int[]) Objects.requireNonNullElse((int[]) poeVar.a(key2), new int[]{-1, -1, -1, -1});
                CaptureResult.Key key3 = nvo.o;
                if (key3 == null) {
                    i2 = -1;
                    iIntValue = -1;
                } else {
                    i2 = -1;
                    iIntValue = ((Integer) Objects.requireNonNullElse((Integer) poeVar.a(key3), -1)).intValue();
                }
                CaptureResult.Key key4 = nvo.v;
                if (key4 == null) {
                    i3 = 0;
                    fArr = new float[0];
                    accelSampleVector = accelSampleVector3;
                } else {
                    i3 = 0;
                    accelSampleVector = accelSampleVector3;
                    fArr = (float[]) Objects.requireNonNullElse((float[]) poeVar.a(key4), new float[0]);
                }
                float[] fArr7 = fArr;
                CaptureResult.Key key5 = nvo.w;
                float[] fArr8 = key5 == null ? new float[i3] : (float[]) Objects.requireNonNullElse((float[]) poeVar.a(key5), new float[i3]);
                float[] fArr9 = (float[]) Objects.requireNonNullElse((float[]) poeVar.a(nvo.q), new float[0]);
                Rect rect2 = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
                float fFloatValue2 = ((Float) poeVar.a(CaptureResult.CONTROL_ZOOM_RATIO)).floatValue();
                CaptureResult.Key key6 = nvo.A;
                float fFloatValue3 = key6 == null ? -1.0f : ((Float) Objects.requireNonNullElse((Float) poeVar.a(key6), fValueOf)).floatValue();
                CaptureResult.Key key7 = nvp.w;
                if (key7 == null) {
                    fArr2 = new float[0];
                    rect = rect2;
                } else {
                    rect = rect2;
                    fArr2 = (float[]) Objects.requireNonNullElse((float[]) poeVar.a(key7), new float[0]);
                }
                float[] fArr10 = fArr2;
                CaptureResult.Key key8 = nvp.r;
                int iIntValue2 = key8 == null ? i2 : ((Integer) Objects.requireNonNullElse((Integer) poeVar.a(key8), Integer.valueOf(i2))).intValue();
                CaptureResult.Key key9 = nvp.o;
                if (key9 == null) {
                    i4 = 0;
                    fArr3 = new float[0];
                } else {
                    i4 = 0;
                    fArr3 = (float[]) Objects.requireNonNullElse((float[]) poeVar.a(key9), new float[0]);
                }
                float[] fArr11 = fArr3;
                CaptureResult.Key key10 = nvp.p;
                float[] fArr12 = key10 == null ? new float[i4] : (float[]) Objects.requireNonNullElse((float[]) poeVar.a(key10), new float[i4]);
                CaptureResult.Key key11 = nvp.q;
                float fFloatValue4 = key11 == null ? -1.0f : ((Float) Objects.requireNonNullElse((Float) poeVar.a(key11), fValueOf)).floatValue();
                CaptureResult.Key key12 = nvp.A;
                if (key12 == null) {
                    i5 = 0;
                    fArr4 = new float[0];
                } else {
                    i5 = 0;
                    fArr4 = (float[]) Objects.requireNonNullElse((float[]) poeVar.a(key12), new float[0]);
                }
                float[] fArr13 = fArr4;
                CaptureResult.Key key13 = nvp.B;
                float[] fArr14 = key13 == null ? new float[i5] : (float[]) Objects.requireNonNullElse((float[]) poeVar.a(key13), new float[i5]);
                float fFloatValue5 = (pnxVar == null || (key = nvp.y) == null) ? -1.0f : ((Float) Objects.requireNonNullElse((Float) pnxVar.a(key), fValueOf)).floatValue();
                float[] fArr15 = {-1.0f, -1.0f, -1.0f, -1.0f};
                CaptureResult.Key key14 = nvq.w;
                if (key14 == null || (fArr6 = (float[]) poeVar.a(key14)) == null) {
                    fArr5 = fArr15;
                } else {
                    float f4 = fArr6[0];
                    float f5 = fArr6[1];
                    fArr5 = new float[]{f4, f5, fArr6[2] - f4, fArr6[3] - f5};
                }
                CaptureResult.Key key15 = nvq.p;
                boolean z = key15 != null && ((Byte) Objects.requireNonNullElse((Byte) poeVar.a(key15), (byte) 0)).byteValue() > 0;
                Map mapG = poeVar.g();
                int[] iArr2 = new int[mapG.size()];
                long[][] jArr = new long[mapG.size()][];
                float[][] fArr16 = new float[mapG.size()][];
                float[][] fArr17 = new float[mapG.size()][];
                int i8 = 0;
                for (Map.Entry entry : mapG.entrySet()) {
                    float[][] fArr18 = fArr17;
                    tcy tcyVarA = ((P11MetadataSerializer) vdsVar).a((String) entry.getKey());
                    pnx pnxVar2 = (pnx) entry.getValue();
                    GyroSampleVector gyroSampleVector3 = gyroSampleVector2;
                    CaptureResult.Key key16 = nvp.t;
                    float[] fArr19 = null;
                    long[] jArr2 = key16 == null ? null : (long[]) pnxVar2.a(key16);
                    CaptureResult.Key key17 = nvp.u;
                    float[] fArr20 = key17 == null ? null : (float[]) pnxVar2.a(key17);
                    CaptureResult.Key key18 = nvp.v;
                    if (key18 != null) {
                        fArr19 = (float[]) pnxVar2.a(key18);
                    }
                    iArr2[i8] = tcyVarA.w;
                    jArr[i8] = jArr2;
                    fArr16[i8] = fArr20;
                    fArr18[i8] = fArr19;
                    i8++;
                    gyroSampleVector2 = gyroSampleVector3;
                    fArr17 = fArr18;
                }
                float[][] fArr21 = fArr17;
                NativeMetadataConverter nativeMetadataConverter = ((P11MetadataSerializer) vdsVar).b;
                pjr pjrVar = pjrVarD;
                Rect rect3 = rect;
                FrameMetadata frameMetadataP = nativeMetadataConverter.p(poeVar, gyroSampleVector2, accelSampleVector, null, pjrVar);
                HashMap map = new HashMap();
                CaptureResult.Key key19 = nvq.m;
                if (key19 != null && (bArr = (byte[]) pnxVar.a(key19)) != null) {
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                    while (byteBufferWrap.remaining() >= 40) {
                        int i9 = byteBufferWrap.getInt();
                        FloatArray9 floatArray9 = new FloatArray9();
                        FrameMetadata frameMetadata = frameMetadataP;
                        ByteBuffer byteBuffer = byteBufferWrap;
                        for (int i10 = 0; i10 < 9; i10++) {
                            floatArray9.c(i10, byteBuffer.getFloat());
                        }
                        map.put(Integer.valueOf(i9), floatArray9);
                        frameMetadataP = frameMetadata;
                        byteBufferWrap = byteBuffer;
                    }
                }
                FrameMetadata frameMetadata2 = frameMetadataP;
                if (andIncrement == 0) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        String.format(Locale.US, "%d: [", entry2.getKey());
                        int i11 = 0;
                        while (i11 < 9) {
                            String.format(Locale.US, " %.2f", Float.valueOf(((FloatArray9) entry2.getValue()).a(i11)));
                            i11++;
                            it = it;
                        }
                    }
                }
                FloatArray9 floatArray92 = (FloatArray9) map.get(1);
                if (floatArray92 != null) {
                    frameMetadata2.i().c(floatArray92);
                }
                ByteBuffer byteBufferNativeSerializeImageMetadata = P11MetadataSerializer.nativeSerializeImageMetadata(((Long) poeVar.a(CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW)).longValue(), fFloatValue, iArr[0], iArr[1], iArr[2], iArr[3], iIntValue, fArr7, fArr8, fArr9, rect3.left, rect3.top, rect3.width(), rect3.height(), fFloatValue2, fFloatValue3, fArr10, iIntValue2, fArr11, fArr12, fFloatValue4, fArr13, fArr14, iArr2, jArr, fArr16, fArr21, f, fFloatValue5, i, fArr5[0], fArr5[1], fArr5[2], fArr5[3], z, FrameMetadata.c(frameMetadata2), nativeMetadataConverter.u(poeVar).a);
                if (byteBufferNativeSerializeImageMetadata == null) {
                    throw new vdt("serializeImageMetadata failed");
                }
                byteBufferNativeSerializeImageMetadata.limit();
                ((oyi) rwcVarD.c()).b(new gdc(byteBufferNativeSerializeImageMetadata), micros);
            } catch (vdt e) {
                ((sgt) ((sgt) d.c().i(e)).M((char) 762)).s("Exception when encoding p11 metadata");
                if (this.h.b(hbc.DOGFOOD)) {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.gcv, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    @Override // defpackage.gcv
    public final void f() {
        long micros = TimeUnit.NANOSECONDS.toMicros(SystemClock.uptimeNanos());
        synchronized (this.c) {
            this.i.offer(Long.valueOf(micros));
        }
    }

    @Override // defpackage.gcv
    public final boolean g(gaw gawVar) {
        return gawVar.L;
    }
}
