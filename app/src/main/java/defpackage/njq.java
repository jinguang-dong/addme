package defpackage;

import com.google.android.apps.camera.ui.gridlines.GridLinesUi;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njq implements pau {
    final /* synthetic */ GridLinesUi a;

    public njq(GridLinesUi gridLinesUi) {
        this.a = gridLinesUi;
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        mus musVarA = mus.a(((Integer) obj).intValue());
        GridLinesUi gridLinesUi = this.a;
        mup mupVar = (mup) gridLinesUi.a.get(musVarA);
        rnt.x(mupVar);
        gridLinesUi.b.a(mupVar);
    }
}
