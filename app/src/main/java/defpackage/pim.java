package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pim {
    public final pik a;
    public final pdt b;
    public final pbn c;
    public final pbc d;
    public final Set e;
    public final int f;
    public final our g;
    public final mwq h;

    public pim(pdt pdtVar, pik pikVar, our ourVar, pbc pbcVar, pbn pbnVar, mwq mwqVar, pjp pjpVar) {
        this.b = pdtVar;
        this.a = pikVar;
        this.g = ourVar;
        this.c = pbnVar;
        this.h = mwqVar;
        this.d = pbcVar.a("StreamMap");
        this.e = ((pjn) pjpVar.a(pdtVar.a)).b;
        this.f = 64 - ((Byte) pjpVar.a(pdtVar.a).n(CameraCharacteristics.REQUEST_PIPELINE_MAX_DEPTH, (byte) 8)).byteValue();
    }
}
