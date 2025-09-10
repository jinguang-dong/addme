package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.google.android.apps.camera.bottombar.ThumbnailView;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbf {
    public final boolean a;
    public final Context b;
    public final fvu c;
    public final Executor d;
    public final rww e;
    public final pbn f;
    public Runnable h;
    private final ThumbnailView j;
    private final luj l;
    public mxm g = mxm.PORTRAIT;
    public int i = 1;
    private final ArrayList k = new ArrayList();

    public mbf(boolean z, Context context, Executor executor, fvu fvuVar, ThumbnailView thumbnailView, luj lujVar, rww rwwVar, pbn pbnVar) {
        this.a = z;
        this.b = context;
        this.c = fvuVar;
        this.d = executor;
        this.j = thumbnailView;
        this.l = lujVar;
        this.e = rwwVar;
        this.f = pbnVar;
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.k;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            mbh mbhVar = (mbh) arrayList2.get(i);
            if (!mbhVar.c) {
                arrayList.add(mbhVar.a.activityInfo.packageName);
            }
        }
        throw null;
    }

    public final void b(Runnable runnable) {
        this.h = runnable;
        int i = this.i;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            runnable.run();
            return;
        }
        this.i = 3;
        this.l.d(luf.aj, true);
        this.c.i = true;
        Rect rect = new Rect();
        this.j.getGlobalVisibleRect(rect);
        View decorView = ((Activity) this.b).getWindow().getDecorView();
        int iOrdinal = this.g.ordinal();
        if (iOrdinal == 0) {
            new Point(rect.left, rect.top);
        } else if (iOrdinal == 1) {
            new Point(decorView.getHeight() - rect.bottom, rect.left);
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
            new Point(rect.left, rect.top);
        } else {
            new Point(rect.top, decorView.getWidth() - rect.right);
        }
        new cku().g(null);
        throw null;
    }

    public final boolean c() {
        Activity activity = (Activity) this.b;
        return activity.isDestroyed() || activity.isFinishing();
    }
}
