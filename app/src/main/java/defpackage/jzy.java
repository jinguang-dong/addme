package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.googlex.gcam.ShotMetadata;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzy implements jzx {
    private final pbc a;
    private final rwc b;
    private final tzj c;
    private final long d;
    private final DynamicDepthUtils e;
    private final tgp f = new tgp();
    private final rwc g;
    private final lob h;

    public jzy(pbc pbcVar, rwc rwcVar, tzj tzjVar, long j, DynamicDepthUtils dynamicDepthUtils, rwc rwcVar2, lob lobVar) {
        this.a = pbcVar.a("jzy");
        this.b = rwcVar;
        this.c = tzjVar;
        this.d = j;
        this.e = dynamicDepthUtils;
        this.g = rwcVar2;
        this.h = lobVar;
    }

    private final poj c(hke hkeVar, poj pojVar, jzw jzwVar, ShotMetadata shotMetadata) {
        poj pojVar2;
        long jNanoTime = System.nanoTime();
        try {
            pojVar2 = pojVar;
            try {
                hkd hkdVar = (hkd) hkeVar.a(new hkk(pojVar2, (ltr) jzwVar.b, (poe) ((syq) jzwVar.d).b, rwc.i(this.h.b(((plu) pojVar).a)), rwc.j(shotMetadata))).get();
                long jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - jNanoTime, TimeUnit.NANOSECONDS);
                this.a.b("Post-processing - image transformer finished. Took " + jConvert + "ms");
                return hkdVar.a();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                this.a.i("Couldn't apply post-processing", e);
                return pojVar2;
            }
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            pojVar2 = pojVar;
        }
    }

    private final poj d(HardwareBuffer hardwareBuffer, long j, ShotMetadata shotMetadata) {
        rwc rwcVar = this.b;
        if (!rwcVar.h()) {
            return new plu(hardwareBuffer, j);
        }
        HardwareBuffer hardwareBufferAllocateHardwareBuffer = MomentsUtils.allocateHardwareBuffer(hardwareBuffer.getWidth(), hardwareBuffer.getHeight(), hardwareBuffer.getFormat(), 1, this.d | 768);
        if (hardwareBufferAllocateHardwareBuffer == null) {
            this.a.d("Unable to allocate output buffer for rectiface, return image without warping.");
            return new plu(hardwareBuffer, j);
        }
        if (((loq) rwcVar.c()).f(hardwareBuffer, hardwareBufferAllocateHardwareBuffer, shotMetadata)) {
            hardwareBuffer.close();
            return new plu(hardwareBufferAllocateHardwareBuffer, j);
        }
        hardwareBufferAllocateHardwareBuffer.close();
        return new plu(hardwareBuffer, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    @Override // defpackage.jzx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.poj a(defpackage.jzw r22, com.google.googlex.gcam.YuvWriteView r23, defpackage.poj r24, com.google.googlex.gcam.ShotMetadata r25) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzy.a(jzw, com.google.googlex.gcam.YuvWriteView, poj, com.google.googlex.gcam.ShotMetadata):poj");
    }

    @Override // defpackage.jzx
    public final poj b(jzw jzwVar, HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata) {
        return c((hke) this.c.a(), d(hardwareBuffer, ((Long) jzwVar.c).longValue(), shotMetadata), jzwVar, shotMetadata);
    }
}
