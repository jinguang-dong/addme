package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejm extends ejh {
    private final egh j;
    private final eji k;

    public ejm(efs efsVar, ejk ejkVar, eji ejiVar, efh efhVar) {
        super(efsVar, ejkVar);
        this.k = ejiVar;
        egh eghVar = new egh(efsVar, this, new ejc("__container", ejkVar.a, false), efhVar);
        this.j = eghVar;
        eghVar.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // defpackage.ejh, defpackage.egi
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.ejh
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.ejh
    public final void l(eia eiaVar, int i, List list, eia eiaVar2) {
        this.j.e(eiaVar, i, list, eiaVar2);
    }

    @Override // defpackage.ejh
    public final ejs q() {
        ejs ejsVarQ = super.q();
        return ejsVarQ != null ? ejsVarQ : this.k.q();
    }

    @Override // defpackage.ejh
    public final hkk r() {
        hkk hkkVarR = super.r();
        return hkkVarR != null ? hkkVarR : this.k.r();
    }
}
