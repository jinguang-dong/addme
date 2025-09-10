package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gqc implements grh {
    public static final sgv a = sgv.g("gqc");
    public static final gqa b = new gqb();
    public final gri d;
    public final gps e;
    public final szh g;
    public grm h;
    public final pbn i;
    private final hbc j;
    private int k;
    private final ktx l;
    public final Map c = new ConcurrentHashMap();
    public gqa f = b;

    public gqc(gps gpsVar, gri griVar, pbn pbnVar, hbc hbcVar, ktx ktxVar, szh szhVar) {
        this.l = ktxVar;
        this.e = gpsVar;
        this.d = griVar;
        this.i = pbnVar;
        this.j = hbcVar;
        this.g = szhVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    public final void a(Exception exc, String str) {
        ((sgt) ((sgt) a.b().i(exc)).M((char) 1002)).v("%s", str);
        if (this.j.b(hbc.DOGFOOD)) {
            throw new gpt(str, exc);
        }
    }

    @Override // defpackage.grh
    public final void b(gqf gqfVar) {
        this.f.a(gqfVar);
    }

    public final void c(poj pojVar) {
        if (this.h == null) {
            pojVar.close();
            return;
        }
        long micros = TimeUnit.NANOSECONDS.toMicros(pojVar.d());
        Map map = this.c;
        Long lValueOf = Long.valueOf(micros);
        map.put(lValueOf, pojVar);
        int i = this.l.b().e + 90;
        List listG = pojVar.g();
        poi poiVar = (poi) listG.get(0);
        int i2 = 1;
        poi poiVar2 = (poi) listG.get(1);
        poi poiVar3 = (poi) listG.get(2);
        int i3 = i % 360;
        if (i3 != 0) {
            if (i3 == 90) {
                i2 = 4;
            } else if (i3 == 180) {
                i2 = 3;
            } else {
                if (i3 != 270) {
                    throw new IllegalArgumentException(a.bv(i3, "Unsupported rotation: "));
                }
                i2 = 2;
            }
        }
        gri griVar = this.d;
        int iC = pojVar.c();
        int iB = pojVar.b();
        gqg gqgVar = griVar.b;
        gqgVar.g = iC;
        gqgVar.h = iB;
        grj grjVar = gqgVar.f;
        grjVar.e = iC;
        grjVar.f = iB;
        grm grmVar = this.h;
        rnt.w(grmVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        ByteBuffer buffer = poiVar.getBuffer();
        ByteBuffer buffer2 = poiVar2.getBuffer();
        ByteBuffer buffer3 = poiVar3.getBuffer();
        int iC2 = pojVar.c();
        int iB2 = pojVar.b();
        int rowStride = poiVar.getRowStride();
        int rowStride2 = poiVar2.getRowStride();
        int pixelStride = poiVar2.getPixelStride();
        if (grmVar.b == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (!buffer.isDirect() || !buffer2.isDirect() || !buffer3.isDirect()) {
            throw new IllegalStateException("Byte buffers are not direct.");
        }
        if (grmVar.a.receiveYuvFrame(grmVar.b, micros, buffer, buffer2, buffer3, iC2, iB2, rowStride, rowStride2, pixelStride, i2 - 1)) {
            return;
        }
        map.remove(lValueOf);
        pojVar.close();
    }

    public final synchronized void d(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        pbn pbnVar = this.i;
        pbnVar.f("camera_vkp_mode_switch");
        grm grmVar = this.h;
        rnt.x(grmVar);
        rgy rgyVarD = this.e.d(i);
        grmVar.a.resetSchedulingOptimizerOptions(grmVar.b, rgyVarD.h());
        pbnVar.g();
    }
}
