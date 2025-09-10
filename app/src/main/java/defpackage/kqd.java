package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kqd implements kpz {
    private final ViewfinderJankSession a;
    private double b = 33.0d;

    public kqd(ViewfinderJankSession viewfinderJankSession) {
        this.a = viewfinderJankSession;
    }

    @Override // defpackage.kpz
    public final void a(poe poeVar, double d, double d2) {
        ViewfinderJankSession viewfinderJankSession = this.a;
        viewfinderJankSession.d++;
        double d3 = this.b;
        if (d3 > 33.0d && d > 33.0d) {
            double d4 = (d - d3) / d3;
            if (d4 >= 0.5d) {
                synchronized (viewfinderJankSession.a) {
                    if (d4 >= 0.5d) {
                        try {
                            viewfinderJankSession.e++;
                        } finally {
                        }
                    }
                    if (d4 >= 1.5d) {
                        viewfinderJankSession.f++;
                    }
                    if (d4 >= 5.0d) {
                        viewfinderJankSession.g++;
                    }
                    if (d4 >= 1.5d) {
                        sqm sqmVarC = ViewfinderJankSession.c(poeVar, d, d3);
                        viewfinderJankSession.c.add(sqmVarC);
                        viewfinderJankSession.a(sqmVarC);
                    }
                }
            }
        }
        if (d > 33.0d) {
            double d5 = this.b;
            if (d > d5) {
                this.b = (d + (d5 * 10.0d)) / 11.0d;
            } else {
                this.b = d;
            }
        }
    }
}
