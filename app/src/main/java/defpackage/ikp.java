package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikp {
    public static final Byte a = (byte) 0;
    public final pjo b;
    public final jwh c;
    public final ila d;
    public final jwj e;
    public final hbj f;
    private final pjr g;

    public ikp(pjp pjpVar, hbj hbjVar, jwj jwjVar, jwh jwhVar) {
        this.f = hbjVar;
        this.e = jwjVar;
        pjr pjrVarE = pjpVar.e(pka.BACK);
        rnt.x(pjrVarE);
        this.g = pjrVarE;
        pjo pjoVarA = pjpVar.a(pjrVarE);
        this.b = pjoVarA;
        this.c = jwhVar;
        ila ilaVar = new ila();
        pas pasVarC = oxj.RES_1080P.c();
        ilaVar.a = pasVarC.a;
        ilaVar.b = pasVarC.b;
        ilaVar.e = false;
        ilaVar.c = pjoVarA.g();
        SizeF sizeF = (SizeF) pjoVarA.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        rnt.x(sizeF);
        float[] fArr = (float[]) pjoVarA.m(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        rnt.x(fArr);
        ilaVar.d = (fArr[0] * 36.0f) / sizeF.getWidth();
        this.d = ilaVar;
    }

    public final double a() {
        float f = this.d.d;
        double dAtan = Math.atan(36.0f / (f + f));
        return Math.toDegrees(dAtan + dAtan);
    }
}
