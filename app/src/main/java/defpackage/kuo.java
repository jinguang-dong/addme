package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuo extends ojl {
    private final hps a;
    private final kgg b;
    private final owq c;
    private boolean d;
    private final pfu e;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, owq] */
    public kuo(kgg kggVar, ggg gggVar, pfu pfuVar, hps hpsVar) {
        super((short[]) null);
        this.e = pfuVar;
        this.a = hpsVar;
        this.b = kggVar;
        this.c = gggVar.a;
        this.d = false;
        int i = gyt.a;
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.List] */
    private final void cm(List list) {
        if (!list.isEmpty() || this.d) {
            CaptureRequest.Key key = nvm.e;
            if (key != null) {
                pfu pfuVar = this.e;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(404);
                byteBufferAllocate.order(ByteOrder.nativeOrder());
                List<hpz> list2 = (List) Collection.EL.stream(list).filter(new hzk(1)).collect(Collectors.toList());
                byteBufferAllocate.putInt(list2.size());
                for (hpz hpzVar : list2) {
                    rwc rwcVar = hpzVar.c;
                    if (rwcVar.h()) {
                        byteBufferAllocate.putInt(hpzVar.a);
                        byteBufferAllocate.putFloat(hpzVar.b);
                        byteBufferAllocate.putInt(((sbp) rwcVar.c()).size());
                        ?? C = rwcVar.c();
                        int size = C.size();
                        for (int i = 0; i < size; i++) {
                            byteBufferAllocate.putFloat(((Float) C.get(i)).floatValue());
                        }
                        for (int i2 = 0; i2 < 6 - ((sbp) rwcVar.c()).size(); i2++) {
                            byteBufferAllocate.putFloat(0.0f);
                        }
                        byteBufferAllocate.putFloat(hpzVar.d);
                    }
                }
                pfuVar.m(key, byteBufferAllocate.array());
            }
            this.d = !list.isEmpty();
            this.b.a(!list.isEmpty());
        }
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        hpz hpzVar;
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_TIMESTAMP);
        Rect rect = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
        Face[] faceArr = (Face[]) poeVar.a(CaptureResult.STATISTICS_FACES);
        if (!this.b.d() || l == null || rect == null || faceArr == null) {
            int i = sbp.d;
            cm(sex.a);
            return;
        }
        owq owqVar = this.c;
        if (!((Boolean) ((ovx) owqVar).d).booleanValue() && faceArr.length > 0) {
            owqVar.a(true);
        }
        long jLongValue = l.longValue();
        HashMap map = new HashMap();
        hpr hprVarB = this.a.b(jLongValue);
        if (hprVarB != null) {
            List<hpq> list = hprVarB.b;
            if (!list.isEmpty()) {
                for (hpq hpqVar : list) {
                    rwc rwcVar = hpqVar.c;
                    if (!rwcVar.h() || ((sbp) rwcVar.c()).size() != 4) {
                        rwcVar = rvk.a;
                    }
                    float f = hpqVar.b;
                    if (f > 0.0f) {
                        int i2 = (int) hpqVar.a;
                        Integer numValueOf = Integer.valueOf(i2);
                        rwcVar.getClass();
                        hpz hpzVar2 = new hpz(i2, f, rwcVar, hpqVar.d);
                        rwc rwcVar2 = hpzVar2.c;
                        if (rwcVar2.h()) {
                            a.I(((sbp) rwcVar2.c()).size() == 4);
                        }
                        map.put(numValueOf, hpzVar2);
                    }
                }
            }
        }
        List arrayList = new ArrayList();
        if (!map.keySet().isEmpty()) {
            for (Face face : faceArr) {
                if (map.containsKey(Integer.valueOf(face.getId())) && (hpzVar = (hpz) map.get(Integer.valueOf(face.getId()))) != null && hpzVar.b > 0.0f) {
                    arrayList.add(hpzVar);
                }
            }
            Collections.sort(arrayList, new ccn(17));
            if (arrayList.size() > 5) {
                arrayList = arrayList.subList(0, 5);
            }
        }
        cm(arrayList);
    }
}
