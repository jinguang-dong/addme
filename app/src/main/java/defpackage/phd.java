package defpackage;

import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phd implements pdi {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public MeteringRectangle[] i;
    public MeteringRectangle[] j;
    public MeteringRectangle[] k;

    public phd(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.i = meteringRectangleArr;
        this.j = meteringRectangleArr2;
        this.k = meteringRectangleArr3;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
    }

    public static phd a(pdj pdjVar) {
        return new phd(pdjVar.d(), pdjVar.b(), pdjVar.a(), pdjVar.c(), pdjVar.e(), pdjVar.g(), pdjVar.f(), pdjVar.h(), false, false, false);
    }

    public static phd b(phe pheVar) {
        phd phdVarA = a(pheVar);
        phdVarA.f = pheVar.a;
        phdVarA.g = pheVar.b;
        phdVarA.h = pheVar.c;
        return phdVarA;
    }

    public final phe c() {
        return new phe(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i, this.j, this.k);
    }
}
