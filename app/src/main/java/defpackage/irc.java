package defpackage;

import android.view.Choreographer;
import androidx.wear.ambient.AmbientModeSupport;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irc implements Choreographer.FrameCallback {
    public long a = 0;
    public boolean b = false;
    public AmbientModeSupport.AmbientController c;

    public final void a() {
        b();
        Choreographer.getInstance().postFrameCallback(this);
    }

    public final void b() {
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        a();
        if (this.b) {
            long j2 = j - this.a;
            if (j2 >= 33333333) {
                float f = j2;
                AmbientModeSupport.AmbientController ambientController = this.c;
                if (ambientController != null) {
                    irk irkVar = (irk) ambientController.a;
                    Map map = irkVar.g;
                    for (Map.Entry entry : map.entrySet()) {
                        Map map2 = irkVar.f;
                        Float f2 = (Float) map2.get(entry.getKey());
                        if (f2 != null) {
                            efs efsVar = (efs) entry.getValue();
                            float fA = efsVar.a();
                            float fB = efsVar.b();
                            float fC = clc.C(f2.floatValue() + (f / 3.3333334E7f), efsVar.b(), efsVar.a());
                            map2.put((iri) entry.getKey(), Float.valueOf(fC));
                            if (efsVar.e() != -1) {
                                efsVar.s((fC - fB) / (fA - fB));
                                if (fC == fA) {
                                    efs efsVar2 = (efs) map.get(iri.CHARACTER_MAIN);
                                    float fC2 = efsVar2 != null ? efsVar2.c() : 0.0f;
                                    efs efsVar3 = (efs) map.get(iri.c);
                                    float fC3 = efsVar3 != null ? efsVar3.c() : 0.0f;
                                    if (fC3 <= 0.0f || Math.abs(fC2 - fC3) < 0.1f) {
                                        map2.put((iri) entry.getKey(), Float.valueOf(fB));
                                        efsVar.l();
                                    }
                                }
                            } else if (fC == fA) {
                                map2.put((iri) entry.getKey(), Float.valueOf(fB));
                                efsVar.s(0.0f);
                            } else {
                                efsVar.s((fC - fB) / (fA - fB));
                            }
                        }
                    }
                }
                this.a = j;
            }
        }
    }
}
