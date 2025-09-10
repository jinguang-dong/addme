package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eix implements eis {
    public final String a;
    public final eip b;
    public final eip c;
    public final eif d;
    public final boolean e;

    public eix(String str, eip eipVar, eip eipVar2, eif eifVar, boolean z) {
        this.a = str;
        this.b = eipVar;
        this.c = eipVar2;
        this.d = eifVar;
        this.e = z;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egs(efsVar, ejhVar, this);
    }

    public final String toString() {
        eip eipVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + CZAHo.IckaBQYeWgSjgr + String.valueOf(eipVar) + "}";
    }
}
