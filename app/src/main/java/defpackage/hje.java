package defpackage;

import android.hardware.HardwareBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hje implements kiz {
    final /* synthetic */ hjg a;
    final /* synthetic */ hkk b;

    public hje(hjg hjgVar, hkk hkkVar) {
        this.b = hkkVar;
        this.a = hjgVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, poj] */
    @Override // defpackage.kiz
    public final syu a() {
        HardwareBuffer hardwareBufferF = this.b.a.f();
        if (hardwareBufferF != null) {
            try {
                ((sgt) hjg.a.c().M(1329)).s("Using CPU processing on an image having a HardwareBuffer?");
            } finally {
            }
        }
        if (hardwareBufferF != null) {
            hardwareBufferF.close();
        }
        hjg hjgVar = this.a;
        syv syvVar = new syv(new hjf(hjgVar.d, this.b, hjgVar.b, hjgVar.e));
        hjgVar.c.execute(syvVar);
        return syvVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, poj] */
    @Override // defpackage.kiz
    public final syu b() {
        return ske.M(new hjt(this.b.a));
    }
}
