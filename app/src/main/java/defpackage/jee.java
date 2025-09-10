package defpackage;

import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jee implements emy {
    public final /* synthetic */ jeg a;

    public jee(jeg jegVar) {
        this.a = jegVar;
    }

    @Override // defpackage.emy
    public final void a(byte[] bArr) {
        jeg jegVar = this.a;
        jegVar.r = false;
        jdn jdnVar = jegVar.c;
        if (jdnVar.a(jegVar.q, jegVar.I, jegVar.J, false) != null) {
            jegVar.g();
            jegVar.s = false;
            jdnVar.b.r(jegVar.H, new jws(this, 1));
        }
        float[] fArrF = jegVar.g.f();
        float[] fArr = {fArrF[0], fArrF[1], fArrF[2], fArrF[4], fArrF[5], fArrF[6], fArrF[8], fArrF[9], fArrF[10]};
        float f = 0.0f;
        String str = new String();
        for (int i = 0; i < 9; i++) {
            str = str + fArr[i] + " ";
            f += fArr[i];
        }
        try {
            jegVar.o.write(str + f + "\n");
            jegVar.o.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        jeg jegVar2 = this.a;
        jegVar2.y.post(new imf(jegVar2, bArr, 17, (byte[]) null));
        Object obj = jeb.a;
        if (LightCycleNative.GetNumCapturedTargets() == LightCycleNative.GetNumTotalTargets()) {
            jegVar2.b.c();
            if (jegVar2.x == null || LightCycleNative.GetNumTotalTargets() != 1) {
                jfk jfkVar = jegVar2.w;
                if (jfkVar != null) {
                    jfkVar.a(null);
                }
            } else {
                jegVar2.x.a(null);
            }
        }
        jfk jfkVar2 = jegVar2.B;
        if (jfkVar2 != null) {
            jfkVar2.a(null);
        }
    }
}
