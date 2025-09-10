package defpackage;

import android.app.Activity;
import android.graphics.RectF;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class mye {
    private static final sgv a = sgv.g("mye");
    private final Activity b;

    public mye(Activity activity) {
        this.b = activity;
    }

    public final RectF a() {
        if (b() == null) {
            ((sgt) a.c().M(5172)).s("Preview rectangle is not available yet. Main activity layout is not available.");
            return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        mxu mxuVarG = b().g();
        if (mxuVarG == null) {
            ((sgt) a.c().M(5171)).s("Preview rectangle is not available now");
            return new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        }
        RectF rectF = new RectF();
        myd mydVar = mxuVarG.b;
        return mydVar != null ? new RectF(mydVar.h(mydVar.l, mydVar.j)) : rectF;
    }

    public final MainActivityLayout b() {
        return (MainActivityLayout) this.b.findViewById(R.id.activity_root_view);
    }

    public final boolean c() {
        return this.b.isInMultiWindowMode();
    }
}
