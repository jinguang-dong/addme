package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muo {
    public final RectF a = new RectF();
    public mup b;
    public final View c;
    public final mur d;
    public final mur e;
    public final mur f;
    public final mun g;
    public final mun h;
    public final mun i;

    public muo(GridLinesUi gridLinesUi, Paint paint, Paint paint2) {
        this.c = gridLinesUi;
        this.d = new mur(paint);
        this.e = new mur(paint);
        this.g = new mun(paint);
        this.h = new mun(paint);
        this.f = new mur(paint2);
        this.i = new mun(paint2);
    }

    public final void a(mup mupVar) {
        this.b = mupVar;
        b();
        this.c.invalidate();
    }

    public final void b() {
        mup mupVar = this.b;
        boolean z = mupVar.i;
        mur murVar = this.d;
        murVar.b = z;
        mur murVar2 = this.e;
        murVar2.b = z;
        mun munVar = this.g;
        munVar.b = z;
        mun munVar2 = this.h;
        munVar2.b = z;
        mur murVar3 = this.f;
        murVar3.b = z;
        mun munVar3 = this.i;
        munVar3.b = z;
        murVar3.a(true != mupVar.h ? 0 : 255);
        munVar3.a(true == this.b.h ? 255 : 0);
        this.b.a(this.a);
        mup mupVar2 = this.b;
        murVar.a = mupVar2.a;
        murVar2.a = mupVar2.b;
        munVar.a = mupVar2.c;
        munVar2.a = mupVar2.d;
        murVar3.a = mupVar2.e;
        munVar3.a = mupVar2.f;
        this.c.invalidate();
    }
}
