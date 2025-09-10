package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kqe implements kpz {
    private final ViewfinderJankSession a;

    public kqe(ViewfinderJankSession viewfinderJankSession) {
        this.a = viewfinderJankSession;
    }

    @Override // defpackage.kpz
    public final void a(poe poeVar, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.a;
        synchronized (viewfinderJankSession.a) {
            List list = viewfinderJankSession.b;
            if (list.size() < 30) {
                sqm sqmVarC = ViewfinderJankSession.c(poeVar, d, d2);
                list.add(sqmVarC);
                viewfinderJankSession.a(sqmVarC);
            }
        }
    }
}
