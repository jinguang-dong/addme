package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agr implements aim {
    final /* synthetic */ ags a;

    public agr(ags agsVar) {
        this.a = agsVar;
    }

    @Override // defpackage.aim
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        ags agsVar = this.a;
        float fFloatValue = ((Number) agsVar.a.a(Float.valueOf(f))).floatValue();
        agsVar.d.b(Boolean.valueOf(fFloatValue > 0.0f));
        agsVar.e.b(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
